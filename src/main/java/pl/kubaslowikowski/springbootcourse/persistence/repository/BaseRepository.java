package pl.kubaslowikowski.springbootcourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.kubaslowikowski.springbootcourse.persistence.model.BaseEntity;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {
}
    /*interfejs odpowiedzialny za operacje, ktore mozemy wykonywac na danych
    * JpaRepository - zawiera wiele operacji na bazach danych
    * obiekty, ktore przyjmie ten interfejs beda musialy rozszerzac BaseEntity, poniewaz beda odpowiadaly za wyglad tabelek
    */