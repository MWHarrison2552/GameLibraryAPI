package com.example.gamelibraryapi.repository;

import com.example.gamelibraryapi.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//REPOSITORIES ARE PART OF THE DATA LAYER. HOW THE DATA IS ACCESSED AND INTERACTED WITH VIA THE SET OF TOOLS/METHODS

@Repository
public interface PlatformRepository extends JpaRepository<Platform, Long> {
    //No code needed!
    // Extending JPARepository interface gives .findall(), .findById(), .save(), .delete()
}
