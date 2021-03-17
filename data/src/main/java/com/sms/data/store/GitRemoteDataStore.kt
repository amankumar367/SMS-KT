package com.sms.data.store

import com.sms.data.models.PullRequestEntity
import com.sms.data.models.SingleRepoEntity
import com.sms.data.models.request.PullRequestGetBody
import com.sms.data.repositories.GitDataStore
import com.sms.data.repositories.GitRemote
import io.reactivex.Single
import javax.inject.Inject

class GitRemoteDataStore @Inject constructor(
    private val gitRemote: GitRemote
) : GitDataStore {


    override fun getUserGitRepositories(username: String): Single<List<SingleRepoEntity>> {
        return gitRemote.getUserGitRepositories(username)
    }

    override fun getPullRequestList(
        username: String,
        repoName: String,
        state: String
    ): Single<List<PullRequestEntity>> {
        return gitRemote.getPullRequestList(PullRequestGetBody(username, repoName, state))
    }
}