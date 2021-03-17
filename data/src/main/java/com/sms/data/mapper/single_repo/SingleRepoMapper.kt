package com.sms.data.mapper.single_repo

import com.sms.data.mapper.Mapper
import com.sms.data.models.SingleRepoEntity
import com.sms.domain.models.repo.GitSingleRepo
import javax.inject.Inject

class SingleRepoMapper @Inject constructor() : Mapper<SingleRepoEntity, GitSingleRepo> {
    override fun mapFromEntity(type: SingleRepoEntity): GitSingleRepo {
        return GitSingleRepo(
            repoName = type.repoName,
            defaultBranch = type.defaultBranch,
            forksCount = type.forksCount,
            openIssuesCount = type.openIssuesCount,
            repoDescription = type.repoDescription
        )
    }

    override fun mapToEntity(type: GitSingleRepo): SingleRepoEntity {
        return SingleRepoEntity(
            repoName = type.repoName,
            defaultBranch = type.defaultBranch,
            forksCount = type.forksCount,
            openIssuesCount = type.openIssuesCount,
            repoDescription = type.repoDescription
        )
    }
}