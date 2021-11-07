public class LineWrappingPrinter extends PrinterDecorator {
    private int numberChars;

    public LineWrappingPrinter(Printer printer) {
        // this.numberChars = numberChars;
        super(printer);
    }

    public LineWrappingPrinter(Printer printer, int numberChars) {
        super(printer);
        this.numberChars = numberChars;
    }

    @Override
    public void print(String s) {
        while (s.length() > 0) {
            if  (s.length()> numberChars) {
                super.print(s.substring(0, numberChars));
                s = s.substring(numberChars);
            } else {
                super.print(s);
                s = "";
            }
        }
    }


    String chunkString(String s, int numberChars) {
        return s;
    }
}
