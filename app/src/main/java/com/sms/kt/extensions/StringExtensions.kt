package com.sms.kt.extensions

fun String?.isValid(): Boolean {
    return this != null && this.isNotEmpty() && this.isNotBlank()
}