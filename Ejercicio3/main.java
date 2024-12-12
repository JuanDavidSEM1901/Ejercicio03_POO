package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);
        List<MetodoPago> metodos = new ArrayList<>();
        metodos.add(new TarjeRegalo());
        metodos.add(new TarjetadeCredito());
        metodos.add(new TransferenciaBancaria());
        metodos.add(new Bitcoin());
        metodos.add(new PayPal());

        System.out.println("Ingrese un monto");
        double monto = entry.nextDouble();

        for (MetodoPago metodoPago : metodos) {
            System.out.println();
            System.out.println(metodoPago.obtenerDetalles());
            metodoPago.procesarPago(monto);
            metodoPago.validarMonto(monto);
        }
    }
}
