
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
        //System.out.println("");
    }

    public static void printTriangle(int size) {
        int num = size;
        while (num > 0) {
            int i = num - 1;
            printWhitespaces(i);
            printStars(size - i);
            //System.out.println("");
            num--;
        }
    }

    public static void xmasTree(int height) {
        int num = height;
        int stars = 0;
        while(num>0) {
            int ws = num-1;
            printWhitespaces(ws);
            printStars(height-ws+stars);
            //System.out.println("");
            num--; stars++;
        }
        int bot = height-2;
        printWhitespaces(bot);
        printStars(3);
        printWhitespaces(bot);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
