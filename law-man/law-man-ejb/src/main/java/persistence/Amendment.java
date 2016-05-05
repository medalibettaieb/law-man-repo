package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Amendment
 *
 */
@Entity

public class Amendment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dateOfAmendment;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Law lawProposed;
	@ManyToOne
	private Law lawAmended;
	@ManyToOne
	private Article articleProposed;
	@ManyToOne
	private Article articleAmended;


	public Amendment() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfAmendment() {
		return this.dateOfAmendment;
	}

	public void setDateOfAmendment(Date dateOfAmendment) {
		this.dateOfAmendment = dateOfAmendment;
	}

	public Law getLawProposed() {
		return lawProposed;
	}

	public void setLawProposed(Law lawProposed) {
		this.lawProposed = lawProposed;
	}

	public Law getLawAmended() {
		return lawAmended;
	}

	public void setLawAmended(Law lawAmended) {
		this.lawAmended = lawAmended;
	}

	public Article getArticleProposed() {
		return articleProposed;
	}

	public void setArticleProposed(Article articleProposed) {
		this.articleProposed = articleProposed;
	}

	public Article getArticleAmended() {
		return articleAmended;
	}

	public void setArticleAmended(Article articleAmended) {
		this.articleAmended = articleAmended;
	}

}
