package com.example;
import java.util.Scanner;

public class ReadMeData {
    private String githubUsername;
    private String repoName;
    private String projectName;
    private String projectBio;
    private String skills;
    private String prerequisites;
    private String usageLinks;
    private String roadMap;
    private String license;
    private String data; 
    private String template;
    
    public void setSkills(String skills){
        this.skills = skills;
    }

    public void setPrerequisites(String pre){
        this.prerequisites = pre;
    }

    public void setUsageLinks(String usage){
        this.usageLinks = usage;
    }

    public void setRoadMap(String roadMap){
        this.roadMap = roadMap;
    }

    public void setLicense(String license){
        this.license = license;
    }
    
    public void setTemplate(String template){
        this.template = template;
    }

    public String getTemplate(){
        return this.template;
    }

   
    public String returnReadMeDataTemplate() {
        System.out.println(getTemplate());
        data = template.replace("{GITHUB_USERNAME}", githubUsername)
                      .replace("{REPO_NAME}", repoName)
                      .replace("{PROJECT_NAME}", projectName)
                      .replace("{PROJECT_DESCRIPTION}", projectBio)
                      .replace("{SKILLS}", skills)
                      .replace("{PREREQUISITES}", prerequisites)
                      .replace("{USAGE_LINKS}", usageLinks)
                      .replace("{ROADMAP}", roadMap)
                      .replace("{LICENSE}", license);
        return data;
    }

    public String getUsername() {
        return this.githubUsername;
    }

    public void setUsername(String username){
        this.githubUsername = username;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectBio() {
        return this.projectBio;
    }

    public void setProjectBio(String projectBio) {
        this.projectBio = projectBio;
    }

}
