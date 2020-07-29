package BTS;
/***
 * Node class for the BST tree.
 * @author Oscar Méndez
 * @author Keyner Gómez
 * @version 0.1
 * @since 2020
 */
public class Nodo <T> {
    private T data;
    private Nodo<T> left, right;

    Nodo(T data)
    {
        this.data = data;
    }
    /***
     * This method returns the 'data' variable.
     * @return data
     */
    public T getData() {
        return data;
    }
    /***
     * This method changes the value of the 'data' variable.
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }
    /***
     * This method returns the 'left' node.
     * @return Node
     */
    public Nodo<T> getLeft() {
        return left;
    }
    /***
     * This method changes the value of the 'left' node.
     * @param left Node
     */
    public void setLeft(Nodo<T> left) {
        this.left = left;
    }
    /***
     * This method returns the 'right' node.
     * @return Node
     */
    public Nodo<T> getRight() {
        return right;
    }
    /***
     * This method changes the value of the 'right' node.
     * @param right Node
     */
    public void setRight(Nodo<T> right) {
        this.right = right;
    }
}
