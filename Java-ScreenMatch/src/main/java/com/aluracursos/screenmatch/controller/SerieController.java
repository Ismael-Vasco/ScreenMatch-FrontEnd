package com.aluracursos.screenmatch.controller;

import com.aluracursos.screenmatch.dto.EpisodioDTO;
import com.aluracursos.screenmatch.dto.SerieDTO;
import com.aluracursos.screenmatch.repository.Serierepository;
import com.aluracursos.screenmatch.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/series")  // para que sea el padron principal
public class SerieController {

    @Autowired
    private SeriesService servicio;
    
    @GetMapping()
    public List<SerieDTO> obtenerTodasLasSeries() {
        return servicio.obtenerTodasLasSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5() {
        return servicio.obtenerTop5();
    }

    @GetMapping("/lanzamientos")
    public List<SerieDTO> obtenerLanzamientosMasRecientes(){
        return servicio.obtenerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDTO> obtenerTodasLasTemporadas(@PathVariable Long id) {
        return servicio.obtenerTodasLasSeries(id);
    }

    @GetMapping("/{id}/temporadas/{numeroTemporada}")
    public List<EpisodioDTO> obtenerTemporadasPorNumero(@PathVariable Long id,
                                                        @PathVariable Long numeroTemporada) {
        return servicio.obtenerTemporadasPorNumero(id, numeroTemporada);
    }

    @GetMapping("/{id}/temporadas/top")
    public List<EpisodioDTO> obterTopEpisodios(@PathVariable Long id){
        return servicio.obtenerTopEpisodios(id);
    }


    @GetMapping("/categoria/{nombreGenero}")
    public List<SerieDTO> obtenerSeriesPorCategoria(@PathVariable String nombreGenero){
        return servicio.obtenerSeriesPorCategoria(nombreGenero);
    }


//      Prueba de una nueva ruta
//    @GetMapping("/incio")
//    public String muestraMensaje() {
//        return "Probando LiveReloading";
//    }
}