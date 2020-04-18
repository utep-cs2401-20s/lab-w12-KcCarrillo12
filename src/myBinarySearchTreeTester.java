import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeTester{

    //tests to see if insert method works
    //passed
    @Test
    public void insert1(){
        int [] testArr = {1, 2, 3, 4};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        sol.insert(5);
        assertEquals(5, sol.size());
    }

    //tests to see if insert method works with multiple values
    //passed
    @Test
    public void insert2(){
        int [] testArr = {1,2,3,4};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        sol.insert(5);
        sol.insert(6);
        assertEquals(6, sol.size());
    }

    //This test is to see if the depth method works
    //passed
    @Test
    void depth1(){
        int[] testArr = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(5, sol.depth(6));
    }

    //this test is to see if the size method works
    //passed
    @Test
    void size1(){
        int[] testArr = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(6, sol.size());
    }

    //this test is to see if the size method works with duplicates
    //passed
    @Test
    void size2(){
        int[] testArr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 7};
        myBinarySearchTreeNode sol = new myBinarySearchTreeNode(testArr);
        assertEquals(7, sol.size());
    }
}
