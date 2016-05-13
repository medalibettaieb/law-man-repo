package resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import persistence.Law;
import services.basicmanagement.interfaces.LawManagementLocal;

@Path("/law")
@RequestScoped
public class LawResource {
	@Inject
	private LawManagementLocal lawManagementLocal;

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Law> doFindAllProducts() {
		return lawManagementLocal.findAllLaws();
	}
}
