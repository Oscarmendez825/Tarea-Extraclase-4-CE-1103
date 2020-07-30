package BTS;

import android.text.Editable;

/***
 * Binary search tree class
 * @author Oscar Méndez
 * @author Keyner Gómez
 * @version 0.1
 * @since 2020
 */
public class T4BinaryTree <T extends Comparable<T>>{
    private Nodo<T> root;
    /***
     * This method verifies if the tree is empty
     * @return Boolean
     */
    public String resultado;

    public boolean isEmpty(){
        if (root == null){
            return true;
        }else {
            return false;
        }
    }
    /***
     * Public method of the true 'insert' method.
     * @param data
     */
    public void insert(T data)
    {
        root = insert(root, data);
    }

    /***
     * This recursive method inserts a the data in the tree.
     * @param root Node
     * @param data
     * @return Node
     */
    private Nodo<T> insert(Nodo<T> root, T data)
    {

        if (root == null)
        {
            return new Nodo<>(data);
        }

        else if (data.compareTo(root.getData()) < 0)
        {
            root.setLeft(insert(root.getLeft(), data));
        }
        else if (data.compareTo(root.getData()) > 0)
        {
            root.setRight(insert(root.getRight(), data));
        }
        else
        {

        }

        return root;
    }

    /***
     * Public method of the true 'delete' method.
     * @param data
     */
    public void delete(T data)
    {
        root = delete(root, data);
    }

    /***
     * This recursive method finds and deletes a certain item of the tree
     * @param root Node
     * @param data
     * @return Node
     */
    private Nodo<T> delete(Nodo<T> root, T data)
    {

        if (root == null)
        {
            return null;
        }

        else if (data.compareTo(root.getData()) < 0)
        {
            root.setLeft(delete(root.getLeft(), data));
        }
        else if (data.compareTo(root.getData()) > 0)
        {
            root.setRight(delete(root.getRight(), data));
        }
        else
        {

            if (root.getLeft() == null && root.getRight() == null)
            {
                return null;
            }

            else if (root.getRight() == null)
            {
                return root.getLeft();
            }

            else if (root.getLeft() == null)
            {
                return root.getRight();
            }

            else
            {
                root.setData(findMax(root.getLeft()));
                root.setLeft(delete(root.getLeft(), root.getData()));
            }
        }

        return root;
    }

    /***
     * This method finds the furthest-to-the-right node on the given tree, or subtree in a certain cqse.
     * @param root Node
     * @return data
     */
    private T findMax(Nodo<T> root)
    {
        while (root.getRight() != null)
        {
            root = root.getRight();
        }

        return root.getData();
    }

    /***
     * Principal method of the true 'contains' method.
     * @param data Usuario
     * @return Boolean
     */
    public boolean contains(T data)
    {
        return contains(root, data);
    }

    /***
     * This recursive method verifies if a certain data is in the tree.
     * @param root Node
     * @param data
     * @return Boolean
     */
    private boolean contains(Nodo<T> root, T data)
    {

        if (root == null)
        {
            return false;
        }

        else if (data.compareTo(root.getData()) < 0)
        {
            return contains(root.getLeft(), data);
        }
        else if (data.compareTo(root.getData()) > 0)
        {
            return contains(root.getRight(), data);
        }

        else
        {
            return true;
        }
    }

    /***
     * Principal method of the true 'inorder' method.
     */
    public String inorder()
    {
        resultado = "";
        System.out.print("In-order Traversal:");
        inorder(root);
        System.out.println(resultado);
        return resultado;

    }

    /***
     * This recursive method prints the whole data in an in-order pattern.
     * @param root Node
     */
    private void inorder(Nodo<T> root)
    {
        if (root == null)
            return;

        inorder(root.getLeft());
        resultado = resultado + ("  " + root.getData().toString());
        inorder(root.getRight());
    }

    /***
     * Principal method of the true 'preorder' method.
     */
    public String preorder()
    {
        resultado = "";
        System.out.print("Pre-order Traversal:");
        preorder(root);
        System.out.println();
        System.out.println(resultado);
        return resultado;
    }

    /***
     * This method prints the whole data in an pre-order pattern.
     * @param root Node
     */
    private void preorder(Nodo<T> root)
    {
        if (root == null)
            return;

        resultado = resultado + ("  " + root.getData().toString());
        preorder(root.getLeft());
        preorder(root.getRight());
        return;
    }

    /***
     * Principal method of the true 'postorder' method.
     */
    public String postorder()
    {
        resultado = "";
        System.out.print("Post-order Traversal:");
        postorder(root);
        System.out.println();
        System.out.println(resultado);
        return resultado;
    }

    /***
     * This method prints the whole data in an post-order pattern.
     * @param root Node
     */
    private void postorder(Nodo<T> root)
    {
        if (root == null)
            return;

        postorder(root.getLeft());
        postorder(root.getRight());
        resultado = resultado + ("  " + root.getData().toString());
    }
}
