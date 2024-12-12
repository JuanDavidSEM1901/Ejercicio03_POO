package Ejercicio3;

public class TransferenciaBancaria implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con Transferencia Bancaria\nMonto: $" + monto);
        if (monto >= 10) {
            System.out.println("El pago con TRANSFERENCIA BANCARIA se ha realizado con exito");
        } else {
            System.out.println("TRANSFERENCIA NO VALIDA! El monto debe ser mayor o igual a $10");
        }
    }

    @Override
    public String obtenerDetalles() {
        System.out.println();
        return "---- TRANSFERENCIA BANCARIA ----";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 10;
    }
}
