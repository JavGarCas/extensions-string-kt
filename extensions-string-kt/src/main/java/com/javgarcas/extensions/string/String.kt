package com.javgarcas.extensions.string

import java.util.regex.Pattern

fun String.Companion.empty() = ""

fun String.Companion.space() = " "

fun String?.safeString() = this ?: String.empty()

fun String.isValidEmail() = Pattern.compile(EMAIL_PATTERN).matcher(this).matches()

