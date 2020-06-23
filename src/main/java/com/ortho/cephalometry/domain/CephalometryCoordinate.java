package com.ortho.cephalometry.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CephalometryCoordinate {
    private String name;
    private Integer x;
    private Integer y;
}
