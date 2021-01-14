package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.0gM  reason: invalid class name and case insensitive filesystem */
public class C11480gM implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C11480gM(byte[] bArr) {
        this.A01 = bArr;
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
