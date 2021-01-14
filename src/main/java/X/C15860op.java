package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.0op  reason: invalid class name and case insensitive filesystem */
public final class C15860op {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public C15860op(int i, int i2) {
        this.A07 = Color.red(i);
        this.A05 = Color.green(i);
        this.A04 = Color.blue(i);
        this.A08 = i;
        this.A06 = i2;
    }

    public final void A00() {
        int A032;
        int A033;
        if (!this.A02) {
            int i = this.A08;
            int A052 = C004402b.A05(-1, i, 4.5f);
            int A053 = C004402b.A05(-1, i, 3.0f);
            if (A052 == -1 || A053 == -1) {
                int A054 = C004402b.A05(-16777216, i, 4.5f);
                int A055 = C004402b.A05(-16777216, i, 3.0f);
                if (A054 == -1 || A055 == -1) {
                    if (A052 != -1) {
                        A032 = C004402b.A03(-1, A052);
                    } else {
                        A032 = C004402b.A03(-16777216, A054);
                    }
                    this.A00 = A032;
                    if (A053 != -1) {
                        A033 = C004402b.A03(-1, A053);
                    } else {
                        A033 = C004402b.A03(-16777216, A055);
                    }
                    this.A01 = A033;
                    this.A02 = true;
                    return;
                }
                this.A00 = C004402b.A03(-16777216, A054);
                this.A01 = C004402b.A03(-16777216, A055);
                this.A02 = true;
                return;
            }
            this.A00 = C004402b.A03(-1, A052);
            this.A01 = C004402b.A03(-1, A053);
            this.A02 = true;
        }
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        C004402b.A06(this.A07, this.A05, this.A04, fArr);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15860op.class != obj.getClass()) {
            return false;
        }
        C15860op r5 = (C15860op) obj;
        if (this.A06 == r5.A06 && this.A08 == r5.A08) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A08 * 31) + this.A06;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Palette$Swatch");
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.A08));
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(A01()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.A06);
        sb.append(']');
        sb.append(" [Title Text: #");
        A00();
        sb.append(Integer.toHexString(this.A01));
        sb.append(']');
        sb.append(" [Body Text: #");
        A00();
        sb.append(Integer.toHexString(this.A00));
        sb.append(']');
        return sb.toString();
    }
}
