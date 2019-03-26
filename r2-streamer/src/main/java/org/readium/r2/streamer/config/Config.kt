package org.readium.r2.streamer.config

/**
 * Created by Nuwan on 3/25/19.
 */
class Config {

    var isReqiredEncryption: Boolean = false
    var callback: Unit? = null


    companion object {
        private val instance = Config()

        fun getInsance(): Config {
            return instance;
        }
    }


}