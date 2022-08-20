/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uapbazar;

public class Bazar {
    public static void main(String[] args) {
       UapBazar product1 = new UapBazar("Burger","food",114,15);
       product1.display();
       double v= product1.getDiscountedPrice(20);
       System.out.println("Discount price:"+v);
    }
}