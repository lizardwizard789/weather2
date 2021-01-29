package com.company.jones;

public class Main {

    public static void main(String[] args) {
	int[] temperature={45, 29, 10, 22, 41, 28, 33};
	int[] precipitationChance={95, 60, 25, 5, 0, 75, 90};
	String[] week= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	for (int i=0; i<temperature.length; i++){

	if (temperature[i]<=32 && precipitationChance[i]>50)
        System.out.println("on "+week[i]+", it will gonna snow maybe!");
    }
}
}
