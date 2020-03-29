package pl.kubaslowikowski.springbootcourse.service;

import org.springframework.stereotype.Service;
import pl.kubaslowikowski.springbootcourse.persistence.model.BaseEntity;
import pl.kubaslowikowski.springbootcourse.persistence.repository.BaseRepository;

import java.io.Serializable;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public abstract class BaseServiceImpl<T extends BaseEntity, K extends Serializable, R extends BaseRepository<T, K>> implements BaseService<T, K, R> {
    //nie można wywołać tej klasy, można ją przeciążyć

    public abstract R getRepository(); //pobiera nasze repozytorium

    @Override
    public T save(T entity) {

        return getRepository().save(entity);
    }

    @Override
    public T delete(K id) {
        T entity = getOne(id);
        entity.setActive(false); // nie usuwamy elementu tylko ustawiamy pole "active" na false
        return save(entity);
    }

    @Override
    public T getOne(K id) { //Lepiej by było użyć klasy Optional
        T t = getRepository().getOne(id);
        if(t.getActive())
            return t;
        else
            return null;
    }

    @Override
    public Collection<T> getAll() {
        return getRepository().findAll()
                .stream()
                .filter(BaseEntity::getActive)
                .collect(Collectors.toList());
    }
}