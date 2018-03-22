package MyGame;

public class Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        return new int[4][2];  
    }  
    public void changePosition()  
    {  
        currentMethod++;  
        if(currentMethod>3)  
            currentMethod=0;  
    }  
    protected int currentMethod=0;  
  
}  
  
class OneBlock extends Blocks//а╒пн  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0)  
        {  
            points[1]=new int[]{x-1,y};  
            points[2]=new int[]{x+1,y};  
            points[3]=new int[]{x,y-1};  
        }  
        else if(currentMethod==1)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x-1,y-1};  
        }  
        else if(currentMethod==2)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x-1,y-1};  
            points[3]=new int[]{x+1,y-1};  
        }  
        else if(currentMethod==3)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x+1,y-1};  
        }  
        return points;  
    }  
  
}  
  
class LeftTwoBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x-1,y-2};  
        }  
        else if(currentMethod==1)  
        {  
            points[1]=new int[]{x-1,y};  
            points[2]=new int[]{x+1,y};  
            points[3]=new int[]{x+1,y-1};  
        }  
        else if(currentMethod==2)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x+1,y};  
        }  
        else if(currentMethod==3)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x+1,y-1};  
            points[3]=new int[]{x+2,y-1};  
        }  
        return points;  
    }  
}  
  
class RightTwoBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x+1,y-2};  
        }  
        else if(currentMethod==1)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x-1,y-1};  
            points[3]=new int[]{x-2,y-1};  
        }  
        else if(currentMethod==2)  
        {  
            points[1]=new int[]{x-1,y};  
            points[2]=new int[]{x,y-1};  
            points[3]=new int[]{x,y-2};  
        }  
        else if(currentMethod==3)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x+1,y};  
            points[3]=new int[]{x+2,y};  
        }  
        return points;  
    }  
}  
  
class LeftThreeBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0||currentMethod==2)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x-1,y-1};  
            points[3]=new int[]{x-1,y-2};  
        }  
        else if(currentMethod==1||currentMethod==3)  
        {  
            points[1]=new int[]{x-1,y};  
            points[2]=new int[]{x,y-1};  
            points[3]=new int[]{x+1,y-1};  
        }  
  
        return points;  
    }  
}  
  
class RightThreeBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0||currentMethod==2)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x+1,y-1};  
            points[3]=new int[]{x+1,y-2};  
        }  
        else if(currentMethod==1||currentMethod==3)  
        {  
            points[1]=new int[]{x+1,y};  
            points[2]=new int[]{x,y-1};  
            points[3]=new int[]{x-1,y-1};  
        }  
  
        return points;  
    }  
}  
  
class FourBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        points[1]=new int[]{x+1,y};  
        points[2]=new int[]{x,y-1};  
        points[3]=new int[]{x+1,y-1};  
  
        return points;  
    }  
}  
  
class FiveBlock extends Blocks  
{  
    public int[][] getLocation(int x,int y)  
    {  
        int[][] points=new int[4][2];  
        points[0]=new int[]{x,y};  
        if(currentMethod==0||currentMethod==2)  
        {  
            points[1]=new int[]{x,y-1};  
            points[2]=new int[]{x,y-2};  
            points[3]=new int[]{x,y-3};  
        }  
        else if(currentMethod==1||currentMethod==3)  
        {  
            points[1]=new int[]{x+1,y};  
            points[2]=new int[]{x+2,y};  
            points[3]=new int[]{x-1,y};  
        }  
  
        return points;  
    }  
}  
