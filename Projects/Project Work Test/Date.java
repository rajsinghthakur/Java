import java.text.SimpleDateFormat;
import java.util.Date;

class date {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDate);
        String re = "\u001B[0m", bl = "\u001B[40m", r = "\u001B[41m", g = "\u001B[42m", y = "\u001B[43m",y2 = "\u001B[44m",
                p = "\u001B[45m", c = "\u001B[46m", R = "\u001B[47m", G = "\u001B[42m", C = "\u001B[46m",
                W = "\u001B[47m";

        System.out.println(bl+"Current System Date and Time: " + formattedDateTime);
        System.out.println(r+"Current System Date and Time: " + formattedDateTime);
        System.out.println(g+"Current System Date and Time: " + formattedDateTime);
        System.out.println(y+"Current System Date and Time: " + formattedDateTime);
        System.out.println(y2+"Current System Date and Time: " + formattedDateTime);
        System.out.println(p+"Current System Date and Time: " + formattedDateTime);
        System.out.println(c+"Current System Date and Time: " + formattedDateTime);
        System.out.println(R+"Current System Date and Time: " + formattedDateTime);
    }
}
