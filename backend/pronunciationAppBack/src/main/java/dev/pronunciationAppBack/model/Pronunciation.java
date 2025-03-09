package dev.pronunciationAppBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pronunciation {
    @Id
    private String id;
    private String audioDescription;
    private long audioDuration;
    private long audioSize;
    private String audioUrl;
    private String definition;
    private String phoneticSpelling;
    private String speakerGender;

    public enum Type {
        RECORDED, SAMPLE
    }

    private Type type;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;
}