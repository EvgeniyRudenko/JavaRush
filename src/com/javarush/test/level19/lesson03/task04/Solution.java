package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String s = scanner.nextLine();
            String[] data = s.split(" ");
            String firstName = data[1];
            String middleName = data[2];
            String lastName = data[0];
            Calendar date = new GregorianCalendar(Integer.parseInt(data[5]),
                                                  Integer.parseInt(data[4])-1,
                                                  Integer.parseInt(data[3]));
            Date birthDate = date.getTime();
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}
