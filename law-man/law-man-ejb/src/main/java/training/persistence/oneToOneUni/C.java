package training.persistence.oneToOneUni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: C
 *
 */
@Entity

public class C implements Serializable {

	@Id
	private int idC;
	private static final long serialVersionUID = 1L;

	@OneToOne
	private D d;

	public C() {
		super();
	}

	public int getIdC() {
		return this.idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}

	public D getD() {
		return d;
	}

	public void setD(D d) {
		this.d = d;
	}

}
