package com.facebook.msys.util;

public final class McfReferenceHolder {
    public long nativeReference = 0;

    private void setNativeReference(long j) {
        this.nativeReference = j;
    }
}
