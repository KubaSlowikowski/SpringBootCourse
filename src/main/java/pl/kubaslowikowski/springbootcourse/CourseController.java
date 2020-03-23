package pl.kubaslowikowski.springbootcourse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Course> createCourse (@RequestBody Course course) { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
        courses.add(course);
        System.out.println(course.getName());
        System.out.println(course.getLengthInSecond());
        return new ResponseEntity<>(course, HttpStatus.CREATED); //Ctrl+Shift+I
    }
    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<Course>> getAvailableCourses () { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
        return new ResponseEntity<>(courses, HttpStatus.OK); //Ctrl+Shift+I
    }
//    @RequestMapping(value = "/bought", method = RequestMethod.GET) FIXME
//    public ResponseEntity<List<Course>> getBoughtCourses () { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
//        return new ResponseEntity<>(courses, HttpStatus.CREATED); //Ctrl+Shift+I
//    }
}