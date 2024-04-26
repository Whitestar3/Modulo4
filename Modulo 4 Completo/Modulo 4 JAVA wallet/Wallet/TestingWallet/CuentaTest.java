package TestingWallet;

import org.junit.Test;

import billeteraVirtual.Cuenta;
import billeteraVirtual.EstayTerriblePato;

import static org.junit.Assert.*;

public class CuentaTest {

    @Test
    public void testRestarSaldo() throws EstayTerriblePato {
        System.out.println("Probando restar saldo...");
        // Creamos una cuenta con saldo inicial de 1000
        Cuenta cuenta = new Cuenta(1, 1000.0);

        // Restamos un monto válido
        cuenta.restarSaldo(500);

        // Verificamos que el saldo se haya restado correctamente
        assertEquals(500.0, cuenta.getSaldo(), 0.01);
        System.out.println("Saldo restado correctamente. Nuevo saldo: " + cuenta.getSaldo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRestarSaldoConMontoNegativo() throws EstayTerriblePato {
        System.out.println("Probando restar saldo con monto de un loco terrible pato...");
        // Creamos una cuenta con saldo inicial de 1000
        Cuenta cuenta = new Cuenta(1, 1000.0);

        // Intentamos restar un monto negativo, lo cual debería lanzar una excepción
        cuenta.restarSaldo(-500);
        System.out.println("Operación de restar saldo con monto negativo no lanzó una excepción.");
    }

    @Test(expected = EstayTerriblePato.class)
    public void testRestarSaldoConSaldoInsuficiente() throws EstayTerriblePato {
        System.out.println("Probando restar saldo loco cargale algo soy terrible pobre...");
        // Creamos una cuenta con saldo inicial de 1000
        Cuenta cuenta = new Cuenta(1, 1000.0);

        // Intentamos restar un monto mayor al saldo, lo cual debería lanzar una excepción
        cuenta.restarSaldo(1500);
        System.out.println("Operación de restar saldo con saldo insuficiente no lanzó una excepción.");
    }

    @Test
    public void testSumarSaldo() {
        System.out.println("Probando sumar saldo , mira como caen las luquitas XDD...");
        // Creamos una cuenta con saldo inicial de 500
        Cuenta cuenta = new Cuenta(1, 500000.0);

        // Sumamos un monto válido
        cuenta.sumarSaldo(300000);

        // Verificamos que el saldo se haya sumado correctamente
        assertEquals(800000.0, cuenta.getSaldo(), 0.01);
        System.out.println("Saldo sumado correctamente Ahora teni 8 gambas XDD: " + cuenta.getSaldo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumarSaldoConMontoNegativo() {
        System.out.println("Probando sumar saldo negativa a lo pillin pillin...");
        // Creamos una cuenta con saldo inicial de 500
        Cuenta cuenta = new Cuenta(1, 500.0);

        // Intentamos sumar un monto negativo, lo cual debería lanzar una excepción
        cuenta.sumarSaldo(-300);
        System.out.println("Operación de sumar saldo con monto negativo no lanzó una excepción.");
    }
}
