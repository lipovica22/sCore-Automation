package core_class;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;


public class PDFRead {
    public static void readPdf() throws IOException {
        String file1 = "path/to/file1.pdf";
        String file2 = "path/to/file2.pdf";

        PDDocument document1 = PDDocument.load(new File(file1));
        PDDocument document2 = PDDocument.load(new File(file2));

        PDFTextStripper stripper1 = new PDFTextStripper();
        PDFTextStripper stripper2 = new PDFTextStripper();

        String text1 = stripper1.getText(document1);
        String text2 = stripper2.getText(document2);

        if(text1.equals(text2)) {
            System.out.println("Both PDF files are equal");
        } else {
            System.out.println("Both PDF files are not equal");
        }

        document1.close();
        document2.close();
    }
}
