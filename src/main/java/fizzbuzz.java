public class fizzbuzz {

    public static void main (String[] args){

        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = fizz + buzz;

        for ( int i = 0; i < 100; i++){

            if ( i%5 ==0 && i%3 == 0){
                System.out.println(fizzbuzz + ": " + i);
            } else if (i%5 == 0){
                System.out.println(buzz + ": " + i);
            } else if (i%3 == 0){
                System.out.println(fizz + ": " + i);
            }

        }

    }

    // Product research, walgreens, kohls, test buys, few hundred dollars on each product
    // restocking according,  stay in stock on winning products
    // skin care is huge
    // groceries, supplements, hand soap
    // amazon has a new feature through subscription
    // Invest in KT 

}
