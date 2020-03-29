package pl.kubaslowikowski.springbootcourse.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass //jest to klasa, z której mapujemy właściwości
@Data
public class BaseEntity implements Serializable { //jest to główna klasa zawierająca podstawowe pola w tabelkach

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 29 6:42
    @Column(name = "id")
    private Long id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @PrePersist //te rzeczy mają się wykonać zanim wykonamy zapis do bazy danych
    protected void logDataBeforeInsert() {
        this.createdDate = new Date();
        this.updatedDate = new Date();
        this.active = true;
    }

    @PreUpdate //te rzeczy mają się wykonać przed aktualizacją bazy danych
    protected void logDataBeforeUpdate() {
        this.updatedDate = new Date();
    }
}