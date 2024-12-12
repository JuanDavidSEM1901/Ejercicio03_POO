package Ejercicio3;

public interface MetodoPago {
    // metodos abstractos
    void procesarPago(double monto);

    String obtenerDetalles();

    boolean validarMonto(double monto);

}
