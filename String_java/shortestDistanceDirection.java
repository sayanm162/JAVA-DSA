public class shortestDistanceDirection {

    public static float getShortestPath(String str) {
        //origin
        int x = 0, y = 0;
        //traversing through the string 
        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);

            //south
            if(dir == 'S') {
                y--;
            }
            
            //north
            else if(dir == 'N') {
                y++;
            }

            //east
            else if(dir == 'E') {
                x++;
            }

            //west
            else if(dir == 'W') {
                x--;
            }
        }
        //calculating displacement
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]) {
        String route = "WNEENESENNN";
        System.out.println(getShortestPath(route));
    }
}
