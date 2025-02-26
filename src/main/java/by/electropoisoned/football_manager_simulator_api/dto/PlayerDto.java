package by.electropoisoned.football_manager_simulator_api.dto;

import by.electropoisoned.football_manager_simulator_api.model.enums.Country;
import by.electropoisoned.football_manager_simulator_api.model.enums.Position;
import jakarta.validation.constraints.NotBlank;
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
public class PlayerDto {

    @NotBlank
    private String name;
    private Position position;
    private LocalDate birthDate;
    private Country country;
    private TeamDto team;
}
