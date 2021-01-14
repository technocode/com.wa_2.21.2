package X;

import java.io.InputStream;

/* renamed from: X.2b7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52432b7 implements AnonymousClass2KN {
    public final /* synthetic */ C52482bC A00;
    public final /* synthetic */ byte[] A01;

    public /* synthetic */ C52432b7(C52482bC r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }

    @Override // X.AnonymousClass2KN
    public final InputStream A42(InputStream inputStream) {
        C52482bC r0 = this.A00;
        return new AnonymousClass2KI(inputStream, r0.A71().A3d(this.A01));
    }
}
