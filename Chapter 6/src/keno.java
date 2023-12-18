import java.util.Scanner;
public class keno

{
    public static void main(String[] args)
    {
        int earnings=0; int winCount=0; int lossCount=0;
        Scanner s = new Scanner(System.in);
        int gameCount = s.nextInt();
         System.out.println("how many spots would you like to play?");
        int spotCount = s.nextInt();
         System.out.println("do you want an easy pick?(Enter 1)\n or pick your own numbers? (enter 2)");
        int pickChoice = s.nextInt();
        int [] pNumbers = rngNumbers(pickChoice,spotCount);
        sort(pNumbers);
        outputArray(pNumbers);
        makeGames(gameCount,pNumbers, spotCount, earnings, winCount, lossCount);
    }
    public static void makeGames(int gCount, int [] pNums, int spots, int eTotal, int Win, int Lose)
    {
        int [] matchArray = new int[spots+1];
        for (int i = 0; i < gCount; i++)
        {
            eTotal--;
            int matches = 0;  
            int [] gNumbers = rngNumbers(1,20);
            int [] gNumbersSort = sort(gNumbers);
            matches = checkMatches(matches, gNumbers, pNums, spots);
            matchArray = countMatches(matches, matchArray);
            if (matches==spots)
            {
                System.out.print("Game # "+(i+1)+" - ");
                outputArray(gNumbersSort);
                
            }
            int earnings = gameResults(spots, matches);
            if (earnings==0) Lose++;
            else Win++;
            eTotal = eTotal + earnings;
        }
        outputResults(Win,Lose,eTotal,matchArray);

    }
    public static int checkMatches(int matches, int [] gNumbersSort, int [] pNums, int spots)
    {
        for (int i = 0; i < spots; i++)
        {
            for (int j = 0; j < gNumbersSort.length; j++)
            {
                if (pNums[i]==gNumbersSort[j])
                {
                    matches++;
                }
            }
        }
        return matches;
    }
    public static int[] rngNumbers(int choice, int spots)
    {
        Scanner s = new Scanner(System.in);
        int [] n = new int[spots];
        boolean [] picked = new boolean[81];
        if (choice==1)
        {
            for(int i = 0;i<n.length;i++)
            {
                int rNum =(int)(Math.random()*80)+1;
                while(picked[rNum]==true)
                {
                    rNum = (int)(Math.random()*80)+1;
                }
                n[i]=rNum;
                picked[rNum]=true;
            }
        }
        else
        {
            System.out.println("enter 10 numbers from 1 to 80");
            for(int i = 0;i<n.length;i++)
            {
            n[i]=s.nextInt();
            }
        }
        return n;
    }
public static int [] sort(int [] num)
    {
       
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i+1; j < num.length; j++)
            {
                if(num[i]>num[j])
                {
                    int star = num[i];
                    num[i] = num[j];
                    num[j] = star;
                }
            }
        }
        return num;
    }
    public static void outputArray(int [] daArray)
    {
        for (int i = 0; i < daArray.length; i++)
        {
            System.out.print(daArray[i]+" ");
        }
        if (daArray.length==20)
        {
        System.out.println("");    
        }
        else
        {
         System.out.print("were selected ");
         System.out.println("");
        System.out.println(" keno numbers when winning maximum prize ");
        }
    }
    public static int gameResults(int spots, int matches)
    {
        if(spots == 1 && matches ==1) return 2;
        else if(spots ==2 && matches ==2) return 11;
        else if (spots ==3 )
        {
            if(matches==2) return 2;
            if(matches==3) return 27;
        }
        else if (spots ==4 )
        {
            if(matches==2) return 1;
            if(matches==3) return 5;
            if(matches==4) return 72;
        }
         else if (spots ==5 )
        {
            if(matches==3) return 2;
            if(matches==4) return 18;
            if(matches==5) return 410;
        }
         else if (spots ==6 )
        {
            if(matches==3) return 1;
            if(matches==4) return 7;
            if(matches==5) return 57;
            if(matches==6) return 1100;
        }
          else if (spots ==7 )
        {  
            if(matches==3) return 1;
            if(matches==4) return 5;
            if(matches==5) return 11;
            if(matches==6) return 100;
            if(matches==7) return 2000;
        }
         else if (spots ==8 )
        {   
            if(matches==4) return 2;
            if(matches==5) return 15;
            if(matches==6) return 50;
            if(matches==7) return 300;
            if(matches==8) return 10000;
        }
        else if (spots ==9 )
        {
            if(matches==4) return 2;
            if(matches==5) return 5;
            if(matches==6) return 20;
            if(matches==7) return 100;
            if(matches==8) return 2000;
             if(matches==9) return 25000;
        }
        else if (spots ==10 )
        {
            if(matches==0) return 5;
            if(matches==5) return 2;
            if(matches==6) return 10;
            if(matches==7) return 50;
            if(matches==8) return 500;
            if(matches==9) return 5000;
            if(matches==10)return 100000;
        }
        return 0;
    }
    public static void outputResults(int Win, int Lose, int eTotal, int [] matchArray)
    {
        System.out.println("#############");
         System.out.println(" results ");
        System.out.println("#############");
        System.out.println("wins: " + Win);
        System.out.println("losses: " + Lose);
         System.out.println("earnings = $"+eTotal);
        for (int i = 0; i < matchArray.length; i++)
        {
 if(matchArray[i]==1) System.out.println("you matched " + i + " numbers "+matchArray[i]+ " time.");
         else System.out.println(" you matched "+i+" numbers "+ matchArray[i] + " times.");
        }
    }
        public static int [] countMatches(int matches, int [] mArray)
    {
            if(matches==0) mArray[0]++;
            if(matches==1) mArray[1]++;
            if(matches==2) mArray[2]++;
            if(matches==3) mArray[3]++;
            if(matches==4) mArray[4]++;
            if(matches==5) mArray[5]++;
            if(matches==6) mArray[6]++;
            if(matches==7) mArray[7]++;
            if(matches==8) mArray[8]++;
            if(matches==9) mArray[9]++;
            if(matches==10)mArray[10]++;
        return mArray;
    }
}
