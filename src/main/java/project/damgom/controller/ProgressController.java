package project.damgom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgressController {
    @GetMapping("/progress")
    public String showProgress(Model model) {
        // 진행률 값 설정
        int progress = 30; // 예시로 50%로 설정

        model.addAttribute("progress", progress);
        return "progress"; // 타임리프 템플릿 이름
    }
}
