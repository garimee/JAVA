package arraylist;

public class book implements Comparable<book> {

	private String title;
	private String writer;
	private int year;
	
	public book() {}
	public book(String title, String writer, int year) {
		this.title = title;
		this.writer = writer;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + " 저자: " + writer + " 출간 년도: " + year;
	}
	
	@Override
	public boolean equals(Object o) {
		 String title = (String)o;
		 
		 return this.title.equals(title);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
