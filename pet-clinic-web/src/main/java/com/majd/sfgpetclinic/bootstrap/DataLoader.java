package com.majd.sfgpetclinic.bootstrap;

import com.majd.sfgpetclinic.controllers.VetController;
import com.majd.sfgpetclinic.model.Owner;
import com.majd.sfgpetclinic.model.Vet;
import com.majd.sfgpetclinic.services.OwnerService;
import com.majd.sfgpetclinic.services.VetService;
import com.majd.sfgpetclinic.services.map.OwnerServiceMap;
import com.majd.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Homer");
        owner1.setLastName("Simpson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bart");
        owner2.setLastName("Simpson");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ..");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Inurashi");
        vet1.setLastName("Kazuke");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Memokashi");
        vet2.setLastName("Kazuke");

        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
