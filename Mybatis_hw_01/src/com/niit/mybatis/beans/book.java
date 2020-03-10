package com.niit.mybatis.beans;

public class book {
private int id;
private String bookName;
@Override
public String toString() {
	return "book [id=" + id + ", bookname=" + bookName + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookName;
}
public void setBookname(String bookname) {
	this.bookName = bookName;
}

}
