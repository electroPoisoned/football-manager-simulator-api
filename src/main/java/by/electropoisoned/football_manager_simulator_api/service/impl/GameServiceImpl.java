package by.electropoisoned.football_manager_simulator_api.service.impl;

import by.electropoisoned.football_manager_simulator_api.dto.GameDTO;
import by.electropoisoned.football_manager_simulator_api.exception.GameNotFoundException;
import by.electropoisoned.football_manager_simulator_api.mapper.GameMapper;
import by.electropoisoned.football_manager_simulator_api.model.Game;
import by.electropoisoned.football_manager_simulator_api.repository.GameRepository;
import by.electropoisoned.football_manager_simulator_api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository, GameMapper gameMapper) {
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }

    @Override
    public GameDTO createGame(GameDTO gameDTO) {
        Game game = gameMapper.toEntity(gameDTO);
        Game savedGame = gameRepository.save(game);
        return gameMapper.toDto(savedGame);
    }

    @Override
    public GameDTO getGameById(Long id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new GameNotFoundException());
        return gameMapper.toDto(game);
    }

    @Override
    public List<GameDTO> getAllGames() {
        return gameRepository.findAll().stream()
                .map(gameMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public GameDTO updateGame(Long id, GameDTO gameDTO) {
        Game existingGame = gameRepository.findById(id)
                .orElseThrow(() -> new GameNotFoundException());
        existingGame.setHomeScore(gameDTO.getHomeScore());
        existingGame.setAwayScore(gameDTO.getAwayScore());
        Game updatedGame = gameRepository.save(existingGame);
        return gameMapper.toDto(updatedGame);
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}
