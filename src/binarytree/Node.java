package binarytree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int newValue){
        value = newValue;
    }

    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }

    public void setLeft(int newValue){
        this.left = new Node(newValue);
    }
    public void setRight(int newValue){
        this.right = new Node(newValue);
    }

    public void insert(int newValue){
        if (newValue < value) {
            if (this.getLeft()!=null){
                this.insert(newValue);
            }
            else {
                this.setLeft(newValue);
            }
        }
        if (newValue > value) {
            if (this.getRight()!=null){
                this.getRight().insert(newValue);
            }
            else {
                this.setRight(newValue);
            }
        }
    }

    public boolean findValue(int val) {
        if (value == val) {
            return true;
        }
        else {
            if (val < value) {
                if (this.getLeft()!=null) {
                    this.getLeft().findValue(val);
                }
                else {
                    return false;
                }
            }
            if (val > value) {
                if(this.getRight()!=null) {
                    this.getRight().findValue(val);
                }
                else {
                    return false;
                }
            }
        }
    }
}