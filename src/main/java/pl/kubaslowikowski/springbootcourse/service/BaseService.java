package pl.kubaslowikowski.springbootcourse.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kubaslowikowski.springbootcourse.persistence.model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;

public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T, K>> {
    /*
     T - model bazy danych
     K - klucz, po którym indentyfikujemy swoje dane (nasze id)
     R - nasze repozytorium
    CRUD - create, read, update, delete
    */

    R getRepository();

    T save(T entity);

    T delete(K id);

    Collection<T> getAll();

    T getOne(K id); //zwraca konkretną encję
}