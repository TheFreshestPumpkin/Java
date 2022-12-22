package zad4;

public class MathFunc implements MathCalculate{
    MathFunc() {}
    @Override
    public double pow(double num, int grad) {
        double num_1=num;
        if (grad == 0) { return 1; }
        if (grad == 1) { return num; }
        for (int i = 1; i < grad; i++) { num *=num_1; }
        return num;
    }

    @Override
    public double abs(double num) {
        if (num > 0 ) return num;
        else return num *= -1;
    }

    @Override
    public double PI() {
        return 3.141592;
    }
}
