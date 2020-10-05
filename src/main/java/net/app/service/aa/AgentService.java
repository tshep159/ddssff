/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.service.aa;

import net.app.dto.aa.Agent;
import java.util.List;

/**
 *
 * @author Tshepo
 */
public interface AgentService {
    
    
public List<Agent> list();

public void save(Agent user);
public void update(Agent user);

public Agent get(long id);

    
}
