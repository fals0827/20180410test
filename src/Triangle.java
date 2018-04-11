public class Triangle extends Shape{
    private int a , b , angle ;
    public Triangle (int a1 ,int b1 ,int angle1){
        this.setA(a1);
        this.setB(b1);
        this.setAngle(angle1);
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
    public void setAngle(int angle1) {
        if (angle1 > 0 && angle1 < 180){
            this.angle = angle1;
        }else {
            System.out.println("輸入錯誤，將角度設定為 90 度");
        }
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getAngle() {
        return angle;
    }
    @Override
    public void show() {
        double area = 0.5d * getA() * getB() * Math.sin(getAngle());
        System.out.println("面積:\t"+ area);
    }
}
