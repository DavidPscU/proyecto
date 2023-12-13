/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.resources;

import org.proyecto.services.ProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alesa
 */
@RestController
public class ProcesoResource {
    @Autowired
    private ProcesoService service;
    
    @RequestMapping(value = "consultarProcesos", method = RequestMethod.GET)
    public ResponseEntity<?> consultarProcesos(){
        return new ResponseEntity<>(service.consultarProcesos(), HttpStatus.OK);
    }
}
