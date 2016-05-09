package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import persistence.User;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity

public class Agent extends User implements Serializable {

	
	private String role;
	private static final long serialVersionUID = 1L;

	public Agent() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
   
}
