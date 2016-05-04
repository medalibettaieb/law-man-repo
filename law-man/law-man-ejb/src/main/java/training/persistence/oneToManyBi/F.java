package training.persistence.oneToManyBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: F
 *
 */
@Entity

public class F implements Serializable {

	@Id
	private int idF;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private E e;

	public F() {
		super();
	}

	public int getIdF() {
		return this.idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

}
