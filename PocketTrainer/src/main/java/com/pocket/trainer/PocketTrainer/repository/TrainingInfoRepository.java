package com.pocket.trainer.PocketTrainer.repository;

import com.pocket.trainer.PocketTrainer.domain.News;
import com.pocket.trainer.PocketTrainer.domain.TrainingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingInfoRepository extends JpaRepository<TrainingInfo, Integer> {
}
