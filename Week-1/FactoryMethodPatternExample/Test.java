public class Test{
    public static void main(String[] args){
        DocumentFactory wordFac=new WordDocumentFactory();
        Document wordDoc=wordFac.createDocument();
        wordDoc.open();

        DocumentFactory pdfFac=new PdfDocumentFactory();
        Document pdfDoc=pdfFac.createDocument();
        pdfDoc.open();

        DocumentFactory excelFac=new ExcelDocumentFactory();
        Document excelDoc=excelFac.createDocument();
        excelDoc.open();
    }
}