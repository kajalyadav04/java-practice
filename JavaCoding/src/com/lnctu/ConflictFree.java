package com.lnctu;
import java.util.*;

public class ConflictFree{

    public static int dfs(int node, List<List<Integer>> graph, boolean[] visited, int[] expertise) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        int totalExpertise = 0;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (!visited[current]) {
                visited[current] = true;
                totalExpertise += expertise[current];
                for (int neighbor : graph.get(current)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return totalExpertise;
    }
    public static int maxExpertiseTeam(int n, int c, List<int[]> conflicts, int[] expertise) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] conflict : conflicts) {
            int u = conflict[0] - 1;  // convert to 0-index
            int v = conflict[1] - 1;  // convert to 0-index
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        int maxExpertise = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int expertiseSum = dfs(i, graph, visited, expertise);
                maxExpertise = Math.max(maxExpertise, expertiseSum);
            }
        }

        return maxExpertise;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        List<int[]> conflicts = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            conflicts.add(new int[]{u, v});
        }
        int[] expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = sc.nextInt();
        }
        int result = maxExpertiseTeam(n, c, conflicts, expertise);
        System.out.println(result);

        sc.close();
    }
}

