import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class DataManager {
    private List<String> data = new ArrayList<>();
    private List<Object> processors = new ArrayList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors()
    );

    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    public void loadData(String source) {
        try {
            data = Files.readAllLines(Paths.get(source));
            System.out.println("Загружено " + data.size() + " строк из " + source);
        } catch (IOException e) {
            System.err.println("Ошибка загрузки " + e.getMessage());
        }
    }
    
    public void processData() {
     
        List<Method> methods = new ArrayList<>();
        for (Object processor : processors) {
            for (Method method : processor.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(DataProcessor.class)) {
                    methods.add(method);
                }
            }
        }
        
       
        methods.sort(Comparator.comparingInt(m -> 
            m.getAnnotation(DataProcessor.class).priority()
        ));
        
     
        for (Method method : methods) {
            try {
                System.out.println("Выполняется обработчик: " + method.getName() + 
                                 " с приоритетом: " + 
                                 method.getAnnotation(DataProcessor.class).priority());
                
            
                Stream<String> stream = data.stream();
                
                
                Object processorInstance = method.getDeclaringClass().getDeclaredConstructor().newInstance();
                

                @SuppressWarnings("unchecked")
                List<String> result = (List<String>) method.invoke(processorInstance, stream);
                
               
                data = result;
                System.out.println("Данные после обработки " + method.getName() + 
                                 ": " + data);
                
            } catch (Exception e) {
                System.err.println("Ошибка обработки в методе " + method.getName() + 
                                 ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public void saveData(String destination) {
        try {
            Files.write(Paths.get(destination), data);
            System.out.println("Сохранено " + data.size() + " строк в " + destination);
        } catch (IOException e) {
            System.err.println("Ошибка сохранения " + e.getMessage());
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    public List<String> getData() {
        return data;
    }
}
