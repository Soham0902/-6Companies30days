package Microsoft;

public class CircleAndRectangleOverlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = Math.max(x1,Math.min(x2,xCenter));
        int closeY = Math.max(y1,Math.min(y2,yCenter));

        int distX = xCenter - closeX;
        int distY = yCenter - closeY;

        if(distX * distX + distY * distY <= radius * radius){
            return true;
        }
        return false;
    }
}
