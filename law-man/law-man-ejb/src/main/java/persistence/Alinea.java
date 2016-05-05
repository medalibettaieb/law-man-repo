package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Alinea
 *
 */
@Entity

public class Alinea implements Serializable {
	@Id
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Section section;

	public Alinea() {
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

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

}
