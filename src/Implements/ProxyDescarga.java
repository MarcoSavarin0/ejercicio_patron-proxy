package Implements;

import Model.Usuario;

public class ProxyDescarga implements ServicioDescarga{
    private Descargar descargar;

    @Override
    public String descargar(Usuario usuario) {
       if (usuario.getTier() == Usuario.Tier.PREMIUM){
           descargar = new Descargar();
           return descargar.descargar(usuario);
       }
       return "La persona tiene el plan free";
    }
}
