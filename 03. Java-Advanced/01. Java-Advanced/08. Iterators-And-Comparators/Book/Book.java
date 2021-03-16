package Book;

import java.util.Arrays;
import java.util.List;

class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... author) {
        this.title = title;
        this.year = year;
        this.authors = Arrays.asList(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book anotherBook) {
        int compareResult = this.title.compareTo(anotherBook.getTitle());
        if (compareResult == 0) {
            compareResult = Integer.compare(this.year, anotherBook.getYear());
        }
        return compareResult;
    }
}
