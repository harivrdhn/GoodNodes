import java.io.*;
import java.util.*;

public class Solution {
    
    static int count = 0;
    static HashSet<Integer> set = new HashSet();

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node nodes[] = new Node[N+1];
        for(int i = 1; i <= N; i++){
            nodes[i] = new Node(sc.nextInt());
        }
        for(int i = 1; i <= N; i++){
            if(nodes[i].end == 0){
                if(i==1 || nodes[i].next==1 || nodes[nodes[i].next].end == 1){
                    nodes[i].end = 1;
                }
                else{
                    set.clear();
                    nodes[i].end = findEnd(i,nodes);
                }
            }
        }
        for(int i = 1; i <= N; i++){
            if(nodes[i].end!=1)
                count++;
        }
        System.out.println(count);
    }
    
  public static int findEnd(int i, Node nodes[]){
      set.add(i);
      if(nodes[nodes[i].next].end != 0){
          return nodes[nodes[i].next].end;
      }
      else if(set.contains(nodes[i].next)){
          nodes[i].next = 1;
          count++;
          return 1;
      }
      else
        return findEnd(nodes[i].next,nodes);
  }
}

class Node{
        public int next;
        public int end;
        
        Node(int v){
            next = v;
            end = 0;
        }
    }
