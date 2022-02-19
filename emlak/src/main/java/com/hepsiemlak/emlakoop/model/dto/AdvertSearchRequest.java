package com.hepsiemlak.emlakoop.model.dto;

import com.hepsiemlak.emlakoop.enums.EstateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvertSearchRequest {
    private EstateType estateType;
    private String province;
    private Integer numberOfRooms;
    private Integer numberOfBathrooms;
}
