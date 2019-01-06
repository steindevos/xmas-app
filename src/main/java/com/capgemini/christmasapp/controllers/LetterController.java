package com.capgemini.christmasapp.controllers;

import com.capgemini.christmasapp.models.Letter;
import com.capgemini.christmasapp.repositories.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/letter")
public class LetterController {

    @Autowired
    private LetterRepository letterRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Letter> getAll() {
        return letterRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Letter postLetter(@RequestBody Letter newLetter) {
        letterRepository.save(newLetter);
        return newLetter;
    }

}
