package tasks.secondtask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FileReWriter {

    private String fileName;
    private String columnName;
    private String value;

    FileReWriter(String fileName, String columnName, String value){
        this.fileName = fileName;
        this.columnName = columnName;
        this.value = value;
    }

    void rewriteColumnValue() {
        try {
            Path filePath = Paths.get(fileName);
            Stream<String> stream = Files.lines(filePath);

            List<String> list = stream
                    .map(line -> line.replaceAll(columnName + "\\s+.*", String.format("%s %s", columnName, value)))
                    .collect(Collectors.toList());

            Files.write(filePath, list);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
