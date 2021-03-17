package com.sms.presentation.viewmodel

sealed class SyncMessageState {

    object Init : SyncMessageState()

    data class Loading(val message: String) : SyncMessageState()

    data class Error(var message: String) : SyncMessageState()

}