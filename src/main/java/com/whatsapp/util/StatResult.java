package com.whatsapp.util;

public final class StatResult {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public static native StatResult lstatOpenFile(String str);

    public static native StatResult statOpenFile(int i);

    public StatResult(int i, int i2, int i3, int i4, long j, long j2, boolean z) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i4;
        this.A04 = j;
        this.A03 = j2;
        this.A05 = z;
    }
}
