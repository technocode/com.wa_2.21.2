package X;

import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.0yh  reason: invalid class name and case insensitive filesystem */
public class C21410yh implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ AbstractC21140yF A01;
    public final /* synthetic */ C33091gB A02;

    public C21410yh(C33091gB r1, Point point, AbstractC21140yF r3) {
        this.A02 = r1;
        this.A00 = point;
        this.A01 = r3;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        EnumC21130yE r2;
        C33091gB r3 = this.A02;
        r3.A06 = z;
        r3.A07 = false;
        if (r3.A01) {
            r3.A00 = false;
        }
        if (z) {
            r2 = EnumC21130yE.SUCCESS;
        } else {
            r2 = EnumC21130yE.FAILED;
        }
        Point point = this.A00;
        r3.A00(((C21420yi) r3).A01, r2, point);
        r3.A00(this.A01, r2, point);
    }
}
