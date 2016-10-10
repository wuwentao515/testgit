package com.sinoway.cisp.test;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class test {  
    public static Map chm = new ConcurrentHashMap();  
    public static void main(String[] args)  
    {  
        test.chm.put("test", 1);  
        tht t1 = new tht();  
        t1.start();  
        for(int i=1;i<1000;i++)  
        {  
            th t = new th(i);  
            t.start();  
        }
  
    }  
}  
class th extends Thread  
{  
    private int number = 0;  
    public th(int _number)  
    {  
        number = _number;  
    }  
      
    @Override  
    public void run()  
    {  
          
        boolean bo = true;  
        while(bo){  
            int state = (Integer)test.chm.get("test");  
            if(state == 9 )  
            {  
//              System.out.println("线程:"+number+",停止!");  
                bo = false;  
            }else  
            {  
                System.out.println("线程:"+number+",state="+state+",time:"+System.currentTimeMillis());  
            }  
        }  
    }  
}  
  
class tht extends Thread  
{  
    public tht()  
    {  
    }  
      
    @Override  
    public void run()  
    {  
          
        boolean bo = true;  
        while(bo){  
                int state = (int)(Math.random() * 1000000);  
                test.chm.put("test", state);  
                if(state == 9)  
                {  
                    System.out.println("线程:-1,停止,time="+System.currentTimeMillis()+",--------------------------------------------");  
                    bo = false;  
                }  
        }  
    }  
}  