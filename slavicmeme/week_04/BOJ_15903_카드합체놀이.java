package LOLGAYMING;

import java.io.*;
import java.util.*;

public class BOJ_15903_ī����ü���� {
	
	static PriorityQueue<Long> q = new PriorityQueue<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, M ;
	static Long temp, num = 0L;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++)
			q.add(Long.parseLong(st.nextToken()));
		
		for(int k = 0; k < M; k ++)
		{
			temp = q.poll();
			temp += q.poll(); // 1�� x�� ī��� y�� ī�带 ��� �� �� �忡 ������ ���� ���� ���� ����Ѵ�. (x �� y)
			q.add(temp);
			q.add(temp);// 2�� ����� ���� x�� ī��� y�� ī�� �� �� ��ο� ���� ����.
		}
		
		
		while(!q.isEmpty())
			num += q.poll();
		
		bw.write(Long.toString(num));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
