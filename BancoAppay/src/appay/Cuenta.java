package appay;

public class Cuenta {

    private String alias;
    private String numeroCuenta;
    protected Double balance;
    private Cliente cliente;

    // CONSTRUCTOR
    public Cuenta(String alias, String nroCuenta, Cliente cliente) {
        this.alias = alias;
        this.numeroCuenta = nroCuenta;
        this.cliente = cliente;
        this.balance = 0.0;
    }

    // EXTRAER DINERO
    public void extraer(Double cantidad) {
        if (cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Extracción realizada. Nuevo balance: " + balance);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    // DEPOSITAR
    public void depositar(Double cantidad) {
        balance += cantidad;
        System.out.println("Depósito realizado. Nuevo balance: " + balance);
    }

    // OBTENER BALANCE
    public Double obtenerBalance() {
        return balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getAlias() {
        return alias;
    }

    public String getNroCuenta() {
        return numeroCuenta;
    }

	@Override
	public String toString() {
		return "Cuenta [alias=" + alias + ", numeroCuenta=" + numeroCuenta + ", balance=" + balance + ", cliente="
				+ cliente + "]";
	}


}

