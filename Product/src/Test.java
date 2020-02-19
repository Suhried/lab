public class Test {

	public static void main(String[] args) {
	Product pl = new Product("100v","this is a phone.",50000);
    System.out.println(pl);
    System.out.println("-------------");
	Product p2 = new Product();
	p2.setCode("200p");
	p2.setDescription("this is nokia");
	p2.setPrice(3000);
	
	System.out.println(p2);

	}

}
