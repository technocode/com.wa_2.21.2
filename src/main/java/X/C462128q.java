package X;

import java.util.List;

/* renamed from: X.28q  reason: invalid class name and case insensitive filesystem */
public final class C462128q extends AnonymousClass25Z {
    public final AnonymousClass14W A00;

    public C462128q(List list) {
        byte[] bArr = (byte[]) list.get(0);
        this.A00 = new AnonymousClass14W(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }
}
