package X;

/* renamed from: X.13W  reason: invalid class name */
public class AnonymousClass13W extends Exception {
    public final String decoderName;
    public final String diagnosticInfo;
    public final AnonymousClass13W fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass13W(X.AnonymousClass126 r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "Decoder init failed: ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r2 = r1.toString()
            java.lang.String r4 = r10.A0P
            java.lang.String r1 = "neg_"
            java.lang.String r0 = "com.google.android.exoplayer.MediaCodecTrackRenderer_"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0Y(r0, r1)
            int r0 = java.lang.Math.abs(r12)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r6 = 0
            r5 = 0
            r1 = r9
            r3 = r11
            r8 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13W.<init>(X.126, java.lang.Throwable, int):void");
    }

    public AnonymousClass13W(String str, Throwable th, String str2, boolean z, String str3, String str4, AnonymousClass13W r7) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.decoderName = str3;
        this.diagnosticInfo = str4;
        this.fallbackDecoderInitializationException = r7;
    }
}
