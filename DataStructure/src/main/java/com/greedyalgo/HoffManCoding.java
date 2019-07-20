package com.greedyalgo;

import lombok.Data;

import java.util.*;

public class HoffManCoding {
    static String s="In the code below, 1.4 was configured in the pom using maven-compiler-plugin None of the IntelliJ settings did anything for me. This answer is the only thing that fixed it after hours of searching. Thanks";
    public static  Map<Character,Integer> occurrance=new HashMap<Character,Integer>();
    public static Node root;
    public static void main(String[] args){
        char[] cArray=s.toCharArray();
        for(int i=0;i<cArray.length;i++){
            if(occurrance.containsKey(cArray[i])){
                occurrance.put(cArray[i],occurrance.get(cArray[i])+1);
            }else{
                occurrance.put(cArray[i],1);
            }
        }
        List<Map.Entry<Character,Integer>> set=new ArrayList<Map.Entry<Character, Integer>>(occurrance.entrySet());
        Collections.sort(set, new MapComparator());
        int[] freq=new int[set.size()];
        set.forEach(s->System.out.println(s.getKey()+"::"+s.getValue()));
        for(int i=0;i<set.size();i++){
            freq[i]=set.get(i).getValue();
        }


        for(int i=0;i<freq.length;i++){
            if(freq[i]+freq[i+1]>root.getData()){
                Node ns1=new Node(freq[i]);
                Node ns2=new Node(freq[i+1]);
                Node hub=new Node(freq[i]+freq[i+1]);
                if(root==null){
                    root=hub;
                }else{
                    Node newRoot=new Node(hub.getData()+root.getData());
                    if(hub.getData()>root.getData()){
                        newRoot.setLeft(root);
                        newRoot.setRight(hub);
                    }else{
                        newRoot.setRight(root);
                        newRoot.setLeft(hub);
                    }
                }
            }

        }
    }
}

class MapComparator implements Comparator<Map.Entry<Character,Integer>> {

    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return o1.getValue()-o2.getValue();
    }
}
@Data
class Node{
    Node(){

    }
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    private int data;
    private Node left;
    private Node right;
    private char ch;
}
