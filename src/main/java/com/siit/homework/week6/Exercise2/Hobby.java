package com.siit.homework.week6.Exercise2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
class Hobby {

    private final String name;
    private final int frequency;
    private final List<Adresa> address;
}
