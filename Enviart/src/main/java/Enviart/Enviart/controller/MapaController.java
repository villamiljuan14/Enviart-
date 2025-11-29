package Enviart.Enviart.controller;

import Enviart.Enviart.dto.UbicacionEnvioDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/mapa")
public class MapaController {

    @GetMapping("/datos")
    public List<UbicacionEnvioDTO> obtenerDatosMapa() {
        // Simulación de datos que vendrían de la Base de Datos
        return Arrays.asList(
                new UbicacionEnvioDTO(4.6486, -74.0639, 35, "Chapinero"),
                new UbicacionEnvioDTO(4.7432, -74.0868, 42, "Suba"),
                new UbicacionEnvioDTO(4.7075, -74.0306, 28, "Usaquén"),
                new UbicacionEnvioDTO(4.628, -74.148, 50, "Kennedy"),
                new UbicacionEnvioDTO(4.676, -74.139, 22, "Fontibón"));
    }
}
