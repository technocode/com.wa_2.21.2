package X;

import android.view.View;

/* renamed from: X.1PJ  reason: invalid class name */
public class AnonymousClass1PJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public AnonymousClass1PJ(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.A06 = iArr[0];
        this.A07 = iArr[1];
        this.A02 = view.getTranslationX();
        this.A03 = view.getTranslationY();
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A05 = view.getWidth();
        this.A04 = view.getHeight();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1PJ)) {
            return false;
        }
        AnonymousClass1PJ r4 = (AnonymousClass1PJ) obj;
        if (r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A05 == this.A05 && r4.A04 == this.A04 && r4.A06 == this.A06 && r4.A07 == this.A07) {
            return true;
        }
        return false;
    }
}
