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
public class alum extends gente {
    private String car;
    private int nc,ac,cf;

    public alum(String car, int nc, int ac, int cf, String nom, String apel) {
        super(nom, apel);
        this.car = car;
        this.nc = nc;
        this.ac = ac;
        this.cf = cf;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getCf() {
        return cf;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
         return super.toString()+ "alum{" + "car=" + car + ", nc=" + nc + ", ac=" + ac + ", cf=" + cf + '}';
    }
    
}
