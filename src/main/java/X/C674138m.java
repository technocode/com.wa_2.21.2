package X;

import android.view.View;

/* renamed from: X.38m  reason: invalid class name and case insensitive filesystem */
public class C674138m {
    public int A00;
    public View.OnClickListener A01;
    public C007003k A02;
    public String A03;

    public C674138m() {
        if (1 != 0) {
            this.A00 = 2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C674138m(int i, C007003k r4) {
        boolean z = true;
        if (!(i == 1 || i == 3)) {
            z = false;
        }
        AnonymousClass00E.A06(z);
        this.A00 = i;
        this.A02 = r4;
    }

    public C674138m(View.OnClickListener onClickListener) {
        if (1 != 0) {
            this.A00 = 4;
            this.A01 = onClickListener;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C674138m(String str) {
        if (1 != 0) {
            this.A00 = 0;
            this.A03 = str;
            return;
        }
        throw new IllegalArgumentException();
    }
}
