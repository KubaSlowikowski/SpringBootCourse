package pl.kubaslowikowski.springbootcourse.service;

import pl.kubaslowikowski.springbootcourse.model.CourseDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.Course;

public class Mapper {

    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setName(course.getName());
        courseDTO.setLengthInSecond(0);
        return courseDTO;
    }

    public static Course dTOToCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        course.setName(courseDTO.getName());
        return course;
    }
}
