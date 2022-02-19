package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.Advert;
import com.hepsiemlak.emlakoop.model.dto.AdvertSearchRequest;
import com.hepsiemlak.emlakoop.service.AdvertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advert")
@RequiredArgsConstructor
public class AdvertController {

    public final AdvertService advertService;

    @PostMapping("/search")
    public List<Advert> search(@RequestBody AdvertSearchRequest searchRequest) {
        return advertService.searchAdverts(searchRequest);
    }

    @GetMapping("/favorite/{email}")
    public List<Advert> getFavoriteAdvertsOfUser(@PathVariable String email) {
        return advertService.getFavoriteAdvertsOfUser(email);
    }

    @GetMapping("/favoriteById/{id}")
    public List<Advert> getFavoriteAdvertsOfUserByUserId(@PathVariable String id) {
        return advertService.getFavoriteAdvertsOfUserByUserId(id);
    }
}
