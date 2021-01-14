package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2xN  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC64012xN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C64022xO A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC64012xN(C64022xO r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C64022xO r2 = this.A00;
        int height = r2.A05.getHeight();
        if (height != r2.A03) {
            r2.A03 = height;
            int i = r2.A01;
            int i2 = (i * 3) >> 2;
            int i3 = height % i;
            if (i3 >= (i >> 2) && i3 <= i2) {
                i2 = i3;
            }
            int max = Math.max(0, height - i2);
            r2.A02 = (max % i) / ((max / i) + 1);
        }
        int width = r2.A05.getWidth();
        if (r2.A04 != width) {
            r2.A04 = width;
            int i4 = width / r2.A01;
            if (r2.A00 != i4) {
                r2.A00 = i4;
                r2.A08.A1N(i4);
                AnonymousClass3QG r0 = r2.A06;
                if (r0 != null) {
                    ((AbstractC16300pa) r0).A01.A00();
                }
            }
            AnonymousClass3QG r02 = r2.A06;
            if (r02 != null) {
                ((AbstractC16300pa) r02).A01.A00();
            }
        }
    }
}
