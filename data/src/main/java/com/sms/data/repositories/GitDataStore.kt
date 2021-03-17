package com.sms.data.repositories

import com.sms.data.models.PullRequestEntity
import com.sms.data.models.SingleRepoEntity
import io.reactivex.Single

interface GitDataStore {
    fun getUserGitRepositories(username: String): Single<List<SingleRepoEntity>>

    fun getPullRequestList(
        username: String,
        repoName: String,
        state: String
    ): Single<List<PullRequestEntity>>
}