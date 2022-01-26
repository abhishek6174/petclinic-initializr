package om.eternal.petclinic.bootstrap;

import om.eternal.petclinic.model.Owner;
import om.eternal.petclinic.model.Vet;
import om.eternal.petclinic.services.OwnerService;
import om.eternal.petclinic.services.PetService;
import om.eternal.petclinic.services.VetService;
import om.eternal.petclinic.services.map.OwnerServiceMap;
import om.eternal.petclinic.services.map.PetServiceMap;
import om.eternal.petclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService,VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded ownerrs...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
