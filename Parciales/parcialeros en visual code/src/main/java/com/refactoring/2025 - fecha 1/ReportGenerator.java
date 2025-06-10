public class ReportGenerator {
    private EstrategiaExport strat;

    public ReportGenerator(EstrategiaExport strat) {this.strat = strat}

    public void generateReport(Document doc) {
        this.saveExportedFile(strat.export(doc));
    }
}
