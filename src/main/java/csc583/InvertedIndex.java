package csc583;
import csc583.Document;

public class InvertedIndex {

    boolean indexExists=false;
    String inputFilePath ="";

    public InvertedIndex(String inputFile){
        inputFilePath =inputFile;
    }

    public static void main(String[] args ) {
        try {
            String fileName = "Docs.txt";
            System.out.println("********Welcome to  Homework 2!");
            String query = "schizophrenia /2 drug";
            InvertedIndex objInvertedIndex = new InvertedIndex(fileName);
            Document[] ans = objInvertedIndex.runQ8_1_1(query);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Document[] runQ8_1_1(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        Document[] dummy_ans= {null};
        return dummy_ans;
    }

    public Document[] runQ8_1_2(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        Document[] dummy_ans= {null,null,null};
        return dummy_ans;
    }

    public Document[] runQ8_2_directional(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        Document[] dummy_ans= {null};
        return dummy_ans;
    }
}
