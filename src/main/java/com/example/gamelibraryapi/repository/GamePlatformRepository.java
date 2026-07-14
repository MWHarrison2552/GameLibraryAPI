package com.example.gamelibraryapi.repository;

import com.example.gamelibraryapi.model.GamePlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePlatformRepository extends JpaRepository<GamePlatform, Long> {
    //No code needed!
    // Extending JPARepository interface gives .findall(), .findById(), .save(), .delete()
}
