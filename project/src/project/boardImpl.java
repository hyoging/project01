package project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class boardImpl implements boardService{
	   boardDTO dto = new boardDTO();
	   private ArrayList<boardDTO> List;
	   String pattern = "yyyy/MM/dd";
	   SimpleDateFormat simple = new SimpleDateFormat(pattern);
	   
	   public boardImpl() {
		   List = new ArrayList<>();
}

	@Override
	public void display() {
		System.out.println("===작성된 글 목록===");
		System.out.println("제목\t작성자\t글 내용\t날짜");
		System.out.println("-----------------------------------");
		for(int i =0; i<List.size(); i++) {
			boardDTO dto = List.get(i);
			System.out.println(dto.getTitle()+"\t"+dto.getWriter()+"\t"+dto.getContents()+"\t"+dto.getPostingDate());
			System.out.println("-----------------------------------");
		}

	}

	@Override
	  public void posting() {
	      Scanner sc = new Scanner(System.in);
	      
	      while(true) {   
	         System.out.println("==== 글 작성 ====");
	         System.out.println("[1]제목 [2]내용 [3]작성자[4]종료");
	         int choice = sc.nextInt();
	         switch(choice) {
	         case 1: 
	            System.out.println("제목: ");
	            String title=sc.next();
	            dto.setTitle(title); 
	            dto.setPostingDate(simple.format(new Date())); 
	            break;
	            
	         case 2: 
	            System.out.println("내용: ");
	            String contents=sc.next();
	            dto.setContents(contents);
	            break;
	            
	         case 3:
	            System.out.println("작성자: ");
	            String writer = sc.next();
	            dto.setWriter(writer);
	            List.add(dto);
	            
	         case 4: 
	            return;
	         }
	      }

	}

}
