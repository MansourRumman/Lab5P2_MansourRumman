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
public class ceo extends gente{
    private String pregrad,id;
    private int exp,edad;

    public ceo(String pregrad, String id, int exp, int edad, String nom, String apel) {
        super(nom, apel);
        this.pregrad = pregrad;
        this.id = id;
        this.exp = exp;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
          return super.toString()+ "ceo{" + "titulo=" + pregrad + ", id=" + id + ", experiencia=" + exp + ", edad=" + edad + '}';
    }
    
}
