package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: X.13V  reason: invalid class name */
public final class AnonymousClass13V {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r7.isFeatureSupported("tunneled-playback") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r7.isFeatureSupported("adaptive-playback") == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass13V(java.lang.String r5, java.lang.String r6, android.media.MediaCodecInfo.CodecCapabilities r7, boolean r8, boolean r9, boolean r10) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L_0x005c
            r4.A02 = r5
            r4.A01 = r6
            r4.A00 = r7
            r4.A05 = r8
            r3 = 1
            if (r9 != 0) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            int r1 = X.AnonymousClass0W2.A00
            r0 = 19
            if (r1 < r0) goto L_0x0021
            java.lang.String r0 = "adaptive-playback"
            boolean r1 = r7.isFeatureSupported(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r4.A03 = r0
            r2 = 21
            if (r7 == 0) goto L_0x0036
            int r0 = X.AnonymousClass0W2.A00
            if (r0 < r2) goto L_0x0036
            java.lang.String r0 = "tunneled-playback"
            boolean r1 = r7.isFeatureSupported(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r4.A07 = r0
            if (r10 != 0) goto L_0x004a
            if (r7 == 0) goto L_0x005a
            int r0 = X.AnonymousClass0W2.A00
            if (r0 < r2) goto L_0x005a
            java.lang.String r0 = "secure-playback"
            boolean r0 = r7.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x005a
        L_0x004a:
            r4.A06 = r3
            java.lang.String r1 = X.C233415j.A02(r6)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            r4.A04 = r0
            return
        L_0x005a:
            r3 = 0
            goto L_0x004a
        L_0x005c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13V.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    public final void A00(String str) {
        StringBuilder A0Z = AnonymousClass008.A0Z("NoSupport [", str, "] [");
        A0Z.append(this.A02);
        A0Z.append(", ");
        A0Z.append(this.A01);
        A0Z.append("] [");
        A0Z.append(AnonymousClass0W2.A02);
        A0Z.append("]");
        Log.d("MediaCodecInfo", A0Z.toString());
    }

    public boolean A01(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A00("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A00("sizeAndRate.vCaps");
            return false;
        }
        if (d == -1.0d || d <= 0.0d) {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        } else {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d == -1.0d || d <= 0.0d) {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            } else {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            }
            if (isSizeSupported2) {
                StringBuilder A0U = AnonymousClass008.A0U("sizeAndRate.rotated, ", i, "x", i2, "x");
                A0U.append(d);
                StringBuilder A0Z = AnonymousClass008.A0Z("AssumedSupport [", A0U.toString(), "] [");
                A0Z.append(this.A02);
                A0Z.append(", ");
                A0Z.append(this.A01);
                A0Z.append("] [");
                A0Z.append(AnonymousClass0W2.A02);
                A0Z.append("]");
                Log.d("MediaCodecInfo", A0Z.toString());
                return true;
            }
        }
        StringBuilder A0U2 = AnonymousClass008.A0U("sizeAndRate.support, ", i, "x", i2, "x");
        A0U2.append(d);
        A00(A0U2.toString());
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0124, code lost:
        if (r2 != null) goto L_0x0128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AnonymousClass126 r13) {
        /*
        // Method dump skipped, instructions count: 748
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13V.A02(X.126):boolean");
    }

    public boolean A03(AnonymousClass126 r4) {
        if (this.A04) {
            return this.A03;
        }
        Pair A012 = C227813d.A01(r4.A0K);
        return A012 != null && ((Number) A012.first).intValue() == 42;
    }

    public boolean A04(AnonymousClass126 r6, AnonymousClass126 r7, boolean z) {
        if (!this.A04) {
            if ("audio/mp4a-latm".equals(this.A01) && r6.A0P.equals(r7.A0P) && r6.A05 == r7.A05 && r6.A0C == r7.A0C) {
                Pair A012 = C227813d.A01(r6.A0K);
                Pair A013 = C227813d.A01(r7.A0K);
                if (!(A012 == null || A013 == null)) {
                    int intValue = ((Number) A012.first).intValue();
                    int intValue2 = ((Number) A013.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else if (!r6.A0P.equals(r7.A0P) || r6.A0B != r7.A0B) {
            return false;
        } else {
            if (!this.A03 && (r6.A0F != r7.A0F || r6.A08 != r7.A08)) {
                return false;
            }
            if ((z || r7.A0J != null) && !AnonymousClass0W2.A08(r6.A0J, r7.A0J)) {
                return false;
            }
            return true;
        }
    }

    public String toString() {
        return this.A02;
    }
}
