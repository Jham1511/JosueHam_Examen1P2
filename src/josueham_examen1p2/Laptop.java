/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_examen1p2;



/**
 *
 * @author skxka
 */
public class Laptop extends PC{
    private String mask, resolucion;
    private boolean RGB;

    public Laptop() {
        super();
    }

    public Laptop(String mask, String resolucion, boolean RGB, String IP, String mascara, String hostname) {
        super(IP, mascara, hostname);
        this.mask = mask;
        this.resolucion = resolucion;
        this.RGB = RGB;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "Mascara: " + mask 
                + "\nResolucion: " + resolucion 
                + "\nRGB: " + RGB;
    }
    
    
}
