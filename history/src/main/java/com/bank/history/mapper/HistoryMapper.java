package com.bank.history.mapper;

import com.bank.history.dto.HistoryDto;
import com.bank.history.entity.HistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Маппер {@link HistoryEntity} в {@link HistoryDto}.
 */
@Mapper(componentModel = "spring")
public interface HistoryMapper {

    /**
     * @param history принимаем {@link HistoryDto}.
     * @return {@link HistoryEntity}.
     */
    @Mapping(target = "id", ignore = true)
    HistoryEntity toEntity(HistoryDto history);

    /**
     * @param history принимаем {@link HistoryEntity}.
     * @return {@link HistoryDto}.
     */
    HistoryDto toDto(HistoryEntity history);

    /**
     * @param history {@link HistoryDto}.
     * @param historyEntity {@link HistoryEntity}.
     * @return {@link HistoryEntity}.
     */
    @Mapping(target = "id", ignore = true)
    HistoryEntity mergeToEntity(HistoryDto history, @MappingTarget HistoryEntity historyEntity);
}
