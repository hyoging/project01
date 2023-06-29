package project;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;



public class boardImpl implements boardService{
   boardDTO dto = new boardDTO();
   
   
      private ArrayList<boardDTO> List;
      String pattern = "yyyy/MM/dd";
      SimpleDateFormat simple = new SimpleDateFormat(pattern);
      
      public boardImpl() {
         List = new ArrayList<>();
}
      private int register(String t, String c, String w) {
         boardDTO dto = new boardDTO();
         dto.setTitle(t); dto.setContents(c); dto.setWriter(w); 
         List.add(dto);
         return 1;
      }


   @Override
   public void display() {
      System.out.println("===작성된 글 목록===");
      System.out.println("제목\t내용\t작성자 \t날짜");
      System.out.println("-----------------------------------");
      for(int i =0; i<List.size(); i++) {
         boardDTO dto1 = List.get(i);
         System.out.println(dto1.getTitle()+"\t"+dto1.getContents()+"\t "+dto1.getWriter()+"\t " + dto.getPostingDate());
         System.out.println("-----------------------------------");
      }     
   }

   @Override
   public void posting() {
       Scanner sc = new Scanner(System.in);
       int result =0;
         while(true) {   
            System.out.println("==== 글 작성 ====");
            System.out.println("[1]게시판 작성 [2]돌아가기 ");
            int choice = sc.nextInt();
            String title = null, contents = null, writer = null;
            switch(choice) {
            case 1: 
               System.out.println("제목: ");
               title=sc.next();
               System.out.println("내용: ");
               contents=sc.next();
               System.out.println("작성자: ");
               writer = sc.next();
               dto.setPostingDate(simple.format(new Date())); 
               result = register(title, contents, writer);
            if(result == 1) {
               System.out.println("등록 완료");
            }
               break;
            case 2: 
               System.out.println("목록으로 ");
               return;
            }
         }
   
         

   }

}