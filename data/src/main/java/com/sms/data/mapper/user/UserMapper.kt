package com.sms.data.mapper.user

import com.sms.data.mapper.Mapper
import com.sms.data.models.UserEntity
import com.sms.domain.models.user.User
import javax.inject.Inject

class UserMapper @Inject constructor() : Mapper<UserEntity, User> {

    override fun mapFromEntity(type: UserEntity): User {
        return User(
            userName = type.userName,
            profilePic = type.profilePic
        )
    }

    override fun mapToEntity(type: User): UserEntity {
        return UserEntity(
            userName = type.userName,
            profilePic = type.profilePic
        )
    }
}