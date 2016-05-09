package persistence;

import java.io.Serializable;
import javax.persistence.*;
import persistence.User;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity

public class Member extends User implements Serializable {

	
	private int place;
	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}   
	public int getPlace() {
		return this.place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
   
}
