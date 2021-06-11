package app;

import java.util.ArrayList;

public abstract class EpassStudent extends EpassStandard implements TituloTransporte {
    private int ano;
    private String escola;
    
    private ArrayList<Zona> zonas;

    
    public EpassStudent(int ano,String escola){
        this.ano=ano;
        this.escola=escola;
    }

    
    public EpassStudent(EpassStudent outros){
        this.ano= outros.getAno();
        this.escola=outros.escola;
        this.zonas=outros.getZonas();
    }

    
