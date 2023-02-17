/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_examen1p2;

/**
 *
 * @author skxka
 */
public class PC {
    protected String IP, mascara, hostname;

    public PC() {
    }

    public PC(String IP, String mascara, String hostname) {
        this.IP = IP;
        this.mascara = mascara;
        this.hostname = hostname;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "IP: " + IP 
                + "\nMascara: " + mascara 
                + "\nHostName: " + hostname;
    }
    
    
}
