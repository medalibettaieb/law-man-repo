package training.persistence.oneToManyUniMasterSide;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: J
 *
 */
@Entity

public class J implements Serializable {

	@Id
	private int idJ;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private I i;

	public J() {
		super();
	}

	public int getIdJ() {
		return this.idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

}
