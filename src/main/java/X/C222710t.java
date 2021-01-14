package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.10t  reason: invalid class name and case insensitive filesystem */
public class C222710t {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C33451gn A03;

    public C222710t(C33451gn r1) {
        this.A03 = r1;
    }

    public static void A00(C222710t r6) {
        int i;
        if (r6.A02 != null) {
            C33451gn r4 = r6.A03;
            if (r4.A08 == null) {
                i = 0;
            } else {
                i = r4.getMountItemCount();
            }
            for (int i2 = r6.A00; i2 < i; i2++) {
                C223010x r2 = r4.A08[i2];
                if (r2 != null) {
                    if (r2.A01.A07.A04 == AnonymousClass11D.VIEW) {
                        r6.A00 = i2 + 1;
                        return;
                    } else if (r2.A03) {
                        ((Drawable) r2.A02).draw(r6.A02);
                    }
                }
            }
            r6.A00 = r6.A01;
        }
    }
}
