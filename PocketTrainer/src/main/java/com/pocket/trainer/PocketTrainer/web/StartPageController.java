package com.pocket.trainer.PocketTrainer.web;

import com.pocket.trainer.PocketTrainer.domain.TrainingInfo;
import com.pocket.trainer.PocketTrainer.repository.NewsRepository;
import com.pocket.trainer.PocketTrainer.repository.TrainingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StartPageController {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private TrainingInfoRepository trainingInfoRepository;

    @RequestMapping("/")
    public String startPage(Model model) {

        model.addAttribute("newsEnable", true);
        model.addAttribute("news", newsRepository.findAll());
        model.addAttribute("traininginfo", trainingInfoRepository.findAll());

        return "index";
    }

    @RequestMapping("/newsDisable/{trhead}")
    public String newsDisable(@PathVariable String trhead,
                              Model model) {

        model.addAttribute("newsEnable", false);
        List<TrainingInfo> trInfo = trainingInfoRepository.findAll();

//        for (int i = 0; i < trInfo.size(); i++) {
//            TrainingInfo info = trInfo.get(i);

        for (TrainingInfo info : trInfo) {
            if (info.getTrhead().equalsIgnoreCase(trhead)) {
                model.addAttribute("trbody", info.getTrbody());
            }
        }

        model.addAttribute("traininginfo", trInfo);

        return "index";
    }
}
