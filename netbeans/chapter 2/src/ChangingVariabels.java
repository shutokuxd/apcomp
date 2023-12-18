
public class ChangingVariabels {
    public static void main(String[] args) 
    {
        int num =5;
        double pi = Math.PI;
//       add 1 num
    num = num + 1;
    num++;
    num += 1;
    
//    add 5 to num
num += 5;
num = num +5;

//double a variable's digit's value
num = num * 2;
num *= 2;

//lose the ones digit
num = num / 10; 

//round a double off to the nearest integer
//pi = (int) (pi + .5);

//truncate a double variable to 3 decimal places
pi = ((int)pi *1000)/1000.0; //3.1414926 --> 3141
    
        System.out.println(num);
        System.out.println(pi);
    }
}
