import java.util. List;
import java.util. stream.Collectors;
import java.util. stream.Stream;

public class FilterProcessor {

    @DataProcessor(description = "Фильтрует пустые строки", priority = 1)
    public List<String> filterEmptyLines(Stream<String> dataStream) {
        return dataStream
                .filter(line -> line != null && !line. trim().isEmpty())
                .collect(Collectors.toList());
    }
}
