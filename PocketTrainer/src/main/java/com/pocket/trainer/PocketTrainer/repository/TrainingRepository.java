package com.pocket.trainer.PocketTrainer.repository;

import com.pocket.trainer.PocketTrainer.domain.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {

}
