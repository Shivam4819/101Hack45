/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author shivam
 */
public class LectureNotes {

    public void lecture() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        int friends[] = new int[k];
        for(int friends_i=0; friends_i < k; friends_i++){
            friends[friends_i] = in.nextInt();
        }
        int temp=0,count=0;
         for(int i=0;i<friends.length;i++){
             temp=friends[i];
             Character c = s.charAt(temp-1);
             if(c=='0'){
                 count=1;
                 break;
             }
             else
                 count=0;
         }
         if(count==1)
             System.out.println("YES");
         else
             System.out.println("NO");
    }

}
