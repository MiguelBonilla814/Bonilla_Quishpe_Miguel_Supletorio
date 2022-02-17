package com.example.bonilla_quishpe_miguel_supletorio;

public class Usuario_mebq {
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Contraseña;
    private String Cedula;

    public Usuario(){

    }

    public Usuario(int id, String nombre, String apellido, String contraseña, String cedula) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Contraseña = contraseña;
        Cedula = cedula;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }
}
