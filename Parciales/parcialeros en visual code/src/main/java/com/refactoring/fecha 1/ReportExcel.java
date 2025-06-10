public class ReportExcel extends EstrategiaExport {
    public ReportExcel() {

    }

    private void setearContenidoPDF(DocumentFile docFile, Document doc) {
        PDFExporter exporter = new PDFExporter();
        docFile.setContent(exporter.generatePDFFile(doc));
    }

    public DocumentFile export(Document doc) {
        DocumentFile docFile = super.export(doc);
        docFile.contentType("application/vnd.ms-excel");
        docFile.setSheetName(doc.getSubtitle());
        this.setearContenidoExcel(docFile, doc);
        return docFile;
    }
}
