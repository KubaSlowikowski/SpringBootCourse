package pl.kubaslowikowski.springbootcourse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubaslowikowski.springbootcourse.model.CourseDTO;
import pl.kubaslowikowski.springbootcourse.exception.WrongIdException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<CourseDTO> courseDTOS = new ArrayList<>();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> createCourse (@RequestBody CourseDTO courseDTO) { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
        if(courseDTO.getId()==null || courseDTO.getId()<0) {
            throw new WrongIdException("Zmienna kurs posiada id nullowe lub mniejsze od 0");
        }
        courseDTOS.add(courseDTO);
        System.out.println(courseDTO.getName());
        System.out.println(courseDTO.getLengthInSecond());
        return new ResponseEntity<>(courseDTO, HttpStatus.CREATED); //Ctrl+Shift+I
    }

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO>> getAvailableCourses () { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
        return new ResponseEntity<>(courseDTOS, HttpStatus.OK); //Ctrl+Shift+I
    }

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.POST)
    public CourseDTO buyCourse (@PathVariable(value = "id") Long id) {
        System.out.println("buyCourse");
        return getCourse(id);
    }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public CourseDTO buyCourse2 (@RequestParam(value = "id") Long id) {
        System.out.println("buyCourse2");
        return getCourse(id);
    }

    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for(CourseDTO c : courseDTOS) {
            if(c.getId() != null && c.getId().equals(id))
                courseDTO = c;
            break;
        }
        if(courseDTO == null) {
            // TODO
        }
        return courseDTO;
    }

//    @RequestMapping(value = "/bought", method = RequestMethod.GET) FIXME
//    public ResponseEntity<List<Course>> getBoughtCourses () { //metoda pozwala na zwrócenie odpowiedzi i odpowiedniego kodu HTT
//        return new ResponseEntity<>(courses, HttpStatus.CREATED); //Ctrl+Shift+I
//    }
}