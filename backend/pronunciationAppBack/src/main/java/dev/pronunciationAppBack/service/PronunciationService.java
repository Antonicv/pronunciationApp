package dev.pronunciationAppBack.service;


import dev.pronunciationAppBack.model.Pronunciation;
import dev.pronunciationAppBack.repository.PronunciationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PronunciationService {

    @Autowired
    private PronunciationRepository pronunciationRepository;

    public List<Pronunciation> getAllPronunciations() {
        return pronunciationRepository.findAll();
    }

    public Optional<Pronunciation> getPronunciationById(String id) {
        return pronunciationRepository.findById(id);
    }

    public Pronunciation createPronunciation(Pronunciation pronunciation) {
        return pronunciationRepository.save(pronunciation);
    }

    public Pronunciation updatePronunciation(Pronunciation pronunciation) {
        return pronunciationRepository.save(pronunciation);
    }

    public void deletePronunciation(String id) {
        pronunciationRepository.deleteById(id);
    }

    public void deleteAllPronunciations() {
        pronunciationRepository.deleteAll();
    }

    public boolean existsById(String id) {
        return pronunciationRepository.existsById(id);
    }

    public long getPronunciationCount() {
        return pronunciationRepository.count();
    }

 

    public List<Pronunciation> getPronunciationsBySpeakerGender(String gender) {
        return pronunciationRepository.findBySpeakerGender(gender);
    }

    public List<Pronunciation> getPronunciationsByWordId(String wordId) {
        return pronunciationRepository.findByWordId(wordId);
    }

    public List<Pronunciation> getPronunciationsByPhoneticSpelling(String phoneticSpelling) {
        return pronunciationRepository.findByPhoneticSpellingContaining(phoneticSpelling);
    }
}
