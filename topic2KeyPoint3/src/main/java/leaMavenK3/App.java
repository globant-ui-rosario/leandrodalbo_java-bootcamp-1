package leaMavenK3;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		PDFCreator pdfCreator = new PDFCreator("example1.pdf");

		try {
			pdfCreator.createPdf();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
