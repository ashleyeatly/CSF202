import com.sun.javafx.binding.StringFormatter;

public class LineNumberPrinter extends PrinterDecorator {
    public LineNumberPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        String[] stringArray = s.split("/n");
        int lineNumber = 0;
        for (String value : stringArray) {
            // String finalOne = Integer.toString(lineNumber) + ":" + value;
            String finalOne = lineNumber + ":" + value;
            lineNumber++;
            super.print(finalOne);
        }
    }
}
