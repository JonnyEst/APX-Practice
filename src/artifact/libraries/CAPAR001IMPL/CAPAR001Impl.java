package artifact.libraries.CAPAR001IMPL;

import artifact.dtos.CAPAC001.In.InfoCalculadora;
import artifact.dtos.CAPAC001.Out.CalculadoraOut;
import artifact.dtos.CAPAC001.Out.InfoCalculadoraOut;
import artifact.libraries.CAPAR001.InterfaceCalculadora;

public class CAPAR001Impl implements InterfaceCalculadora {


    @Override
    public InfoCalculadoraOut respuestaOperacion(InfoCalculadora infoCalculadora) {
        int operacion=0;
        InfoCalculadoraOut infoCalculadoraOut = new InfoCalculadoraOut();

        CalculadoraOut calculadoraOut = new CalculadoraOut();

        calculadoraOut.setValUno(infoCalculadora.getCalculadora().getValUno());
        calculadoraOut.setValDos(infoCalculadora.getCalculadora().getValDos());
        calculadoraOut.setOperacion(infoCalculadora.getCalculadora().getOperacion());
        calculadoraOut.setResultado(operacion(infoCalculadora));


        infoCalculadoraOut.setNombre(infoCalculadora.getNombre());
        infoCalculadoraOut.setPorque(infoCalculadora.getPorQue());
        infoCalculadoraOut.setCalculadoraOut(calculadoraOut);


        return infoCalculadoraOut;
    }



    public static int operacion(InfoCalculadora infoCalculadora){
        int result=0;

        String opcion = infoCalculadora.getCalculadora().getOperacion();

        switch (infoCalculadora.getCalculadora().getOperacion()){
            case "SUMA":
                result = infoCalculadora.getCalculadora().getValUno() + infoCalculadora.getCalculadora().getValDos();
                break;
            case  "RESTA":
                result = infoCalculadora.getCalculadora().getValUno() - infoCalculadora.getCalculadora().getValDos();
                break;
            case "MULTIPLICACION":
                result = infoCalculadora.getCalculadora().getValUno() * infoCalculadora.getCalculadora().getValDos();
                break;
            case  "DIVIDISION":
                result = infoCalculadora.getCalculadora().getValUno() / infoCalculadora.getCalculadora().getValDos();
                break;
            default:
                System.out.println("Opcion no valida");
        }

        return result;
    }
}
