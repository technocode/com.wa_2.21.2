package X;

import android.os.Build;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
public class C07750Zj {
    public final Object A00;

    public C07750Zj() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A00 = new C30141an(this);
        } else {
            this.A00 = new C15060nK(this);
        }
    }

    public C07750Zj(Object obj) {
        this.A00 = obj;
    }
}
