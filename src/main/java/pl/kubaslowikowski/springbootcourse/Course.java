package pl.kubaslowikowski.springbootcourse;

import lombok.Data;

@Data
public class Course {

    private Long id;
    private String name;
    private int lengthInSecond;
}
