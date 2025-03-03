package by.electropoisoned.football_manager_simulator_api.service.impl;

import by.electropoisoned.football_manager_simulator_api.dto.team.TeamDTO;
import by.electropoisoned.football_manager_simulator_api.exception.TeamNotFoundException;
import by.electropoisoned.football_manager_simulator_api.mapper.team.TeamMapper;
import by.electropoisoned.football_manager_simulator_api.model.Team;
import by.electropoisoned.football_manager_simulator_api.repository.TeamRepository;
import by.electropoisoned.football_manager_simulator_api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    @Override
    public TeamDTO createTeam(TeamDTO teamDTO) {
        Team team = teamMapper.toEntity(teamDTO);
//
//        Team team = new Team();
//
//        team.setName(teamDTO.getName());
//        team.setCountry(teamDTO.getCountry());
//        team.setFoundationDate(teamDTO.getFoundationDate());
//
        Team savedTeam = teamRepository.save(team);
        return teamMapper.toDto(savedTeam);
    }

    @Override
    public TeamDTO getTeamById(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException());
        return teamMapper.toDto(team);
    }

    @Override
    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll().stream()
                .map(teamMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TeamDTO updateTeam(Long id, TeamDTO teamDTO) {
        Team existingTeam = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException());

        existingTeam.setName(teamDTO.getName());
        existingTeam.setCountry(teamDTO.getCountry());
        existingTeam.setFoundationDate(teamDTO.getFoundationDate());

        Team updatedTeam = teamRepository.save(existingTeam);
        return teamMapper.toDto(updatedTeam);
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}
