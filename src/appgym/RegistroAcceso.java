/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;
import java.util.Date;

/**
 *
 * @author newflare
 */
public class RegistroAcceso {
    private Date horaEntrada;
    private Date horaSalida;
    
    // registro = new RegistrarAcceso();
    // registro.horaEntrada;        MAL
    // registro.getHoraEntrada();
    
    public RegistroAcceso() {
        this.horaEntrada = null;
        this.horaSalida = null;
    }
    
    // Getters y Setters
    public Date getHoraEntrada() {
        return this.horaEntrada;
    }
    
    public void setHoraEntrada( Date nuevaHoraEntrada ) {
        this.horaEntrada = nuevaHoraEntrada;
    }
    
    public Date getHoraSalida() {
        return this.horaSalida;
    }
    
    public void setHoraSalida( Date nuevaHoraSalida ) {
        this.horaSalida = nuevaHoraSalida;
    }
    
    // Métodos solicitados
    public void registrarEntrada() {
        this.horaEntrada = new Date();
    }
    
    public void registrarSalida() {
       this.horaSalida = new Date(); 
    }
    
    @Override
    public String toString() {
        // TODO: Crear formatos de entrada y salida
        
        return "RegistroAcceso{entrada, salida}";
    }
}
