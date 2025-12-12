import java.util. List;
import java.util.stream. Collectors;
import java.util. stream.Stream;

public class Transform {

    @DataProcessor(description = "Преобразует строки в верхний регистр", priority = 2)
    public List<String> transformToUpperCase(Stream<String> dataStream) {
        return dataStream
                . map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
