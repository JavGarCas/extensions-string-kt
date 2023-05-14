package com.javgarcas.extensions_string_kt

import java.util.regex.Pattern

fun String.Companion.empty() = ""

fun String.Companion.space() = " "

fun String.isValidEmail() = Pattern.compile(EMAIL_PATTERN).matcher(this).matches()

fun String?.safeString() = this ?: String.empty()
