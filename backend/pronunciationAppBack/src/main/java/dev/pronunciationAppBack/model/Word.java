package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Word {

    @Id
    private String id;
    private String wordName;
    private String definition;
    private String phoneticSpelling;
    private String sentence;
    private boolean isActive;
    private int levelNumber;

    @OneToMany(mappedBy = "word")
    private List<Pronunciation> pronunciations;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level wordLevel;

    @ManyToMany
    @JoinTable(
        name = "word_category",
        joinColumns = @JoinColumn(name = "word_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    @OneToMany(mappedBy = "word")
    private List<StageWord> stageWords;

    // Constructor per defecte
    public Word() {}

    // Constructor amb paràmetres
    public Word(String id, String wordName, String definition, String phoneticSpelling, String sentence, boolean isActive, int levelNumber) {
        this.id = id;
        this.wordName = wordName;
        this.definition = definition;
        this.phoneticSpelling = phoneticSpelling;
        this.sentence = sentence;
        this.isActive = isActive;
        this.levelNumber = levelNumber;
    }

    // Getters i setters
    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(List<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPhoneticSpelling() {
        return phoneticSpelling;
    }

    public void setPhoneticSpelling(String phoneticSpelling) {
        this.phoneticSpelling = phoneticSpelling;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public Level getWordLevel() {
        return wordLevel;
    }

    public void setWordLevel(Level wordLevel) {
        this.wordLevel = wordLevel;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id='" + id + '\'' +
                ", wordName='" + wordName + '\'' +
                ", definition='" + definition + '\'' +
                ", phoneticSpelling='" + phoneticSpelling + '\'' +
                ", sentence='" + sentence + '\'' +
                ", isActive=" + isActive +
                ", levelNumber=" + levelNumber +
                '}';
    }
}