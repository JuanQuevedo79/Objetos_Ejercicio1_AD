/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juan
 */
    public class Fraccionario {
    private int numerador ;
    private int denominador;

    /**
     * @param args the command line arguments
     */
    
    public Fraccionario(int numerador, int denominador, int mixto) {
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fraccionario sumar(Fraccionario f2) {
        Fraccionario f;
        int num, den;  
        
        num = this.numerador * f2.denominador+this.denominador*f2.numerador;
        den = this.denominador*f2.denominador;
        f = new Fraccionario (num, den, 1);
        return f;
    }
    public Fraccionario restar(Fraccionario f2) {
        Fraccionario f;
        int num, den;  
        
        num = this.numerador * f2.denominador-this.denominador*f2.numerador;
        den = this.denominador*f2.denominador;
        f = new Fraccionario (num, den,1);
        return f;
    }
    
    public Fraccionario Multiplicacion (Fraccionario f2) {
        Fraccionario f;
        int num, den;  
        
        num = this.numerador * f2.denominador*this.denominador*f2.numerador;
        den = this.denominador*f2.denominador;
        f = new Fraccionario (num, den,1);
        return f;
    }
    public Fraccionario dividir(Fraccionario f2)  {
        Fraccionario f;
        int num, den;
        
        num = this.numerador*f2.denominador;
        den = this.denominador*f2.numerador;
        f = new Fraccionario(num, den, 1);
        return f;
    }

}
