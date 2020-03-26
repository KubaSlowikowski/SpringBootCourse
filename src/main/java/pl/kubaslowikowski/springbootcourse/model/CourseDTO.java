package pl.kubaslowikowski.springbootcourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDTO { //odpowiada za wyświetlanie JSONa

    private Long id;
    private String name;
    private int lengthInSecond;
}
