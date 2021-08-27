/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_mansourrumman;

/**
 *
 * @author manso
 */
public class decano extends gente {
    private String pregrad,id,tit,titm;
    private int edad;

    public decano(String pregrad, String id, String tit, String titm, int edad, String nom, String apel) {
        super(nom, apel);
        this.pregrad = pregrad;
        this.id = id;
        this.tit = tit;
        this.titm = titm;
        this.edad = edad;
    }

    public String getPregrad() {
        return pregrad;
    }

    public void setPregrad(String pregrad) {
        this.pregrad = pregrad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getTitm() {
        return titm;
    }

    public void setTitm(String titm) {
        this.titm = titm;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+ "decano{" + "pregrad=" + pregrad + ", id=" + id + ", tit=" + tit + ", titm=" + titm + ", edad=" + edad + '}';
    }
    
}
