package by.electropoisoned.football_manager_simulator_api.service.impl;

import by.electropoisoned.football_manager_simulator_api.dto.team.TeamDTO;
import by.electropoisoned.football_manager_simulator_api.exception.TeamNotFoundException;
import by.electropoisoned.football_manager_simulator_api.mapper.ModelMapper;
import by.electropoisoned.football_manager_simulator_api.model.Team;
import by.electropoisoned.football_manager_simulator_api.model.enums.Country;
import by.electropoisoned.football_manager_simulator_api.repository.TeamRepository;
import by.electropoisoned.football_manager_simulator_api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository, ModelMapper modelMapper) {
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TeamDTO createTeam(TeamDTO teamDTO) {
        //Team team = modelMapper.toTeam(teamDTO);

        Team team = new Team();

        team.setName(teamDTO.getName());
        team.setCountry(Country.valueOf(teamDTO.getCountry()));
        team.setFoundationDate(LocalDate.parse(teamDTO.getFoundationDate()));

        Team savedTeam = teamRepository.save(team);
        return modelMapper.toTeamDTO(savedTeam);
    }

    @Override
    public TeamDTO getTeamById(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException());
        return modelMapper.toTeamDTO(team);
    }

    @Override
    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll().stream()
                .map(modelMapper::toTeamDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TeamDTO updateTeam(Long id, TeamDTO teamDTO) {
        Team existingTeam = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException());
        existingTeam.setName(teamDTO.getName());
//        existingTeam.setCountry(teamDTO.getCountry());
//        existingTeam.setFoundationDate(teamDTO.getFoundationDate());

        Team updatedTeam = teamRepository.save(existingTeam);
        return modelMapper.toTeamDTO(updatedTeam);
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}
