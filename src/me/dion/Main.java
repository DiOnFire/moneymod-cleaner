package me.dion;

public class Main {
    public static void main(String[] args) throws Exception {
	System.out.print("Moneymod+2 cleaner by dion\n");
        System.out.print("Deletes shit cattyn's rat from your computer\n");
        System.out.print("Detecting your OS name...\n");
        System.out.print("OS Detected! ");
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Mac OS X")) {
            MacRemover macRemover = new MacRemover();
            macRemover.MacBackdoorRemover();
        } else if (System.getProperty("os.name").startsWith("Windows")) {
            WindowsRemover winRemover = new WindowsRemover();
            winRemover.WinBackdoorRemover();
        }

        System.out.print("Done!");
    }
}
