package X;

import android.media.MediaCodec;

/* renamed from: X.12x  reason: invalid class name and case insensitive filesystem */
public final class C227212x {
    public byte[] A00;
    public final MediaCodec.CryptoInfo A01;
    public final C227112w A02;

    public C227212x() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i = AnonymousClass0W2.A00;
        C227112w r0 = null;
        if (i >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.A01 = cryptoInfo;
        this.A02 = i >= 24 ? new C227112w(cryptoInfo) : r0;
    }
}
