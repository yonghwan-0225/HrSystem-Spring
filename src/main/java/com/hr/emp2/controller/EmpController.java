package com.hr.emp2.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hr.emp2.dto.EmpList;
import com.hr.emp2.service.EmpService;

@Controller // 컨트롤러임을 명시
@RequestMapping(value = "/") // 주소 패턴
public class EmpController {
	@Inject // 주입(심부름꾼) 명시
	private EmpService service; // Service 호출을 위한 객체생성

	@RequestMapping(value = "/listAll", method = RequestMethod.GET) // 주소 호출 명시 . 호출하려는 주소 와 REST 방식설정 (GET)
	public void listAll(Model model) throws Exception { // 메소드 인자값은 model 인터페이스(jsp전달 심부름꾼)
		model.addAttribute("list", service.listAll()); // jsp에 심부름할 내역(서비스 호출)
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void registerGET(EmpList board, Model model) throws Exception {
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST) // POST방식으로 내용 전송
	public String registPOST(EmpList board, RedirectAttributes rttr) throws Exception { // 인자값으로 REDIRECT 사용
		service.regist(board); // 글작성 서비스 호출
		return "redirect:/listAll"; // 작성이 완료된 후, 목록페이지로 리턴
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void read(@RequestParam("id") int id, Model model) throws Exception {
		// 인자값은 파라미터 값으로 기본키인 글번호를 기준으로 Model을 사용하여 불러옴
		model.addAttribute("EmpList", service.read(id)); // read 서비스 호출
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET) // GET 방식으로 페이지 호출
	public void modifyGET(int id, Model model) throws Exception {
		model.addAttribute("EmpList", service.read(id)); // 수정을 위한 글읽기 서비스 호출
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST) // POST방식으로 데이터 전송
	public String modifyPOST(EmpList board, RedirectAttributes rttr) throws Exception {
		service.modify(board); // 글수정 서비스 호출
		return "redirect:/listAll"; // 수정이 완료된 후, 목록페이지로 리턴
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST) // POST방식으로 데이터 전송
	public String removePOST(@RequestParam("id") int id, RedirectAttributes rttr) throws Exception {
		service.remove(id); // 글삭제 서비스 호출
		return "redirect:/listAll"; // 삭제가 완료된 후, 목록페이지로 리턴
	}

}
