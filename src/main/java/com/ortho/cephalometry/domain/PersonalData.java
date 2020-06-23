package com.ortho.cephalometry.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonalData {
    private String name;
    private String address;
    private Gender gender;
    private String phone;
    private String doctor;
    private String birthDate;
    private String xRayDate;
    private String remark;
}
