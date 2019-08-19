package org.readium.r2.streamer.config

/**
 * Created by Nuwan on 3/25/19.
 */
class Configurations {

    var needExport: Boolean = false
    var callback: Callback? = null
    var imageListener:ImageClickListener?=null

    interface Callback {
        fun export(input: String): String
    }

    interface ImageClickListener {
        fun onImageClick(url: String)
    }


    companion object {
        private val instance = Configurations()

        fun getInsance(): Configurations {
            return instance;
        }
    }


    fun clear() {
        imageListener=null
        needExport = false
        callback = null
    }

}