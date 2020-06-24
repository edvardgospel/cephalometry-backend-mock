package com.ortho.cephalometry.service;

import com.ortho.cephalometry.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CephalometryService {

    static CephalometricAngle sna = CephalometricAngle.builder().name("SNA").angle(81.4).build();
    static CephalometricAngle snb = CephalometricAngle.builder().name("SNB").angle(81.9).build();
    static CephalometricAngle anb = CephalometricAngle.builder().name("ANB").angle(-0.4).build();
    static CephalometricAngle snPg = CephalometricAngle.builder().name("SNPg").angle(84.2).build();
    static CephalometricAngle snGn = CephalometricAngle.builder().name("SNGn").angle(80.1).build();
    static CephalometricAngle nsBa = CephalometricAngle.builder().name("NSBa").angle(124.0).build();
    static CephalometricAngle build = CephalometricAngle.builder().name("Gn-Tg-Ar").angle(133.5).build();
    static CephalometricAngle n = CephalometricAngle.builder().name("N").angle(46.1).build();
    static CephalometricAngle h = CephalometricAngle.builder().name("H").angle(7.7).build();
    static CephalometricAngle na = CephalometricAngle.builder().name("Na").angle(103.6).build();
    static CephalometricAngle build1 = CephalometricAngle.builder().name("ML-NSL").angle(34.6).build();
    static CephalometricAngle build2 = CephalometricAngle.builder().name("NL-NSL").angle(5.7).build();
    static CephalometricAngle build3 = CephalometricAngle.builder().name("ML-NL").angle(28.8).build();
    static CephalometricAngle build4 = CephalometricAngle.builder().name("N-Sp' mm").angle(39.7).build();
    static CephalometricAngle build5 = CephalometricAngle.builder().name("Sp'-Gn mm").angle(53.2).build();
    static CephalometricAngle build6 = CephalometricAngle.builder().name("I%").angle(74.7).build();
    static CephalometricAngle build7 = CephalometricAngle.builder().name("1-T").angle(120.8).build();
    static CephalometricAngle build8 = CephalometricAngle.builder().name("1-NA").angle(36.5).build();
    static CephalometricAngle build9 = CephalometricAngle.builder().name("T-NB").angle(23.0).build();
    static CephalometricAngle build10 = CephalometricAngle.builder().name("1-NA mm").angle(6.5).build();
    static CephalometricAngle build11 = CephalometricAngle.builder().name("T-NB mm").angle(2.7).build();
    static CephalometricAngle build12 = CephalometricAngle.builder().name("Pg-NB mm").angle(3.3).build();
    static List<CephalometricAngle> cephalometricAngles = Arrays.asList(sna, snb, anb, snPg, snGn, nsBa, build, n, h, na,
            build1, build2, build3, build4, build5, build6, build7, build8, build9, build10, build11, build12);

    public CephalometriesResponse getCephalometries() {
        return CephalometriesResponse.builder()
                .cephalometries(
                        Arrays.asList(
                                CephalometryResponse.builder()
                                        .personalData(PersonalData.builder()
                                                .name("Eros Edvard")
                                                .address("Satu Mare, Marsilia 20")
                                                .gender(Gender.MALE)
                                                .phone("+36 30 162 1442")
                                                .doctor("Dr. Csibi Reka")
                                                .birthDate("1995-02-12")
                                                .xRayDate("2020-06-19")
                                                .remarks("Missing, rotations, etc")
                                                .build())
                                        .cephalometricAngles(cephalometricAngles).build(),
                                CephalometryResponse.builder()
                                        .personalData(PersonalData.builder()
                                                .name("Kiss Janos")
                                                .address("Budapest, Nagy Diofa 26-28")
                                                .gender(Gender.MALE)
                                                .phone("+36 30 111 2222")
                                                .doctor("Dr. Csibi Reka")
                                                .birthDate("1990-02-12")
                                                .xRayDate("2020-06-19")
                                                .remarks("Rotations")
                                                .build())
                                        .cephalometricAngles(cephalometricAngles).build(),
                                CephalometryResponse.builder()
                                        .personalData(PersonalData.builder()
                                                .name("Nagy Gizi")
                                                .address("Kolozsvar")
                                                .gender(Gender.FEMALE)
                                                .phone("0744 600 500")
                                                .doctor("Dr. Csibi Reka")
                                                .birthDate("1992-02-12")
                                                .xRayDate("2020-06-19")
                                                .build())
                                        .cephalometricAngles(cephalometricAngles).build()
                        )
                ).build();
    }

    public CephalometryResponse postCephalometries(CephalometryRequest cephalometryRequest) {
        return CephalometryResponse.builder()
                .personalData(PersonalData.builder()
                        .name(cephalometryRequest.getPersonalData().getName())
                        .address(cephalometryRequest.getPersonalData().getAddress())
                        .gender(cephalometryRequest.getPersonalData().getGender())
                        .phone(cephalometryRequest.getPersonalData().getPhone())
                        .doctor(cephalometryRequest.getPersonalData().getDoctor())
                        .birthDate(cephalometryRequest.getPersonalData().getBirthDate())
                        .xRayDate(cephalometryRequest.getPersonalData().getXRayDate())
                        .remarks(cephalometryRequest.getPersonalData().getRemarks())
                        .build())
                .cephalometricAngles(cephalometricAngles)
                .build();
    }
}
