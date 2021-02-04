import java.util.LinkedList;

public class Combination {
    LinkedList<LinkedList<Integer>> result = new LinkedList<>();
    LinkedList<Integer> item = new LinkedList<>();

    public static void main(String[] args) {
        new Combination().combine(4, 2);
    }
    public LinkedList<LinkedList<Integer>> combine(int n, int k) {
        if (n <= 0 || n < k) return this.result;
        return dfs(n, k, 1);
    }

    private LinkedList<LinkedList<Integer>> dfs(int n, int k, int start) {
        System.out.println("---> stack open at: " + start + ", item size: " + this.item.size());
        if (item.size() == k) {
            this.result.add(new LinkedList<>(item));
            /*
            System.out.println(item);
            System.out.println(this.result);
             */
            return result;
        }

        for (int i = start; i <= n; i++) {
            this.item.add(i);
            System.out.println(this.item);
            dfs(n, k, i + 1);
            this.item.remove(this.item.size() - 1);
            System.out.println("\t\t" + this.item);
        }
        System.out.println("<--- stack closed at: " + start + ", item size: " + this.item.size() + "\nloop end\n");
        return this.result;
    }
}
