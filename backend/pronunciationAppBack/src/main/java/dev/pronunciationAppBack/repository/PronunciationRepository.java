package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.Pronunciation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface PronunciationRepository extends JpaRepository<Pronunciation, String> {
    List<Pronunciation> findByType(Pronunciation.type type);

    List<Pronunciation> findBySpeakerGender(String gender);

    List<Pronunciation> findByWordId(String wordId);

    List<Pronunciation> findByPhoneticSpellingContaining(String phoneticSpelling);
}
