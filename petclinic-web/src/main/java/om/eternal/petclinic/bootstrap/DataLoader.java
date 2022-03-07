package om.eternal.petclinic.bootstrap;

import om.eternal.petclinic.model.*;
import om.eternal.petclinic.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count ==0) {
            loadData();
        }
    }

    private void loadData() {
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

        Visit fianCatVisit = new Visit();
        fianCatVisit.setPet(fianCat);
        fianCatVisit.setDescription("De-worming work");
        fianCatVisit.setDateTime(LocalDateTime.now().minusMonths(1));

        visitService.save(fianCatVisit);
        System.out.println("Loaded ownerrs...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Vet vet1 = new Vet();

        vet1.setFirstName("Deepak");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jasmine");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
