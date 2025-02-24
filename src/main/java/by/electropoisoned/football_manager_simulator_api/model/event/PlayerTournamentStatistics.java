package by.electropoisoned.football_manager_simulator_api.model.event;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerTournamentStatistics {

    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "stat_value")
    private Integer statValue;
}
