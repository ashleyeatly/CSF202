public class SplitLinePrinter extends PrinterDecorator {
    public SplitLinePrinter(Printer printer) {

        super(printer);
    }

    @Override
    public void print(String s) {
        String[] stringArray = s.split(" ");
        for (String value : stringArray) {
            // String finalOne = Integer.toString(lineNumber) + ":" + value;

            super.print(value);
        }
    }
}
