package om.eternal.petclinic.model;

import java.util.Set;

public class Owner extends Person implements Comparable<Owner>{
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public int compareTo(Owner o) {
        return (int)(this.id-((Owner)o).id);
    }
}
