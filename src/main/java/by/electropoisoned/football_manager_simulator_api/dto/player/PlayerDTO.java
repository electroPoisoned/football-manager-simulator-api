package by.electropoisoned.football_manager_simulator_api.dto.player;

import by.electropoisoned.football_manager_simulator_api.dto.player_characteristics.PlayerCharacteristicsDTO;
import by.electropoisoned.football_manager_simulator_api.dto.player_statistics.PlayerStatisticsDTO;
import by.electropoisoned.football_manager_simulator_api.model.enums.Country;
import by.electropoisoned.football_manager_simulator_api.model.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDTO {
    private Long id;
    private String name;
    private Position position;
    private LocalDate birthDate;
    private Country country;
    private PlayerCharacteristicsDTO playerCharacteristics;
    private PlayerStatisticsDTO playerStatistics;
    private Long teamId;
}
