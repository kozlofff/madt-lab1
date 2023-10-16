package com.example.lab1

class TextCounter {
    fun countWords(text: String): Int {
        val words = text.split("[ ,.]+".toRegex())
        return words.size
    }

    fun countCharacters(text: String): Int {
        return text.length
    }
}
