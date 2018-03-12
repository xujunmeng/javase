package AnalysisOfPDF;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageTree;

public class TestPDF2 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\1a484fae28e130aab16f4e8633b84df0.pdf");
		
		PDDocument pdd = PDDocument.load(file);
		PDPageTree pages = pdd.getPages();
		int count = pages.getCount();
		System.out.println(count);
	}
}
