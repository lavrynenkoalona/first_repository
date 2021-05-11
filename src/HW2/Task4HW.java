package HW2;

public class Task4HW {
    //Create your own example with increment/decrement,
    // count it manually and then run program and verify your value.
    // Example has to contain more then 5 increment operation,
    // more then 5 decrement operations, *=, +=, -=, and more then 5 resetting of value for each variable.
    public static void main(String[] args) {

        int x = 2;
        int y = 3;     // x=2  y=3
        x = ++x * ++y; //x=(3*4)=12 y=4
        y *= y + x;   // x=12 y= y*(y+x)=4*(4+12)=4*16=64
        x = ++y - x++;//x=65-12=53 x=54  y=64
        y = --y + ++x;//x=55 y=63+55=118
        x += x + 2*y; //x= x+(x + 2*y)=54 + (54+2*118)=344 y=118
        y -= y + 3*x;//y=y-(y+3*x)=118-(118+3*344)=-1032 x=344
        x = 1 + ++x + y--; //x=1+345+(-1032)=-686 y=-1033
        y = (x - y - 1) / 3; //y= (-686 - (-1033) -1)/3=(-686+1033-1)/3=115 x=-686
        x = 4 + --x + y++;//x=(4+ (-687) +115)=-568 y=116
        y = (--x - y - 1) / 5; //y=(-569-116-1)/5=-137 x=-569
        System.out.println("The value of x " + x);
        System.out.println("The value of y " + y);

    }

}
