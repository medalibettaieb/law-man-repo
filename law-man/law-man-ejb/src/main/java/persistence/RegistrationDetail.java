package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: RegistrationDetail
 *
 */
@Entity

public class RegistrationDetail implements Serializable {
	@EmbeddedId
	private RegistrationDetailId id;
	private String role;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", insertable = false, updatable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "idPolitocalParty", referencedColumnName = "id", insertable = false, updatable = false)
	private PoliticalParty politicalParty;

	public RegistrationDetail() {
		super();
	}

	public RegistrationDetail(String role, User user, PoliticalParty politicalParty) {
		this.id = new RegistrationDetailId(user.getId(), politicalParty.getId(), new Date());
		this.role = role;
		this.user = user;
		this.politicalParty = politicalParty;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public RegistrationDetailId getId() {
		return id;
	}

	public void setId(RegistrationDetailId id) {
		this.id = id;
	}

	public PoliticalParty getPoliticalParty() {
		return politicalParty;
	}

	public void setPoliticalParty(PoliticalParty politicalParty) {
		this.politicalParty = politicalParty;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
