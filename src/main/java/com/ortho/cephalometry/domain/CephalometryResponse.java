package com.ortho.cephalometry.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CephalometryResponse {
    private PersonalData personalData;
    private List<CephalometricAngle> cephalometricAngles;
}
