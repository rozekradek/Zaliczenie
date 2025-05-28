import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Podaj " + n + " liczb całkowitych:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        boolean foundduplicate = false;
        System.out.println("Zduplikowane wartości");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
                foundduplicate = true;
            }
        }
        if (!foundduplicate){
            System.out.println("Brak zduplikowanych wartości");
        }
        scanner.close();
        }
    }