package Comparable예제;

public class CarComparable implements Comparable<CarComparable>{
    String modelName;
    int modelYear;
    String color;

    public CarComparable(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarComparable o) {
        if (this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName);
        }
        else if (this.modelYear < o.modelYear) return -1; // 정렬 조건이 아님
        else return 1;
    }
}
