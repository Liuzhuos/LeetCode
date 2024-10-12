/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 大厂面试;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/10/12
 */
public class MTt7 {
    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    // 高效打印
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    // 并查集的找根数组fa
    static HashMap<Integer, Integer> fa = new HashMap<>();

    // 并查集的找根方法
    static int find(int i) {
        // 如果fa不存在i，则初始化fa[i]
        if (!fa.containsKey(i)) {
            fa.put(i, i);
        }

        // 找根的同时，进行路径压缩
        if (i != fa.get(i)) {
            fa.put(i, find(fa.get(i)));
        }

        return fa.get(i);
    }

    // 并查集的合并方法
    static void union(int x, int y) {
        int x_fa = find(x);
        int y_fa = find(y);

        // x,y的根不同，则可以合并x分量和y分量
        if (x_fa != y_fa) {
            fa.put(y_fa, x_fa);
        }
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        int q = nextInt();

        // m行：建立朋友关系
        // 记录待关联的朋友关系 {u, v}
        HashSet<String> waitUnion = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int u = nextInt();
            int v = nextInt();

            String key = u > v ? u + " " + v : v + " " + u;
            waitUnion.add(key);
        }

        // q行（查询或解除朋友关系）操作
        ArrayList<int[]> opList = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int op = nextInt();
            int u = nextInt();
            int v = nextInt();

            // op为1，表示解除u,v的关联关系
            String key = u > v ? u + " " + v : v + " " + u;
            if (op == 1 && !waitUnion.remove(key)) {
                // 如果存在{u, v}朋友关系，则解除成功
                // 如果不存在{u, v}朋友关系，则此行解除操作无效，可以丢弃，后续反向并查集时，不需要冗余添加
                continue;
            }

            // 记录有效操作：op==2的查询操作，op==1且有效解除操作
            opList.add(new int[]{op, u, v});
        }

        // waitUnion记录的是最终的朋友关系（即，经历了m行建立朋友关系，和q行解除朋友关系后的最终朋友关联关系）
        for (String s : waitUnion) {
            String[] tmp = s.split(" ");
            int u = Integer.parseInt(tmp[0]);
            int v = Integer.parseInt(tmp[1]);

            union(u, v);
        }

        // 反向操作
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = opList.size() - 1; i >= 0; i--) {
            int op = opList.get(i)[0];
            int u = opList.get(i)[1];
            int v = opList.get(i)[2];

            if (op == 1) {
                // 由于此时ufs记录的已经是最终朋友关联关系，因此反向操作时，遇到op==1，原本正向时是解除朋友关系，则反向时是建立朋友关系
                union(u, v);
            } else {
                // op == 2 的查询操作，查询u, v的朋友关系， 注意此时res是反向记录的
                res.add(find(u) == find(v));
            }
        }

        // 最终需要正向打印查询结果，因此res需要倒叙
        for (int i = res.size() - 1; i >= 0; i--) {
            pw.println(res.get(i) ? "Yes" : "No");
        }

        pw.flush();
    }
}
