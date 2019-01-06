package com.pocket.trainer.PocketTrainer.repository;

import com.pocket.trainer.PocketTrainer.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
