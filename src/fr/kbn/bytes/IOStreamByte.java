package fr.kbn.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamByte {
	public static void main(String[] args) throws IOException {
		int length = 10;
		String filepath = "./tmp.txt";
		FileOutputStream outputStream = new FileOutputStream(filepath);
		for (int i = 0; i < length; i++) {
			outputStream.write(i);
		}
		FileInputStream inputStream = new FileInputStream(filepath);
		int i;
		int[] inputs = new int[length];
		while((i = inputStream.read()) != -1) {
			inputs[i] = i;
		}
		for (int j : inputs) {
			System.out.println("J : " + j);
		}
	}
}
