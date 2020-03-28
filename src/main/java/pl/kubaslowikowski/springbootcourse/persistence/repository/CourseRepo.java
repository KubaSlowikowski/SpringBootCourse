package pl.kubaslowikowski.springbootcourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.kubaslowikowski.springbootcourse.persistence.model.Course;

public interface CourseRepo extends BaseRepository<Course, Long> {
//interfejs odpowiedzialny za operacje, ktore mozemy wykonywac na danych
// JpaRepository - dużo operacji na bazach danych
}