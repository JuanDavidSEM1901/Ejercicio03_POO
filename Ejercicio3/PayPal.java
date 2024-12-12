package Ejercicio3;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago con PayPal\nMonto:  $" + monto);
        if (monto >= 1 && monto <= 10000) {
            System.out.println("El pago con PAYPAL se ha realizado con exito");
        } else {
            System.out.println("TRANSFERENCIA NO VALIDA! El monto debe estar entre $1 y $10,000");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "---- PAYPAL ----";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 1 && monto <= 10000;
    }
}
