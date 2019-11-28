package com.engcomp2019.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author rckmath
 */
@Path("moves")
public class Moves {

    @Context
    private IniFile i;

    /**
     * Construtor
     */
    public Moves() {
    }

    /**
     * Executa uma requisição GET que busca o movimento salvo no arquivo .ini
     *
     * @return Retorna o movimento salvo no arquivo .ini
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        i = new IniFile("load.ini");
        String var = i.loadIniOption("session", "move");
        i.writeIni("session", "move", "X");
        return var;
    }

    @POST
    @Consumes("application/json")
    @Path("direction")
    public void postMove(String content) {
        i = new IniFile("load.ini");
        i.writeIni("session", "move", content);
        System.out.println("Mov: " + content);
    }
}
