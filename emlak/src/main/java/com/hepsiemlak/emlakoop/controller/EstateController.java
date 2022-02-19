package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.estate.Estate;
import com.hepsiemlak.emlakoop.repository.EstateRepository;
import com.hepsiemlak.emlakoop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estate")
@RequiredArgsConstructor
public class EstateController {

    public final EstateRepository estateRepository;
    public final UserRepository userRepository;

    @GetMapping("/{id}")
    public Estate getEstate(@PathVariable String id) {
        return estateRepository.getEstate(id);
    }

}
