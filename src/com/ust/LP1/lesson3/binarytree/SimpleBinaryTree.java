package com.ust.LP1.lesson3.binarytree;
public class SimpleBinaryTree{
public class SimpleBinaryTree<K, V> implements BinaryTree<K, V>{
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
    }
}