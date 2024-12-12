package Ejercicio3;

public class TarjetadeCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de credito\nMonto: $" + monto);
        if (monto > 0) {
            System.out.println("El pago con TARJETA DE CREDITO se ha realizado con exito");
        } else {
            System.out.println("TRANSFERENCIA NO VALIDA! El monto debe ser mayor que $0");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "---- TARJE DE CREDITO ----";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;
    }
}
