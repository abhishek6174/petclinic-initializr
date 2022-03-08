package om.eternal.petclinic.repositories;

import om.eternal.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
}
