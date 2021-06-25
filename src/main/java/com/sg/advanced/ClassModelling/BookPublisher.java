package com.sg.advanced.ClassModelling;

public class BookPublisher {
    public static void main(String[] args) {

        //Use constructor
        BookPublisher newBook = new BookPublisher("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Penguin", "United Kingdom");

    }
    //Constructor
    public BookPublisher(String bookNameIn, String authorIn, String publisherIn, String pubCountryIn){
        this.bookName = bookNameIn;
        this.author = authorIn;
        this.publisher = publisherIn;
        this.pubCountry = pubCountryIn;
    }

    //Data fields for class
    String bookName;
    String author;
    String publisher;
    String pubCountry;

    //Accessors and Mutators
    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getPubCountry(){
        return pubCountry;
    }
    public void setBookName(){
        this.bookName = bookName;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setPublisher(){
        this.publisher = publisher;
    }
    public void setPubCountry(){
        this.pubCountry = pubCountry;
    }

    //Behaviour
    public void isFinished (){
        System.out.println("Return whether the book has been finished or not.");
    }
    public void getNoOfBooks (){
        System.out.println("Returns the number of books the author has published.");
    }

}
