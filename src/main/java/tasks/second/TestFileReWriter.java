package tasks.second;

public class TestFileReWriter {

    public static void main(String[] args) {
        FileReWriter fileReWriter1 = new FileReWriter("file.txt", "column1", "hey dude");
        FileReWriter fileReWriter2 = new FileReWriter("file.txt", "column2", "let's go");
        FileReWriter fileReWriter3 = new FileReWriter("file.txt", "column3", "party");
        FileReWriter fileReWriter4 = new FileReWriter("file.txt", "column", "hard");
        fileReWriter1.rewriteColumnValue();
        fileReWriter2.rewriteColumnValue();
        fileReWriter3.rewriteColumnValue();
        fileReWriter4.rewriteColumnValue();
    }

}
