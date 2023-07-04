package com.example.homepage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SirkelRepository extends JpaRepository<Sirkel, Integer> {

}
