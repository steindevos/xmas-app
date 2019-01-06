package com.capgemini.christmasapp.repositories;

import com.capgemini.christmasapp.models.Letter;
import org.springframework.data.repository.CrudRepository;

public interface LetterRepository extends CrudRepository<Letter, Long> {
}
