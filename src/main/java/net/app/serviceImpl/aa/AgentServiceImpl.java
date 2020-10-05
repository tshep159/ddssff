/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.serviceImpl.aa;

import java.util.List;
import net.app.dto.aa.Agent;
import net.app.repository.aa.AgentRepository;
import net.app.service.aa.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tshepo
 */

@Service
public class AgentServiceImpl implements AgentService{

    
    @Autowired
    AgentRepository dao;
    @Override
    public List<Agent> list() {
       
        return dao.findAll();
    }

    @Override
    public void save(Agent user) {
      dao.save(user);
    }

    @Override
    public void update(Agent user) {
      dao.save(user);

    }

    @Override
    public Agent get(long id) {
       return dao.getOne(id);
    }
    
    
    
}
