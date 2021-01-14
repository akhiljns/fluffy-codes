package reachn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ReachProblem {

    static List<Integer> al = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        TreeSet<Integer> hs = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            hs.add(s.nextInt());
        }

        Iterator<Integer> i = hs.iterator();
        while (i.hasNext()) {
            int a = i.next();
            al.add(a);
            solve(n / a, hs.descendingSet());
            if (al.size() < min) {
                min = al.size();
                temp.clear();
                temp.addAll(al);
            }
            al.clear();
        }

        Collections.sort(temp);
        System.out.println(temp);

        s.close();

    }

    static List<Integer> solve(int n, NavigableSet<Integer> navigableSet) {
        // tree backtracking solution
        Iterator<Integer> i = navigableSet.iterator();
        while (i.hasNext() && n != 1) {
            int a = i.next();
            if (n % a == 0) {
                al.add(a);
                return solve(n / a, navigableSet);
            }
        }
        if (n == 1) {
            al.add(1);
        }

        return al;
    }

}