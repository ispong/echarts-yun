package com.isxcode.rainbow.modules.work.mapper;

import com.isxcode.rainbow.api.work.pojos.dto.SyncWorkConfig;
import com.isxcode.rainbow.api.work.pojos.res.GetSyncWorkConfigRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkConfigMapper {

    GetSyncWorkConfigRes syncWorkConfigToGetSyncWorkConfigRes(SyncWorkConfig syncWorkConfig);
}
