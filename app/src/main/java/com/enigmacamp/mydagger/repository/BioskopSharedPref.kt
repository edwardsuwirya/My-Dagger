package com.enigmacamp.mydagger.repository

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

//Alternatif
//@Singleton
//class BioskopSharedPref @Inject constructor(context: Context) {
class BioskopSharedPref(context: Context){
    val sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    fun save(KEY_NAME: String, text: String) {
        val editor = sharedPref.edit()
        with(editor) {
            putString(KEY_NAME, text)
            commit()
        }
    }

    fun getValueString(KEY_NAME: String): String? {
        return sharedPref.getString(KEY_NAME, null)
    }

    fun removeValue(KEY_NAME: String) {
        val editor = sharedPref.edit()
        with(editor) {
            remove(KEY_NAME)
            commit()
        }
    }

    fun clearSharedPreference() {
        val editor = sharedPref.edit()
        with(editor) {
            clear()
            commit()
        }
    }

    companion object {
        private const val PREF_NAME = "BIOSKOP"
    }
}