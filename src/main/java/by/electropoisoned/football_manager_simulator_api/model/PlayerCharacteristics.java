package by.electropoisoned.football_manager_simulator_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "player_characteristics")
public class PlayerCharacteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(0) @Max(100)
    private Integer goalkeeping;

    @Min(0) @Max(100)
    private Integer defending;

    @Min(0) @Max(100)
    private Integer attacking;

    @Min(0) @Max(100)
    private Integer common;

    @OneToOne
    @JoinColumn(
            name = "player_id",
            referencedColumnName = "id",
            nullable = false)
    private Player player;
}
