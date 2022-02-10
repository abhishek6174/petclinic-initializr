package om.eternal.petclinic.bootstrap;

import om.eternal.petclinic.model.Owner;
import om.eternal.petclinic.model.Pet;
import om.eternal.petclinic.model.PetType;
import om.eternal.petclinic.model.Vet;
import om.eternal.petclinic.services.OwnerService;
import om.eternal.petclinic.services.PetTypeService;
import om.eternal.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();

        owner1.setFirstName("Mithilesh");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Vitthlwadi");
        owner1.setCity("Kalyan");
        owner1.setTelephone("123-123-123-123");

        Pet mithileshPet = new Pet();
        mithileshPet.setPetType(savedDogPetType);
        mithileshPet.setOwner(owner1);
        mithileshPet.setName("Rosco");
        mithileshPet.setBirthDate(LocalDate.now().minusMonths(1));
        owner1.getPets().add(mithileshPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fian");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Vitthlwadi");
        owner2.setCity("Kalyan");
        owner2.setTelephone("123-123-123-123");

        Pet fianCat = new Pet();

        fianCat.setPetType(savedCatPetType);
        fianCat.setOwner(owner2);
        fianCat.setName("Fians Cat");
        fianCat.setBirthDate(LocalDate.now().minusMonths(1));
        owner2.getPets().add(fianCat);

        ownerService.save(owner2);

        System.out.println("Loaded ownerrs...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Deepak");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jasmine");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
