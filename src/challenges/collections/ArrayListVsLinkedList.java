package challenges.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList vs LinkedList - Understanding Different List Implementations
 * Both implement List interface but have different internal structures
 * and performance characteristics
 */
public class ArrayListVsLinkedList {

    // Test 1: Creating and adding elements
    public static void testCreationAndAddition() {
        System.out.println("=== Test 1: Creation and Addition ===");
        
        // Create ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        
        // Create LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);
        System.out.println();
    }

    // Test 2: Accessing elements by index
    public static void testIndexAccess() {
        System.out.println("=== Test 2: Index Access ===");
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        
        // Access by index
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));
        System.out.println();
    }

    // Test 3: Removing elements from middle
    public static void testRemoval() {
        System.out.println("=== Test 3: Removal from Middle ===");
        
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        for (String fruit : fruits) {
            arrayList.add(fruit);
            linkedList.add(fruit);
        }
        
        System.out.println("Before removal:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        
        // Remove from index 2
        arrayList.remove(2);
        linkedList.remove(2);
        
        System.out.println("After removing index 2:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();
    }

    // Test 4: Inserting in the middle
    public static void testInsertion() {
        System.out.println("=== Test 4: Insertion in Middle ===");
        
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("D");
        
        System.out.println("Before insertion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        
        // Insert at index 2
        arrayList.add(2, "C");
        linkedList.add(2, "C");
        
        System.out.println("After inserting 'C' at index 2:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();
    }

    // Test 5: Iterating through the list
    public static void testIteration() {
        System.out.println("=== Test 5: Iteration ===");
        
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 3; i++) {
            arrayList.add("Item" + i);
            linkedList.add("Item" + i);
        }
        
        System.out.println("ArrayList iteration:");
        for (String item : arrayList) {
            System.out.println("  " + item);
        }
        
        System.out.println("LinkedList iteration:");
        for (String item : linkedList) {
            System.out.println("  " + item);
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("===== ArrayList vs LinkedList Comparison =====");
        System.out.println();
        
        testCreationAndAddition();
        testIndexAccess();
        testRemoval();
        testInsertion();
        testIteration();
        
        System.out.println("=== Summary ===");
        System.out.println("ArrayList: Efficient for random access, slower for insertions/deletions");
        System.out.println("LinkedList: Efficient for insertions/deletions, slower for random access");
    }
}
