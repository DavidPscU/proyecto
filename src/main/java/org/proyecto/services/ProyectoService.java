/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.List;
import org.proyecto.dto.PersonaDto;
import org.proyecto.dto.ProyectoDto;
import org.proyecto.entity.Persona;
import org.proyecto.entity.Proyecto;
import org.proyecto.mappers.PersonaMapper;
import org.proyecto.mappers.ProyectoMapper;
import org.proyecto.repository.PersonaRepository;
import org.proyecto.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alesa
 */
@Service
public class ProyectoService {
    
    @Autowired
    private ProyectoRepository repository;
    
    @Autowired
    private ProyectoMapper mapper;
    
    public List<ProyectoDto> consultarProyectos() {
        List<Proyecto> proyectos = repository.findAll();
        List<ProyectoDto> proyectosDtos = mapper.toDto(proyectos);
        return proyectosDtos;
    }
    
    public ProyectoDto guardarProyecto(ProyectoDto dto){
        Proyecto proyecto = mapper.toEntity(dto);
        proyecto = repository.save(proyecto);
        return mapper.toDto(proyecto);
    }
}
