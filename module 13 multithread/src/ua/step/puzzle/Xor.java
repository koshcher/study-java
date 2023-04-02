package ua.step.puzzle;

public class Xor
{
    public static void main(String[] args)
    {
        int i = 0xFFFF;

        i <<= 0x0FFFFF ;
        i >>>= 0x0FFFFF;
        System.out.println(i);
    }
}
