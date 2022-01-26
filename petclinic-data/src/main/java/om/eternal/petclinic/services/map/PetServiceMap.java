package om.eternal.petclinic.services.map;

import om.eternal.petclinic.model.Pet;
import om.eternal.petclinic.services.CrudService;
import om.eternal.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long>
        implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
