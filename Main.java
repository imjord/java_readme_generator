import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.example.CreateFile;
import com.example.ReadMeData;
import com.example.WriteFile;


class Main {

    public static void main(String[] args) {
         // read template file
         ReadMeData data = new ReadMeData();
            CreateFile.readFile(data);
            System.out.println("imjord java readme generator");
        try (Scanner scanObj = new Scanner(System.in)) {
           
            System.out.println("What is your github username?(Must be exact)");
            // get the users data
            String githubUsername = scanObj.nextLine(); 
            data.setUsername(githubUsername);
            System.out.println("What is your github reponame?(Must be exact)");
            String githubRepoName = scanObj.nextLine(); 
            data.setRepoName(githubRepoName);
             System.out.println("What is your project name?");
            String githubProjectName = scanObj.nextLine(); 
            data.setProjectName(githubProjectName);
            System.out.println("What is your project description?");
            String githubProjectDescription = scanObj.nextLine(); 
            data.setProjectBio(githubProjectDescription);
            System.out.println("What is are the skills you used for this project?");
            String githubProjectSkills = scanObj.nextLine(); 
            data.setSkills(githubProjectSkills);
            System.out.println("Are there any preresiquites for this project?");
            String githubPre = scanObj.nextLine(); 
            data.setPrerequisites(githubPre);
            System.out.println("any links for usage/demos?");
            String githubProjectUsage = scanObj.nextLine(); 
            data.setUsageLinks(githubProjectUsage);
            System.out.println("Do you have a roadmap for any future features?");
            String githubRoadmap = scanObj.nextLine(); 
            data.setRoadMap(githubRoadmap);
            System.out.println("What license do you use?");
            String githubLicense = scanObj.nextLine(); 
            data.setLicense(githubLicense);
            // make the readme if not already made...
            CreateFile.makeFile();
            // get template data and assign it to the template
            String template = data.returnReadMeDataTemplate();
            // write the data to the read me.
            WriteFile.writeFile(template);
        } 
    }
}