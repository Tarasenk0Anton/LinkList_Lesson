package TestLessons;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1,"Ivan", "Ivanov");
        Person petr = new Person(29,"Petr", "Petrov");
        Person sveta = new Person(3,"Sveta", "Sveticova");
        Person ivan1 = new Person(30,"Ivan1", "Ivanov1");
        Person ivan2 = new Person(45,"Ivan2", "Ivanov2");
        Person ivan3 = new Person(10,"Ivan3", "Ivanov3");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);
        map.put(ivan1.getId(), ivan1);
        map.put(ivan2.getId(), ivan2);
        map.put(ivan3.getId(), ivan3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() +"="+entry.getValue());
        }
    }


}
