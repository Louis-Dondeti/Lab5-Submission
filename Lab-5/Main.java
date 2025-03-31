import java.util.ArrayList; 
class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST lab5tree = new BST(); 
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    lab5tree.insert(13); 
    lab5tree.insert(22); 
    lab5tree.insert(36); 
    lab5tree.insert(5); 
    lab5tree.insert(48); 
    lab5tree.insert(17); 
    lab5tree.insert(39); 
    lab5tree.insert(2); 
    lab5tree.insert(26); 
    lab5tree.insert(40); 
    lab5tree.insert(29); 
    lab5tree.insert(34); 
    lab5tree.insert(10); 
    // Step 3 - Delete the value 17
    lab5tree.delete(17); 
    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.println();
    System.out.println("inorder: ");
    lab5tree.inorder(); 
    // Step 5 - Traverse and output the values using postorder
    System.out.println();
    System.out.println("postorder: ");
    lab5tree.postorder();
    // Step 6 - Traverse and output the values using preorder
    System.out.println();
    System.out.println("preorder: ");
    lab5tree.preorder();
    // Step 7 - Display the result of a search for the value 36
    System.out.println();
    System.out.println(lab5tree.search(36));
    // Step 8 - Display the result of a search for the value 37
    System.out.println();
    System.out.println(lab5tree.search(37));
    // Step 9 - Using the path() method, display the path from the root to 2
    System.out.println();
    ArrayList<BST.TreeNode<Integer>> pathto2 = lab5tree.path(2); 
    if(pathto2.isEmpty()){
      System.out.println("not found");
    }
    else{
      for(BST.TreeNode<Integer> node : pathto2)
      {
          System.out.print(node.element +" ");
      }
    }

    System.out.println();

    

    // Step 10 - Display the path from the root to 34
    ArrayList<BST.TreeNode<Integer>> pathto34 = lab5tree.path(34); 
    if(pathto2.isEmpty()){
      System.out.println("not found");
    }
    else{
      for(BST.TreeNode<Integer> node : pathto34)
      {
          System.out.print(node.element +" ");
      }
    }

  }
}