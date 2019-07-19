package org.readium.r2.streamer.config

/**
 * Created by Nuwan on 3/25/19.
 */
class Configurations {

    var needExport: Boolean = false
    var callback: Callback? = null

    interface Callback {
        fun export(input: String): String
    }


    companion object {
        private val instance = Configurations()

        fun getInsance(): Configurations {
            return instance;
        }
    }


    fun clear() {

        needExport = false
        callback = null
    }

}