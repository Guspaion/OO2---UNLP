public class ReportPDF extends EstrategiaExport {
    public ReportPDF() {

    }

    private void setearContenidoPDF(DocumentFile docFile, Document doc) {
        PDFExporter exporter = new PDFExporter();
        docFile.setContent(exporter.generatePDFFile(doc));
    }

    public DocumentFile export(Document doc) {
        DocumentFile docFile = super.export(doc);
        docFile.contentType("application/pdf");
        docFile.setPageSize("A4");
        this.setearContenidoPDF(docFile, doc);
        return docFile;
    }
}
