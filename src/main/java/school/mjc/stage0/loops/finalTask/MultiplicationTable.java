package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {

    public static int printTable(int numberTableToPrint) {
        int limit = 10;

        for (int i = 1; i <= limit; i++) {
            int multiplicationResult = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + multiplicationResult);

        }
        return numberTableToPrint;
    }
}