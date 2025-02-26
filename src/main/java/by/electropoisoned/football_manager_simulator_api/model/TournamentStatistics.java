package by.electropoisoned.football_manager_simulator_api.model;

import by.electropoisoned.football_manager_simulator_api.model.event.PlayerTournamentStatistics;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentStatistics {

    @ElementCollection
    @CollectionTable(
            name = "tournament_top_assistants",
            joinColumns = @JoinColumn(name = "tournament_id")
    )
    private List<PlayerTournamentStatistics> topScorers;

    @ElementCollection
    @CollectionTable(
            name = "tournament_top_assistants",
            joinColumns = @JoinColumn(name = "tournament_id")
    )
    private List<PlayerTournamentStatistics> topAssistants;

    @ElementCollection
    @CollectionTable(
            name = "tournament_top_yellow_cards",
            joinColumns = @JoinColumn(name = "tournament_id")
    )
    private List<PlayerTournamentStatistics> topYellowCards;

    @ElementCollection
    @CollectionTable(
            name = "tournament_top_red_cards",
            joinColumns = @JoinColumn(name = "tournament_id")
    )
    private List<PlayerTournamentStatistics> topRedCards;

    @ElementCollection
    @CollectionTable(
            name = "tournament_top_clean_sheet_gk",
            joinColumns = @JoinColumn(name = "tournament_id")
    )
    private List<PlayerTournamentStatistics> topCleanSheetGoalkeepers;
}
