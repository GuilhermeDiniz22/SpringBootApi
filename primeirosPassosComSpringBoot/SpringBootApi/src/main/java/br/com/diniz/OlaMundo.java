package br.com.diniz;

public class OlaMundo {
	
	private final long id;
	
	private final String content;
	
	public OlaMundo(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
}
