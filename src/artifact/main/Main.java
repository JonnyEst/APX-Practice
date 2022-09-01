package artifact.main;

import artifact.dtos.CAPAC001.In.Calculadora;
import artifact.dtos.CAPAC001.In.InfoCalculadora;
import artifact.dtos.CAPAC001.Out.InfoCalculadoraOut;
import artifact.libraries.CAPAR001IMPL.CAPAR001Impl;

public class Main {
    public static void main(String[] args) {
        CAPAR001Impl capar001 = new CAPAR001Impl();
        InfoCalculadoraOut infoCalculadoraOut = capar001.respuestaOperacion(ingresoDatos());
        System.out.println(infoCalculadoraOut);

        System.out.println("Hola "+infoCalculadoraOut.getNombre() +". El resultado de la operacion "
                +infoCalculadoraOut.getCalculadoraOut().getOperacion()+" entre el valor: "
                + infoCalculadoraOut.getCalculadoraOut().getValUno() + " y "
                +infoCalculadoraOut.getCalculadoraOut().getValDos() + " es igual a: "
                +infoCalculadoraOut.getCalculadoraOut().getResultado());

    }

    public static InfoCalculadora ingresoDatos(){
        Calculadora calculadora = new Calculadora();

        calculadora.setValUno(5);
        calculadora.setValDos(1);
        calculadora.setOperacion("RESTA");

        InfoCalculadora infoCalculadora = new InfoCalculadora();

        infoCalculadora.setNombre("Cristian");
        infoCalculadora.setPorQue("Quiero aprender a sumar.");
        infoCalculadora.setCalculadora(calculadora);

        return infoCalculadora;
    }
}
