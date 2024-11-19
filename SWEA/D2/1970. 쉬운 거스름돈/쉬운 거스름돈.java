import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int price = Integer.parseInt(br.readLine());
			int o_man = price / 50000;
			int man = price / 10000;
			int o_cheon = price / 5000;
			int cheon = price / 1000;
			int o_back = price / 500;
			int back = price / 100;
			int o_ship = price / 50;
			int ship = price / 10;

			if (o_man <= 0) {
				o_man = 0;
			}

			if (man > 0) {
				if (man % 5 == 0) {
					man = 0;
				} else if (man % 5 > 0) {
					man = man % 5;
				}
			} else {
				man = 0;
			}

			if (o_cheon > 0) {
				if (o_cheon % 2 == 0) {
					o_cheon = 0;
				} else if (o_cheon > 2 && o_cheon % 2 == 1) { // 5천원이 3장 이상(1.5이상)이고, 홀수라면
					o_cheon = o_cheon % 2;
				}
			} else {
				o_cheon = 0;
			}

			if (cheon > 0) {
				if (cheon % 5 == 0) {
					cheon = 0;
				} else if (cheon % 5 > 0) {
					cheon = cheon % 5;
				}
			} else {
				cheon = 0;
			}

			if (o_back > 0) {
				if (o_back % 2 == 0) {
					o_back = 0;
				} else if (o_back > 2 && o_back % 2 == 1) {
					o_back = o_back % 2;
				}
			} else {
				o_back = 0;
			}

			if (back > 0) {
				if (back % 5 == 0) {
					back = 0;
				} else if (back % 5 > 0) {
					back = back % 5;
				}
			} else {
				back = 0;
			}

			if (o_ship > 0) {
				if (o_ship % 2 == 0) {
					o_ship = 0;
				} else if (o_ship > 2 && o_ship % 2 == 1) {
					o_ship = o_ship % 2;
				}
			} else {
				o_ship = 0;
			}

			if (ship > 0) {
				if (ship % 5 == 0) {
					ship = 0;
				} else if (ship % 5 > 0) {
					ship = ship % 5;
				}
			} else {
				ship = 0;
			}
			System.out.println("#" + test_case + " ");
			System.out.println(o_man + " " + man + " " + o_cheon + " " + cheon + " " + o_back
					+ " " + back + " " + o_ship + " " + ship);
		}
	}
}