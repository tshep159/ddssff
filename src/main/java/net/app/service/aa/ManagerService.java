/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.service.aa;

import java.util.List;
import net.app.dto.aa.Manager;

/**
 *
 * @author Tshepo
 */
public interface ManagerService {
    
        
public List<Manager> list();

public void save(Manager user);
public void update(Manager user);

public Manager get(long id);
    
}
