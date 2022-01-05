package om.eternal.petclinic.services;

import om.eternal.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
