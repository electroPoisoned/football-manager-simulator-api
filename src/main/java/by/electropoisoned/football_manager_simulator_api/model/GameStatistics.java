package by.electropoisoned.football_manager_simulator_api.model;

import by.electropoisoned.football_manager_simulator_api.model.event.PlayerGameStatistics;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "game_statistics")
public class GameStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "statistics")
    private Game game;

    @ElementCollection
    @CollectionTable(
            name = "game_goal_scorers",
            joinColumns = @JoinColumn(name = "statistics_id")
    )
    private List<PlayerGameStatistics> goalScorers;

    @ElementCollection
    @CollectionTable(
            name = "game_assistants",
            joinColumns = @JoinColumn(name = "statistics_id")
    )
    private List<PlayerGameStatistics> assistants;

    @ElementCollection
    @CollectionTable(
            name = "game_yellow_cards",
            joinColumns = @JoinColumn(name = "statistics_id")
    )
    private List<PlayerGameStatistics> yellowCards;

    @ElementCollection
    @CollectionTable(
            name = "game_red_cards",
            joinColumns = @JoinColumn(name = "statistics_id")
    )
    private List<PlayerGameStatistics> redCards;
}
