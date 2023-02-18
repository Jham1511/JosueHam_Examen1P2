/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_examen1p2;



/**
 *
 * @author skxka
 */
public class PC_Escritorio extends PC{
    private int RAM, almacenamiento;
    private boolean grafica, tipoAlmacenamiento;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int RAM, int almacenamiento, boolean tipoAlmacenamiento, boolean grafica, String IP, String mascara, String hostname) {
        super(IP, mascara, hostname);
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.grafica = grafica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(boolean tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isGrafica() {
        return grafica;
    }

    public void setGrafica(boolean grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return super.toString()+ "RAM: " + RAM + "GB"
               + "\nAlmacenamiento: " + almacenamiento + "GB" 
                + "\nGrafica: " + grafica 
                + "\nTipo de Almacenamiento: " + tipoAlmacenamiento;
    }
    
    
}
