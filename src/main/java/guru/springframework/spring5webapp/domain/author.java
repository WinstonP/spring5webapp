package guru.springframework.spring5webapp.domain;


import java.util.Set;

public class author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
}
