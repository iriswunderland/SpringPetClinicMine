package iris.springframwork.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delte(T object);

    void deleteById(ID id);

}
