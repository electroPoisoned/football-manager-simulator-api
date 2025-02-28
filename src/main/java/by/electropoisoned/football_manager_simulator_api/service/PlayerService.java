package by.electropoisoned.football_manager_simulator_api.service;

import by.electropoisoned.football_manager_simulator_api.dto.player.PlayerDTO;

import java.util.List;

public interface PlayerService {
    PlayerDTO createPlayer(PlayerDTO playerDTO);
    PlayerDTO getPlayerById(Long id);
    List<PlayerDTO> getAllPlayers();
    PlayerDTO updatePlayer(Long id, PlayerDTO playerDTO);
    void deletePlayer(Long id);
}
