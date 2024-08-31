package practice_ser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Run3_JACKson_deSerTest {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		
		ObjectMapper ojm =new ObjectMapper();
		
	Project pobj = ojm.readValue(new File ("./project1.json"),Project.class);
	
	System.out.println(pobj.getprojectName());
	System.out.println(pobj.getTeamSize());
	System.out.println(pobj.getStatus());
	System.out.println(pobj.getCreatedBy());
		
		

	}

}
