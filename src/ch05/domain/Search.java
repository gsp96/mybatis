package ch05.domain;

public class Search {
	private String userName;
	private Post post;
	
	public Search(String userName, Post post) {
		this.post = post;
		this.userName = userName;
	}
}
