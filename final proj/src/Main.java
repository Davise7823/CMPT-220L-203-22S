public class Main {
    public static void main(String[] args){
        Tree bst = new Tree();
        Node node = new Node();
        node = bst.add(node, 9);
        node = bst.add(node, 5);
        node = bst.add(node, 12);
        node = bst.add(node, 3);
        node = bst.add(node, 7);
        node = bst.add(node, 15);
        node = bst.add(node, 11);
        node = bst.add(node, 4);
        node = bst.add(node, 8);
        bst.delete(node, 5);
        bst.greatest(node);
        bst.lowest(node);
        bst.preOrder(node);
        bst.inOrder(node);
        bst.postOrder(node);
    }
}
