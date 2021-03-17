package com.sms.data

import com.sms.data.mapper.single_repo.SingleRepoMapper
import com.sms.data.store.GitDataStoreFactory
import com.sms.domain.SyncMessageRepository
import javax.inject.Inject

class SyncMessageDataRepository @Inject constructor(
    private val singleRepoMapper: SingleRepoMapper,
    private val gitDataStoreFactory: GitDataStoreFactory
) : SyncMessageRepository {

    override fun syncMessages() {

    }


}