package inheritance;

public class CustomerManager {
	

	
	//POLYMORPHISM: Metot pararmetresini S�per Class seklinde tanimlayarak t�m alt classlari icerebilir
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
