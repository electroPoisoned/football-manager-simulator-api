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
public class PlayerCharacteristicsDTO {
    private Integer goalkeeping;
    private Integer defending;
    private Integer attacking;
    private Integer common;
}
