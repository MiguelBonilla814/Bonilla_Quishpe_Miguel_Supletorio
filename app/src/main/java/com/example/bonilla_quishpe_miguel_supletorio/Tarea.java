package com.example.bonilla_quishpe_miguel_supletorio;

public class Tarea {

    private int Id;
    private String Tarea;
    private String Detalle;
    private boolean Check;

    public Tarea(){

    }

    public Tarea(int id, String tarea, String detalle, boolean check){
        Id = id;
        Tarea = tarea;
        Detalle = detalle;
        Check = check;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String tarea) {
        Tarea = tarea;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public boolean isCheck() {
        return Check;
    }

    public void setCheck(boolean check) {
        Check = check;
    }
}
