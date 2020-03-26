package pl.kubaslowikowski.springbootcourse.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "courses")
public class Course { //klasa referuje bezpośrednio do bazy danych, reprezentuje dane po stronie tabelki

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) //jest generowany przez tabelkę
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}