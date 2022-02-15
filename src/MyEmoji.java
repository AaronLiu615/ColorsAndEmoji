public class MyEmoji {

    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    private String monkey = "\uD83D\uDC35";
    private String tomato = "\uD83C\uDF45";
    private String dragon = "\uD83D\uDC09";

    private String name;

    public MyEmoji(String name)
    {
        this.name = name;
    }

    public void introduce(){
        System.out.println(monkey + RED + " HELLO MY NAME IS " + name + "\nNICE TO MEET YOU!");
    }

    public void animate() throws InterruptedException
    {
        // helper method defined below

        System.out.println(monkey + "                                         " + tomato);
        Thread.sleep(500);

        System.out.println("       " + monkey + "                                  " + tomato);
        Thread.sleep(500);

        System.out.println("                     " + monkey + "                    " + tomato);
        Thread.sleep(500);

        System.out.println("                                   " + monkey + "      " + tomato);
        Thread.sleep(500);

        System.out.println("                                       " + monkey + "  " + tomato);
        Thread.sleep(500);

        System.out.println("                                          " + monkey + tomato);
        Thread.sleep(500);

        System.out.println("                                  "+ monkey + RED + name + ": CHOMP CHOMP YUM!");
        Thread.sleep(500);


    }
}
