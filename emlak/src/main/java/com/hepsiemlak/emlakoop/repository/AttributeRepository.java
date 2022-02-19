package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Attribute;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AttributeRepository {

    List<Attribute> attributes = new ArrayList<>();

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public Attribute getAttribute(int index) {
        return attributes.get(index);
    }

    public void add(Attribute attribute) {
        attributes.add(attribute);
    }

    public void removeAttribute(Attribute attribute) {
        attributes.remove(attribute);
    }
}
