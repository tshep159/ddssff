/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.service.aa;

import java.util.List;
import net.app.dto.aa.Agent;
import net.app.dto.aa.Team;

/**
 *
 * @author Tshepo
 */
public interface TeamService {
    
   List<Team> list();

public void save(Team team);
public void update(Team team);

public Team get(long id);

public List<Agent> findTeamAgents(long id);
    
}
