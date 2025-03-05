package by.electropoisoned.football_manager_simulator_api.service;

import by.electropoisoned.football_manager_simulator_api.dto.PlayerDTO;
import by.electropoisoned.football_manager_simulator_api.dto.PlayerStatisticsDTO;

import java.util.List;

public interface PlayerService {
    PlayerDTO createPlayer(PlayerDTO playerDTO);
    PlayerDTO getPlayerById(Long id);
    List<PlayerDTO> getAllPlayers();
    PlayerDTO updatePlayer(Long id, PlayerDTO playerDTO);
    PlayerDTO updatePlayerStatistics(Long id, PlayerStatisticsDTO playerStatisticsDTO);
    void deletePlayer(Long id);
    List<PlayerDTO> createPlayers(List<PlayerDTO> playerDTOs);
}
