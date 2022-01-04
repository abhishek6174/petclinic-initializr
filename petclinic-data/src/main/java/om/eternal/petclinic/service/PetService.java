package om.eternal.petclinic.service;

import om.eternal.petclinic.model.Owner;
import om.eternal.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
