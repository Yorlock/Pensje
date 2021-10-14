import java.util.*;
import java.io.*;

class Heap implements Comparable<Heap>{

    private int id;
    private int value;

    public Heap(int id, int value){
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public Integer getValue() { return value; }

    @Override
    public int compareTo(Heap o) {
        return this.getValue().compareTo(o.getValue());
    }

}

public class main {
    public static int n;
    public static ArrayList<Integer>[] subTree;
    public static int[] keys;

    public static int getHeightOneNodedHeap(int t){
        int level = 1;
        int start = t;
        while(true){
            if(subTree[t].size() > 1) return getHeight(start);
            if(subTree[t].size() == 0) return level;
            level++;
            t = subTree[t].get(0);
        }
    }

    public static int getHeight(int t){
        int level = 1;
        for(int i : subTree[t]){
            level += getHeight(i);
        }
        return level;
    }

    public static void DFS(int value, ArrayList<Integer> list){
        while(true){
            keys[value] = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            if(subTree[value].size() == 1){
                value = subTree[value].get(0);
            }else break;
        }
    }

    public static String main(String[] arg) throws FileNotFoundException {
        File file = new File(arg[0]);
        Scanner in = new Scanner(file);
        n = in.nextInt();
        keys = new int[n];
        boolean[] known = new boolean[n];
        boolean[] defined = new boolean[n];
        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        Queue<Integer> kQueue = new PriorityQueue<Integer>();
        ArrayList<Integer> father = new ArrayList<Integer>();
        subTree = new ArrayList[n];
        for(int i = 0; i < n; i++){
            subTree[i] = new ArrayList<Integer>();
        }
        ArrayList<Heap> heap = new ArrayList<Heap>();
        for(int i = 0; i < n; i++){
            father.add(in.nextInt() - 1);
            keys[i] = in.nextInt() - 1;
        }
        for(int i = 0; i < n; i++){
            int p = father.get(i);
            if(p == i) keys[p] = n - 1;
            if (keys[i] != -1) continue;
            if(keys[p] != -1)
                heap.add(new Heap(i, keys[p]));
            else subTree[p].add(i);
        }
        Collections.sort(heap);
        for(int i = 0; i < n; i++){
            if(keys[i] != -1) known[keys[i]] = true;
        }
        for(int i = 0; i < n; i++){
            if(!known[i]){
                kQueue.add(i);
                pQueue.add(i);
            }
        }
        for(Heap h : heap){
            int level = getHeightOneNodedHeap(h.getId());
            ArrayList<Integer> m = new ArrayList<Integer>();
            while(!kQueue.isEmpty() && kQueue.peek() < h.getValue() && m.size() < level){
                m.add(kQueue.peek());
                kQueue.poll();
            }
            boolean exist = false;
            if(kQueue.isEmpty() || kQueue.peek() > h.getValue()) DFS(h.getId(), m);
            else exist = true;
            while(!pQueue.isEmpty() && pQueue.peek() < h.getValue()){
                if(exist)
                    defined[pQueue.peek()] = true;
                pQueue.poll();
            }
        }
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++){
            //System.out.printf("%d\n", (keys[i] != -1 && !defined[keys[i]]) ? keys[i] + 1 : 0);
            answer.append((keys[i] != -1 && !defined[keys[i]]) ? keys[i] + 1 : 0).append(" ");
        }
        return answer.toString();
    }

}
