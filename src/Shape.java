public abstract class Shape {
    protected static int count;
    public Shape () {
        count ++ ;
    }
    public static void showCount (){
        System.out.println("已有" + count + "個資料");
    }
    public abstract void show ();
}
