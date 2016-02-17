package io.dojogeek.gofrs.libro.lectura.rest;

import io.dojogeek.gofrs.libro.lectura.rest.entities.Book;
import io.dojogeek.gofrs.libro.lectura.rest.entities.Reading;

import javax.ws.rs.core.Response;


/**
 * Created by Irene on 2/16/16.
 */

public interface ReadingRest {

    Response createReading(Reading reading);

    Response updateReading(String id, Reading reading);

    Response deleteReading(String id);

    Response getReadingsByUserId(String userId);
}
