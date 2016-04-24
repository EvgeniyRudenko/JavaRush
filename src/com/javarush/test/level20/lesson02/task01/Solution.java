package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your
        // real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте
        // outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            //File your_file_name = File.createTempFile("C:\\Users\\Oleks\\Desktop\\888.txt", null);
            File your_file_name = new File ("C:\\Users\\Oleks\\Desktop\\888.txt");

            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human petrov = new Human("Petrov", new Asset("job"), new Asset("car"), new Asset("wife"));
            petrov.assets.get(0).setPrice(900);
            petrov.save(outputStream);
            outputStream.flush();

            System.out.println(ivanov);
            System.out.println();
            System.out.println(petrov);
            System.out.println();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            System.out.println(somePerson);

            Human somePerson1 = new Human();
            somePerson1.load(inputStream);
            System.out.println(somePerson);

            System.out.println(ivanov.equals(somePerson));
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(name);
            for (Asset asset: assets){
                String hasName = asset.getName()!=null ? "yes" : "no";
                writer.println(hasName);
                if (hasName.equals("yes"))
                    writer.println(asset.getName());
                writer.println(asset.getPrice());
            }
            writer.println("-----");
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            name = reader.readLine();
            String assetName;
                while (!Objects.equals(assetName = reader.readLine(), "-----"))
                {
                    assetName = reader.readLine();
                    double price = Double.parseDouble(reader.readLine());
                    Asset newAsset = new Asset(assetName);
                    newAsset.setPrice(price);
                    assets.add(newAsset);
                }
            reader.close();
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return !(assets != null ? !assets.equals(human.assets) : human.assets != null);

        }

        @Override
        public int hashCode()
        {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        @Override
        public String toString()
        {
            String output = "Name: " + name;
            for (Asset asset : assets)
            {
                output += System.lineSeparator() + "name: " + asset.getName()
                        + System.lineSeparator() + "price: " + asset.getPrice();
            }
            return output;
        }
    }
}
