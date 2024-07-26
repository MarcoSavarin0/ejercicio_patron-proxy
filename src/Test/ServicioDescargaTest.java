package Test;

import Implements.ProxyDescarga;
import Model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioDescargaTest {
    @Test
    @DisplayName("El usuario es premium")
    void caso1(){
        Usuario usuarioPremium = new Usuario(Usuario.Tier.PREMIUM,1);
        ProxyDescarga proxyDescarga = new ProxyDescarga();
        String respuestaEsperada = "Haz descargado la cancion! porque eres Premium";
        String respuestaObtenida = proxyDescarga.descargar(usuarioPremium);
        assertEquals(respuestaEsperada,respuestaObtenida);
    }
    @Test
    @DisplayName("El usuario es premium")
    void caso2(){
        Usuario usuarioFree= new Usuario(Usuario.Tier.FREE,1);
        ProxyDescarga proxyDescarga = new ProxyDescarga();
        String respuestaEsperada = "La persona tiene el plan free";
        String respuestaObtenida = proxyDescarga.descargar(usuarioFree);
        assertEquals(respuestaEsperada,respuestaObtenida);
    }

}