package om.eternal.petclinic.repositories;

import om.eternal.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
