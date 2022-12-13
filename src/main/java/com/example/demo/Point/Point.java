package com.example.demo.Point;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@Entity
@Table
public final class Point {
    @Id
    @SequenceGenerator(
            name = "pointSequence",
            sequenceName = "pointSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pointSequence"
    )
    private Long id;
    private Long longitude;
    private Long latitude;

    public Point(Long id, Long longitude, Long latitude) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Point() {
    }


    public Long id() {
        return id;
    }

    public Long longitude() {
        return longitude;
    }

    public Long latitude() {
        return latitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Point) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.longitude, that.longitude) &&
                Objects.equals(this.latitude, that.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, longitude, latitude);
    }

    @Override
    public String toString() {
        return "Point[" +
                "id=" + id + ", " +
                "longitude=" + longitude + ", " +
                "latitude=" + latitude + ']';
    }

}
