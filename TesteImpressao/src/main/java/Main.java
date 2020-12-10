import com.spire.pdf.PdfDocument;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Main {

    public static void main(String[] args){
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("/home/decasa/Desktop/teste.pdf");

        PrinterJob loPrinterJob = PrinterJob.getPrinterJob();
        PageFormat loPageFormat  = loPrinterJob.defaultPage();

        Paper loPaper = loPageFormat.getPaper();
        loPaper.setSize(500,600);
        loPageFormat.setPaper(loPaper);
        loPrinterJob.setPrintable(pdf,loPageFormat);

        try {
            loPrinterJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}
