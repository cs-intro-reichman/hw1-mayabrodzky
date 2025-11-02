// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		  if (args.length != 3) {
            System.out.println("Usage: java FVCalc <currentValue> <ratePercent> <years>");
            return;
        }

        int currentValue = Integer.parseInt(args[0]);
        double ratePercent = Double.parseDouble(args[1]); 
        int years = Integer.parseInt(args[2]);

        double rate = ratePercent / 100.0;
        double future = currentValue * Math.pow(1 + rate, years);
        int futureInt = (int) future; 

        System.out.println("After " + years + " years, $" + currentValue
                + " saved at " + ratePercent + "% will yield $" + futureInt);
    }
}