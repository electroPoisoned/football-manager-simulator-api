package by.electropoisoned.football_manager_simulator_api.dto.team;

import by.electropoisoned.football_manager_simulator_api.model.enums.Country;
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
public class TeamDTO {
    String name;
    LocalDate foundationDate;
    Country country;
}
