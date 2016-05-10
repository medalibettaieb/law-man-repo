package beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import persistence.Law;
import services.basicmanagement.interfaces.LawManagementLocal;

@ManagedBean
@SessionScoped
public class LawBean {

	@EJB
	private LawManagementLocal lawManagementLocal;

	private Law law = new Law();
	private List<Law> laws = new ArrayList<>();
	private Law lawSlected = new Law();
	private Boolean display = false;

	public void doSelect(Law law) {
		lawSlected = law;
		display = true;
	}

	public void doDelete() {
		lawManagementLocal.deleteLaw(lawSlected.getId());
		lawSlected = new Law();
		display = false;
	}

	public void doUpdate() {
		lawManagementLocal.updateLaw(lawSlected);
		lawSlected = new Law();
		display = false;
	}

	public String doAddLaw() {
		lawManagementLocal.addLaw(law);
		return "/pages/lawManagement/listLaws";
	}

	public Law getLaw() {
		return law;
	}

	public void setLaw(Law law) {
		this.law = law;
	}

	public List<Law> getLaws() {
		laws = lawManagementLocal.findAllLaws();
		return laws;
	}

	public void setLaws(List<Law> laws) {
		this.laws = laws;
	}

	public Law getLawSlected() {
		return lawSlected;
	}

	public void setLawSlected(Law lawSlected) {
		this.lawSlected = lawSlected;
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

}
