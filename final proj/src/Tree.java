public class Tree{
    public Node add(Node two, int val){
        Node one = new Node();
        one.value = val;
        one.left = null;
        one.right = null;

        if(val > one.value){
            two.right = add(two.right, val);
        }else if(val < one.value){
            two.left = add(two.left, val);
        }
        two.parent = one.value;
        return two;
    }

    public void delete(Node node, int val){
        if(node.value == val){
            node.value = Integer.parseInt(null);
        }
    }

    public int lowest (Node node){
        int low = 0;
        if(node.value > low){
            low = node.value;
        }
        return low;
    }

    public int greatest (Node node){
        int great = 0;
        if(node.value > great){
           great = node.value;
        }
        return great;
    }

    public void checkleft(Node node){
        Node current;
        current = node.getleft();
        if(current.getleft() != null){
            current.getleft();
        }else{
            current.getright();
        }
    }

    public void checkright(Node node){
        Node current;
        current = node.getright();
        if(current.getright() != null){
            current.getright();
        }else{
            current.goparent();
        }
    }

    public void preOrder(Node traverse){
        checkleft(traverse);
        checkright(traverse);
        checkright(traverse);
        checkleft(traverse);
    }

    public void inOrder(Node traverse){
        checkleft(traverse);
        checkright(traverse);
        checkleft(traverse);
        checkright(traverse);
    }

    public void postOrder(Node traverse){
        checkleft(traverse);
        checkright(traverse);
    }

}
