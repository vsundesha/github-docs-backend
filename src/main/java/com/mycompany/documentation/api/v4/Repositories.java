package com.mycompany.documentation.api.v4;

import com.mycompany.documentation.api.logic.v4.ReposQuery;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lsimon
 */
@Path("/repositories")
@Produces(MediaType.APPLICATION_JSON)
public class Repositories {
    
    /*@GET
    @Path("/{topics}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getReposWIthTopic(@DefaultValue("") @QueryParam("topics") String[] topics) {
        ReposQuery reposQueryClass = new ReposQuery();

        return reposQueryClass.getReposWithTopic(topics);
    }*/
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] getquerylist(@DefaultValue("") @QueryParam("t") String[] t) {
        return t;
    }
}
