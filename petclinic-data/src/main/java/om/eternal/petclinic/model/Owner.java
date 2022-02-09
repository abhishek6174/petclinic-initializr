package om.eternal.petclinic.model;

import java.util.Set;

public class Owner extends Person implements Comparable<Owner>{
    private Set<Pet> pets;
    private String city;
    private String address;
    private String telephone;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public int compareTo(Owner o) {
        return (int)(this.id-((Owner)o).id);
    }
}
