package study121901;

public class String_test {

	public static void main(String[] args) {
		
		String song = "나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
		
		// 1. 원본은 유지하고 모든 바나나를 오렌지로 변경
		// 2. 과일 알러지 있는 원숭이, 어떤 과일에 알러지 있는지 출력 (알러지 문자열 앞의 과일 이름만 추출)
		// 3. song 문자열 앞에 "상상만 해도 웃음이 나요" 합쳐서 하나의 문자열로 출력
		
		String temp = song.replaceAll("바나나", "오렌지");
		System.out.println(temp);
		
		String fruit = song.substring(song.indexOf(" ") + 1, song.indexOf("알러지"));
		System.out.println(fruit);
		
		temp = "상상만 해도 웃음이 나요 ";
		System.out.println(temp.concat(song));
		
		/*
		song = "크리스마스에는 많은 것을 원하지 않아요 # 내가 원하는 건 딱 하나예요 # "
		        + "트리 아래의 선물 같은 것도 신경쓰지 않아요 # 당신을 원해요 #"
		        + "당신이 생각하는 것보다 더 # 내 소원을 이뤄줘요 #"
		        + "내가 크리스마스에 원하는 건 당신이에요";
		        
		        1. # 기준으로 한 중씩 출력 (#은 출력창에 안 나오게)
		        2. 당신이라는 단어 대신 "그대"라고 바꾸기
		        3. 크리스마스를 영어로 변경하여 출력 (대뮨자로)
		        4. 세 번째 # 뒤의 가사가 무엇인지 출력
		*/
		
		
	}
}
