package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class RegistrationDetailId implements Serializable {
	private int idUser;
	private int idPolitocalParty;
	private Date datOfTransfert;

	public RegistrationDetailId() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationDetailId(int idUser, int idPolitocalParty, Date datOfTransfert) {
		super();
		this.idUser = idUser;
		this.idPolitocalParty = idPolitocalParty;
		this.datOfTransfert = datOfTransfert;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datOfTransfert == null) ? 0 : datOfTransfert.hashCode());
		result = prime * result + idPolitocalParty;
		result = prime * result + idUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationDetailId other = (RegistrationDetailId) obj;
		if (datOfTransfert == null) {
			if (other.datOfTransfert != null)
				return false;
		} else if (!datOfTransfert.equals(other.datOfTransfert))
			return false;
		if (idPolitocalParty != other.idPolitocalParty)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdPolitocalParty() {
		return idPolitocalParty;
	}

	public void setIdPolitocalParty(int idPolitocalParty) {
		this.idPolitocalParty = idPolitocalParty;
	}

	public Date getDatOfTransfert() {
		return datOfTransfert;
	}

	public void setDatOfTransfert(Date datOfTransfert) {
		this.datOfTransfert = datOfTransfert;
	}

}
