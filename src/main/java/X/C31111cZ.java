package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.1cZ  reason: invalid class name and case insensitive filesystem */
public final class C31111cZ implements AbstractC17020qq {
    public final /* synthetic */ Context A00;

    public C31111cZ(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC17020qq
    public AbstractC17030qr A3C(C17010qp r6) {
        Context context = this.A00;
        String str = r6.A02;
        AbstractC17000qo r1 = r6.A01;
        if (r1 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            C17010qp r0 = new C17010qp(context, str, r1, true);
            return new C30771bv(r0.A00, r0.A02, r0.A01, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
