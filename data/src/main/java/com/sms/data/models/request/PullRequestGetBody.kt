package com.sms.data.models.request

data class PullRequestGetBody(
    var userName : String,
    var repositoryName : String,
    var state : String
)