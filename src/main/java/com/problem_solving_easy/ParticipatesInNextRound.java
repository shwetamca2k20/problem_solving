package com.problem_solving_easy;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/158/A
public class ParticipatesInNextRound {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            if(scores[i] >= scores[k] && scores[i]>0) {
                count++;
            }
        }
System.out.println(count);
    }
}
//"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.
//
//        A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
//
//        Input
//        The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.
//
//        The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
//
//        Output
//        Output the number of participants who advance to the next round.