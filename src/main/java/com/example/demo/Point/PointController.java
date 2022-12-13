package com.example.demo.Point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/point")
public class PointController {
    private final PointService pointService;
    @Autowired
    public PointController(PointService pointService) {
        this.pointService = pointService;
    }

    @GetMapping
    public List<Point> test(){
        var a = pointService.allPoints();
        System.out.println(a);
        return a;
    }
}
