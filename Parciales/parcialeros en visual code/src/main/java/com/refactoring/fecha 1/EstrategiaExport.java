public abstract class EstrategiaExport.java {

    public EstrategiaExport() {
        
    }

    private void setearMetadata(DocumentFile docFile, Document doc) {
        docFile.setTitle(document.getTitle());
        docFile.setAuthor(String.join(", ", doc.getAuthors()));
    }

    public DocFile export(Document doc) {
        DocumentFile docFile = new DocumentFile();
        this.setearMetadata(docFile, doc);
        return docFile;
    }

}