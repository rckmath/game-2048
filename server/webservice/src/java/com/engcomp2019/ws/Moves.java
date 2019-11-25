package com.engcomp2019.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.ini4j.*;

/**
 * REST Web Service
 *
 * @author 18711630
 */
@Path("moves")
public class Moves {
    @Context
    private UriInfo context;
    public String move;

    /**
     * Creates a new instance of Moves
     */
    public Moves() {
    }

    /**
     * Retrieves representation of an instance of com.engcomp2019.ws.Moves
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @POST
    @Consumes("application/json")
    @Path("update")
    public void putInserir(String content) {
        writeIni(content);
        move = content;
    }
    
    public void writeIni(String content){
        
    }
}
