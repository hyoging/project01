package project;

import java.util.ArrayList;

public class boardImpl implements boardService{
	private ArrayList<boardDTO> List;
	public boardImpl() {
		List = new ArrayList<>();
	}

	@Override
	public void display() {
		System.out.println("===작성된 글 목록===");
		System.out.println("제목\t작성자\t글 내용\t날짜");
		System.out.println("------------------------");
		for(int i =0; i<List.size(); i++) {
			boardDTO dto = List.get(i);
			System.out.println(dto.getTitle()+"\t"+dto.getWriter()+"\t"+dto.getContents()+"\t"+dto.getPostingDate());
			System.out.println("-----------------------------------");
		}

	}

	@Override
	public void posting() {
	
			

	}

}
