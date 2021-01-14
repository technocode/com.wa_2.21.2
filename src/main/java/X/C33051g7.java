package X;

import android.graphics.Point;

/* renamed from: X.1g7  reason: invalid class name and case insensitive filesystem */
public class C33051g7 implements AbstractC21140yF {
    public final /* synthetic */ CallableC21260yS A00;

    public C33051g7(CallableC21260yS r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21140yF
    public void AGE(EnumC21130yE r7, Point point) {
        C33081gA r5 = this.A00.A01;
        if (!r5.A0b) {
            synchronized (r5) {
                r5.A0C();
                r5.A0Z = r5.A0R.A00(new CallableC21270yT(r5), "reset_focus", 2000);
            }
        }
    }
}
