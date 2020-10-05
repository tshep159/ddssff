/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.dto.aa;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Tshepo
 */

@Entity
public class Manager {
    
    
      @Id
    @GeneratedValue
    private Long id;
    private String name;
    
  
    @OneToMany(mappedBy = "manager")
    private Set<Team> teams;

    
    @OneToMany(mappedBy = "manager")
    private Set<Agent> agents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }


    
    
    
    
}
