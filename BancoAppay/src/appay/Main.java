package appay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Crear un cliente
        Cliente cliente1 = new Cliente("Kevin", "Meza", "Temuco", 12345678);

        // Lista de cuentas (1 cliente → muchas cuentas)
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        // Crear varias cuentas para el mismo cliente
        Cuenta cuenta1 = new Cuenta("Kevin.sueldo", "001", cliente1);
        Cuenta cuenta2 = new Cuenta("Kevin.ahorro", "002", cliente1);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);

        // Operaciones
        cuenta1.depositar(100000.0);
        cuenta1.extraer(25000.0);

        cuenta2.depositar(50000.0);

        // Mostrar cuentas del cliente
        System.out.println("\nCuentas del cliente:");
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
    }
}

