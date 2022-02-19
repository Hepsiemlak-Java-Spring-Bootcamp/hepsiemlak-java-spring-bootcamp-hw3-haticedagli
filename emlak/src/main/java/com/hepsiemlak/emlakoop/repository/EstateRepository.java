package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.estate.Estate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class EstateRepository {

    List<Estate> estates = new ArrayList<>();

    public void add(Estate estate) {
        estates.add(estate);
    }

    public List<Estate> getEstates() {
        return estates;
    }

    public void setEstates(List<Estate> estates) {
        this.estates = estates;
    }

    public Estate getEstate(String id) {
        for (Estate estate : estates) {
            if (Objects.equals(estate.getId(), id)) {
                return estate;
            }
        }
        return null;
    }

    public void removeEstate(String id) {
        estates.removeIf(estate -> Objects.equals(estate.getId(), id));
    }
}
