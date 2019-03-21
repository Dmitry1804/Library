package Models;

import java.time.LocalDateTime;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private Integer pages;
    private Integer year;
    private LocalDateTime addedOn;
    private Integer total;
    private Integer available;
    private Reader readers;

    public Book() {
    }

    public Book(String isbn, String name, String author, Integer pages, Integer year, LocalDateTime addedOn, Integer total, Integer available, Reader readers) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.addedOn = addedOn;
        this.total = total;
        this.available = available;
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                ", addedOn=" + addedOn +
                ", total=" + total +
                ", available=" + available +
                ", readers=" + readers +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Reader getReaders() {
        return readers;
    }

    public void setReaders(Reader readers) {
        this.readers = readers;
    }
}
