package com.siit.homework.week9.Exercise2;

import java.util.*;

public class Persons {

    public static void main(String[] args) {
        Comparator<Persoana> comparator = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana person1, Persoana person2) {
                int compareByName = person1.getName().compareTo(person2.getName());
                int compareByAge = person1.getAge().compareTo(person2.getAge());
                if (compareByName == 0){
                    return compareByAge;
                }
                return compareByName;
            }
        };

        Set<Persoana> personsSet = new TreeSet<>(comparator);
        personsSet.add(new Persoana("Stefan", 35));
        personsSet.add(new Persoana("Florin", 28));
        personsSet.add(new Persoana("Maria", 30));
        personsSet.add(new Persoana("Paul", 22));
        personsSet.add(new Persoana("Andrei", 40));
        personsSet.forEach(System.out::println);

        Map<Persoana, List<Hobby>> personsMap = new HashMap<>();

    }
}


