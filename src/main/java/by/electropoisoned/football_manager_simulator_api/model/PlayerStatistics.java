package by.electropoisoned.football_manager_simulator_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class PlayerStatistics {

    @Min(0)
    @Column(nullable = false)
    private Integer gamesPlayed;

    @Min(0)
    @Column(nullable = false)
    private Integer goals;

    @Min(0)
    @Column(nullable = false)
    private Integer assists;

    @Min(0)
    @Column(nullable = false)
    private Integer cleanSheets;

    @Min(0)
    @Column(nullable = false)
    private Integer yellowCards;

    @Min(0)
    @Column(nullable = false)
    private Integer redCards;
}