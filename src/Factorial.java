public class Factorial {

    public Integer fac(int number) {
        if(number>1) number *= fac(number - 1);
        return number;
    }
}
