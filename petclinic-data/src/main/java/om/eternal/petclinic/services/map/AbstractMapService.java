package om.eternal.petclinic.services.map;

import om.eternal.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    //<T extends BaseEntity> means either send me T or send subclass of BaseEntity or BaseEntity as we have used BaseEntity
    // as parent to all other Model like Vet,Owner,Pet it would work for all>
    //<Id extends Long> also means the same either send me ID or send me anything that extends Long or long
    //extends in generic act as a Bounded-Type parameter
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else{
            throw new RuntimeException("Object can't be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch(NoSuchElementException nse){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@Exception got caught!");
            nextId = 1L;
        }
        return nextId;
    }
}
