/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evanv
 */
public class Coupon {
    private String title;
    private int cost;
    private int quant;
    public Coupon(String t, int c, int q){
        title = t;
        cost = c;
        quant = q;
    }
    public String getTitle(){
        return title;
    }
    public int getCost(){
        return cost;
    }
    public int getQuant(){
        return quant;
    }
    public void minusQuant(){
        quant-=1;
    }
}
