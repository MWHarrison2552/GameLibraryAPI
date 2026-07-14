package com.example.gamelibraryapi.repository;

import com.example.gamelibraryapi.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//REPOSITORIES ARE PART OF THE DATA LAYER. HOW THE DATA IS ACCESSED AND INTERACTED WITH VIA THE SET OF TOOLS/METHODS

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    //No code needed!
    // Extending JPARepository interface gives .findall(), .findById(), .save(), .delete()
}
