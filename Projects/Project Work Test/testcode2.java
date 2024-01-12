 class DarkRedTextExample {
    public static void main(String[] args) {
        // ANSI escape code for dark red text
        String dr = "\u001B[31;2m";
        String r = "\u001B[31;40m";
        
        // Text to display
        String message = "Dark Red Text Example";
        
        // ANSI escape code to reset text color to default
        String reset = "\u001B[0m";
        
        // Display dark red text
        System.out.println(dr + "This is " + message + reset);
        System.out.println(r + "This is " + message + reset);
    }
}
