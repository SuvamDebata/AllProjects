 package practice_ser;

import java.io.File;


import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonPropertyOrder(
	value = {"projectName",
			"createdBy",
			"teamSize",
			"status"
			
	}
)

@JsonIgnoreProperties(
value = {
		"teamSize"},allowSetters = true)

class Project{ //pojo class (plain old java object)
	
	//step1:// create variable
	
	private String projectName;
	@JsonProperty(value =" created By ")
	private String createdBy;
	private int teamSize;
	private String status;
	
	
	//step3:create empty constructor for deserialization
	
	private Project() {}
	
	//step2:then create constructor

	public Project(String projectName, String createdBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	public String getprojectName() {
		return projectName;
	}

	public void setprojectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamsize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
 
public class Run1_JACKsonSerTest {
	 public static void main(String[] args) throws Throwable, DatabindException, IOException {
		 Project pobj = new Project("Rusting","SUPRIYA",10,"Created");
		 
		 ObjectMapper objm = new ObjectMapper();
		 objm.writeValue(new File ("./project2.json"),pobj );
		 System.out.println("============END========");
		 
		 
	}
	
	

}
