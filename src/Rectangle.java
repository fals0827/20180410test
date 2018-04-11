public class Rectangle extends Shape{
    private int a , b ;
    public Rectangle (int a1 , int b1){
        this.setA(a1);
        this.setB(b1);
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
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    @Override
    public void show() {
        System.out.println("面積:" + getA() * getB());
    }
}
