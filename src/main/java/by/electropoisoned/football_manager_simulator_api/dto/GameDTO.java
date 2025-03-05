package by.electropoisoned.football_manager_simulator_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameDTO {
    private Long id;
    private Long homeTeamId;
    private Long awayTeamId;
    private Integer homeScore;
    private Integer awayScore;
    private Long roundId;
}
