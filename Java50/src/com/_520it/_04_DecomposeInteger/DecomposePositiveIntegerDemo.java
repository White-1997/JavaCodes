package com._520it._04_DecomposeInteger;

public class DecomposePositiveIntegerDemo {
	public static void main(String[] args) {
		int num = 75;
		String res = deInteger(num);
		System.out.println(res);
	}

	private static String deInteger(int num) {
		// TODO Auto-generated method stub
		String res = "";
		int i;
		for ( i = 2; i <= num; i++) {
			if(num == i)
				break;
			else if(num % i == 0){
				num = num / i;
				res = res + "*" + i;
				i = 1;
			}
		}
		res = res + "*" + i;
		res = res.substring(1,res.length());
		return res;
	}

}
