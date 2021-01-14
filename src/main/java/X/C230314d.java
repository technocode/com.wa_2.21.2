package X;

import android.text.Layout;

/* renamed from: X.14d  reason: invalid class name and case insensitive filesystem */
public final class C230314d {
    public float A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = -1;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;

    public void A00(C230314d r4) {
        if (r4 != null) {
            if (!this.A0C && r4.A0C) {
                this.A03 = r4.A03;
                this.A0C = true;
            }
            if (this.A02 == -1) {
                this.A02 = r4.A02;
            }
            if (this.A05 == -1) {
                this.A05 = r4.A05;
            }
            if (this.A09 == null) {
                this.A09 = r4.A09;
            }
            if (this.A06 == -1) {
                this.A06 = r4.A06;
            }
            if (this.A07 == -1) {
                this.A07 = r4.A07;
            }
            if (this.A08 == null) {
                this.A08 = r4.A08;
            }
            if (this.A04 == -1) {
                this.A04 = r4.A04;
                this.A00 = r4.A00;
            }
            if (!this.A0B && r4.A0B) {
                this.A01 = r4.A01;
                this.A0B = true;
            }
        }
    }
}
