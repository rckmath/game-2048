package com.engcomp2019.ws;


import java.io.File;
import java.io.IOException;
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
 * @author rckmath
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
        this.move = "X";
    }

    /**
     * Retrieves representation of an instance of com.engcomp2019.ws.Moves
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        String var = loadIniMovingDirection();
        writeIni("X");
        return var;
    }

    @POST
    @Consumes("application/json")
    @Path("direction")
    public void postMove(String content) {
        writeIni(content);
        System.out.println("Mov: " + content);
        move = content;
    }

    public void writeIni(String content) {
        try {
            Wini ini;
            new File(System.getenv("APPDATA") + "\\2048").mkdir();
            File file = new File(System.getenv("APPDATA") + "\\2048\\" + "load.ini");

            if (!file.exists()) {
                file.createNewFile();
                ini = new Wini(file);
                ini.put("options", "altTheme", false);
                ini.put("options", "audioOn", true);
                ini.put("session", "record", 0);
            } else {
                ini = new Wini(file);
            }
            ini.put("session", "move", content);
            ini.store();
        } catch (IOException e) {
            System.err.println("ERRO: " + e);
        }
    }

    public String loadIniMovingDirection() {
        Wini ini;
        new File(System.getenv("APPDATA") + "\\2048").mkdir();
        File file = new File(System.getenv("APPDATA") + "\\2048\\" + "load.ini");

        if (file.exists()) {
            try {
                ini = new Wini(file);
                return ini.get("session", "move");
            } catch (IOException e) {
                System.err.println("ERRO: " + e);
                return "X";
            }
        }
        return "X";
    }
}
