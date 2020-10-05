/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.repository.aa;

import net.app.dto.aa.Manager;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tshepo
 */
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    
}
