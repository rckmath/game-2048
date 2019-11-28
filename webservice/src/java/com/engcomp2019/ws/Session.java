/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.engcomp2019.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author erick
 */
@Path("session")
public class Session {

    @Context
    private IniFile i;

    /**
     * Construtor
     */
    public Session() {
    }

    /**
     * Retrieves representation of an instance of
     * com.engcomp2019.ws.SessionResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
       return null;
    }

    @POST
    @Consumes("application/json")
    @Path("option")
    public void postOption(String content) {
        i = new IniFile("temp.ini");
        i.writeIni("session", "score", content);
        System.out.println("Post: " + content);
    }
}
