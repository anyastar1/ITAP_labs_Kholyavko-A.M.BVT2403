import java.util.*;

public class EvaluateGrades {
    public static Map<String, Integer> evaluateGrades(int[] grades) {
        Map<String, Integer> result = new LinkedHashMap<>();
        result.put("A", 0);
        result.put("B", 0);
        result.put("C", 0);
        result.put("D", 0);
        result.put("F", 0);
        
        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                result.put("A", result.get("A") + 1);
            } else if (grade >= 80 && grade <= 89) {
                result.put("B", result.get("B") + 1);
            } else if (grade >= 70 && grade <= 79) {
                result.put("C", result.get("C") + 1);
            } else if (grade >= 60 && grade <= 69) {
                result.put("D", result.get("D") + 1);
            } else if (grade >= 0 && grade <= 59) {
                result.put("F", result.get("F") + 1);
            }
        }
        
        // Удаляем оценки с нулевым количеством
        result.entrySet().removeIf(entry -> entry.getValue() == 0);
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        // Парсим [90,85,70,40,100]
        String arrayPart = input.replace("[", "").replace("]", "").trim();
        String[] numbers = arrayPart.split(",");
        int[] grades = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            grades[i] = Integer.parseInt(numbers[i].trim());
        }
        
        Map<String, Integer> result = evaluateGrades(grades);
        
        // Вывод в формате {A: 2, B: 1, C: 1, F: 1}
        System.out.print("{");
        int count = 0;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            if (count < result.size() - 1) {
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("}");
    }
}
  
}
