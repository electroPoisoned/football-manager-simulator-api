package by.electropoisoned.football_manager_simulator_api.mapper.team;

import by.electropoisoned.football_manager_simulator_api.dto.team.TeamDTO;
import by.electropoisoned.football_manager_simulator_api.mapper.BaseMapper;
import by.electropoisoned.football_manager_simulator_api.model.Team;
import org.mapstruct.Mapper;

@Mapper(
        config = BaseMapper.class,
        componentModel = "spring"
)
public interface TeamMapper extends BaseMapper<Team, TeamDTO> {
}
