/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Centro_B implements Bestia {

    int alma = 500, cristal = 500, luz = 500;
    int MAXalma = 10000, MAXcristal = 5000, MAXluz = 3000;

    @Override
    public String M_entrenar() {
        return null;
    }

    @Override
    public String M_atacar() {
        return null;
    }

    @Override
    public String M_defender() {
        return null;
    }

    @Override
    public String E_generar() {
        return null;
    }

    @Override
    public String E_recolectar() {
        return null;
    }

    @Override
    public void V_construccion() {

    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCB() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(alma);
        Centro.add(cristal);
        Centro.add(luz);
        Centro.add(MAXalma);
        Centro.add(MAXcristal);
        Centro.add(MAXluz);
        System.out.println("\t\tRey, ahora tiene un centro de mando bestial.");
        return Centro;
    }

    @Override
    public void mejorarCB(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                int r1 = (((int) 0.1) * (Centro.get(3)));//10% alma
                int r2 = (((int) 0.1) * (Centro.get(4)));//10% cristal
                int r3 = (((int) 0.1) * (Centro.get(5)));//10% luz
                costo = ((int) 0.25) * (Centro.get(4) + r1 + Centro.get(5) + r2 + Centro.get(6) + r3);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                } else {
                    System.out.println("No dispone de la cantidad de recursos necesaria: " + costo + " cada de recurso");
                }
                break;
            case 2:
                int r11 = (((int) 0.3) * (Centro.get(3)));//30% alma
                int r21 = (((int) 0.3) * (Centro.get(4)));//30% cristal
                int r31 = (((int) 0.3) * (Centro.get(5)));//30% luz
                costo = ((int) 0.25) * (Centro.get(4) + r11 + Centro.get(5) + r21 + Centro.get(6) + r31);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                } else {
                    System.out.println("No dispone de la cantidad de recursos necesaria: " + costo + " cada de recurso");
                }
                break;
            case 3:
                int r12 = (((int) 0.5) * (Centro.get(3)));//50% alma
                int r22= (((int) 0.5) * (Centro.get(4)));//50% cristal
                int r32 = (((int) 0.5) * (Centro.get(5)));//50% luz
                costo = ((int) 0.25) * (Centro.get(4) + r12 + Centro.get(5) + r22 + Centro.get(6) + r32);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                }
                else{
                    System.out.println("No dispone de la cantidad de recursos necesaria: "+costo+" cada de recurso");
                }
                break;
        }
        //return null;
    }

}
