package leaMavenK3;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFCreator {

	private String documentName;

	public PDFCreator(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public void createPdf() throws DocumentException, FileNotFoundException{
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("./"+this.getDocumentName()));
	
		document.open();
		document.add(new Paragraph("This is an example of how to add dependencies in a Maven project and use them. This time we are using Itex to create this file."));
		document.close();
		
	}

}
