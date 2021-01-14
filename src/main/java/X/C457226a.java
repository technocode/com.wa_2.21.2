package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.26a  reason: invalid class name and case insensitive filesystem */
public final class C457226a implements AbstractC36061lW {
    public final Status A00;
    public final C36081lY A01;

    public C457226a(Status status, C36081lY r2) {
        this.A00 = status;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass17C
    public final Status A9C() {
        return this.A00;
    }

    @Override // X.AbstractC36061lW
    public final String A6z() {
        C36081lY r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }
}
