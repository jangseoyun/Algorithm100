package inflearn.algorithm.dfs;

class Node5{
    int data;
    Node5 lt, rt;

    public Node5(int val){
        data = val;
        lt = rt = null;
    }
}

public class Algorithm7N9 {
    Node5 root;
    public int dfs(int L, Node5 root){
        if(root.lt == null && root.rt == null){
            return L;
        }else {
            return Math.min(dfs(L + 1, root.lt), dfs(L + 1, root.rt));
        }
    }
    public static void main(String[] args) {
        Algorithm7N9 tree = new Algorithm7N9();
        tree.root = new Node5(1);
        tree.root.lt = new Node5(2);
        tree.root.rt = new Node5(3);

        tree.root.lt.lt = new Node5(4);
        tree.root.lt.rt = new Node5(5);
        System.out.println(tree.dfs(0, tree.root));
    }
}
