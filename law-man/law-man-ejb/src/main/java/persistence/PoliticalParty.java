package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: PoliticalParty
 *
 */
@Entity

public class PoliticalParty implements Serializable {

	@Id
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "politicalParty")
	private List<RegistrationDetail> registrationDetails;

	public PoliticalParty() {
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
