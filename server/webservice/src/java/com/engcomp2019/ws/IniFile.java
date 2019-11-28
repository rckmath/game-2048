package com.engcomp2019.ws;

import java.io.File;
import java.io.IOException;
import org.ini4j.Wini;

/**
 *
 * @author rckmath
 */
public class IniFile {

    private Wini ini;
    File file;

    IniFile(String fileName) {
        new File(System.getenv("APPDATA") + "\\2048").mkdir();
        file = new File(System.getenv("APPDATA") + "\\2048\\" + fileName);
    }

    /**
     * Permite salvar dados no arquivo .ini na seção desejada com o nome
     * desejado
     *
     * @param x Dado a ser salvo
     * @param sectionName Nome da seção
     * @param objectName Nome do objeto
     */
    public void writeIni(String sectionName, String objectName, Object x) {
        try {
            if (!file.exists()) {
                file.createNewFile();
                ini = new Wini(file);
                ini.put("options", "altTheme", false);
                ini.put("options", "audioOn", true);
                ini.put("session", "record", 0);
            } else {
                ini = new Wini(file);
            }
            ini.put(sectionName, objectName, x);
            ini.store();
        } catch (IOException e) {
            System.err.println("ERRO: " + e);
        }
    }

    /**
     * Permite buscar dados presentes no arquivo .ini
     *
     * @param sectionName Nome da seção
     * @param objectName Nome do objeto
     * @return Retorna o dado correspondente aos parâmetros ou X em caso de não
     * encontrado
     */
    public String loadIniOption(Object sectionName, Object objectName) {
        if (file.exists()) {
            try {
                ini = new Wini(file);
                return ini.get(sectionName, objectName);
            } catch (IOException e) {
                System.err.println("ERRO: " + e);
                return "X";
            }
        }
        return "X";
    }
}
