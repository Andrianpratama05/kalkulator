
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class CRUD {

    private Connection connection;
    private Double angka1, angka2, hasil;
    private String operator;
    private Connection crudkoneksi;
    private PreparedStatement crudpsmt;
    private Statement crudstat;
    private ResultSet crudhasil;
    private String crudquery;

    public CRUD() {
        Koneksi connection = new Koneksi();
        crudkoneksi = connection.getKoneksi();
    }
    
    public void setAngka1(Double angka1){
        this.angka1 = angka1;
    }
    
    public double getAngka1(){
        return angka1;
    }
    
    public void setOperator(String operator){
        this.operator = operator;
    }
    
    public String getOperator(){
        return operator;
    }
    
    public void setAngka2(Double angka2){
        this.angka2 = angka2;
    }
    
    public double getAngka2(){
        return angka2;
    }
    
    public void setHasil(Double hasil){
        this.hasil = hasil;
    }
    
    public double getHasil(){
        return hasil;
    }
    
    public void simpanData(Double angka1, String operator, Double angka2, Double hasil){
        crudquery = "insert into kalku (angka1, operator, angka2, hasil) values (?, ?, ?, ?)";
        
        try{
            crudpsmt = crudkoneksi.prepareStatement(crudquery);
            crudpsmt.setDouble(1, angka1);
            crudpsmt.setString(2, operator);
            crudpsmt.setDouble(3, angka2);
            crudpsmt.setDouble(4, hasil);
            crudpsmt.execute();
            crudpsmt.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
