
public class PowerbBill {
	public static void main(String[] args) {
		int pu = 4790;
		int cu = 4950;
		int units = cu-pu;
		System.out.println("No of consumed units:"+units);
		double price;
		double BillAmount = 0;
		if(units<=100) {
			price = 3;
			System.out.println("Slab-1 & unit price:"+price);
			BillAmount = units*price;
		} 
		else if (units>=101 & units<=200) {
			price = 4;
			System.out.println("Slab-2 & unit price:"+price);
			BillAmount = ((100*3)+((units-100)*price));
		}
		else if(units>=201 & units<=300) {
			price = 5;
			System.out.println("Slab-3 & unit price:"+price);
			BillAmount = ((100*3)+(100*4)+(units-200)*price);
		}
		else if(units>=301 & units<=500) {
			price = 10;
			System.out.println("Slab-4 & unit price:"+price);
			BillAmount = ((100*3)+(100*4)+(100*5)+(units-300)*price);
		}
		else if(units>=501) {
			price = 15;
			System.out.println("Slab-5 & unit price:"+price);
			BillAmount = ((100*3)+(100*4)+(100*5)+(200*10)+(units-500)*15);
		}
		System.out.println(BillAmount);
		
	}

}
