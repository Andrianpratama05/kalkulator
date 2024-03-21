/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class app {
    public static void main(String[] args){
        KalkulatorForm kf = new KalkulatorForm();
        kf.setLocationRelativeTo(null);
        kf.setVisible(true);
    }
 public static Double hitung(Double angka1, Double angka2, String operator){
     Double hasil = null;
      if (operator.equals("+")) {
            hasil = angka1 + angka2;

        } else if (operator.equals("-")) {
            hasil = angka1 - angka2;

        } else if (operator.equals("*")) {
            hasil = angka1 * angka2;

        } else if (operator.equals("/")) {
            hasil = angka1 / angka2;
        }
      
      return hasil;
 }   
 
 public static Double penjumlahan(Double angka1, Double angka2){
     Double hasil = angka1 + angka2;
     return hasil;
 }
  public static Double pengurangan(Double angka1, Double angka2){
     Double hasil = angka1 - angka2;
     return hasil;
}
   public static Double perkalian(Double angka1, Double angka2){
     Double hasil = angka1 * angka2;
     return hasil;
 }
    public static Double pembagian(Double angka1, Double angka2){
     Double hasil = angka1/angka2;
     return hasil;
 }
}
  
