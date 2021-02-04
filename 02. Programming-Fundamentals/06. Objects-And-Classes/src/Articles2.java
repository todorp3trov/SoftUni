import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String sortBy = scanner.nextLine();
        if (sortBy.equals("title")) {
            articles.stream()
                    .sorted(Comparator.comparing(Article::getTitle))
                    .forEach(article -> System.out.println(article.toString()));
        } else if (sortBy.equals("content")) {
            articles.stream()
                    .sorted(Comparator.comparing(Article::getContent))
                    .forEach(article -> System.out.println(article.toString()));
        } else {
            articles.stream()
                    .sorted(Comparator.comparing(Article::getAuthor))
                    .forEach(article -> System.out.println(article.toString()));
        }
    }

    private static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
}
