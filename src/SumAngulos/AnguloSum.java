package src.SumAngulos;

public class AnguloSum {
    private int angle1;
    private int angle2;
    private int angle3;

    public AnguloSum(int angle1, int angle2, int angle3) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public boolean isValid() {
        int sum = this.angle1 + this.angle2 + this.angle3;
        return sum == 180;
    }
}
