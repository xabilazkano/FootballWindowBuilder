public class FootballMatch {

	private Team localTeam;
	private Team visitorTeam;
	private int goalsLocal;
	private int goalsVisitor;
	
	public FootballMatch(Team localTeam,int goalsLocal,Team visitorTeam,int visitorGoals) {
		setLocalTeam(localTeam);
		setGoalsLocal(goalsLocal);
		setVisitorTeam(visitorTeam);
		setGoalsVisitor(visitorGoals);
	}

	public Team getLocalTeam() {
		return this.localTeam;
	}

	public void setLocalTeam(Team localTeam) {
		this.localTeam=localTeam;
	}

	public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam=visitorTeam;
	}

	public int getGoalsLocal() {
		return goalsLocal;
	}

	public void setGoalsLocal(int goalsLocal) {
		this.goalsLocal=goalsLocal;
	}

	public int getGoalsVisitor() {
		return goalsVisitor;
	}

	public void setGoalsVisitor(int goalsVisitor) {
		this.goalsVisitor=goalsVisitor;
	}
}