package com.tenniscourts.schedules;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface ScheduleMapper {

    Schedule map(ScheduleDTO source);

    ScheduleDTO map(Schedule source);

    @Mapping(target = "tennisCourt.id", source = "tennisCourtId")
    @Mapping(target = "startDateTime", source = "startDateTime")
    Schedule map(CreateScheduleRequestDTO source);

    List<ScheduleDTO> map(List<Schedule> source);
}
