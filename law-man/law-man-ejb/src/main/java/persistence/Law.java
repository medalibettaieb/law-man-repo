package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Law implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	private TypeLaw typeLaw;

	@OneToMany(mappedBy = "law", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JsonIgnore
	private List<Chapter> chapters;
	@OneToMany(mappedBy = "lawProposed")
	@JsonIgnore
	private List<Amendment> amendmentsMaster;
	@OneToMany(mappedBy = "lawAmended")
	@JsonIgnore
	private List<Amendment> amendmentsSlave;

	public Law() {
	}

	public Law(String text, TypeLaw typeLaw) {
		super();
		this.text = text;
		this.typeLaw = typeLaw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public TypeLaw getTypeLaw() {
		return typeLaw;
	}

	public void setTypeLaw(TypeLaw typeLaw) {
		this.typeLaw = typeLaw;
	}

	public List<Amendment> getAmendmentsMaster() {
		return amendmentsMaster;
	}

	public void setAmendmentsMaster(List<Amendment> amendmentsMaster) {
		this.amendmentsMaster = amendmentsMaster;
	}

	public List<Amendment> getAmendmentsSlave() {
		return amendmentsSlave;
	}

	public void setAmendmentsSlave(List<Amendment> amendmentsSlave) {
		this.amendmentsSlave = amendmentsSlave;
	}

	public void linkChaptersToThisLaw(List<Chapter> chapters) {
		this.chapters = chapters;
		for (Chapter c : chapters) {
			c.setLaw(this);
		}
	}

	@Override
	public String toString() {
		return "Law [id=" + id + ", text=" + text + ", typeLaw=" + typeLaw + ", chapters=" + chapters + "]";
	}

}
