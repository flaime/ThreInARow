package rowGame;

import java.awt.List;
import java.util.ArrayList;

public class Knowledge {
	
	private String knowledgeStart = "";
	private ArrayList<thougth> idea = new ArrayList<>();
	
	public Knowledge(String knowledgeStart){
		this.knowledgeStart = knowledgeStart;
	}
	
	public boolean setIdea(String s){
		this.idea.add(new thougth(s));
		return true;
	}
	
	public thougth find(String s){
		int number = idea.indexOf(s);
		if(number != -1)
			return idea.get(number);
		
		return null;
		
	}
	
	

}
