package by.electropoisoned.football_manager_simulator_api.service.impl;

import by.electropoisoned.football_manager_simulator_api.dto.player.PlayerDTO;
import by.electropoisoned.football_manager_simulator_api.exception.PlayerNotFoundException;
import by.electropoisoned.football_manager_simulator_api.mapper.player.PlayerMapper;
import by.electropoisoned.football_manager_simulator_api.model.Player;
import by.electropoisoned.football_manager_simulator_api.repository.PlayerRepository;
import by.electropoisoned.football_manager_simulator_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    @Override
    public PlayerDTO createPlayer(PlayerDTO playerDTO) {
        Player player = playerMapper.toEntity(playerDTO);
        Player savedPlayer = playerRepository.save(player);
        return playerMapper.toDto(savedPlayer);
    }

    @Override
    public PlayerDTO getPlayerById(Long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException());
        return playerMapper.toDto(player);
    }

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return playerRepository.findAll().stream()
                .map(playerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PlayerDTO updatePlayer(Long id, PlayerDTO playerDTO) {
        Player existingPlayer = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException());
        existingPlayer.setName(playerDTO.getName());
        existingPlayer.setPosition(playerDTO.getPosition());
        existingPlayer.setBirthDate(playerDTO.getBirthDate());
        existingPlayer.setCountry(playerDTO.getCountry());
        Player updatedPlayer = playerRepository.save(existingPlayer);
        return playerMapper.toDto(updatedPlayer);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
