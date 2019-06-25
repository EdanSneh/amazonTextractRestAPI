package proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Component
@Path("change")
public class PeopleComp {

    private PersonService personService;

    @Autowired
    public PeopleComp(PersonService personService) {
        this.personService = personService;
    }

    @PUT
    @Path("/assignee/{id}")
    public Response changeAssignee(@PathParam("id") String id, @Context HttpServletRequest httpServletRequest) {
        try {
            System.out.println("test");
            Person person = personService.changeAsignee(id, httpServletRequest.getPart("Assignee").toString());
            return Response.ok(person).build();
        } catch(PersonException e) {
            return Response.status(Response.Status.FORBIDDEN).build();
        } catch(Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

}
