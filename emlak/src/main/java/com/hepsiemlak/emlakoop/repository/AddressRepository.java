package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class AddressRepository {

    List<Address> addresses = new ArrayList<>();

    public List<Address> getAll() {
        return addresses;
    }

    public Address getById(String id) {
        for (Address address : addresses) {
            if (Objects.equals(address.getId(), id)) {
                return address;
            }
        }
        return null;
    }

    public void add(Address address) {
        addresses.add(address);
    }

    public void update(Address address) {
        for (Address address1 : addresses) {
            if (Objects.equals(address1.getId(), address.getId())) {
                address1.setAddress(address.getAddress());
                address1.setDistrict(address.getDistrict());
                address1.setProvince(address.getProvince());
                address1.setNeighborhood(address.getNeighborhood());
            }
        }
    }

    public void delete(String id) {
        addresses.removeIf(address -> Objects.equals(address.getId(), id));
    }
}
