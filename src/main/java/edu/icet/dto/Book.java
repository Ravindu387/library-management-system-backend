package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer id;
    private String title;
    private String isbn;
    private String category;
    private String publicationYear;
    private Integer authorId;
    private Integer availability;
}
