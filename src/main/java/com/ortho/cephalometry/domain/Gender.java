package com.ortho.cephalometry.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Gender {
    @JsonProperty("male")
    MALE("male"),

    @JsonProperty("female")
    FEMALE("female");

    public final String label;

}
