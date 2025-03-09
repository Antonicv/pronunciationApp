package dev.pronunciationAppBack.service;

import dev.pronunciationAppBack.model.Stage;
import dev.pronunciationAppBack.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;

    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    public Optional<Stage> getStageById(Long id) {
        return stageRepository.findById(id);
    }

    public Stage createStage(Stage stage) {
        return stageRepository.save(stage);
    }

    public Stage updateStage(Stage stage) {
        return stageRepository.save(stage);
    }

    public void deleteStage(Long id) {
        if (stageRepository.existsById(id)) {
            stageRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Stage with id " + id + " does not exist.");
        }
    }

    public void deleteAllStages() {
        stageRepository.deleteAll();
    }

    public boolean existsById(Long id) {
        return stageRepository.existsById(id);
    }

    public long getStageCount() {
        return stageRepository.count();
    }
}
