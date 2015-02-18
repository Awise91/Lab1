import java.util.*;

public class RetirementPlan {
	private int YearsToWork = 0;
	private double InvestmentAnnualReturn = 0;
	private double PaybackAnnualReturn = 0;
	private int YearsRetired = 0;
	private double RequiredIncome = 0;
	private double MonthlySSI = 0;
	private double SaveEachMonth = 0;
	private double WhatYouNeedSaved = 0;
	
	public static void main(String[] args) {
		String HowManyYears = "How many years do you plan to work?";
		
		Scanner scanner = new Scanner(HowManyYears);
		
		scanner.close();
	}
	
	
	
		
		
    public static double pmt(double rate, double numperiods, double principle, double finalbalance, boolean type) {
        double retval = 0;
        if (rate == 0) {
            retval = -1*(finalbalance+principle)/numperiods;
        }
        else {
        double r1 = rate + 1;
        retval = ( finalbalance + principle * Math.pow(r1, numperiods) ) * rate
                  /
               ((type ? r1 : 1) * (1 - Math.pow(r1, numperiods)));
        }
        return retval;
    	}
}
