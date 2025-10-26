package com;

public class PlayerRating {

	private int playerPosition;
	private String playerName;
	private float criticOneRating;
	private float criticTwoRating;
	private float criticThreeRating;
	private float averageRating;
	private char category;
	
	PlayerRating(int playerPosition, String playerName){
		this.playerPosition = playerPosition;
		this.playerName =playerName;
	}
	
	void calculateAverageRating(float criticOneRating,float criticTwoRating){
		this.averageRating = (criticOneRating+criticTwoRating)/2;
	}
	
	void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating) {
		this.averageRating = (criticOneRating+criticTwoRating+criticThreeRating)/3;
	}
	
	void calculateCategory() {
		
		if(averageRating>8) {
			category = 'A'; 
		}
		else if(averageRating>5 && averageRating<=8) {
			category = 'B';
		}
		else if(averageRating>0 && averageRating<=5) {
			category = 'C';
		}
	}
	
	void display() {
		System.out.println("the player name is "+playerName);
		System.out.println("the player position is "+playerPosition);
		System.out.println("the average rating is "+averageRating);
		System.out.println("the category is "+category);
	}
	
	public static void main(String[] args) {
		
		PlayerRating player = new PlayerRating(1,"Oscar");
		
		player.calculateAverageRating(9,9.9f);
		player.calculateCategory();
		player.display();
		
	}
}
