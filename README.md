# DSA-using-JAVA

- com
    - ust
        - LP1
            - c2
                - assignments
                    - [WithoutMod.java](#WithoutMod.java)
            - JAVA_M1
                - [BinaryToDecimal.java](#BinaryToDecimal.java)
            - lesson2
                - LinkedList
                    - [DbLinkedList.java](#DbLinkedList.java)
                - [LinkedList.java](#LinkedList.java)
                - [LinkedListNode.java](#LinkedListNode.java)
                - [Queue.java](#Queue.java)
                - [QueueArray.java](#QueueArray.java)
                - [BinarySearch.java](#BinarySearch.java)
                - [BubbleSort.java](#BubbleSort.java)
                - [MergeSort.java](#MergeSort.java)
                - [MergeSortAltO.java](#MergeSortAltO.java)
                - [QuickSort.java](#QuickSort.java)
                - [QuickSortAltO.java](#QuickSortAltO.java)
                - [Stack.java](#Stack.java)
                - [StringReverse.java](#StringReverse.java)
            - lesson3
                - [BinaryTree.java](#BinaryTree.java)
                - [BinaryTreeNode.java](#BinaryTreeNode.java)
                - [SimpleBinaryTree.java](#SimpleBinaryTree.java)
        - LP2
            - c1
                - [MultiplicationHashing.java](#MultiplicationHashing.java)
                - [UniversalHasing.java](#UniversalHasing.java)
                - [Calculatorabstract.java](#Calculatorabstract.java)
                - [College.java](#College.java)
                - [Dog.java](#Dog.java)
                - [car1.java](#car1.java)
                - [car2.java](#car2.java)
                - [car3.java](#car3.java)
                - [EncapsulationExample.java](#EncapsulationExample.java)
                - [Finally.java](#Finally.java)
                - [MultiCatch.java](#MultiCatch.java)
                - [NestedTry.java](#NestedTry.java)
                - [ThrowKay.java](#ThrowKay.java)
                - [ThrowsKey.java](#ThrowsKey.java)
                - [TryCatch.java](#TryCatch.java)
                - [Unchecked.java](#Unchecked.java)
                - [UserDefinedException.java](#UserDefinedException.java)
                - [Hierarchical.java](#Hierarchical.java)
                - [MultiLevel.java](#MultiLevel.java)
                - [Single.java](#Single.java)
                - [InterfaceExample.java](#InterfaceExample.java)
                - [MethodOverloading.java](#MethodOverloading.java)
                - [MethodOverriding.java](#MethodOverriding.java)
        - livesession
            - [Main.java](#Main.java)
            - [lexo.java](#lexo.java)
            - [Palindrome.java](#Palindrome.java)
            - [roughWork.java](#roughWork.java)
            - [stringMethods.java](#stringMethods.java)
            - [tables.java](#tables.java)
            - [teststring.java](#teststring.java)
            - [arraysort.java](#arraysort.java)
            - [frequent.java](#frequent.java)

[//]: # ()
[//]: # (- src)

[//]: # (    - com)

[//]: # (        - ust)

[//]: # (            - LP1)

[//]: # (                - c2)

[//]: # (                    - assignments)

[//]: # (                - JAVA_M1)

[//]: # (                - lesson2)

[//]: # (                    - LinkedList)

[//]: # (                    - queue)

[//]: # (                    - Sorting)

[//]: # (                    - stack)

[//]: # (                - lesson3)

[//]: # (                    - binarytree)

[//]: # (                    - hashtable)

[//]: # (            - LP2)

[//]: # (                - c1)

[//]: # (                    - abstraction)

[//]: # (                    - assignment)

[//]: # (                    - classes)

[//]: # (                    - constructor)

[//]: # (                    - encapsulation)

[//]: # (                    - exceptions)

[//]: # (                    - inheritance)

[//]: # (                    - interfaces)

[//]: # (                    - polymorphism)

[//]: # (    - livesession)

[//]: # (        - array)

[//]: # (───src  )

[//]: # (    ├───com  )

[//]: # (    │   └───ust  )

[//]: # (    │       ├───LP1  )

[//]: # (    │       │   ├───c2  )

[//]: # (    │       │   │   └───assignments  )

[//]: # (    │       │   ├───JAVA_M1  )

[//]: # (    │       │   ├───lesson2  )

[//]: # (    │       │   │   ├───LinkedList  )

[//]: # (    │       │   │   ├───queue  )

[//]: # (    │       │   │   ├───Sorting  )

[//]: # (    │       │   │   └───stack  )

[//]: # (    │       │   └───lesson3  )

[//]: # (    │       │       ├───binarytree  )

[//]: # (    │       │       └───hashtable  )

[//]: # (    │       └───LP2  )

[//]: # (    │           └───c1  )

[//]: # (    │               ├───abstraction  )

[//]: # (    │               ├───assignment  )

[//]: # (    │               ├───classes  )

[//]: # (    │               ├───constructor  )

[//]: # (    │               ├───encapsulation  )

[//]: # (    │               ├───exceptions  )

[//]: # (    │               ├───inheritance  )

[//]: # (    │               ├───interfaces  )

[//]: # (    │               └───polymorphism  )

[//]: # (    └───livesession  )

[//]: # (        └───array  )

# Main.java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```
# WithoutMod.java
```java
package com.ust.LP1.c2.assignments;

public class WithoutMod {
    public static void main(String[] args) {
        int a = 11,b = 4;
        System.out.println(a-(b*(a/b)));
    }
}

```
# BinaryToDecimal.java

```java
package com.ust.LP1.JAVA_M1;

public class BinaryToDecimal {
    public int BtoD(String b) {
        int conv = 1;
        int result = 0;
        for (int i = 1; i <= b.length(); i++) {
            if (b.charAt(b.length() - i) == '1')
                result += conv;
            conv *= 2;
        }
        return result;
    }

    public int BtoDAlt(String b) {
        int res = 0;
        for (int i = 1; i <= b.length(); i++) {
            if (b.charAt(b.length() - i) == '1')
                res += Math.pow(2, i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.BtoD("10110"));
        System.out.println(binaryToDecimal.BtoDAlt$("10110"));
    }
}

```
# DbLinkedList.java
```java
package com.ust.LP1.lesson2.LinkedList;

import java.util.Optional;

public class DbLinkedList<V> {
    private V value;
    private DbLinkedList<V> next;
    private DbLinkedList<V> previous;

    public DbLinkedList(V value,DbLinkedList<V> previous, DbLinkedList<V> next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Optional<DbLinkedList<V>> getNext(){return Optional.ofNullable(next);}
    public Optional<DbLinkedList<V>> getPrevious(){return Optional.ofNullable(previous);}

    public V getValue() {return value;}
    public DbLinkedList<V> setValue(V value) {
        this.value = value;
        return this;
    }

    public DbLinkedList<V> setNext(DbLinkedList<V> next) {
        this.next = next;
        return this;
    }

    public DbLinkedList<V> setPrevious(DbLinkedList<V> previous) {
        this.previous = previous;
        return this;
    }
    @Override
    public String toString() {
        return "LinkedListNode{value="+value+"}";
    }
}

```
# LinkedList.java
```java
package com.ust.LP1.lesson2.LinkedList;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;
    public LinkedList(){head=null;}
    public void addFront(V item){this.head = new LinkedListNode<V>(item,head);}
    public void deleteFront(){
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n -> n.setNext(null));
    }
    public Optional<LinkedListNode<V>> find(V item){
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        while (node.filter(n -> n.getValue() != item).isPresent()){
            node = node.flatMap(LinkedListNode::getNext);
        }
        return node;
    }
    public String toString(){
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        StringBuffer result = new StringBuffer("[");
        while (node.isPresent()){
            node.ifPresent(n -> result.append(n.getValue().toString()));
            node = node.flatMap(LinkedListNode::getNext);
            node.ifPresent(n -> result.append(", "));
        }
        return result.append("]").toString();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFront("viswa");
        list.addFront("axel");
        list.addFront("is");
        list.addFront("a");
        list.addFront("developer");
        System.out.println(list.toString());
        System.out.println(list.find("a").toString());
    }
}

```
# LinkedListNode.java
```java
package com.ust.LP1.lesson2.LinkedList;

import java.util.Optional;

public class LinkedListNode<V> {
    private V value;
    private LinkedListNode<V> next;

    public LinkedListNode(V value, LinkedListNode<V> next){
        this.value = value;
        this.next = next;
    }

    public Optional<LinkedListNode<V>> getNext() {return Optional.ofNullable(next);}
    public V getValue() { return value; }
    public LinkedListNode setValue(V value){
        this.value = value;
        return this;
    }
    public LinkedListNode setNext(LinkedListNode<V> next){
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        return "LinkedListNode{value="+value+"}";
    }
}

```
# Queue.java
```java
package com.ust.LP1.lesson2.queue;

import com.ust.LP1.lesson2.LinkedList.DbLinkedList;

import java.util.Optional;

public class Queue<V> {
    private DbLinkedList<V> head;
    private DbLinkedList<V> tail;
    private Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(V item){
        DbLinkedList<V> node = new DbLinkedList<>(item, tail, null);
        Optional.ofNullable(tail).ifPresent(n -> n.setNext(node));
        tail = node;
        if (head == null) head = node;
    }
    public Optional<V> dequeue(){
        Optional<DbLinkedList<V>> node = Optional.ofNullable(head);
        head = node.flatMap(DbLinkedList::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n -> n.setPrevious(null));
        if (head == null) tail = null;
        return node.map(DbLinkedList::getValue);
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("Viswa");
        q.enqueue("axel");
        q.enqueue("jou");
        q.enqueue("full");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue("axel");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

```
# QueueArray.java
```java
package com.ust.LP1.lesson2.queue;

public class QueueArray {

    public static void main(String[] args) {
        System.out.println("under implementation...");
    }
}

```
# BinarySearch.java
```java
package com.ust.LP1.lesson2.Sorting;

public class BinarySearch {
    public boolean binarySearch(int x, int[] num){
        return binarySearch(x, num,0,num.length);
    }
    public boolean binarySearch(int x, int[] num, int beg,int end){
        if(beg<=end){
            int mid=(end-beg) /2 + beg;
            if (num[mid]==x) return true;
            if (num[mid]>x) return binarySearch(x,num,beg,mid-1);
            return binarySearch(x,num,mid+1,end);
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7,new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(binarySearch.binarySearch(0,new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}

```
# BubbleSort.java
```java
package com.ust.LP1.lesson2.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public void sort(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public void sBubbleSort(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i;j++){ //I
                if(num[j]>num[j+1]){
                    swap(num, j,j+1);
                }
            }
        }
    }
    public void sortImproved(int[] num){
        int i=0;
        boolean swapOccured = true;
        while (swapOccured){
            swapOccured = false;
            i++;
            for (int j=0;j< num.length-i;j++){
                if (num[j] > num[j + 1]) {
                    swap(num, j, j + 1);
                    swapOccured = true;
                }
            }
        }
    }
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num1 = new int[]{2,5,7,2,4,2,8,1,0};
        int[] num2 = new int[]{2,5,7,2,4,2,8,1,0};
        bubbleSort.sort(num);
        bubbleSort.sBubbleSort(num1);
        bubbleSort.sortImproved(num2);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}

```
# MergeSort.java
```java
package com.ust.LP1.lesson2.Sorting;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] num,int beg,int end){
        if(beg<end){
            int m = (end-beg)/2 + beg;
            mergeSort(num,beg,m);
            mergeSort(num,m+1, end);
            merge(num,beg,m,end);
        }
    }
    public void merge(int[] num,int beg,int mid,int end){
        int i=beg;
        int j=mid+1;
        int[] temp = new int[end-beg+1];
        for (int k = 0; k < temp.length; k++){
            if(i <= mid && (j > end || num[i] <= num[j])){
                temp[k] = num[i];
                i++;
            }
            else {
                temp[k] = num[j];
                j++;
            }
        }
        System.arraycopy(temp,0,num,beg,temp.length);
    }
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        mergeSort.mergeSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}

```
# MergeSortAltO.java
```java
package com.ust.LP1.lesson2.Sorting;

import java.util.Arrays;

public class MergeSortAltO {
    public void mergeSort(int[] num,int beg,int end){
        if(beg<end){
            int m = (end-beg)/2 + beg;
            mergeSort(num,beg,m);
            mergeSort(num,m+1, end);
            merge(num,beg,m,end);
        }
    }
    public void merge(int[] num,int beg,int mid,int end){
        int x=0;
        int i=beg;
        int j=mid+1;
        int[] temp = new int[end-beg+1];
        while(i<=mid && j<=end){
            if(num[i] <= num[j]) temp[x++] = num[i++];
            else temp[x++] = num[j++];
        }
        while (i <= mid) {
            temp[x++] = num[i++];
        }
        while (j <= end) {
            temp[x++] = num[j++];
        }
//        for (int l = 0; l < temp.length; l++) {
//            num[beg + l] = temp[l];
//        }
        System.arraycopy(temp,0,num,beg,temp.length);
    }
    public static void main(String[] args) {
        MergeSortAltO mergeSortAltO = new MergeSortAltO();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        mergeSortAltO.mergeSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}

```
# QuickSort.java
```java
package com.ust.LP1.lesson2.Sorting;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] num){sort(num,0,num.length-1);}
    public void sort(int[] num,int beg,int end){
        if(beg<end) {
            int p = partition(num, beg, end);
            sort(num, beg, p - 1);
            sort(num, p + 1, end);
        }
    }
    private int partition(int[] num,int beg,int end){
        int piv = num[end];
        int x = beg - 1;
        for (int i=beg; i < end;i++){
            if (num[i] < piv){
                x++;
                swap(num,x,i);
            }
        }
        swap(num,x+1,end);
        return x+1;
    }
    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        quickSort.sort(num);
        System.out.println(Arrays.toString(num));
    }
}

```
# QuickSortAltO.java
```java
package com.ust.LP1.lesson2.Sorting;

import java.util.Arrays;

public class QuickSortAltO {
    public void QuickSort(int[] num){QuickSort(num,0,num.length-1);}
    public void QuickSort(int[] num,int p, int q){
        if(p<q){
            int j = partition(num,p,q);
            QuickSort(num, p, j-1);
            QuickSort(num, j+1, q);
        }
    }
    public int partition(int[] num,int p,int q){
        int v = num[(p+q) / 2];
        int i = p;
        int j = q;
        while(i <= j){
            while (num[i] < v)
                i++;
            while (num[j] > v)
                j--;
            if(i <= j) {
                swap(num, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        QuickSortAltO quickSortAltO = new QuickSortAltO();
        int[] num = new int[]{2,5,7,2,4,2,8,1,0,9,3,6};
        quickSortAltO.QuickSort(num);
        System.out.println(Arrays.toString(num));
    }
}

```
# Stack.java
```java
package com.ust.LP1.lesson2.stack;
import com.ust.LP1.lesson2.LinkedList.LinkedListNode;
import java.util.Optional;
public class Stack<V> {
    public LinkedListNode<V> head;
    public Stack(){
        head=null;
    }
    public void push(V item){
        //        if(head != null) Optional.ofNullable(head).ifPresent(n -> n.setNext(node));
        head = new LinkedListNode<>(item, head);
    }
    public Optional<V> pop(){
        if (head == null) {
            return Optional.empty();
        }
        LinkedListNode<V> poped = head;
        head = head.getNext().orElse(null);
        return Optional.ofNullable(poped.getValue());
    }
    public Optional<V> peek(){
        return Optional.ofNullable(head).map(LinkedListNode::getValue);
    }

    public boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push("viswa");
        s.push("axel");
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push("7");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

```
# StringReverse.java
```java
package com.ust.LP1.lesson2.stack;

import java.util.Optional;

public class StringReverse {
    public String reverse(String str){
        StringBuffer res = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        Optional<Character> optchar = stack.pop();
        while (optchar.isPresent()){
            res.append(optchar.get());
            optchar = stack.pop();
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(new StringReverse().reverse("This will be reversed"));
    }
}

```
# BinaryTree.java
```java
package com.ust.LP1.lesson3.binarytree;

import java.util.Optional;

public interface BinaryTree<K, V> {
    void put(K key, V value);
    Optional<V> get(K key);
}

```
# BinaryTreeNode.java
```java
package com.ust.LP1.lesson3.binarytree;

import java.util.Optional;

public class BinaryTreeNode<K, V> {
    private BinaryTreeNode<K, V> left;
    private BinaryTreeNode<K, V> right;
    private K key;
    private V value;

    public BinaryTreeNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public Optional<BinaryTreeNode<K, V>> getLeft() {return Optional.ofNullable(left);}
    public Optional<BinaryTreeNode<K, V>> getRight() {return Optional.ofNullable(right);}

    public void setLeft(BinaryTreeNode<K, V> left) {this.left = left;}

    public void setRight(BinaryTreeNode<K, V> right) {this.right = right;}

    public K getKey() {return key;}

    public V getValue() {return value;}

    public void setValue(V value) {this.value = value;}

    public void setKey(K key) {this.key = key;}
}

```
# SimpleBinaryTree.java
```java
package com.ust.LP1.lesson3.binarytree;

public class SimpleBinaryTree{
//public class SimpleBinaryTree<K, V> implements BinaryTree<K, V>{
//    protected BinaryTreeNode<K, V> root;
//    public void put(K key,V value){
//        if(root == null) root = new BinaryTreeNode<>(key,value);
//        else put(key,value,root);
//    }
//    public void put(K key,V value,BinaryTreeNode<K,V> node){
//        if (((Comparable) key).compareTo(node.getKey())==0){
//            node.setKey(key);
//            node.setValue(value);
//        } else if (((Comparable) key).compareTo(node.getKey()) < 0){
//            if (node.getLeft().isPresent())
//                put(key,value,node.getLeft().get());
//            else
//                node.setLeft(new BinaryTreeNode<>(key,value));
//        } else {
//            if (node.getRight().isPresent())
//                put(key,value,node.getRight().get());
//            else
//                node.setRight(new BinaryTreeNode<>(key, value));
//        }
//    }
}

```
# MultiplicationHashing.java
```java
package com.ust.LP1.lesson3.hashtable;

public class MultiplicationHashing {
    private Double k;
    public MultiplicationHashing(Double k){ this.k = k;}
    public int hashKey(Integer key, int tableSize){return (int) (tableSize * (k * key % 1));}

    public static void main(String[] args) {
        MultiplicationHashing multiplicationHashing = new MultiplicationHashing((Math.sqrt(5)-1)/2);
        System.out.println(multiplicationHashing.hashKey(12342342,1000));
        System.out.println(multiplicationHashing.hashKey(23545646,1000));
        System.out.println(multiplicationHashing.hashKey(87934653,1000));
        System.out.println(multiplicationHashing.hashKey(25464566,1000));
    }
}

```
# UniversalHasing.java
```java
package com.ust.LP1.lesson3.hashtable;

public class UniversalHasing {
}

```
# Calculatorabstract.java
```java
package com.ust.LP2.c1.abstraction;
abstract class Calculator{
    abstract void add();
    void mul(){
        System.out.println("1*1 = "+1*1);
    }
}
class MyCal extends Calculator{
    @Override
    void add(){
        System.out.println("1+1 = "+(1+1));
    }
}
public class Calculatorabstract {
    public static void main(String[] args) {
        MyCal myCal = new MyCal();
        myCal.add();
        myCal.mul();
    }
}

```
# College.java
```java
package com.ust.LP2.c1.assignment;

import java.util.Arrays;

class Department {
    private String deptCode;
    private String deptName;
    private String building;
    private String   foundedYear;

    public Department(String deptCode, String deptName, String building, String foundedYear) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.building = building;
        this.foundedYear = foundedYear;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public void setBuilding(String building) {
        this.building = building;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getBuilding() {
        return building;
    }

    public String getFoundedYear() {
        return foundedYear;
    }
}
class TeachingStaff {
    private String ID;
    private String name;
    private String qualification;
    private String dateOfJoining;
    private String deptCode;
    public TeachingStaff(String ID, String name, String qualification, String dateOfJoining, String deptCode) {
        this.ID = ID;
        this.name = name;
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
        this.deptCode = deptCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getQualification() {
        return qualification;
    }

    public String getID() {
        return ID;
    }
}
class StudentDetails{
    protected String studentId;
    protected String name;
    protected String mobileNumber;
    protected String email;
    protected String department;
    protected String[] teacherCode;

    public StudentDetails(String studentId, String name, String mobileNumber, String email, String department, String[] teacherCode) {
        this.studentId = studentId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.department = department;
        this.teacherCode = teacherCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeacherCode(String[] teacherCode) {
        this.teacherCode = teacherCode;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }
    public String[] getTeacherCode() {
        return teacherCode;
    }
    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", teacherCode=" + Arrays.toString(teacherCode) +
                '}';
    }
}
class StudentMarks extends StudentDetails {
    private int semNumber;
    private int[] marks;

    public StudentMarks(String studentId, String name, String mobileNumber, String email, String department, String[] teacherCode, int semNumber, int[] marks) {
        super(studentId, name, mobileNumber, email, department, teacherCode);
        this.semNumber = semNumber;
        this.marks = marks;
    }

    public int getTotal(){
        int total =  0;
        for (int mark: marks) total += mark;
        return total;
    }
    public double getAverage(){
        return (double) getTotal() /marks.length;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", teacherCode=" + Arrays.toString(teacherCode) +'}'+
                "StudentMarks{" +
                "getTotal" + getTotal() +
                ", getAverage" + getAverage() +
                ", semNumber=" + semNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
public class College {
    public static void main(String[] args) {
        Department dep1 = new Department("MCA","Master of Computer Applications","Green Building","1990");
        Department dep2 = new Department("IT","Information Technology","Main Building","1995");

        TeachingStaff Staff1 = new TeachingStaff("T01","Patma","PhD","12/05/1980","MCA");
        TeachingStaff Staff2 = new TeachingStaff("T03","aruna","PhD","19/05/1983","IT");

        StudentDetails student1 = new StudentDetails("S01","Viswa","6345378901","viswa@gmail.com","MCA",new String[]{"T01"});
        StudentDetails student2 = new StudentDetails("S02","Axel","1234567891","axel@gmail.com","IT",new String[]{"T01","T02"});

        StudentMarks[] studentMarks = new StudentMarks[]{
                new StudentMarks("S01","Viswa","6345378901","viswa@gmail.com","MCA",new String[]{"T01"}, 3,new int[]{45,56,89,67}),
                new StudentMarks("S02","Axel","1234567891","axel@gmail.com","IT",new String[]{"T01","T02"}, 3,new int[]{78,56,76,78}),
                new StudentMarks("S03","anu","1245982776","anu1233@gmail.com","MCA",new String[]{"T02"}, 3,new int[]{47,67,72,73}),
                new StudentMarks("S04","banu","9876543210","banu@gmail.com","MCA",new String[]{"T03"}, 3,new int[]{50,56,90,67})
        };
        for (StudentMarks mark: studentMarks) {
            System.out.println(mark.toString());
        }
    }
}

```
# Dog.java
```java
package com.ust.LP2.c1.classes;

public class Dog {
    String name; //instance variable
    String color;
    static int noOtLegs = 4; //static variable
    boolean isBarking(){
        boolean barking = true; //local variable
        return barking;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();  //creating object
        dog.name = "rick";
        dog.color = "black";
        System.out.println("pet: "+ dog.name);
        System.out.println("pet color: "+ dog.color);
    }
}

```
# car1.java
```java
package com.ust.LP2.c1.constructor;
/* *
 * default constructor
 * */
public class car1 {
    String name;

    public static void main(String[] args) {
        car1 car1 = new car1();
        car1.name = "BMW";
        System.out.println("car1: "+car1.name);
    }
}

```
# car2.java
```java
package com.ust.LP2.c1.constructor;
/* *
* constructor with no parameter
* */
public class car2 {
    String name;

    car2(){
        name="BMW";
    }
    public static void main(String[] args) {
        car2 car2 = new car2();
        System.out.println("car2: "+car2.name);
    }
}

```
# car3.java
```java
package com.ust.LP2.c1.constructor;

public class car3 {
    String name;

    car3(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        car3 car3 = new car3("BMW");
        System.out.println("car3: "+car3.name);

        car3 car4 = new car3("Honda");
        System.out.println("car4: "+car3.name);
    }
}

```
# EncapsulationExample.java
```java
package com.ust.LP2.c1.encapsulation;

public class EncapsulationExample {
    public static class Bike{
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setName("BMW");
        System.out.println(bike.getName());
        bike.setName("TVS");
        System.out.println(bike.getName());
    }
}

```
# Finally.java
```java
package com.ust.LP2.c1.exceptions;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally will always executed");
        }
    }
}

```
# MultiCatch.java
```java
package com.ust.LP2.c1.exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 0;
            System.out.println(10/0);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

```
# NestedTry.java
```java
package com.ust.LP2.c1.exceptions;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int[] a = new int[5];
                a[5] = 0;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            try {
                System.out.println(10/0);
            } catch (ArithmeticException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

```
# ThrowKay.java
```java
package com.ust.LP2.c1.exceptions;

public class ThrowKay {
    static void validate(int age) {
        if (age < 18) throw new ArithmeticException("Age is not enough");
        else System.out.println("Welcome to vote");
    }

    public static void main(String[] args) {
        validate(15);
    }
}

```
# ThrowsKey.java
```java
package com.ust.LP2.c1.exceptions;

public class ThrowsKey {
    void m() throws ArithmeticException {
        throw new ArithmeticException("Throws keyword");
    }
    void n() throws ArithmeticException {
        m();
    }
    void o(){
        try {
            m();
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ThrowsKey throwsKey = new ThrowsKey();
        throwsKey.o();
    }
}

```
# TryCatch.java
```java
package com.ust.LP2.c1.exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

```
# Unchecked.java
```java
package com.ust.LP2.c1.exceptions;

public class Unchecked {
    public static void main(String[] args) {
        System.out.println(15/0); //java.lang.ArithmeticException: / by zero
    }
}

```
# UserDefinedException.java
```java
package com.ust.LP2.c1.exceptions;
class AgeBelowException extends Exception{
    /* *
    * to enable serialVersionUID need to make
    * file -> settings -> editor -> inspection -> JVM -> serializable class without serialVersionUID
    * otherwise it only shows the warning
    * */
    private static final long serialVersionUID = 1246524410975209203L;

    AgeBelowException(String s){super(s);}
}
public class UserDefinedException {
    static void validate(int age) throws AgeBelowException {
        if (age < 18) throw new AgeBelowException("Age is not enough");
        else System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (AgeBelowException e) {
            System.out.println(e);
        }
    }
}

```
# Hierarchical.java
```java
package com.ust.LP2.c1.inheritance;

public class Hierarchical {
    public static class Vehicle{
        String name;
        public Vehicle(){name="BMW";}
        public void Sound(){
            System.out.println("peem peem");
        }
    }
    public static class Bike extends Vehicle {
        public Bike(String name){
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("pim pim");
        }
    }
    public static class Cycle extends Vehicle {
        public Cycle(String name) {
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("tring tring");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike("Honda");
        Cycle cycle = new Cycle("FF");

        System.out.println("bike:"+bike.name);
        System.out.println("cycle:"+cycle.name);

        vehicle.Sound();
        bike.Sound();
        cycle.Sound();
    }
}

```
# MultiLevel.java
```java
package com.ust.LP2.c1.inheritance;

public class MultiLevel {
    public static class Vehicle{
        String name;
        public Vehicle(){name="BMW";}
        public void Sound(){
            System.out.println("peem peem");
        }
    }
    public static class Bike extends Vehicle{
        public Bike(String name){
            this.name = name;
        }
        @Override
        public void Sound(){
            System.out.println("pim pim");
        }
    }
    public static class Cycle extends Bike{
        public Cycle(String name) {
            super(name);
        }
        @Override
        public void Sound(){
            System.out.println("tring tring");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike("Honda");
        Cycle cycle = new Cycle("FF");
        System.out.println("bike:"+bike.name);
        vehicle.Sound();
        bike.Sound();
        cycle.Sound();
    }
}

```
# Single.java
```java
package com.ust.LP2.c1.inheritance;

public class Single {
    public static class Animal{
        protected String color;
        public Animal(String color){
            this.color = color;
        }
        public void makeSound(){
            System.out.println("******");
        }
    }
    public static class Cat extends Animal{
        String name;
        public Cat(String name,String color){
            super(color);
            this.name = name;
        }
        @Override
        public void makeSound(){
            System.out.println("meow.....");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("red");
        Cat cat = new Cat("atiya","white");
        System.out.println("Anumal color:"+animal.color);
        System.out.println("cat name:"+cat.name);
        System.out.println("cat color:"+cat.color);
    }
}

```
# InterfaceExample.java
```java
package com.ust.LP2.c1.interfaces;
interface Animal{
    void sound();
}
public class InterfaceExample implements Animal {
    public void sound(){
        System.out.println("Interface method implemented");
    }
    public static void main(String[] args) {
        Animal cat = new InterfaceExample();
        cat.sound();
    }
}

```
# MethodOverloading.java
```java
package com.ust.LP2.c1.polymorphism;

public class MethodOverloading {
    public static class Calculator{
        int addNum(int a, int b){
            return a+b;
        }
        int addNum(int a, int b, int c){
            return a+b+c;
        }

        int mulNum(int a, int b){
            return a*b;
        }
        double mulNum(double a, double b){
            return a*b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNum(1,1));
        System.out.println(calculator.addNum(1,1,1));
        System.out.println(calculator.mulNum(5,5));
        System.out.println(calculator.mulNum(2.2,5.5));
    }
}

```
# MethodOverriding.java
```java
package com.ust.LP2.c1.polymorphism;

public class MethodOverriding {
    public static class Vehicle{
        String color;
        protected Vehicle(String color){this.color = color;}
        void run(){
            System.out.println("Running...!");
        }
    }
    public static class Bike extends Vehicle{
        private String name;
        public Bike(String name, String color){
            super(color);
            this.name = name;
            //this.color = color;
        }
        @Override
        void run(){
            System.out.println("my "+this.name+" is Running...!");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("red");
        Bike bike = new Bike("BMW","Black");
        System.out.println("vehicle color:"+vehicle.color);
        System.out.println("bike name:"+bike.name);
        vehicle.run();
        System.out.println("bike color:"+bike.color);
        bike.run();
    }
}

```
# lexo.java
```java
package livesession;

public class lexo {
    public static void main(String[] args) {
        int[] alp = new int[26];
        String str1 = "listen";
        String str2 = "silent";
        for(int i=0;i<str1.length();i++){
            alp[(int) str1.charAt(i)-96-1]++;
        }
        for(int i=0;i<str2.length();i++){
            alp[(int) str2.charAt(i)-96-1]--;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            if(alp[i] > 0) sum+=alp[i];
        }
        if(sum==0) System.out.println("yes");
        else System.out.println("not");
    }
}

```
# Palindrome.java
```java
package livesession;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String inp = sc.nextLine();
        String rev = "";
        for(char c: inp.toCharArray()){
            rev = c + rev;
        }
        if(inp.equals(rev)) System.out.println("the given string is palindrome");
        else System.out.println("the given string is not a palindrome");
        //alt one
        char arr[] = inp.toCharArray();
        int size = arr.length;
        boolean f=true;
        for(int i = 0; i<size/2;i++){
            if(arr[i]!=arr[size-1-i]){
                f=false;
                break;
            }
        }
        if(f) System.out.println("the given string is palindrome");
        else System.out.println("the given string is not a palindrome");
    }
}

```
# roughWork.java
```java
package livesession;

import java.util.Scanner;

public class roughWork {
//    Scanner sc = new Scanner(System.in);
//    public class a{
//        int b=0;
//    }
//    public static void main(String[] args) {
//        System.out.println("1"+ new Integer(3))+2-1);
//        System.out.println(Integer.valueOf(3)+2+"1");
//    }
}

```
# stringMethods.java
```java
package livesession;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "viswa";
        String lastName = new String(new char[]{'a','x','e','l'});
        System.out.println(name+lastName);
        System.out.println(name.contains("v"));
        System.out.println(name.replace("a","eshvar"));
        System.out.println(name.substring(3,5));
        System.out.println(name.concat(lastName));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(0));
        for(char c: name.toCharArray()) System.out.print(c+" ");
        System.out.print("Enter a string to compare:");
        String inp = sc.nextLine();
        String val = "abc";
        String cap = "ABC";
        System.out.println(val.equals(inp));
        System.out.println(cap.equalsIgnoreCase(inp));
        System.out.println(val.compareTo(inp));
        System.out.println(cap.compareToIgnoreCase(inp));
        String sen = sc.nextLine();
        String[] word = sen.split(" ");
        for(String s: word) System.out.print(s+" ");
        System.out.println(": count : "+word.length+" : sen length : "+sen.length());
    }
}

```
# tables.java
```java
package livesession;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a table number: ");
        t =sc.nextInt();
        for(int i = 1;i <=10;i++) System.out.println(t+" x "+i+" = "+(t*i));
    }
}
/*
  Enter a table number: 10
  10 x 1 = 10
  10 x 2 = 20
  10 x 3 = 30
  10 x 4 = 40
  10 x 5 = 50
  10 x 6 = 60
  10 x 7 = 70
  10 x 8 = 80
  10 x 9 = 90
  10 x 10 = 100
  */
```
# teststring.java
```java
package livesession;

public class teststring {
    public static void main(String[] args) {

    }
}

```
# arraysort.java
```java
package livesession.array;
/* *
* key finding by pair
* */
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        int [] marks = {81,24,56,30,90,18};
        Arrays.sort(marks);
        int k =114;
        int i=0,j=marks.length-1;
        boolean f = false;
        while (i<j){
            if(marks[i]+marks[j] == k){
                f = true;
                break;
            } else if (marks[i]+marks[j] < k) i++;
            else j--;
        }
        if(f) System.out.println("found"+marks[i]+" "+marks[j]);
        else System.out.println("not");
    }
}

```
# frequent.java
```java
package livesession.array;

public class frequent {
    public static void main(String[] args) {
//        int [] marks = {1,2,3,44,5,5,6,7,7,8,88,8,8};
        int [] marks = {2,4,5,7,8,5,1};
        int n = marks.length-1;
        int max = marks[0];
        int maxc = 0;
        for (int i = 0; i<=n;i++){
            int c = 0;
            for (int j = 0;j<=n;j++){
                if(i != j && marks[i] == marks[j]) c++;
            }
            if(c > maxc) {
                max = marks[i];
                maxc = c;
            }
        }
        if(maxc != 0) System.out.println(max+": frequency:"+(maxc+1));
        /**
         *
         *
         *
         *
         * */
        int givenarry[]={3,4,5,6,4,4,6};
        /*int*/ max = 0;
        int mostFreq = givenarry[0];
        int[] count = new int[givenarry.length + 1];

        for (int num : givenarry) {
            count[num]++;
            if (count[num] > max)
            {
                max = count[num];
                mostFreq = num;
            }
        }

        System.out.println(mostFreq);
    }
}

```
