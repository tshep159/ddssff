package net.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.app.dto.aa.Agent;
import net.app.dto.aa.Manager;
import net.app.dto.aa.Team;
import net.app.service.aa.AgentService;
import net.app.service.aa.ManagerService;
import net.app.service.aa.TeamService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class JsonDataController {

	
    private final ManagerService man;
    private final AgentService agent;
    private final  TeamService team;

    @Autowired
    public JsonDataController(ManagerService man, AgentService agent, TeamService team) {
        this.man = man;
        this.agent = agent;
        this.team = team;
    }
    
 
    
       //GET /teams/ - Returns a list of teams in the database in JSON format
        @RequestMapping("teams")
	@ResponseBody
	public List<Team> listteams() {
		
		return team.list();
				
	}
        
        //GET /team/{{id}}/ - Returns a detail view of the specified team in JSON format
     
           @RequestMapping("team/{id}")
	@ResponseBody
	public Team getTeam(@PathVariable long id) {
		
		return team.get(id);
				
	}
        //GET /agents/ - Returns a list of all agents in the database in JSON format
        @RequestMapping("agents")
	@ResponseBody
	public List<Agent> listAgents() {
		
		return agent.list();
				
	}
        
        //GET /agent/{{id}}/ - Returns a detail view of the specified agent in JSON format. This should include team details.
	
         @RequestMapping("agent/{id}")
	@ResponseBody
	public Agent getTeamAgents (@PathVariable int id) {
            Agent _agent = agent.get(id);
		
		return _agent;
				
	}
        
//POST /team/ - Creates a new team with the specified details - Expects a JSON body
          @RequestMapping(value="team", method = RequestMethod.POST)
	public void save(Team t) {
		 team.save(t);
				
	}
        
       // POST /agent/ - Creates a new agent with the specified details - Expects a JSON body
        
          
        @RequestMapping(value="agent", method = RequestMethod.POST)
	public void  addAgent(Agent a) {
	
		 agent.save(a);
		 		
	}
        
        //POST /manager/ - Creates a new manager with the specified details - Expects a JSON body
        
        
        @RequestMapping(value="manager", method = RequestMethod.POST)
	public void save(Manager m) {
		 man.save(m);
				
	}
        
        
      //PUT /team/{{id}}/agent - Assigns an agent to the specified team
	@RequestMapping(value="team/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public void updateTeam (@PathVariable int id) {
		Team _team = team.get(id);
                
		team.update(_team);
				
	}
     
      
        
        

	@RequestMapping("team/{id}/agent")
	@ResponseBody
	public List<Agent> gtTeamAgents (@PathVariable int id) {
		
		return team.findTeamAgents(id);
				
	}
        
        
        

}
