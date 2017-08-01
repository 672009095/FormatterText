package id.codigo.curencyformatter_idr;

/**
 * Created by papahnakal on 01/08/17.
 */

public class IDRCurency {
    public String IDRFormat(String price) {
        String result = "";
        if (price.equalsIgnoreCase("0")) {
            result = "FREE";
            return result;
        } else {
            int lenght = price.length();
            if (lenght <= 3) {
                result = "IDR " + price;
            } else if ((lenght >= 4) && (lenght <= 6)) {
                String reverse = new StringBuilder(price).reverse().toString();
                String tigablkng = reverse.substring(0, 3);
                String depan = reverse.substring(3, reverse.length());
                result = "IDR " + new StringBuilder(tigablkng + "." + depan).reverse().toString();
            } else if (lenght >= 7 && lenght <= 9) {
                String reverse = new StringBuilder(price).reverse().toString();
                String tigablkng = reverse.substring(0, 3);
                String tigatengah = reverse.substring(3, 6);
                String depan = reverse.substring(6, reverse.length());
                result = "IDR " + new StringBuilder(tigablkng + "." + tigatengah + "." + depan).reverse().toString();
            } else if (lenght >= 10 && lenght <= 12) {
                String reverse = new StringBuilder(price).reverse().toString();
                String tigablkng = reverse.substring(0, 3);
                String tigatengah = reverse.substring(3, 6);
                String tigatengah2 = reverse.substring(6, 9);
                String depan = reverse.substring(9, reverse.length());
                result = "IDR " + new StringBuilder(tigablkng + "." + tigatengah + "." + tigatengah2 + "." + depan).reverse().toString();
            }
            return result;
        }
    }
}
