package tool;

public class Calcu {
//    float num1;
//    float num2;

    public void add(float num1, float num2){
        System.out.println("+");
        float total=num1+ num2;
        System.out.println("answer="+total);
    }
    public void sub(float num1, float num2){
        System.out.println("-");
        float total=num1- num2;
        System.out.println("answer="+total);
    }
    public void mul(float num1, float num2){
        System.out.println("*");
        float total=num1* num2;
        System.out.println("answer="+total);
    }
    public void div(float num1, float num2){
        System.out.println("/");
        float total=(float)num1/num2;
        System.out.println("answer="+total);
    }
    public void pow(float num1, float num2){
        System.out.println("^");
        int n= (int)num2;
        float total=1.0f;
        while(n!=0){
            total=total*num1;
            n=n-1;
        }
        System.out.println("answer="+total);
    }

}
