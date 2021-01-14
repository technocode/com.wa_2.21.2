package com.facebook.msys.mci;

public class Proxies {
    public static boolean sConfigured;

    public static native void configureInternal(ProxyProvider proxyProvider);

    public static synchronized void configure(ProxyProvider proxyProvider) {
        synchronized (Proxies.class) {
            if (!sConfigured) {
                sConfigured = true;
                configureInternal(proxyProvider);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
