package by.electropoisoned.football_manager_simulator_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "statistics")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer gamesPlayed;

    private Integer goals;

    private Integer assists;

    private Integer cleanSheets;

    private Integer yellowCards;

    private Integer redCards;
}
