import java.util.*;
class Area  
{
    int l,b;
    Area(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    
    static double returnArea(int x,int y)
    {
        return x*y;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a = new Area(l,b);
        double area = returnArea(l,b);
        System.out.println("AREA = "+area);
    }
}
    
