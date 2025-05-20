package co.za.payu.base.sdk.info;

import co.za.payu.base.SDKVersion;

/**
 * Implementation of SDKVersion
 */
public class SDKVersionImpl implements SDKVersion {

    /**
     * SDK ID used in User-Agent HTTP header
     */
    private static final String SDK_ID = "PayU-Java-SDK";

    /**
     * SDK Version used in User-Agent HTTP header
     */
    private static final String SDK_VERSION = "2.0.0";

    public String getSDKId() {
        return SDK_ID;
    }

    public String getSDKVersion() {
        return SDK_VERSION;
    }
}
