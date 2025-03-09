package dev.pronunciationAppBack.repository;
import dev.pronunciationAppBack.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, String> {
    Word getWordById(String id);
    Word getWordByPhoneticSpelling(String pronunciation);
}
