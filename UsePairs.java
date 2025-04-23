package generics;

public class UsePairs {

	public static void main(String[] args) {
		Pair < String,Double > stockTicker;
		stockTicker = new Pair <String, Double>("AAPL",237.09);
		System.out.println(stockTicker);
		
		Pair<Integer, Double>employee1,employee2,employee3;
		
		employee1 = new Pair<Integer,Double>(9876,101000.98);
		employee2 = new Pair<Integer,Double>(5678,54320.98);
		employee3 = new Pair<Integer,Double>(1234,1984.98);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
