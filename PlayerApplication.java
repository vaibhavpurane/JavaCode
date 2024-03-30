class Player
{   private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	private int run;
}
class Team
{  Player []player;
	void setPlayer(Player ...players)
	{
		this.player=players;
	}
	void show(){	
		for(int i=0;i<player.length; i++){
			System.out.println(player[i].getId()+"\t"+player[i].getName()+"\t"+player[i].getRun());
		}
	}
}
public class PlayerApplication {
	  public static void main(String x[]) {
		 
		 Player p1 = new Player();
		 p1.setId(1);
		 p1.setName("XYZ");
		 p1.setRun(1000);

		 Player p2 = new Player();
		 p2.setId(2);
		 p2.setName("PQR");
		 p2.setRun(2000);
		
		 Team t  = new Team();
		 t.setPlayer(p1,p2);
		

		 System.out.println("display all data of players");
		 t.show();
	  }
}
