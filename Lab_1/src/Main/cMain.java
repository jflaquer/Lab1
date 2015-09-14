/* Jael Flaquer
 * Parth Modi
 * Lab-1  */

package Main;

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class cMain {
	public static void main(String[] args) {
		double rate_i;
		double rate_p;
		double years_w;
		double years_r;
		double income;
		double ssi;
		double r_i;
		double n_r;
		double y_r;
		double f;
		boolean t;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the percentage of rate of interest for investment: ");
		rate_i = user_input.nextFloat();
		r_i = rate_i/(100*12);
		System.out.println("Enter the years of retirement: ");
		years_r = user_input.nextFloat();
		n_r = years_r*12;
		System.out.print("Enter the aount of required income: ");
		income = user_input.nextFloat();
		System.out.print("Enter the amount of monthly SSI: ");
		ssi = user_input.nextFloat();
		y_r = income - ssi;
		System.out.print("How much money would you like as leftover: ");
		f = user_input.nextFloat();
		t = false;
		
		double PV;
		
		PV = FinanceLib.pv(r_i, n_r, y_r, f, t);
		System.out.print("The percent value is" + PV);
		
		double r_w;
		double n_w;
		double p;
		
		System.out.print("Enter the percentage of rate of interest for payback: ");
		rate_p = user_input.nextFloat();
		r_w = rate_p/(100*12);
		System.out.print("Enter the years of work: ");
		years_w = user_input.nextFloat();
		n_w = years_w*12;
		p = 0;
		
		double PMT;
		
		PMT = FinanceLib.pmt(r_w, n_w, p, PV, t);
		System.out.print("The payment value is" + PMT);
		
	}
}