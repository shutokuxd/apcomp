import java.util.Scanner;
public class discounts {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter price");
        double p = s.nextDouble();
        int price = (int)(p*100);  //123.34 ...>12345
        //Part 1
        int h = price /10000;
        int t = price % 10000/1000;
        int o = price % 1000/100;
        int tc = price % 100 / 10;
        int oc = price % 10;
        boolean discount1 = false;  //true or false whether i get discount.
        if(h==2 || h ==3) discount1 = true;
        else if(t==2 || t ==3) discount1 = true;
        else if(o==2 || o ==3) discount1 = true;
        else if(tc==2 || tc ==3) discount1 = true;
        else if(oc==2 || oc ==3) discount1 = true;
        
        if(discount1 == true)  
        { 
           price = price - 100;
            p = price /100.0;
        }
        

        System.out.println("$"+price /100.0);
        System.out.println("Dsicoutn 2");
        //Discount # 2
        price = (int)(p*100);
        h = price /10000;
        t = price % 10000/1000;
        o = price % 1000/100;
        tc = price % 100 / 10;
        oc = price % 10;
        
        System.out.println(h+" "+ t+" "+ o +" "+ tc + " " + oc);
        int counter = 0;
        if(t==0 && h>0)counter++;
        if(o==0 && p>=10)counter++;
        if(tc==0 )counter++;
         if(oc==0 )counter++;
         
         p=p-counter*.5;
         System.out.println("$"+p);
         
            //Discount # 3
            System.out.println("Discount # 3");
        price = (int)(p*100);
        h = price /10000;
        t = price % 10000/1000;
        o = price % 1000/100;
        tc = price % 100 / 10;
        oc = price % 10;
        
        int dollars = (int)p;
        int cents = price %100;
        if(cents>dollars )price = price - 25;
        else if(cents<dollars )price = price - 75;
        else if(cents==dollars )price = price - 185;
        
        p = price/100.0;
        System.out.println("$"+p);
        
          //Discount # 4
            System.out.println("Discount # 4");
        price = (int)(p*100);
        h = price /10000;
        t = price % 10000/1000;
        o = price % 1000/100;
        tc = price % 100 / 10;
        oc = price % 10;
        dollars = (int)p;
        if(dollars %3 == 0)price = price - 250;
        p = price/100.0;
        System.out.println("$"+p);
        
          //Discount # 5
            System.out.println("Discount # 5");
        price = (int)(p*100);
        h = price /10000;
        t = price % 10000/1000;
        o = price % 1000/100;
        tc = price % 100 / 10;
        oc = price % 10;
        
        if(p>20 && p<30 || p>400 && p<500) price = (int)(price/2+.5);
          p = price/100.0;
        System.out.println("$"+p);
        
           //Discount # 6
            System.out.println("Discount # 6");
        price = (int)(p*100);
        h = price /10000;
        t = price % 10000/1000;
        o = price % 1000/100;
        tc = price % 100 / 10;
        oc = price % 10;
        dollars = (int)p;
         cents = price %100;
        //534
        if(dollars>99)
        {
            dollars = h*10 + o;
        }
        p= dollars+(cents/100.0);
            System.out.println("$"+p);
    }
    
}
