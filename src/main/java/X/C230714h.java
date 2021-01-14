package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.14h  reason: invalid class name and case insensitive filesystem */
public class C230714h {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    public C230714h() {
        A01();
    }

    public C34361iK A00() {
        if (this.A01 != Float.MIN_VALUE && this.A05 == Integer.MIN_VALUE) {
            Layout.Alignment alignment = this.A08;
            if (alignment == null) {
                this.A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                int i = C230614g.A00[alignment.ordinal()];
                if (i == 1) {
                    this.A05 = 0;
                } else if (i == 2) {
                    this.A05 = 1;
                } else if (i != 3) {
                    StringBuilder A0S = AnonymousClass008.A0S("Unrecognized alignment: ");
                    A0S.append(alignment);
                    Log.w("WebvttCueBuilder", A0S.toString());
                    this.A05 = 0;
                } else {
                    this.A05 = 2;
                }
            }
        }
        return new C34361iK(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public void A01() {
        this.A07 = 0;
        this.A06 = 0;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A01 = Float.MIN_VALUE;
        this.A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A02 = Float.MIN_VALUE;
    }
}
