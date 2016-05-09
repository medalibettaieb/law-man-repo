package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	@Id
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "user")
	private List<RegistrationDetail> registrationDetails;

	public User() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RegistrationDetail> getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(List<RegistrationDetail> registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

}
