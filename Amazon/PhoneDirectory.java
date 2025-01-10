package Amazon;

import java.io.*;
import java.util.*;

public class PhoneDirectory {
    static class TrieNode{
        TrieNode arr[] = new TrieNode[26];
        boolean isEnd;
        ArrayList<String> words;
        TrieNode(){
            words = new ArrayList<>();
        }
    }
    static class Trie{
        TrieNode root;
        Trie(){
            root = new TrieNode();
        }
        
        void insert(String s){
            TrieNode curr = root;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(curr.arr[ch-'a'] == null){
                    curr.arr[ch-'a'] = new TrieNode();
                }
                curr = curr.arr[ch-'a'];
                curr.words.add(s);
            }
            curr.isEnd = true;
        }
        
        ArrayList<String> getWords(String prefix){
            TrieNode curr = root;
            for(int i=0;i<prefix.length();i++){
                char ch = prefix.charAt(i);
                if(curr.arr[ch-'a'] == null) return new ArrayList<>();
                curr = curr.arr[ch-'a'];
            }
            return curr.words;
        }
    }
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        Trie trie = new Trie();
        for(String con : contact){
            trie.insert(con);
        }
        for(int i=1;i<=s.length();i++){
            ArrayList<String>list = trie.getWords(s.substring(0,i));
            Collections.sort(list);
            list = new ArrayList<>(new LinkedHashSet<>(list));
            if(list.isEmpty()){
                list.add("0");
            }
            ans.add(list);
        }
        return ans;
    }
}

