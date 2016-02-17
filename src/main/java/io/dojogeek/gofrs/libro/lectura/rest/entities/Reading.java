package io.dojogeek.gofrs.libro.lectura.rest.entities;


import lombok.Data;
import org.joda.time.LocalTime;

import java.util.Date;
import java.util.List;

/**
 * Created by Irene on 2/16/16.
 */
@Data
public class Reading {

    private String id;
    private String userId;
    private Date initialDate;
    private LocalTime devotedHours;
    private int seenPages;
    private int pagesBeRead;
    private  int stimatedPages;
    private int idBook;
    private String chapter;









}
