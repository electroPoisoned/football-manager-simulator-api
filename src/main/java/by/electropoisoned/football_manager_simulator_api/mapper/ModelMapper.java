package by.electropoisoned.football_manager_simulator_api.mapper;

import by.electropoisoned.football_manager_simulator_api.dto.player.PlayerDTO;
import by.electropoisoned.football_manager_simulator_api.dto.team.TeamDTO;
import by.electropoisoned.football_manager_simulator_api.model.Player;
import by.electropoisoned.football_manager_simulator_api.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelMapper {

    Player toPlayer(PlayerDTO playerDTO);
    PlayerDTO toPlayerDTO(Player player);

    Team toTeam(TeamDTO teamDTO);
    TeamDTO toTeamDTO(Team team);
}
