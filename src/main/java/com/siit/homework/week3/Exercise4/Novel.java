package com.siit.homework.week3.Exercise4;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Novel extends Book{

    private String type;

    public Novel(String name, int numOfPages, String type) {
        super(name, numOfPages);
        this.type = type;
    }
}
