package om.eternal.petclinic.model;

public class Vet extends Person implements Comparable<Vet>{

    @Override
    public int compareTo(Vet o) {
        return (int)(this.id - o.id);
    }
}
