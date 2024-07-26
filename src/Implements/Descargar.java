package Implements;

import Model.Usuario;

public class Descargar implements ServicioDescarga{
    @Override
    public String descargar(Usuario usuario) {
        return "Haz descargado la cancion!" + " porque eres " + usuario.getTier();
    }
}
