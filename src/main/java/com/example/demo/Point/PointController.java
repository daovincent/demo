package com.example.demo.Point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        System.out.println("############################################################");
        System.out.println(a);
        System.out.println("############################################################");
        return a;
    }
    @PostMapping(params = { "longitude =val1", "latitude=value2" })
    public void test(@RequestParam Long longitude, @RequestParam Long latitude){
        pointService.add(new Point(1L,longitude,latitude));
    }

}
