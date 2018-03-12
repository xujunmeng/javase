package AnalysisOfPDF;

import java.io.InputStream;

import com.itextpdf.text.pdf.PdfReader;

public class TestPDF {
	public static void main(String[] args) throws Exception {
		
		InputStream inputStream = TestPDF.class.getClassLoader().getResourceAsStream("1a484fae28e130aab16f4e8633b84df0.pdf");
		
		PdfReader pdfReader = new PdfReader(inputStream);
		int pages = pdfReader.getNumberOfPages();
		System.out.println(pages);
	}
	
	
	
	
	
	
	
	
}
