package om.eternal.petclinic.services.map;

import om.eternal.petclinic.model.Vet;
import om.eternal.petclinic.services.CrudService;
import om.eternal.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long>
        implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
