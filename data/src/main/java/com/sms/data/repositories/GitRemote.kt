package com.sms.data.repositories

import com.sms.data.models.PullRequestEntity
import com.sms.data.models.SingleRepoEntity
import com.sms.data.models.request.PullRequestGetBody
import io.reactivex.Single

interface GitRemote {
    fun getUserGitRepositories(username: String): Single<List<SingleRepoEntity>>

    fun getPullRequestList(pullRequestGetBody: PullRequestGetBody): Single<List<PullRequestEntity>>
}