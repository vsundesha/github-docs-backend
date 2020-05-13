package com.mycompany.documentation.api.v4;


import com.mycompany.documentation.api.logic.v4.Constants;
import com.mycompany.documentation.api.logic.v4.ReposQuery;
import java.util.ArrayList;
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

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getReposWIthTopic(@QueryParam("t") ArrayList<String> topics,
            @DefaultValue("") @QueryParam("c") String c,
            @DefaultValue("") @QueryParam("f") String f,
            @DefaultValue("") @QueryParam("r") String r) {

        ReposQuery reposQueryClass = new ReposQuery();
        ArrayList<String> topicstofilter = new ArrayList<>();
        
        if(!topics.isEmpty()){
            for(String s : topics){
                topicstofilter.add(s);
            }
        }
        topicstofilter.add(Constants.project);
        return reposQueryClass.getReposWithTopic(topicstofilter);
    }
}
