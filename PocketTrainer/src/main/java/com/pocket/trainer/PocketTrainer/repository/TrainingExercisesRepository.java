package com.pocket.trainer.PocketTrainer.repository;

import com.pocket.trainer.PocketTrainer.domain.TrainingExercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingExercisesRepository extends JpaRepository<TrainingExercises, Integer> {
}
