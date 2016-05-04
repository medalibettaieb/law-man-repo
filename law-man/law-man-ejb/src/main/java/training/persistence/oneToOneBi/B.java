package training.persistence.oneToOneBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: B
 *
 */
@Entity

public class B implements Serializable {

	@Id
	private int idB;
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "b")
	private A a;

	public B() {
		super();
	}

	public int getIdB() {
		return this.idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
