package inheritance;

public class CustomerManager {
	

	
	//POLYMORPHISM: Metot pararmetresini Süper Class seklinde tanimlayarak tüm alt classlari icerebilir
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	
	// Bulk insert
	public void addMultiple (Customer[] customers) {
		for (Customer customer:customers)	{
			add(customer); // yukaridaki metodu cagirdim
		}
	}
}
