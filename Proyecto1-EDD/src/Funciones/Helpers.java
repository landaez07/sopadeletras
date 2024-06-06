/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Chris
 */
public class Helpers {

    private boolean esNumero(String num) {
        return num.matches("[0-9]*");
    }

    private double validarNumero(String num) {
        if (esNumero(num) == true) {
            int number = Integer.parseInt(num);
            return number;
        } else {
            return -1;
        }

    }
}
