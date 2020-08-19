/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vignesh Balaji
 */
import java.util.*;

public class Swayamvar {
    public static int findGroom(StringBuilder s1, StringBuilder s2){
        int i,k=0,count1=s1.length(),flag=0,count=0;
        while(k<s1.length()){
            flag=0;
            for(i=0;i<s2.length();i++){
                if(s1.charAt(k)==s2.charAt(i)){
                    s2.setCharAt(i,'d');
                    count++;
                    flag=1;
                    break;
                }
                if(i==(s2.length()-1) && flag==0){
                    return count1-count;
                }
            }
            k++;
        }
        return count1-count;
    }
    public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        StringBuilder s1=new StringBuilder(sc.next());
        StringBuilder s2=new StringBuilder(sc.next());
        if(s1.length()!=N || s2.length()!=N){
            System.out.println("Invalid Input Length");
        }else{
            int result=findGroom(s1,s2);
            System.out.println(result);
        }
    }
}
