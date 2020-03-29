package pl.kubaslowikowski.springbootcourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CourseDTO { //odpowiada za wyświetlanie JSONa

    private Long id;
    private String name;
}