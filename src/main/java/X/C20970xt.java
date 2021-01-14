package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xt  reason: invalid class name and case insensitive filesystem */
public class C20970xt {
    public final NativeHolder A00;

    public C20970xt(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C20970xt(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, long j, String str, String str2) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIIIOOOOO((long) i, j, 0, str, str2, bArr, bArr2, bArr3);
            return;
        }
        throw null;
    }
}
