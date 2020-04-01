package com.mycompany.documentation.model;

import java.util.ArrayList;

/**
 *
 * @author lsimon
 */
public class Repo {
    private String name;
    private ArrayList<Topic> topics;

    public Repo() {
    }

    public Repo(String name, ArrayList<Topic> topics) {
        this.name = name;
        this.topics = topics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Repo{name=").append(name);
        sb.append(", topics=").append(topics);
        sb.append('}');
        return sb.toString();
    }
}