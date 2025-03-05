package by.electropoisoned.football_manager_simulator_api.mapper;

import by.electropoisoned.football_manager_simulator_api.dto.TeamDTO;
import by.electropoisoned.football_manager_simulator_api.model.Team;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface TeamMapper extends BaseMapper<Team, TeamDTO> {
}
