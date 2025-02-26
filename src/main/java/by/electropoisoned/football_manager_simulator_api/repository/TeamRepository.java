package by.electropoisoned.football_manager_simulator_api.repository;

import by.electropoisoned.football_manager_simulator_api.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
