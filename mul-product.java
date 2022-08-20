import java.util.Scanner;

public class Mul_Product {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		OnlineStoreLab3[] arr = new OnlineStoreLab3[30];
		
		while (true)
		{
			System.out.println();
			System.out.println("0. Exit");
			System.out.println("1. Add new product.");
			System.out.println("2. Update the price of a product.");
			System.out.println("3. Get Discounted Price of a product.");
			System.out.println("4. View the list of products with their details.");
			System.out.println();
			System.out.print("Enter a choice : ");
			int a = input.nextInt();
			switch(a) {
			case 0:
				System.exit(0);
			case 1:
				int i;

				for(i = 0; i < arr.length; i++)
				{
					if (arr[i] == null)
					{
						System.out.print("Enter new product name : ");
						String n = input.next();
						System.out.print("Enter new product quality : ");
						String n1 = input.next();
						System.out.print("Enter new product market price : ");
						double n2 = input.nextDouble();
						arr[i] = new  OnlineStoreLab3(n, n1, n2);
						break;
					}
				}
				break;
				
			case 2:
				int j;
				System.out.print("Enter any product name : ");
				String m = input.next();
				for (j = 0; j < arr.length; j++)
				{
					if (arr[j].product_name.equals(m))
					{
						System.out.print("Enter the updated price : ");
						double p = input.nextDouble();
						arr[j].updateprice(p);
						break;
					}
				}
				break;
				
			case 3:
				int k = 0;
				System.out.print("Enter any product name : ");
				String m1 = input.next();
				for (k = 0; k < arr.length; k++)
				{
					if (arr[k].product_name.equals(m1))
					{
						System.out.print("Enter the amount of discount : ");
						double m2 = input.nextDouble();
						double m3 = arr[k].discountedprice(m2);
						System.out.println("The discounted price of the product is : "+m3);
						break;
					}
				}
				break;
				
			case 4:
				System.out.println("The list of products are these  : ");
				System.out.println();
				for (int s = 0; s < arr.length; s++)
				{
					if (arr[s] ==  null)
						break;
					else
					{
						System.out.println(arr[s]);
						arr[s].toString();
					}
				}
				break;
			}
		}
		
	}
}