/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.controllers;

import com.hotel.reserva.models.TipoHabitacion;
import com.hotel.reserva.services.TipoHabitacionServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis Bernal
 */
@RestController
@RequestMapping("/tipohabitacion")
public class TipoHabitacionController {
    @Autowired
    TipoHabitacionServices tipoHServices;
   
    @RequestMapping(value="/list",method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipoHabitacion>> getData(){
        List<TipoHabitacion> allTipoHabitacion = tipoHServices.getTipoH();
        return new ResponseEntity<List<TipoHabitacion>>(allTipoHabitacion,HttpStatus.OK);
    }
    
}
