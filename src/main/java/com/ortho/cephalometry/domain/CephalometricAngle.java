package com.ortho.cephalometry.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CephalometricAngle {
    private String name;
    private Double angle;
}
