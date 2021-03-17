package com.sms.data.store

import com.sms.data.repositories.GitDataStore
import javax.inject.Inject

class GitDataStoreFactory @Inject constructor(
    private val gitRemoteDataStore: GitRemoteDataStore
) {

    fun getRemoteDataStore(): GitDataStore {
        return gitRemoteDataStore
    }
}