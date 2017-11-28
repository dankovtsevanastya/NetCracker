package ru.vsu.lab1;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by 1 on 21.11.2017.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        MyRepository reposit = new MyRepository(10);

        try {
            reposit.put(new Person("Вася", 1, person.setDb2("12.06.1993")));
            reposit.put(new Person("Стася", 2, person.setDb2("12.06.1997")));
            reposit.put(new Person("Мася", 3, person.setDb2("12.06.2005")));
        } catch (ParseException e) {
            e.printStackTrace();
        }



        System.out.println("Количество элементов: " + reposit.count());

        for (Person p : reposit.arr) {
            if (p != null) {
                System.out.println(p.getId() + "  " + p.getName() + "  " + p.getDb() + "  " + p.getAge());
            }
        }
    }
}
