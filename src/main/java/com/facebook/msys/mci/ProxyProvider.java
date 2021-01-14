package com.facebook.msys.mci;

public interface ProxyProvider {
    Crypto getCrypto();

    UUID getUUID();
}
