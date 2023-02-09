package com.spring.companion.controller.subway;

import com.spring.companion.dto.subway.SubwayLocationRequestDto;
import com.spring.companion.dto.subway.SubwayLocationResponseDto;
import com.spring.companion.service.subway.SubwayLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SubwayLocationController {

    private final SubwayLocationService subwayLocationService;
    //
//    @GetMapping("/subway/loc")
//    public List<SubwayLocationResponseDto> currentSubwayLocation(@RequestBody SubwayLocationRequestDto subwayLocationRequestDto){
//        return subwayLocationService.getSubwayStationList(subwayLocationRequestDto);
//    }
//    @PostMapping("/subway/loc")
//    public SubwayLocationResponseDto currentSubwayLocation(@RequestBody SubwayLocationRequestDto subwayLocationRequestDto){
//        return subwayLocationService.getSubwayStationList(subwayLocationRequestDto);
//    }

    @PostMapping("/subway/loc")
    public List<SubwayLocationResponseDto> currentSubwayLocation(@RequestBody SubwayLocationRequestDto subwayLocationRequestDto){
        return subwayLocationService.getSubwayStationList(subwayLocationRequestDto);
    }

}