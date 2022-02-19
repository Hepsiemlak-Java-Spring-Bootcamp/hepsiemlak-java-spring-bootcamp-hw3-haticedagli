package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Search;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class SearchRepository {

    List<Search> searches = new ArrayList<>();

    public void add(Search search) {
        searches.add(search);
    }

    public List<Search> getAll() {
        return searches;
    }

    public Search getById(String id) {
        for (Search search : searches) {
            if (Objects.equals(search.getId(), id)) {
                return search;
            }
        }
        return null;
    }

    public void delete(String id) {
        searches.remove(getById(id));
    }

    public void update(Search search) {
        delete(search.getId());
        add(search);
    }
}
