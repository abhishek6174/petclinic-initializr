package om.eternal.petclinic.repositories;

import om.eternal.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
