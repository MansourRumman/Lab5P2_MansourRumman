/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_mansourrumman;

public class gente {
    private String nom,apel;

    public gente(String nom, String apel) {
        this.nom = nom;
        this.apel = apel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    @Override
    public String toString() {
        return "gente{" + "nombre:" + nom + ", apellido:" + apel + '}';
    }
    
}
