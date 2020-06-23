package com.ortho.cephalometry.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("xRayDate")
    private String xRayDate;
    private String remarks;
}
