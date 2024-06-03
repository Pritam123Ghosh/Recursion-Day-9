// Count total paths in a maze to move from (0,0) to (n,m) n=3, m=3

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(n, m));
    }

    public static int countPaths(int n, int m) {
        if (n == 1 && m == 1) {
            return 1;
        }
        if (n == 0 || m == 0) {
            return 0;
        }
        return countPaths(n - 1, m) + countPaths(n, m - 1);
    }
}