package Models;

import java.time.LocalDateTime;

public class Reader {
    private Integer readerNumber;
    private String name;
    private LocalDateTime birthday;

    public Reader() {
    }

    public Reader(Integer readerNumber, String name, LocalDateTime birthday) {
        this.readerNumber = readerNumber;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerNumber=" + readerNumber +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(Integer readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
