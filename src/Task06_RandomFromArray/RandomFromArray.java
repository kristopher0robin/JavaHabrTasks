package Task06_RandomFromArray;

public class RandomFromArray {

    private int[] values;
    private int[] weights;
    private int[] ranges; // левые границы отрезков
    private int sum; // общая длина всех отрезков

    public RandomFromArray (int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        // Сумма длин всех отрезков
        sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        // заполняем ranges левыми границами
        int lastSum = 0;
        for (int i=0; i<ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    /**
     * Массив ranges уже заполнен, так что остается сгененрировать
     * значение в промежутке [0; sum],
     * и найти отрезок, содержащий это значение
     */

    public int getRandom() {
        int random = (int) (Math.random() * (sum-1));

        int curRangeIndex = 0;
        for (int i=0; i<ranges.length; i++) {
            if (ranges[i] > random) {
                break;
            }
            curRangeIndex = i;
        }

        return values[curRangeIndex];
    }

}
