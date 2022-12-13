package com.example.demo.Point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PointService {
    private final PointRepository pointRepository;
    @Autowired
    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public List<Point> allPoints(){
        return pointRepository.findAll();
    }
}
