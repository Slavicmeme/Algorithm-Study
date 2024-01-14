package LOLGAYMING;

import java.util.*;
import java.io.*;

public class BOJ_1715_ī�������ϱ� {
	
	static PriorityQueue<Integer> q = new PriorityQueue<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, M, A, num = 0;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			M = Integer.parseInt(br.readLine()); // ī�� �߰�
			q.add(M);
		}
		
		while(q.size()!= 1) // Nosuch ������ ���� ���� 1�� ����
		{
			A = q.poll() + q.poll(); // �� �� �������� ���� ������
			num += A;
			q.add(A);
			
			System.out.println(A);
		}
		

		
		bw.write(num + " ");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
