package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments;
	
	public Post(String title, String content) {
		super();
		this.moment = new Date();
		this.title = title;
		this.content = content;
		this.likes = 0;
		this.comments = new ArrayList<>();
	}

	public void like() {
		this.likes+=1;
	}
	
	public List<Comment> getComment(){
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes+" likes - ");
		sb.append(sdf.format(moment)+"\n");
		sb.append(content+"\n");
		sb.append("Comments:\n");
		for(Comment c: comments)
			sb.append(c.getText()+"\n");
		return sb.toString();
	}
	
	
}
