public class Team {

	private String teamName;
	private String coach;
	
	public Team(String name,String coach) {
		setTeamName(name);
		setCoach(coach);
	}
	
	public String getTeamName() {
		return this.teamName;
	}

	public String getCoach() {
		return this.coach;
	}

	public void setTeamName(String TeamName) {
		this.teamName = TeamName;
	}

	public void setCoach(String Coach) {
		this.coach = Coach;
	}

}