package practice_Serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;


class Project1 {

	String projectName;
	String projectstatus;
	int teamSize;
	List<String> teamMember;
	Projectmanager projectmanager;

	Project1(String projectName, String projectstatus, int teamSize, List<String> teamMember,
			Projectmanager projectmanager) {
		super();
		this.projectName = projectName;
		this.projectstatus = projectstatus;
		this.teamSize = teamSize;
		this.teamMember = teamMember;
		this.projectmanager = projectmanager;
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
 
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamMember(List<String> teamMember) {
		this.teamMember = teamMember;
	}
	public List<String> getTeamMember() {
		return teamMember;
	}
	public void setProjectmanager(Projectmanager projectmanager) {
		this.projectmanager = projectmanager;
	}
	public Projectmanager getProjectmanager() {
		return projectmanager;
	}
}
	 class Projectmanager {
		String name;
		String empID;
		Projectmanager(String name, String empID) {
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

public class Run1_POJO {
	public static void main(String[] args) throws Throwable, Throwable, IOException {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("jhon");
		lst.add("devid");
		lst.add("stev");
		
		Projectmanager pM = new Projectmanager("Sagar", "tp01");
		Project1 projectObj = new Project1("DK", "created", 10, lst, pM);
	    System.out.println(projectObj.projectName);
	    
	    ObjectMapper objM = new ObjectMapper();
	    objM.writeValue(new File("./Project10.json"), projectObj);
	}
 
}
