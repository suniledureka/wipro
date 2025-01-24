package com.wipro.java.util;

public class Book implements Comparable<Book> {
	private Long bookId;
	private String bookTitle;
	private String bookAuthor;

	public Book() {
		super();		
	}

	public Book(Long bookId, String bookTitle, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		String book = String.format("%-6s | %-30s | %s", this.bookId, this.bookTitle, this.bookAuthor);
		return book;
	}

	public int compareTo(Book bk) {
		//return 0;
		//return 1;
		//return -1;
		if(this.getBookId() > bk.getBookId()) {
			return 1;
		}else if(this.getBookId() < bk.getBookId()) {
			return -1;
		}else {
			return 0;
		}
	}
}
