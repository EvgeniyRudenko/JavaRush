package com.javarush.test.level21.lesson05.task01;

import java.util.HashSet;
import java.util.Set;

/* Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this==o)
            return true;
        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;
        if (n.first!=null && n.last!=null)
            return n.first.equals(first) && n.last.equals(last);
        else if (n.first == null && n.last==null){
            return first==null && last==null;
        }
        else if (n.first == null){
            return first==null && n.last.equals(last);
        } else {
            return n.first.equals(first) && last==null;
        }
    }

    public int hashCode() {
        int firstHashCode = (first==null) ? 0 : first.hashCode();
        int lastHashCode = (last==null) ? 0 : last.hashCode();
        return 31 * firstHashCode + lastHashCode;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
