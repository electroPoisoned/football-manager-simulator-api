package by.electropoisoned.football_manager_simulator_api.repository;

import by.electropoisoned.football_manager_simulator_api.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
