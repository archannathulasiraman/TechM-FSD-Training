package TechM;
public class practicee{
    public static void main(String[] args) {
        int[] stocks = {9, 2, 3, 8, 5, 4, 6}; 
        int maxProfit = 0;
        for(int i=0;i<stocks.length;i++) {
        	for(int j=i+1;j<stocks.length;j++) {
        		maxProfit=Math.max(maxProfit,stocks[j]-stocks[i]);
        		 System.out.println(stocks[i]);
        	}
        	
        }
       

//        for (int price : stocks) {
//            if (price < buyPrice) {
//                
//                buyPrice = price;
//            } else if (price - buyPrice > maxProfit) {
//                
//                maxProfit = price - buyPrice;
//            }
//        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}

/*package TechM;
import java.util.Scanner;
public class practicee {
	public static void main(String[]a) {
		Scanner s = new Scanner(System.in);
		int[]stocks= {1,2,3,8,5,4,6};
		int max_profit=0;
		int buy_price=Integer.MAX_VALUE;
		for(int i=0;i<stocks.length;i++) {
			for(int j=i+1;j<stocks.length;j++) {
				if(buy_price>stocks[j]) {
					buy_price=stocks[j];
					
				}
			
			}
			int num=stocks[buy_price];
			int sell_price=0;
			for(int c=0;c<stocks.length;c++) {
				for(int b=num+1;b<stocks.length;b++) {
					if(sell_price>stocks[b]) {
						sell_price=stocks[b];
					
					 max_profit= sell_price-buy_price;
					System.out.printl(max_profit);
				}
			}
			
		}
	}
}
}*/




