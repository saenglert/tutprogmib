public class Image {
    public static void main(String[] args) {
        int p1[][] = Picture.load("/home/sascha/Pictures/Rene_Magritte_Pfeife_Bild_002.jpg");
        int p2[][] = rectangle(p1,30,70,250,160);
        int p3[][] = horizontal(p1);
        int p4[][] = blackcircle(p1, 150, 150, 100);
        int p5[][] = verticlecircle(p1, 150, 150, 100);
        Picture.show(p5);
    }

    public static int[][] rectangle(int[][] image, int x1, int y1, int x2, int y2) {
        int[][] temp = copy(image);
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                temp[i][j] = 0;
            }
        }
        return temp;
    }

    public static int[][] horizontal(int[][] image) {
        int[][] temp = copy(image);

        for (int i = 0; i < image.length / 2; i++) {
            for (int j = 0; j < image[0].length; j++) {
                int temp2 = temp[i][j];
                temp[i][j] = temp[image.length - i - 1][j];
                temp[image.length - i - 1][j] = temp2;
            }
        }

        return temp;
    }

    public static int[][] blackcircle(int[][] image, int mx, int my, int r) {
        int[][] temp = copy(image);

        for (int x = mx - r; x <= mx + r; x++) {
            for (int y = my - r; y <= my + r; y++) {
                if (distance(mx, my, x, y) <= r) black(temp, x, y);
            }
        }

        return temp;
    }

    public static void black(int[][] image,int x,int y) {
        image[x][y] = 0;
    }

    public static int[][] verticlecircle(int[][] image, int mx, int my, int r) {
        int[][] temp = copy(image);
        for(int x =0; x < temp.length; x++) {
            for (int y = my - r; y < my; y++) {
                if (distance(mx, my, x, y) <= r) verticle(temp, mx, my, x, y);
            }
        }

        return temp;
    }

    public static void verticle(int[][] image, int cx, int cy, int x, int y) {
        int temp = image[x][y];
        image[x][y] = image[x][image[x].length - 1 - y];
        image[x][y + (cy - y) * 2] = temp;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static int[][] copy(int[][] image) {
        int [][] temp = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            System.arraycopy(image[i], 0, temp[i], 0, image[0].length);
        }

        return temp;
    }
}
