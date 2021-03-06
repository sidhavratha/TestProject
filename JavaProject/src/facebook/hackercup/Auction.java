package facebook.hackercup;

public class Auction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println((int )(Math.random()*3));

	}

}















/*
You have encountered a new fancy online auction that offers lots of products. You are only interested in their price and weight. 
We shall say that product A is strictly preferred over product B
if A costs less than B and is not heavier (they may be of equal weight) or if A weighs less and is not more expensive 
(they can have equal price).

We shall call a product A a bargain if there is no product B such that B is better than A. Similarly, 
we shall call a product C a terrible deal if there exists no product D such that C is better than D. 
Note that according to our definitions, the same product may be both a bargain and a terrible deal! 
Only wacky auctioneers sell such products though.

One day you wonder how many terrible deals and bargains are offered. The number of products, N, 
is too large for your human-sized brain though. Fortunately, you discovered that the auction manager 
is terribly lazy and decided to sell the products based on a very simple pseudo-random number generator.

If product i has price Pi and weight Wi, then the following holds for product i+1:

    Pi = ((A*Pi-1 + B) mod M) + 1 (for all i = 2..N)
    Wi = ((C*Wi-1 + D) mod K) + 1 (for all i = 2..N) 

You carefully calculated the parameters for the generator (P1, W1, M, K, A, B, C and D). 
Now you want to calculate the number of terrible deals and bargains on the site.
Input

The first line of the input file contains a single integer T: the number of test cases. 
T lines follow, each representing a single test case with 9 space-separated integers: 
N, P1, W1, M, K, A, B, C and D.
Output

Output T lines, one for each test case. For each case, output "Case #t: a b", 
where t is the test case number (starting from 1), a is the number of 
terrible deals and b is the number of bargains.

Constraints

    1 ≤ T ≤ 20
    1 ≤ N ≤ 1018
    1 ≤ M, K ≤ 107
    1 ≤ P1 ≤ M
    1 ≤ W_1 ≤ K
    0 ≤ A,B,C,D ≤ 109 

Example input

5
5 1 4 5 7 1 0 1 2
3 1 3 3 3 1 0 1 1
8 1 3 3 3 1 0 1 2
13 5 7 5 9 1 3 2 5
11 2 3 5 7 11 13 17 19

Example output

Case #1: 3 3
Case #2: 3 3
Case #3: 2 3
Case #4: 2 2
Case #5: 3 1

 */