package by.electropoisoned.football_manager_simulator_api.model;

import by.electropoisoned.football_manager_simulator_api.model.event.PlayerGameStatistics;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "home_team_id",
            nullable = false
    )
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(
            name = "away_team_id",
            nullable = false
    )
    private Team awayTeam;

    private Integer homeScore;

    private Integer awayScore;

    @ElementCollection
    @CollectionTable(
            name = "game_goal_scorers",
            joinColumns = @JoinColumn(name = "game_id")
    )
    private List<PlayerGameStatistics> goalScorers;

    @ElementCollection
    @CollectionTable(
            name = "game_assistants",
            joinColumns = @JoinColumn(name = "game_id")
    )
    private List<PlayerGameStatistics> assistants;

    @ElementCollection
    @CollectionTable(
            name = "game_yellow_cards",
            joinColumns = @JoinColumn(name = "game_id")
    )
    private List<PlayerGameStatistics> yellowCards;

    @ElementCollection
    @CollectionTable(
            name = "game_red_cards",
            joinColumns = @JoinColumn(name = "game_id")
    )
    private List<PlayerGameStatistics> redCards;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;
}
