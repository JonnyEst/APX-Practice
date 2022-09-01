package artifact.libraries.CAPAR001;

import artifact.dtos.CAPAC001.In.InfoCalculadora;
import artifact.dtos.CAPAC001.Out.InfoCalculadoraOut;

public interface InterfaceCalculadora {

    InfoCalculadoraOut respuestaOperacion(InfoCalculadora infoCalculadora);

}
