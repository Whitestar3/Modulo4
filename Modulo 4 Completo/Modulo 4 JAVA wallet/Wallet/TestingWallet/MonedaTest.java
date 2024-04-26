package TestingWallet;

import org.junit.jupiter.api.*;

import billeteraVirtual.Monedas;
import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {

    @Test //convertir peso a peso (para ver que no chanflea jajajaja
    void convertirAPeso_PesosChilenos_DeberiaRetornarMontoOriginal() {
        // Creamos monedas de origen y destino
        Monedas origen = new Monedas(1, "Peso Chileno", "$", 1.0);
        Monedas destino = new Monedas(1, "Peso Chileno", "$", 1.0);

        // Monto a convertir
        double monto = 100.0;

        // Aqui me da el Resultado esperado
        double expected = monto;

        // Aqui me da el Resultado obtenido realmente
        double actual = origen.convertirAPeso(monto, destino);

        // Verificar que el resultado esperado sea el obtenido
        assertEquals(expected, actual, "La conversión a pesos chilenos debe ser el monto original");
        System.out.println("Prueba exitosa: Tus pesos se cambiaron dolar gringooou ");
    }

    @Test //convertir peso a dolar
    void convertirAPeso_DolarEstadounidense_DeberiaRetornarMontoConvertido() {
        // Creamos monedas de origen y destino
        Monedas origen = new Monedas(2, "Dólar Estadounidense", "U$", 0.0011); 
        Monedas destino = new Monedas(1, "Peso Chileno", "$", 1.0);

        // Primero ponemos cuando vamos a convertir
        double monto = 100000.0;

        // Despues la Tasa de cambio estimada
        double tasaCambio = 0.0011;

        // tercero ponemos el resultado esperado
        double expected = monto * tasaCambio;

        // Cuarto ponemos el resultado obtenido realmente
        double actual = origen.convertirAPeso(monto, destino);

        // Verificar que el resultado esperado sea = resultado real (tolerancia para errores de redondeo ya que solo novato)
        assertEquals(expected, actual, 0.01, "La conversión a pesos chilenos debe ser cercana al monto original * tasa de cambio");
        // 0.01 es el % de margen de de error que quiero que tenga mi operacion.
        System.out.println("Prueba exitosa: Tus pesos cambiaron a dolar money");
    } 

    
    @Test //convertir peso a euro
    void convertirAPeso_euro_DeberiaRetornarMontoConvertido() {
        // Creamos monedas de origen y destino
        Monedas origen = new Monedas(2, "Euro", "€", 0.00099);
        Monedas destino = new Monedas(1, "Peso Chileno", "$", 1.0);

        // Primero ponemos cuando vamos a convertir
        double monto = 100000.0;

        // Despues la Tasa de cambio estimada
        double tasaCambio = 0.00099;

        // tercero ponemos el resultado esperado
        double expected = monto * tasaCambio;

        // Cuarto ponemos el resultado obtenido realmente
        double actual = origen.convertirAPeso(monto, destino);

        // Verificar que el resultado esperado sea = resultado real (tolerancia para errores de redondeo ya que solo novato)
        assertEquals(expected, actual, 0.01, "La conversión a pesos chilenos debe ser cercana al monto original * tasa de cambio");
        // 0.01 es el % de margen de de error que quiero que tenga mi operacion.
        System.out.println("Prueba exitosa: Tus pesos cambiaron a esa moneda E rara europea XDD");
    } 

    
    
    @Test //En caso que me equivoque en poner la moneda correcta
    void convertirAPeso_MonedaDestinoInvalida_DeberiaLanzarExcepcion() {
        // Crear monedas de origen y despues moneda errada que este caso era de peso a dolar y el atributo euro
        Monedas origen = new Monedas(2, "Dólar Estadounidense", "U$", 1.0);
        Monedas destino = new Monedas(3, "Euro", "€", 1.0);

        // Despues el monto a convertir
        double monto = 1.0;

        // Tercero el mensaje de excepcion de que te equivocaste pastel jajajajaj
        String expectedMessage = "Moneda de destino no válida: Euro";

        // Verificar que se lance la excepción IllegalArgumentException con el mensaje esperado
        assertThrows(IllegalArgumentException.class, () -> origen.convertirAPeso(monto, destino), expectedMessage);
        System.out.println("Prueba exitosa: Loco te equivocaste de money era otra eri terrible volao jajajaja");
    }
    
}
