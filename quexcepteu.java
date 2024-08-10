public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println(rect.getWidth()); // Output: 10
    }
}
