//import org.junit.Assert; refactorizar
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import services.ServicioA;
import services.impl.ServicioAImpl;

public class TestServicioA {

    @Test
    public void testSumar(){
        int a = 2;
        int b = 3;
        ServicioA servicioA = new ServicioAImpl();
        //Assert.assertEquals(servicioA.sumar(a,b),5); refactorizar
        assertEquals(servicioA.sumar(a,b),5);
    }
}
