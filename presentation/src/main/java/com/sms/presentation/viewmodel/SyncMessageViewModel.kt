package com.sms.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.sms.presentation.base.BaseViewModel

class SyncMessageViewModel : BaseViewModel<SyncMessageState>() {

    private var state: SyncMessageState = SyncMessageState.Init
        set(value) {
            field = value
            publishState(value)
        }

    fun resetState() {
        state = SyncMessageState.Init
    }

    override val stateObservable: MutableLiveData<SyncMessageState> by lazy {
        MutableLiveData<SyncMessageState>()
    }
}
