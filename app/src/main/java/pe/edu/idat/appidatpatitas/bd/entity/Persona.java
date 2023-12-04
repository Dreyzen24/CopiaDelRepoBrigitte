package pe.edu.idat.appidatpatitas.bd.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Persona")
public class Persona {
    @PrimaryKey
    private int  id;
    private String nombres;
    private String apellidos;
    private String email;
    private String celular;
    private String usuario;
    private String password;
    private String esvoluntario;




}
