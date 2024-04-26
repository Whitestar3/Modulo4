package TestingWallet;

import org.junit.Test;

import billeteraVirtual.Cuenta;
import billeteraVirtual.Usuario;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void testAgregarYEliminarCuenta() {
        System.out.println("Probando agregar y eliminar cuenta las cuentas...");
        // Creamos un usuario
        Usuario usuario = new Usuario(1, "UsuarioPrueba");

        // Creamos una cuenta de ejemplo
        Cuenta cuenta = new Cuenta(1, 1000.0);

        // Agregamos la cuenta al usuario
        usuario.agregarCuenta(cuenta);

        // Verificamos que la cuenta se haya agregado correctamente
        assertEquals(1, usuario.getCuenta().size());
        System.out.println("Cuenta agregada correctamente. Cantidad de cuentas: " + usuario.getCuenta().size());

        // Eliminamos la cuenta del usuario
        usuario.eliminarCuenta(cuenta);

        // Verificamos que la cuenta se haya eliminado correctamente
        assertEquals(0, usuario.getCuenta().size());
        System.out.println("Cuenta eliminada correctamente. Cantidad de cuentas: " + usuario.getCuenta().size());
    }

    @Test
    public void testObtenerCuentaCorriente() {
        System.out.println("Probando obtener cuenta corriente...");
        // Creamos un usuario
        Usuario usuario = new Usuario(1, "UsuarioPrueba");

        // Creamos una cuenta corriente de ejemplo
        Cuenta cuentaCorriente = new Cuenta(1, 1000.0);
        cuentaCorriente.setTipoCuenta("Corriente");

        // Agregamos la cuenta corriente al usuario
        usuario.agregarCuenta(cuentaCorriente);

        // Obtenemos la cuenta corriente del usuario
        Cuenta cuentaObtenida = usuario.obtenerCuentaCorriente();

        // Verificamos que la cuenta corriente obtenida sea la misma que la creada
        assertNotNull(cuentaObtenida);
        assertEquals(cuentaCorriente, cuentaObtenida);
        System.out.println("Cuenta corriente obtenida correctamente: " + cuentaObtenida);
    }

    @Test
    public void testObtenerCuentaAhorro() {
        System.out.println("Probando obtener cuenta de ahorro...");
        // Creamos un usuario
        Usuario usuario = new Usuario(1, "UsuarioPrueba");

        // Creamos una cuenta de ahorro de ejemplo
        Cuenta cuentaAhorro = new Cuenta(1, 2000.0);
        cuentaAhorro.setTipoCuenta("Ahorro");

        // Agregamos la cuenta de ahorro al usuario
        usuario.agregarCuenta(cuentaAhorro);

        // Obtenemos la cuenta de ahorro del usuario
        Cuenta cuentaObtenida = usuario.obtenerCuentaAhorro();

        // Verificamos que la cuenta de ahorro obtenida sea la misma que la creada
        assertNotNull(cuentaObtenida);
        assertEquals(cuentaAhorro, cuentaObtenida);
        System.out.println("Cuenta de ahorro obtenida correctamente: " + cuentaObtenida);
    }

    @Test
    public void testObtenerCuentaMonedaInternacional() {
        System.out.println("Probando obtener cuenta de moneda internacional...");
        // Creamos un usuario
        Usuario usuario = new Usuario(1, "UsuarioPrueba");

        // Creamos una cuenta de moneda internacional de ejemplo
        Cuenta cuentaMonedaInternacional = new Cuenta(1, 500.0);
        cuentaMonedaInternacional.setTipoCuenta("Moneda Internacional");

        // Agregamos la cuenta de moneda internacional al usuario
        usuario.agregarCuenta(cuentaMonedaInternacional);

        // Obtenemos la cuenta de moneda internacional del usuario
        Cuenta cuentaObtenida = usuario.obtenerCuentaMonedaInternacional();

        // Verificamos que la cuenta de moneda internacional obtenida sea la misma que la creada
        assertNotNull(cuentaObtenida);
        assertEquals(cuentaMonedaInternacional, cuentaObtenida);
        System.out.println("Cuenta de moneda internacional obtenida correctamente: " + cuentaObtenida);
    }
}
