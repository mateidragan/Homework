package com.siit.homework.week3.Exercise4;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Album extends Book{

    private String paperQuality;

    public Album(String name, int numOfPages, String paperQuality) {
        super(name, numOfPages);
        this.paperQuality = paperQuality;
    }
}
