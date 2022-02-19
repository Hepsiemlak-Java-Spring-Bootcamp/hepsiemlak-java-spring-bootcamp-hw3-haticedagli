package com.hepsiemlak.emlakoop.repository;


import com.hepsiemlak.emlakoop.model.Advert;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class AdvertRepository {

    List<Advert> adverts = new ArrayList<>();

    public void add(Advert advert) {
        adverts.add(advert);
    }

    public List<Advert> getAll() {
        return adverts;
    }

    public Advert getById(String id) {
        for (Advert advert : adverts) {
            if (Objects.equals(advert.getId(), id)) {
                return advert;
            }
        }
        return null;
    }

    public void remove(String id) {
        Advert advert = getById(id);
        adverts.remove(advert);
    }
}
