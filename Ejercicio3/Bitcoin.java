package Ejercicio3;

public class Bitcoin implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con BITCOIN\nMonto: BTC " + monto);
        if (monto >= 0.001) {
            System.out.println("El pago con BITCOIN se ha realizado con exito");
        } else {
            System.out.println("TRANSFERENCIA NO VALIDA! El monto debe ser mayor o igual a 0.001 BTC");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "---- BITCOIN ----";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 0.001;
    }
}
