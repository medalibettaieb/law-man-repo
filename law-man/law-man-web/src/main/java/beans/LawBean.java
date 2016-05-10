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

	public String doAddLaw() {
		lawManagementLocal.addLaw(law);
		return "/a";
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

}
