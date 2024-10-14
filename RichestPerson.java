/*
  Problem Statement:
  You are given an m * n integer grid accounts where accounts[i][j] is
  the amount of money the ith customer has in the jth bank.
  Return the wealth that the richest customer has.

  A customer's wealth is the amount of money they have in all their bank
  accounts. The richest customer is the customer that has the maximum wealth.

  Input: accounts = [[1,2,3], [3,2,1]]
  Output: 6
 */

 public class RichestPerson{
    public static int maximumWealth(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        for(int person : accounts){
            int total_wealth = 0;
            for(int account : person){
                total_wealth += account; 
            }
            if(sum > answer){
                answer = sum;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        
    }
 }