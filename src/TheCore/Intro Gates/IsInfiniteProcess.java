package TheCore.Intro

public class IsInfiniteProcess {
    public static void main(String[] args) {
        System.out.println(solution(2, 6));
    }

    private static boolean solution(int a, int b) {
        return !(a<=b && (a+b)%2==0);

      //  return (b>= && (b-a)%2==0);
    }
}
