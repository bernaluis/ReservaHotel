/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.reserva.resources;

import com.hotel.reserva.models.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Bernal
 */
public class TipoHData {
    //select de tipo habitaciones
    private final Connection conn;

    public TipoHData(java.sql.Connection conn) {
        this.conn = conn;
       
    }

  
    public  List<TipoHabitacion> consTodo()
    {
       List<TipoHabitacion> resp = new ArrayList<>();
        try
        {
            PreparedStatement cmd = this.conn.prepareStatement("select * from tipohabitacion");
           ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new TipoHabitacion(rs.getInt(1),rs.getString(2)));
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error al consultar el tipo de habitacion: " + ex.getMessage());
        }
        finally
        {
            try
            {
                if(this.conn != null)
                {
                    if(!this.conn.isClosed())
                    {
                        this.conn.close();
                    }
                }
            }
            catch(SQLException ex)
            {
                System.err.println("Error al cerrar la conexión");
            }
        }
        return resp;
    }
}
