package rowGame;

public class thougth {
	
	private String thougth = "";
	private int place = 0;
	
	public thougth(String s){
		thougth = s;
	}
	
	public String getThought(){
		return thougth;
	}
	
	public boolean addOnPlace(){
		setPlace(getPlace() + 1);
		return true;
	}
	
	public boolean removeFromPlace(){
		setPlace(getPlace() - 1);
		return true;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

}
