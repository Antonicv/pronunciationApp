package dev.pronunciationAppBack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameProgress {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private int currentScore;

    // Enumeració per a les etapes del joc
    public enum Stage {
        STAGE_01, STAGE_02, STAGE_03, STAGE_04, STAGE_05
    }

    @Enumerated(EnumType.STRING)
    private Stage currentStage;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPlayedDate;

    private int wordsLearned;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;

    @OneToMany(mappedBy = "gameProgress")
    private List<Stage> stages;
}