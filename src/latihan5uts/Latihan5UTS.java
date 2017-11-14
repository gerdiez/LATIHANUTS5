/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5uts;

/**
 *
 * @author User
 */
public class Latihan5UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here-
        JajarGenjang jajar=new JajarGenjang(50, 60, 70, 80, 100, 120);
        jajar.hitungKeliling();
        jajar.hitungLuas();
        
        Segitiga segitiga=new Segitiga();
        segitiga.hitungKeliling();
        segitiga.hitungLuas();
    }
    
}
