package by.electropoisoned.football_manager_simulator_api.controller;

import by.electropoisoned.football_manager_simulator_api.dto.GameDTO;
import by.electropoisoned.football_manager_simulator_api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/new")
    public ResponseEntity<GameDTO> createGame(@RequestBody GameDTO gameDTO) {
        GameDTO createdGame = gameService.createGame(gameDTO);
        return new ResponseEntity<>(createdGame, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> getGameById(@PathVariable Long id) {
        GameDTO gameDTO = gameService.getGameById(id);
        return ResponseEntity.ok(gameDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<GameDTO>> getAllGames() {
        List<GameDTO> games = gameService.getAllGames();
        return ResponseEntity.ok(games);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GameDTO> updateGame(@PathVariable Long id, @RequestBody GameDTO gameDTO) {
        GameDTO updatedGame = gameService.updateGame(id, gameDTO);
        return ResponseEntity.ok(updatedGame);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return ResponseEntity.noContent().build();
    }
}
