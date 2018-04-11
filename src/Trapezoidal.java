public class Trapezoidal extends Shape{
    private int a , b , h;
    public Trapezoidal (int a1 , int b1 , int h1){
        this.setA(a1);
        this.setB(b1);
        this.setH(h1);
    }
    public void setA(int a1) {
        if (a1 > 0){
            this.a = a1;
        }else {
            System.out.println("輸入錯誤，將 a 邊長設定為 1");
        }
    }
    public void setB(int b1) {
        if (b1 > 0){
            this.b = b1;
        }else {
            System.out.println("輸入錯誤，將 b 邊長設定為 1");
        }
    }
    public void setH(int h1) {
        if (h1 > 0){
            this.h = h1;
        }else {
            System.out.println("輸入錯誤，將高設定為 1");
        }
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getH() {
        return h;
    }
    @Override
    public void show() {
        double area = (getA() + getB()) * getH() * 0.5d;
        System.out.println("面積:" + area);
    }
}

