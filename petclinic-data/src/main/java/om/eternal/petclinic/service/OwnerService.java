package om.eternal.petclinic.service;

import om.eternal.petclinic.model.Owner;

import javax.persistence.SecondaryTable;
import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
