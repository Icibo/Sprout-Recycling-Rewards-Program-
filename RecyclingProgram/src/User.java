/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author evanv
 */
public class User {
    private String name;
    private String pass;
    private int points;
    private String tier;
    private double tMulti;
    public User(String n, String p, int po, String t, double tm){
        name = n;
        pass = p;
        points = po;
        tier = t;
        tMulti = tm;
    }
    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public String getTier(){
        return tier;
    }
    public int getPoints(){
        return points;
    }
    public double getTierMulti(){
        return tMulti;
    }
    public void addPoints(int p){
        points+=p;
    }
    public void minusPoints(int p){
        points-=p;
    }
    public void setTier(String t){
        tier = t;
    }
    public void setMTier(double mt){
        tMulti = mt;
    }
}
