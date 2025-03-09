package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.GameProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Date;

@Repository
public interface GameProgressRepository extends JpaRepository<GameProgress, String> {List<GameProgress> findByCurrentStage(GameProgress.Stage stage);

    List<GameProgress> findByLastPlayedDateAfter(Date date);

    List<GameProgress> findByWordsLearnedGreaterThan(int count);

    GameProgress findByAppUserId(String userId);

    List<GameProgress> findByCurrentScoreGreaterThan(int score);
}
