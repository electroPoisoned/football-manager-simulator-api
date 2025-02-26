package by.electropoisoned.football_manager_simulator_api.service;

import by.electropoisoned.football_manager_simulator_api.exception.PlayerNotFoundException;
import by.electropoisoned.football_manager_simulator_api.model.Player;
import by.electropoisoned.football_manager_simulator_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player updatePlayer(Player player) {
        if (player.getId() == null || !playerRepository.existsById(player.getId())) {
            throw new PlayerNotFoundException();
        }
        return playerRepository.save(player);
    }

    public void deletePlayerById(Long id) {
        playerRepository.deleteById(id);
    }
}
