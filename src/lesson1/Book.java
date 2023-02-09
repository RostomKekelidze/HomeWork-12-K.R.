package lesson1;

import java.sql.SQLOutput;

public class Book {
    public String title;
    public int publishingYear;
    public Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void printinfo() {
        System.out.println("Название произведения" + getTitle() +
                "Год написания" + getPublishingYear() + "Автор" + getAuthor().getName() + getAuthor().getSurname());
    }
}
