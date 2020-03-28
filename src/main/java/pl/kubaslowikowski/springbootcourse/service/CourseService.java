package pl.kubaslowikowski.springbootcourse.service;

import pl.kubaslowikowski.springbootcourse.model.CourseDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.Course;
import pl.kubaslowikowski.springbootcourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}
