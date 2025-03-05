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
public class PlayerStatisticsDTO {
    private Integer gamesPlayed;
    private Integer goals;
    private Integer assists;
    private Integer cleanSheets;
    private Integer yellowCards;
    private Integer redCards;
}
