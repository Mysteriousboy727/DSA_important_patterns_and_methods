import java.util.Scanner;

public class dsu {

    static int[] parent;
    static int[] size;

    static int find(int x) {

        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {

        a = find(a);
        b = find(b);

        if (a == b)
            return;

        if (size[a] < size[b]) {

            parent[a] = b;
            size[b] += size[a];

        } else {

            parent[b] = a;
            size[a] += size[b];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n + 1];
        size = new int[n + 1];

        // Initialize DSU
        for (int i = 1; i <= n; i++) {

            parent[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < m; i++) {

            String query = sc.next();

            int u = sc.nextInt();
            int v = sc.nextInt();

            if (query.equals("union")) {

                union(u, v);

            } else {   // get

                if (find(u) == find(v))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

        sc.close();
    }
}