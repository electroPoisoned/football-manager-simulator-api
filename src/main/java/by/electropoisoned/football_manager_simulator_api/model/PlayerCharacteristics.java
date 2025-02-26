package by.electropoisoned.football_manager_simulator_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PlayerCharacteristics {

    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private Integer goalkeeping;

    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private Integer defending;

    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private Integer attacking;

    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private Integer common;
}
