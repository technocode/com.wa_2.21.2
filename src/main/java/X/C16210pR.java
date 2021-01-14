package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0pR  reason: invalid class name and case insensitive filesystem */
public class C16210pR {
    public int A00;
    public int A01;
    public AnonymousClass0VS A02;
    public boolean A03;
    public boolean A04;

    public C16210pR() {
        A01();
    }

    public void A00() {
        int A042;
        if (this.A03) {
            A042 = this.A02.A02();
        } else {
            A042 = this.A02.A04();
        }
        this.A00 = A042;
    }

    public void A01() {
        this.A01 = -1;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = false;
        this.A04 = false;
    }

    public void A02(View view, int i) {
        int A05;
        if (this.A03) {
            int A06 = this.A02.A06(view);
            AnonymousClass0VS r2 = this.A02;
            if (Integer.MIN_VALUE == r2.A00) {
                A05 = 0;
            } else {
                A05 = r2.A05() - r2.A00;
            }
            this.A00 = A05 + A06;
        } else {
            this.A00 = this.A02.A09(view);
        }
        this.A01 = i;
    }

    public void A03(View view, int i) {
        int A05;
        AnonymousClass0VS r3 = this.A02;
        if (Integer.MIN_VALUE == r3.A00) {
            A05 = 0;
        } else {
            A05 = r3.A05() - r3.A00;
        }
        if (A05 >= 0) {
            A02(view, i);
            return;
        }
        this.A01 = i;
        if (this.A03) {
            int A022 = (this.A02.A02() - A05) - this.A02.A06(view);
            this.A00 = this.A02.A02() - A022;
            if (A022 > 0) {
                int A07 = this.A00 - this.A02.A07(view);
                int A042 = this.A02.A04();
                int min = A07 - (Math.min(this.A02.A09(view) - A042, 0) + A042);
                if (min < 0) {
                    this.A00 = Math.min(A022, -min) + this.A00;
                    return;
                }
                return;
            }
            return;
        }
        int A09 = this.A02.A09(view);
        int A043 = A09 - this.A02.A04();
        this.A00 = A09;
        if (A043 > 0) {
            int A023 = (this.A02.A02() - Math.min(0, (this.A02.A02() - A05) - this.A02.A06(view))) - (this.A02.A07(view) + A09);
            if (A023 < 0) {
                this.A00 -= Math.min(A043, -A023);
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("AnchorInfo{mPosition=");
        A0S.append(this.A01);
        A0S.append(", mCoordinate=");
        A0S.append(this.A00);
        A0S.append(", mLayoutFromEnd=");
        A0S.append(this.A03);
        A0S.append(", mValid=");
        A0S.append(this.A04);
        A0S.append('}');
        return A0S.toString();
    }
}
