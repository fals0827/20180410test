public class Circle extends Shape{
    private int r ;
    private double pi = 3.14 ;
    public Circle (int r1){
        this.setR(r1);
    }
    public void setR(int r1) {
        if (r1 > 0){
            this.r = r1;
        }else {
            System.out.println("輸入錯誤，將半徑設定為 1");
        }
    }
    public int getR() {
        return r;
    }
    @Override
    public void show() {
        System.out.println("面積:" + getR() * getR() * pi);
    }
}
