package by.electropoisoned.football_manager_simulator_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "statistics")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToOne
    @JoinColumn(
            name = "player_id",
            referencedColumnName = "id",
            nullable = false)
    private Player player;

}
