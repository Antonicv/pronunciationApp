package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.StageWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageWordRepository extends JpaRepository<StageWord, String> {
    // Métodos de consulta personalizados si es necesario
}
