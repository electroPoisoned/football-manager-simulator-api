package by.electropoisoned.football_manager_simulator_api.mapper;

import by.electropoisoned.football_manager_simulator_api.dto.PlayerDTO;
import by.electropoisoned.football_manager_simulator_api.model.Player;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PlayerMapper extends BaseMapper<Player, PlayerDTO> {
}
