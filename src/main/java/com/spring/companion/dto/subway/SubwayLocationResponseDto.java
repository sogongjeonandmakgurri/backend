package com.spring.companion.dto.subway;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubwayLocationResponseDto {
    private Integer line;

    private String sub_name;

    public SubwayLocationResponseDto(Integer line, String sub_name){
        this.line=line;
        this.sub_name=new String(sub_name);
    }
}
