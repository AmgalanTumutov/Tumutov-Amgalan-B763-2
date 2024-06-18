/*
Тумутов Амгалан Б763-2
Вариант B
18. На прямой гоночной трассе стоит N автомобилей, для каждого из которых известны начальное положение и скорость. Определить, сколько произойдет обгонов.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] positions = {10,20,30,40};
        int[] speeds = {2,3,5,2};
        int overtakes = countOvertakes(positions, speeds);
        System.out.println("Произошло: " + overtakes + " обгона");
    }
    public static int countOvertakes(int[] positions, int[] speeds){
        int overtakes = 0;
        int n = positions.length;
        for (int i = 0; i < n- 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((positions[i] < positions[j] && speeds[i] > speeds[j]) || (positions[i] > positions[j] && speeds[i] < speeds[j])) {
                    overtakes++;
                }
            }
        }
        return overtakes;
    }
}







