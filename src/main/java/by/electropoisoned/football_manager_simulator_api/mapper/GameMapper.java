package by.electropoisoned.football_manager_simulator_api.mapper;

import by.electropoisoned.football_manager_simulator_api.dto.GameDTO;
import by.electropoisoned.football_manager_simulator_api.model.Game;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface GameMapper extends BaseMapper<Game, GameDTO>{
}
