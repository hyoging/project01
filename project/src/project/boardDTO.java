package project;

public class boardDTO {
	private String writer,title,contents;
	private Integer postingDate;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Integer getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(Integer postingDate) {
		this.postingDate = postingDate;
	}
}
