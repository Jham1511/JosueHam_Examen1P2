/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_examen1p2;

import java.util.ArrayList;
import static josueham_examen1p2.Menu.ingrese;

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

    public void ping(ArrayList<PC> compus, int pos) {
        System.out.println("Ingrese la IP: ");
        String cad = ingrese.next();
        String[] tokens = cad.split("\\.");
        int dec = Integer.parseInt(tokens[3]);
        int bin = decToBin(dec);
        String[] tokensAtri = compus.get(pos).getIP().split("\\.");
        int decAtributo = Integer.parseInt(tokensAtri[3]);
        int binAtri = decToBin(decAtributo);
        if (bin == binAtri) {
            String[] MaskAtri = compus.get(pos).getMascara().split("\\.");
            int decMaskAtri = Integer.parseInt(MaskAtri[3]);
            int binMaskAtri = decToBin(decMaskAtri);
            if (bin == binMaskAtri) {
                System.out.println("Pinging to " + cad + " with 32 bits of data: ");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Reply from " + cad + ":" + " bytes = 32 time=37ms TTL=46");
                }
                System.out.println("Ping statistics for " + cad + ":");
                System.out.println("       Packets: Sent = 4, Received = 4, Lost = 0 (0% loss)");
            } else if (bin != binMaskAtri) {
                System.out.println("Pinging to " + cad + " with 32 bits of data: ");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Reply from " + cad + ":" + " Destination Host Unreachable");
                }
                System.out.println("Ping statistics for " + cad + ":");
                System.out.println("       Packets: Sent = 4, Received = 0, Lost = 4 (100% loss)");
            } else if (bin != binAtri) {
                System.out.println("Pinging to " + cad + " with 32 bits of data: ");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Request timed out");
                }
                System.out.println("Ping statistics for " + cad + ":");
                System.out.println("       Packets: Sent = 4, Received = 0, Lost = 4 (100% loss)");
            }

        }

    }

    public int decToBin(int dec) {
        if (dec < 2) {
            return dec;
        } else {
            return dec % 2 + decToBin(dec / 2) * 10;
        }
    }
    }
