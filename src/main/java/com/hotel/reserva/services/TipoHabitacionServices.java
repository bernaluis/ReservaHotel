/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.services;

import com.hotel.reserva.models.TipoHabitacion;
import com.hotel.reserva.resources.TipoHData;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis Bernal
 */
@Service
public class TipoHabitacionServices {

    public List<TipoHabitacion> getTipoH(){
        TipoHData thd=new TipoHData(null);
        return thd.consTodo();
    }
    

   
    
}
