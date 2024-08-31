package practice_ser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

   class Projectpojo {

	String projectName;
    String projectstatus;
    int teamsize;
	List<String> teamMember;
	ProjectManager projectManager;
	
	

	public Projectpojo(String projectName, String projectstatus, int teamsize, List<String> teamMember,
			ProjectManager projectManager) {
		super();
		this.projectName = projectName;
		this.projectstatus = projectstatus;
		this.teamsize = teamsize;
		this.teamMember = teamMember;
		this.projectManager = projectManager;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectstatus(String projectstatus) {
		this.projectstatus = projectstatus;
	}

	public String getProjectstatus() {
		return projectstatus;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamMember(List<String> teamMember) {
		this.teamMember = teamMember;
	}

	public List<String> getTeamMember() {
		return teamMember;
	}

	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}

	public ProjectManager  getProjectManager() {
		return projectManager;
	}

}

class ProjectManager {

	String name;
	String empID;
	
	

	public ProjectManager(String name, String empID) {
		super();
		this.name = name;
		this.empID = empID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpID() {
		return empID;
	}

}

public class Run3_POJO {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		
		List<String> lst = new ArrayList<String>();
		lst.add("david");
		lst.add("david");
		lst.add("stev");
		
		ProjectManager pM = new ProjectManager("sagar","tp01");
		
		Projectpojo projectobj = new Projectpojo("SUVAM", "Created", 10,lst  , pM);
		//System.out.println(projectobj.projectName);
		
		//for fetchimg the data as json file
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File ("./project3.json"), projectobj);
		

	}

}
