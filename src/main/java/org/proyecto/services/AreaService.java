/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.List;
import org.proyecto.dto.AreaDto;
import org.proyecto.entity.Area;
import org.proyecto.mappers.AreaMapper;
import org.proyecto.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alesa
 */
@Service
public class AreaService {

    @Autowired
    private AreaRepository repository;
    
    @Autowired
    private AreaMapper mapper;

    public List<AreaDto> consultarAreas() {
        List<Area> areas = repository.findAll();
        List<AreaDto> areasDtos = mapper.toDto(areas);
        return areasDtos;
    }
}
