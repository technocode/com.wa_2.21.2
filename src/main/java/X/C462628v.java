package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.28v  reason: invalid class name and case insensitive filesystem */
public final class C462628v extends AnonymousClass25Z {
    public static final int A07 = AnonymousClass0W2.A01("styl");
    public static final int A08 = AnonymousClass0W2.A01("tbox");
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public boolean A05;
    public final C233815n A06 = new C233815n();

    public C462628v(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.A03 = bArr[24];
            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.A04 = "Serif".equals(new String(bArr, 43, bArr.length - 43, Charset.forName("UTF-8"))) ? "serif" : str;
            int i = bArr[25] * 20;
            this.A01 = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.A05 = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
                this.A00 = f;
                this.A00 = Math.max(0.0f, Math.min(f, 0.95f));
                return;
            }
            this.A00 = 0.85f;
            return;
        }
        this.A02 = -1;
        this.A04 = str;
        this.A00 = 0.85f;
    }

    public static void A00(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = false;
            if ((i & 1) != 0) {
                z = true;
            }
            boolean z2 = false;
            if ((i & 2) != 0) {
                z2 = true;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else if (!z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }
}
