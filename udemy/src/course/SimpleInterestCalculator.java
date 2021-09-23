package course;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal rate;
	

	public SimpleInterestCalculator(String principle, String rate) {
		this.principle=new BigDecimal(principle);
		this.rate=new BigDecimal(rate).divide(new BigDecimal(100));
	}


	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue= principle.add(principle.multiply(rate).multiply( new BigDecimal(noOfYears)));
		return totalValue;
	}

}
