package TestingWallet;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import billeteraVirtual.Cuenta;
import billeteraVirtual.EstayTerriblePato;
import billeteraVirtual.Operaciones;

class OperacionTest {

	
	@Test
	void realizarTranferencia() throws EstayTerriblePato {
		//crear cuentas de origen y destino
		Cuenta cuentaOrigen = new Cuenta (1, 100000.0);
		Cuenta cuentaDestino = new Cuenta (2, 0.0);
		
		//establecimos el monto que vamos a transferir
		double monto = 70000.0;
		
		//creamos la operacion
		Operaciones operaciones = new Operaciones (1, "tranferencia", monto, "2024-04-21", 1, 2);
		
		//ahora realizamos la transferencia
		operaciones.realizarTransferencia(cuentaOrigen, cuentaDestino, monto);
		
		//verificamos que los saldo esten actualizados de ambas cuentas
		assertEquals(30000.0, cuentaOrigen.getSaldo(), "El saldo de la cuenta origen debe ser 30000.0");
	    assertEquals(70000.0, cuentaDestino.getSaldo(), "El saldo de la cuenta destino debe ser 70000.0");
	}
	
	
	@Test
	void realizarRetiro() throws EstayTerriblePato {
		//crear cuentas de origen y destino
		Cuenta cuentaOrigen = new Cuenta (1, 100000.0);
		
		//establecimos el monto que vamos a transferir
		double monto = 60000.0;
		
		//creamos la operacion del retiro, seria de cuenta 1 a la misma cuenta 1
		Operaciones operaciones = new Operaciones (1, "Retiro", monto, "2024-04-22", 1,1);
		
		//ahora realizamos el retiro de dinero
		operaciones.realizarRetiro(cuentaOrigen, monto);
		
		//verificamos que me muestre el saldo en la cuenta sin retiro
		assertEquals(40000.0, cuentaOrigen.getSaldo(), "El saldo de la cuenta origen debe ser 40000.0");
	}
	
}



