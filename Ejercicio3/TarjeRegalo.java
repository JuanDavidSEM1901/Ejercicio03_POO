package Ejercicio3;

public class TarjeRegalo implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de regalo\nMonto: $" + monto);
        if (monto > 0 && monto < 500) {
            System.out.println("El pago con TARJETA DE REGALO se ha realizado con exito");
        } else {
            System.out.println("TRANSFERENCIA NO VALIDA! El monto debe estar entre $0 y $500");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "---- TARJETA DE REGALO ----";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto < 500;
    }
}
