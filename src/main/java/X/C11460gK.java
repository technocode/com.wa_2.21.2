package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.0gK  reason: invalid class name and case insensitive filesystem */
public class C11460gK implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C11460gK(byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            this.A01 = bArr;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Wrong length: ");
        A0S.append(length);
        throw new IllegalArgumentException(A0S.toString());
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
