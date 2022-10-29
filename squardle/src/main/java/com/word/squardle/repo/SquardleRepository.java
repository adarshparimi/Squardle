package com.word.squardle.repo;

import com.word.squardle.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquardleRepository extends JpaRepository<Words,String> {
}
