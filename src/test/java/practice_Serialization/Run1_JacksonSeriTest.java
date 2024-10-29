package practice_Serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(
	value = {"CreatedBy",
			"projecName",
			"teamSize",
			"status"
			}
)
@JsonIgnoreProperties(value= {"teamSize"},allowSetters = true)


class Project{   //POJO class [Plain old java Object]

	private String projectName;
     @JsonProperty(value="Created By")
	private String CreatedBy;
	private int teamSize;
	private String status;
	
	private Project() {}
	
	public Project(String projectName, String CreatedBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.CreatedBy = CreatedBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		this.CreatedBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSiza(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
public class Run1_JacksonSeriTest {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		Project pObj= new Project("orange","DK",2,"Created");
		
		ObjectMapper objM= new ObjectMapper();
		objM.writeValue(new File("./project1.json"), pObj);
		System.out.println("==========end=========");

	}

}
