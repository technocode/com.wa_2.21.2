package X;

import android.graphics.Bitmap;

/* renamed from: X.0wn  reason: invalid class name and case insensitive filesystem */
public class C20490wn {
    public final int A00;
    public final int A01 = 100;
    public final Bitmap.Config A02;
    public final boolean A03;

    public C20490wn(C20500wo r2) {
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20490wn.class != obj.getClass()) {
            return false;
        }
        C20490wn r5 = (C20490wn) obj;
        return this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02;
    }

    public int hashCode() {
        return ((((((this.A02.ordinal() + ((((((((((3100 + this.A00) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.A03 ? 1 : 0)) * 31)) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ImageDecodeOptions{");
        C19940vr r3 = new C19940vr("ImageDecodeOptions");
        r3.A00("minDecodeIntervalMs", String.valueOf(100));
        r3.A00("maxDimensionPx", String.valueOf(this.A00));
        String valueOf = String.valueOf(false);
        r3.A00("decodePreviewFrame", valueOf);
        r3.A00("useLastFrameForPreview", valueOf);
        r3.A00("decodeAllFrames", valueOf);
        r3.A00("forceStaticImage", String.valueOf(this.A03));
        r3.A00("bitmapConfigName", this.A02.name());
        r3.A00("customImageDecoder", null);
        r3.A00("bitmapTransformation", null);
        r3.A00("colorSpace", null);
        A0S.append(r3.toString());
        A0S.append("}");
        return A0S.toString();
    }
}
