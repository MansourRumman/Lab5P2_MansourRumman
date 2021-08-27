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
public class doc extends gente {
     private String pregrad,titm,cnom,cd;
    private int alum;

    public doc(String pregrad, String titm, String cnom, String cd, int alum, String nom, String apel) {
        super(nom, apel);
        this.pregrad = pregrad;
        this.titm = titm;
        this.cnom = cnom;
        this.cd = cd;
        this.alum = alum;
    }

    public String getPregrad() {
        return pregrad;
    }

    public void setPregrad(String pregrad) {
        this.pregrad = pregrad;
    }

    public String getTitm() {
        return titm;
    }

    public void setTitm(String titm) {
        this.titm = titm;
    }

    public String getCnom() {
        return cnom;
    }

    public void setCnom(String cnom) {
        this.cnom = cnom;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public int getAlum() {
        return alum;
    }

    public void setAlum(int alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
         return super.toString()+ "doc{" + "pregrad=" + pregrad + ", titm=" + titm + ", cnom=" + cnom + ", cd=" + cd + ", alum=" + alum + '}';
    }
    
}
