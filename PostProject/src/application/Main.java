package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Post p1 = new Post("Traveling to New Zealand","I'm going to visit this wonderful country!");
		for(int i=0;i<12;i++)
			p1.like();
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		sc.close();
	}

}
