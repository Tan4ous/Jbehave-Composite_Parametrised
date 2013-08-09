package Tan4ous.steps;

/**
 * Created with IntelliJ IDEA.
 * User: jem
 * Date: 08.08.13
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class Bonus {
        static String ENOUGH="enough", NOT_ENOUGH="not_enough";
        public static final int Product1=1, Product2=2, Product3=3;
        public Double enough,bonus,sum;
        public Boolean isLogged = false;

    public Bonus (int product) {

        switch(product) {
            case Product1:
                bonus = 20.0;
                break;
            case Product2:
                bonus = 5.0;
                break;
            case Product3:
                bonus = 15.0;
                break;
            default:
                bonus = 0.0;
                break;
        }
        enough = 20.0;
    }

    public void calculateSum(Double points){
        sum = points + bonus;
    }

    public String checkOutSum() {
        if (isLogged) {
            if (sum > enough) {
                return ENOUGH;
            } else {
                return NOT_ENOUGH;
            }
        } else return "Not logged";
     }
}