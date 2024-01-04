package ArrayList_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test_main {

	public static void main(String[] args) {
		ArrayList<food> list = load();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static ArrayList<food> load() {
		ArrayList<food> list = new ArrayList<food>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/food.txt"))) 
		{
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] tmp = line.split("-");
				food data = new food(tmp[0], Integer.parseInt(tmp[1]), tmp[2]);
				list.add(data);
			}
			
		} catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
			e.printStackTrace();
			
		}
		return list;
	}

}
