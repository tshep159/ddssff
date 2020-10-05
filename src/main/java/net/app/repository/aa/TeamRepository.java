/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.repository.aa;

import java.util.List;
import net.app.dto.aa.Agent;
import net.app.dto.aa.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Tshepo
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("FROM Team WHERE  agent.id = :agentId")
	public List<Agent> findAgentByTeamId(@Param("agentId") long cartId);

    
}
