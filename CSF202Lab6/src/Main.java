public class Main {
    public static void main(String[] args) {
        Printer upperCasePrinter  = new UpperCasePrinter(new ConsolePrinter());
        upperCasePrinter.print("This is just a test");
        Printer lineNumberPrinter = new LineNumberPrinter(new ConsolePrinter());
        lineNumberPrinter.print("This is a test /n and another line /n");

        Printer printer = new ConsolePrinter();
        printer.print("this is a test");
        String fileName = "./THISTESTFILE.txt";
        // FilePrinter filePrinter = new FilePrinter(fileName);
        Printer anyPrinter = new UpperCasePrinter(new FilePrinter(fileName)/*filePrinter*/);
        anyPrinter.print("This is a more tests again");
        anyPrinter.print("This is a more tests again x");

        Printer lineWrappingPrinter = new LineWrappingPrinter(new FilePrinter(fileName),5);
        lineWrappingPrinter.print("Tom’s labs are the best labs.");
        Printer splitLinePrinter = new SplitLinePrinter(new FilePrinter(fileName));        // filePrinter.closeFile();
        splitLinePrinter.print("Tom’s labs are the best labs.");

        // using a decorated printer
        testPrinter(anyPrinter,"Tom’s labs are the best labs.");
        // using a basic printer
        testPrinter(printer,"Tom’s labs are the best labs.");
        // using a decorated printer§
        testPrinter(upperCasePrinter, "Tom’s labs are the best labs.");

    }

    static void testPrinter(Printer printer,String s) {
        printer.print(s);
    }
}
