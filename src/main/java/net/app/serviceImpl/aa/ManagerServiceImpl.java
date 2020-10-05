/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.serviceImpl.aa;

import java.util.List;
import net.app.dto.aa.Manager;
import net.app.repository.aa.ManagerRepository;
import net.app.service.aa.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tshepo
 */

@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
   ManagerRepository dao;
    
    @Override
    public List<Manager> list() {
        
       
        return dao.findAll();
    }

    @Override
    public void save(Manager user) {
       
         dao.save(user);
    }

    @Override
    public void update(Manager user) {

    
         dao.save(user);
    }

    @Override
    public Manager get(long id) {
    return dao.findOne(id);
    }
    
}
