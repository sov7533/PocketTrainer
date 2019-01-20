package com.pocket.trainer.PocketTrainer.web;

import com.pocket.trainer.PocketTrainer.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping("/")
    //@ResponseBody возвращает объект для jsp
    public String startPage(Model model) {

        model.addAttribute("news",newsRepository.findAll());

        return "index";
    }

}
