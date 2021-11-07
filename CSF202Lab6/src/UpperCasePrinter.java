public class UpperCasePrinter extends PrinterDecorator {
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        super.print(s.toUpperCase());
    }
}
