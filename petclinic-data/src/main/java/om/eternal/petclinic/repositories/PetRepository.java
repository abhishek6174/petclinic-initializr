package om.eternal.petclinic.repositories;

import om.eternal.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet,Long> {
}
