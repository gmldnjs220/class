public class App {
    public static void main(String[] args) throws Exception {
        Point p = new Point(); //point 객체 생성
        p.set(1, 2); // point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
        

    }
}

class Point {
    private int x, y;

    public void set(int x, int y){
    this.x = x;
    this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

}

class ColorPoint extends Point { //Colorpoint가 point 를 상속받음
    private String Color;
    public void setColor(String Color){
        this.Color = Color;
    }

    public void showColorPoint() {
        System.out.print(Color);
        showPoint();
    }
}
