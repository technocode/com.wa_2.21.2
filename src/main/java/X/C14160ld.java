package X;

import android.os.Build;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0ld  reason: invalid class name and case insensitive filesystem */
public class C14160ld {
    public int A00;
    public HashMap A01 = new HashMap();
    public final C14170le A02 = new C14170le();
    public final C14180lf A03 = new C14180lf();
    public final C14190lg A04 = new C14190lg();
    public final C14200lh A05 = new C14200lh();

    public final void A00(int i, C06490Tl r5) {
        this.A00 = i;
        C14170le r2 = this.A02;
        r2.A0W = r5.A0T;
        r2.A0X = r5.A0U;
        r2.A0f = r5.A0k;
        r2.A0g = r5.A0l;
        r2.A0m = r5.A0p;
        r2.A0l = r5.A0o;
        r2.A0B = r5.A0C;
        r2.A0A = r5.A0B;
        r2.A08 = r5.A0A;
        r2.A0i = r5.A0m;
        r2.A0j = r5.A0n;
        r2.A0I = r5.A0J;
        r2.A0H = r5.A0I;
        r2.A03 = r5.A02;
        r2.A05 = r5.A08;
        r2.A0r = r5.A0t;
        r2.A0C = r5.A0D;
        r2.A0D = r5.A0E;
        r2.A00 = r5.A00;
        r2.A0E = r5.A0G;
        r2.A0F = r5.A0H;
        r2.A0d = r5.A0b;
        r2.A01 = r5.A01;
        r2.A0P = r5.A0Q;
        r2.A0Q = r5.A0R;
        r2.A0c = ((ViewGroup.MarginLayoutParams) r5).width;
        r2.A0a = ((ViewGroup.MarginLayoutParams) r5).height;
        r2.A0V = ((ViewGroup.MarginLayoutParams) r5).leftMargin;
        r2.A0e = ((ViewGroup.MarginLayoutParams) r5).rightMargin;
        r2.A0k = ((ViewGroup.MarginLayoutParams) r5).topMargin;
        r2.A09 = ((ViewGroup.MarginLayoutParams) r5).bottomMargin;
        r2.A06 = r5.A09;
        r2.A04 = r5.A03;
        r2.A0n = r5.A0q;
        r2.A0U = r5.A0S;
        r2.A0v = r5.A0v;
        r2.A0u = r5.A0u;
        r2.A0o = r5.A0W;
        r2.A0R = r5.A0V;
        r2.A0p = r5.A0Y;
        r2.A0S = r5.A0X;
        r2.A0q = r5.A0a;
        r2.A0T = r5.A0Z;
        r2.A07 = r5.A05;
        r2.A02 = r5.A04;
        r2.A0s = r5.A0s;
        r2.A0O = r5.A0P;
        r2.A0J = r5.A0K;
        r2.A0L = r5.A0M;
        r2.A0M = r5.A0N;
        r2.A0N = r5.A0O;
        r2.A0K = r5.A0L;
        if (Build.VERSION.SDK_INT >= 17) {
            r2.A0G = r5.getMarginEnd();
            r2.A0h = r5.getMarginStart();
        }
    }

    public void A01(C06490Tl r4) {
        C14170le r2 = this.A02;
        r4.A0T = r2.A0W;
        r4.A0U = r2.A0X;
        r4.A0k = r2.A0f;
        r4.A0l = r2.A0g;
        r4.A0p = r2.A0m;
        r4.A0o = r2.A0l;
        r4.A0C = r2.A0B;
        r4.A0B = r2.A0A;
        r4.A0A = r2.A08;
        r4.A0m = r2.A0i;
        r4.A0n = r2.A0j;
        r4.A0J = r2.A0I;
        r4.A0I = r2.A0H;
        ((ViewGroup.MarginLayoutParams) r4).leftMargin = r2.A0V;
        ((ViewGroup.MarginLayoutParams) r4).rightMargin = r2.A0e;
        ((ViewGroup.MarginLayoutParams) r4).topMargin = r2.A0k;
        ((ViewGroup.MarginLayoutParams) r4).bottomMargin = r2.A09;
        r4.A0O = r2.A0N;
        r4.A0L = r2.A0K;
        r4.A0P = r2.A0O;
        r4.A0K = r2.A0J;
        r4.A02 = r2.A03;
        r4.A08 = r2.A05;
        r4.A0D = r2.A0C;
        r4.A0E = r2.A0D;
        r4.A00 = r2.A00;
        r4.A0t = r2.A0r;
        r4.A0G = r2.A0E;
        r4.A0H = r2.A0F;
        r4.A09 = r2.A06;
        r4.A03 = r2.A04;
        r4.A0q = r2.A0n;
        r4.A0S = r2.A0U;
        r4.A0v = r2.A0v;
        r4.A0u = r2.A0u;
        r4.A0W = r2.A0o;
        r4.A0V = r2.A0R;
        r4.A0Y = r2.A0p;
        r4.A0X = r2.A0S;
        r4.A0a = r2.A0q;
        r4.A0Z = r2.A0T;
        r4.A05 = r2.A07;
        r4.A04 = r2.A02;
        r4.A0b = r2.A0d;
        r4.A01 = r2.A01;
        r4.A0Q = r2.A0P;
        r4.A0R = r2.A0Q;
        ((ViewGroup.MarginLayoutParams) r4).width = r2.A0c;
        ((ViewGroup.MarginLayoutParams) r4).height = r2.A0a;
        String str = r2.A0s;
        if (str != null) {
            r4.A0s = str;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            r4.setMarginStart(r2.A0h);
            r4.setMarginEnd(r2.A0G);
        }
        r4.A00();
    }

