package by.electropoisoned.football_manager_simulator_api.mapper.player;

import by.electropoisoned.football_manager_simulator_api.dto.player.PlayerDTO;
import by.electropoisoned.football_manager_simulator_api.mapper.BaseMapper;
import by.electropoisoned.football_manager_simulator_api.model.Player;
import org.mapstruct.Mapper;

@Mapper(
        config = BaseMapper.class,
        componentModel = "spring"
)
public interface PlayerMapper extends BaseMapper<Player, PlayerDTO> {
}
