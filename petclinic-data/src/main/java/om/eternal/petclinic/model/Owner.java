package om.eternal.petclinic.model;

public class Owner extends Person implements Comparable<Owner>{

    @Override
    public int compareTo(Owner o) {
        return (int)(this.id-((Owner)o).id);
    }
}
