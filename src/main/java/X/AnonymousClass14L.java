package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.14L  reason: invalid class name */
public final class AnonymousClass14L {
    public static final int A0M = A00(0, 0, 0, 0);
    public static final int A0N = A00(2, 2, 2, 0);
    public static final int A0O;
    public static final int[] A0P;
    public static final int[] A0Q = {0, 0, 0, 0, 0, 3, 3};
    public static final int[] A0R = {0, 1, 2, 3, 4, 3, 4};
    public static final int[] A0S;
    public static final int[] A0T = {0, 0, 0, 0, 0, 2, 0};
    public static final int[] A0U = {0, 0, 0, 0, 0, 0, 2};
    public static final int[] A0V = {3, 3, 3, 3, 3, 3, 1};
    public static final boolean[] A0W = {false, false, false, true, true, true, false};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();
    public final List A0L = new ArrayList();

    static {
        int A002 = A00(0, 0, 0, 3);
        A0O = A002;
        int i = A0M;
        A0S = new int[]{i, A002, i, i, A002, i, i};
        A0P = new int[]{i, i, i, i, i, A002, A002};
    }

    public AnonymousClass14L() {
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r8 != 3) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r5, int r6, int r7, int r8) {
        /*
            r4 = 0
            r0 = 4
            X.C002001d.A2M(r5, r0)
            X.C002001d.A2M(r6, r0)
            X.C002001d.A2M(r7, r0)
            X.C002001d.A2M(r8, r0)
            r3 = 1
            if (r8 == 0) goto L_0x001a
            if (r8 == r3) goto L_0x001a
            r0 = 2
            if (r8 == r0) goto L_0x002f
            r0 = 3
            r2 = 0
            if (r8 == r0) goto L_0x001c
        L_0x001a:
            r2 = 255(0xff, float:3.57E-43)
        L_0x001c:
            r1 = 0
            if (r5 <= r3) goto L_0x0021
            r1 = 255(0xff, float:3.57E-43)
        L_0x0021:
            r0 = 0
            if (r6 <= r3) goto L_0x0026
            r0 = 255(0xff, float:3.57E-43)
        L_0x0026:
            if (r7 <= r3) goto L_0x002a
            r4 = 255(0xff, float:3.57E-43)
        L_0x002a:
            int r0 = android.graphics.Color.argb(r2, r1, r0, r4)
            return r0
        L_0x002f:
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14L.A00(int, int, int, int):int");
    }

    public SpannableString A01() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public void A02() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i = A0M;
        this.A0E = i;
        this.A03 = A0N;
        this.A01 = i;
    }

    public void A03(char c) {
        if (c == '\n') {
            List list = this.A0L;
            list.add(A01());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && list.size() >= this.A0B) || list.size() >= 15) {
                    list.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c);
        }
    }

    public void A04(int i, int i2) {
        int i3;
        int i4;
        if (!(this.A04 == -1 || (i4 = this.A03) == i)) {
            SpannableStringBuilder spannableStringBuilder = this.A0K;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), this.A04, spannableStringBuilder.length(), 33);
        }
        if (i != A0N) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        if (!(this.A02 == -1 || (i3 = this.A01) == i2)) {
            SpannableStringBuilder spannableStringBuilder2 = this.A0K;
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(i3), this.A02, spannableStringBuilder2.length(), 33);
        }
        if (i2 != A0M) {
            this.A02 = this.A0K.length();
            this.A01 = i2;
        }
    }

    public void A05(boolean z, boolean z2) {
        if (this.A06 != -1) {
            if (!z) {
                SpannableStringBuilder spannableStringBuilder = this.A0K;
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, spannableStringBuilder.length(), 33);
                this.A06 = -1;
            }
        } else if (z) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C != -1) {
            if (!z2) {
                SpannableStringBuilder spannableStringBuilder2 = this.A0K;
                spannableStringBuilder2.setSpan(new UnderlineSpan(), this.A0C, spannableStringBuilder2.length(), 33);
                this.A0C = -1;
            }
        } else if (z2) {
            this.A0C = this.A0K.length();
        }
    }
}
