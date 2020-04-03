package com.mycompany.documentation.api.logic.v4;

import static com.mycompany.documentation.api.logic.v4.Constants.*;
import org.json.JSONObject;

/**
 *
 * @author lsimon
 */
public class NumRepos {

    public NumRepos() {
    }

    /**
     * It retrieves the number of repos of an owner
     * @return int num of repos
     */
    public int getNumRepos() {
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("query", "query {\n"
                + "  repositoryOwner(login: \"" + login + "\") {\n"
                + "    repositories(first: 10) {\n"
                + "      totalCount\n"
                + "    }\n"
                + "  }\n"
                + "}");

        JsonObj jsonObjClass = new JsonObj();
        String jsonString = jsonObjClass.getJsonObj(jsonObj);

        JSONObject json = new JSONObject(jsonString);

        //remove keys we don't need
        JSONObject repositories = json.getJSONObject("data").getJSONObject("repositoryOwner").getJSONObject("repositories");

        //get number of repos
        int numRepos = repositories.getInt("totalCount");

        return numRepos;
    }
}