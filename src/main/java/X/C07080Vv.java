package X;

import android.content.Context;

/* renamed from: X.0Vv  reason: invalid class name and case insensitive filesystem */
public class C07080Vv {
    public C222910v A00;
    public final int A01;
    public final Context A02;
    public final Object A03;

    public C07080Vv(Context context, Object obj, int i, C222910v r4) {
        this.A02 = context;
        this.A01 = i;
        this.A00 = r4;
        this.A03 = obj;
    }

    public C222910v A00() {
        C222910v r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Trying to access the LayoutCache from outside a layout call");
    }
}
