import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] patients = new String[3][2];

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int i = 0; i < 3; i++) {
            String[] input = sc.nextLine().split(" ");
            patients[i][0] = input[0];
            patients[i][1] = input[1];
        }

        for (int i = 0; i < 3; i++) {
            String symptom = patients[i][0];
            double temp = Double.parseDouble(patients[i][1]);

            if (symptom.equals("Y")) {
                if (temp >= 37.0) {
                    aCount++;
                } else {
                    cCount++;
                }
            } else {
                 if (temp >= 37.0) {
                    bCount++;
                } else {
                    dCount++;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        result.append(aCount).append(" ")
            .append(bCount).append(" ")
            .append(cCount).append(" ")
            .append(dCount).append(" ");

        if (aCount >= 2) {
            result.append("E");
        }

        System.out.println(result.toString());

        sc.close();
    }
}

/**
 * 감기 증상이 있으면 "Y", 감기 증상이 없으면 "N"
 * 체온에 따라 진료소를 구분할 것
 * Y && >= 37 -> "A"
 * N && >= 37 -> "B"
 * Y && <= 37 -> "C"
 * N && <+ 37 -> "D"
 * 한 번에 3명씩 검사하되, A로 가는 사람이 2명 이상 나올때는 "E"
 */