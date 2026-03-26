public class Pointer2d {

    public class Point {
        // write code here
        private int x;
        private int y;

        public Point(){
            this(0, 0);
        }

        public Point (int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance(int x, int y) {
            int xDiff = this.x - x;
            int yDiff = this.y - y;
            double diff = (double) Math.sqrt((xDiff*xDiff)+(yDiff*yDiff));
            return diff;

        }

        public double distance(){
            double diff = (double) distance(0, 0);
            return diff;
        }

        public double distance(Point point) {
            double diff = distance(point.x, point.y);
            return diff;

        }
    }
}
