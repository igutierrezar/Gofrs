package io.dojogeek.gofrs.libro.lectura.rest.entities;

import lombok.Data;
import org.joda.time.DateTime;

/**
 * Created by Irene on 2/16/16.
 */

@Data
public class Book {

    private String id;
    private String title;
    private String author;
    private DateTime releaseDate ;
    private String editorial;
    private String category;
    private int totalPages;



}
