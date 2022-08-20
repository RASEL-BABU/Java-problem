
package uapbazar1;


public class Product {
    int id;
    double price;
    String name,category;
    public Product(int i,String n,String c,double p )
    {
        id = i;
        price=p;
        name=n;
        category=c;
        
      
    }
    
    public void updatePrice(double newPrice){
        price = newPrice;
        

}
    public double getPrice(){
        return price;
    }
    public double getDiscountedPrice(double Percentage){
        
        return price - (price*Percentage/100);
    }
    public void display(){
        System.out.printf("Id :%d\ncatagory:%s\nname:%s\nPrice:%.1f\n",id,category,name,price);
        
  
        
    }
}
