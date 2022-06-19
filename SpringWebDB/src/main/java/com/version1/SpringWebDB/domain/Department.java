package com.version1.SpringWebDB.domain;

public class Department {
    private int dep_id;
    private String dep_name;

    public int getDep_id() {
        return dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public int getTeam_id() {
        return team_id;
    }

    private int team_id;

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep_id=" + dep_id +
                ", dep_name='" + dep_name + '\'' +
                ", team_id=" + team_id +
                '}';
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
