package Book;

import java.util.Comparator;

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int compareResult = book1.getTitle().compareTo(book2.getTitle());
        if (compareResult == 0) {
            compareResult = Integer.compare(book1.getYear(), book2.getYear());
        }
        return compareResult;
    }
}
