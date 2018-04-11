import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("=================================");
            System.out.println("1. 創建形狀");
            System.out.println("2. 查詢資料個數");
            System.out.println("0. 結束使用");
            System.out.println("=================================");
            int x = scn.nextInt();
            switch (x){
                case 1 :
                    System.out.println("1. 三角形");
                    System.out.println("2. 圓形");
                    System.out.println("3. 長方形");
                    System.out.println("4. 梯形");
                    int y = scn.nextInt();
                    switch (y){
                        case 1 :
                            System.out.println("輸入 A 邊長");
                            int triA = scn.nextInt();
                            System.out.println("輸入 B 邊長");
                            int triB = scn.nextInt();
                            System.out.println("輸入夾角角度");
                            int triAngle = scn.nextInt();
                            Shape tri = new Triangle(triA , triB , triAngle);
                            tri.show();
                            break;
                        case 2 :
                            System.out.println("輸入半徑");
                            Shape cri = new Circle(scn.nextInt());
                            cri.show();
                            break;
                        case 3 :
                            System.out.println("輸入 A 邊長");
                            int recA = scn.nextInt();
                            System.out.println("輸入 B 邊長");
                            int recB = scn.nextInt();
                            Shape rec = new Rectangle(recA , recB);
                            rec.show();
                            break;
                        case 4 :
                            System.out.println("輸入上底 A");
                            int traA = scn.nextInt();
                            System.out.println("輸入下底 B");
                            int traB = scn.nextInt();
                            System.out.println("輸入高度 H");
                            int traH = scn.nextInt();
                            Shape tra = new Trapezoidal(traA , traB , traH);
                            tra.show();
                            break;
                    }
                case 2 :
                    Shape.showCount();
                    break;
                case 0 :
                    System.out.println("感謝使用");
                    flag = false;
            }
        }
    }
}