    public Object clone() {
        C14160ld r1 = new C14160ld();
        C14170le r3 = r1.A02;
        C14170le r5 = this.A02;
        if (r3 != null) {
            r3.A0y = r5.A0y;
            r3.A0c = r5.A0c;
            r3.A0w = r5.A0w;
            r3.A0a = r5.A0a;
            r3.A0P = r5.A0P;
            r3.A0Q = r5.A0Q;
            r3.A01 = r5.A01;
            r3.A0W = r5.A0W;
            r3.A0X = r5.A0X;
            r3.A0f = r5.A0f;
            r3.A0g = r5.A0g;
            r3.A0m = r5.A0m;
            r3.A0l = r5.A0l;
            r3.A0B = r5.A0B;
            r3.A0A = r5.A0A;
            r3.A08 = r5.A08;
            r3.A0i = r5.A0i;
            r3.A0j = r5.A0j;
            r3.A0I = r5.A0I;
            r3.A0H = r5.A0H;
            r3.A03 = r5.A03;
            r3.A05 = r5.A05;
            r3.A0r = r5.A0r;
            r3.A0C = r5.A0C;
            r3.A0D = r5.A0D;
            r3.A00 = r5.A00;
            r3.A0E = r5.A0E;
            r3.A0F = r5.A0F;
            r3.A0d = r5.A0d;
            r3.A0V = r5.A0V;
            r3.A0e = r5.A0e;
            r3.A0k = r5.A0k;
            r3.A09 = r5.A09;
            r3.A0G = r5.A0G;
            r3.A0h = r5.A0h;
            r3.A0L = r5.A0L;
            r3.A0O = r5.A0O;
            r3.A0M = r5.A0M;
            r3.A0J = r5.A0J;
            r3.A0K = r5.A0K;
            r3.A0N = r5.A0N;
            r3.A06 = r5.A06;
            r3.A04 = r5.A04;
            r3.A0U = r5.A0U;
            r3.A0n = r5.A0n;
            r3.A0o = r5.A0o;
            r3.A0R = r5.A0R;
            r3.A0p = r5.A0p;
            r3.A0S = r5.A0S;
            r3.A0q = r5.A0q;
            r3.A0T = r5.A0T;
            r3.A07 = r5.A07;
            r3.A02 = r5.A02;
            r3.A0Y = r5.A0Y;
            r3.A0Z = r5.A0Z;
            r3.A0b = r5.A0b;
            r3.A0s = r5.A0s;
            int[] iArr = r5.A0z;
            if (iArr != null) {
                r3.A0z = Arrays.copyOf(iArr, iArr.length);
            } else {
                r3.A0z = null;
            }
            r3.A0t = r5.A0t;
            r3.A0v = r5.A0v;
            r3.A0u = r5.A0u;
            r3.A0x = r5.A0x;
            C14180lf r32 = r1.A03;
            C14180lf r2 = this.A03;
            if (r32 != null) {
                r32.A06 = r2.A06;
                r32.A02 = r2.A02;
                r32.A05 = r2.A05;
                r32.A04 = r2.A04;
                r32.A03 = r2.A03;
                r32.A01 = r2.A01;
                r32.A00 = r2.A00;
                C14190lg r33 = r1.A04;
                C14190lg r22 = this.A04;
                if (r33 != null) {
                    r33.A04 = r22.A04;
                    r33.A03 = r22.A03;
                    r33.A00 = r22.A00;
                    r33.A01 = r22.A01;
                    r33.A02 = r22.A02;
                    C14200lh r23 = r1.A05;
                    C14200lh r34 = this.A05;
                    if (r23 != null) {
                        r23.A0C = r34.A0C;
                        r23.A01 = r34.A01;
                        r23.A02 = r34.A02;
                        r23.A03 = r34.A03;
                        r23.A04 = r34.A04;
                        r23.A05 = r34.A05;
                        r23.A06 = r34.A06;
                        r23.A07 = r34.A07;
                        r23.A08 = r34.A08;
                        r23.A09 = r34.A09;
                        r23.A0A = r34.A0A;
                        r23.A0B = r34.A0B;
                        r23.A00 = r34.A00;
                        r1.A00 = this.A00;
                        return r1;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
