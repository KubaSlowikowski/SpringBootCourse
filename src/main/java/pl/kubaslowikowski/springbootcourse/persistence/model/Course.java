package pl.kubaslowikowski.springbootcourse.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true) //metody hashCode i equals będą brane z klasy nadrzędnej (podpowiedź automatyczna z intelliJ)
@Data
@Entity
@Table(name = "courses")
public class Course extends BaseEntity { //klasa referuje bezpośrednio do bazy danych, reprezentuje dane po stronie tabelki

    @Column(name = "name")
    private String name;
}