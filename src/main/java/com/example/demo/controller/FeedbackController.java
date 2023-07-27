package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
@RestController

public class FeedbackController {
    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping("/Addfeed")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackService.addFeedback(feedback);
    }

    @GetMapping("/Getfeed")
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }
}
