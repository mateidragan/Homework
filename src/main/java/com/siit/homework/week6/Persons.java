package com.siit.homework.week6;

import lombok.*;

public class Persons {
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    static abstract class Persoana {
        String name;

    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    static class Somer extends Persoana{
        final int welfare;

        public Somer(String name, int welfare) {
            super(name);
            this.welfare = welfare;
        }
    }

    @Getter
    @Setter
    @ToString
    static class Angajat extends Persoana {
        int salary;

        public Angajat(String name, int salary) {
            super(name);
            this.salary = salary;
        }
    }

    @Getter
    @Setter
    @ToString

    static class Student extends Persoana {
        int note;

        public Student(String name, int note) {
            super(name);
            this.note = note;
        }
    }
}
