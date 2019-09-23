package iris.springframwork.petclinic.services;

import iris.springframwork.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
