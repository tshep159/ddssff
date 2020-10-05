/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.serviceImpl.aa;

import net.app.dto.aa.Team;
import java.util.List;
import net.app.dto.aa.Agent;
import net.app.repository.aa.TeamRepository;
import net.app.service.aa.TeamService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tshepo
 */

@Service
public class TeamServiceImpl implements TeamService{

    TeamRepository dao;
    
    @Override
    public List<Team> list() {
  
    return dao.findAll();
    }

    @Override
    public void save(Team team) {
   
      dao.save(team);
    }

    @Override
    public void update(Team team) {
      dao.save(team);
    }

    @Override
    public Team get(long id) {
    return dao.getOne(id);}

    @Override
    public List<Agent> findTeamAgents(long id) {
       
        return dao.findAgentByTeamId(id);
    }
    
}
