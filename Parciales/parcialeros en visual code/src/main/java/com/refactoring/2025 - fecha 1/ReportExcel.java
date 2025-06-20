public class ReportExcel extends EstrategiaExport {
    public ReportExcel() {

    }

    private void setearContenidoExcel(DocumentFile docFile, Document doc) {
        ExcelWriter writer = new ExcelWriter();
        docFile.setContent(writer.generateExcelFile(doc));
    }

    public DocumentFile export(Document doc) {
        DocumentFile docFile = super.export(doc);
        docFile.contentType("application/vnd.ms-excel");
        docFile.setSheetName(doc.getSubtitle());
        this.setearContenidoExcel(docFile, doc);
        return docFile;
    }
}
