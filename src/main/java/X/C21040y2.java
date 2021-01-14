package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0y2  reason: invalid class name and case insensitive filesystem */
public class C21040y2 {
    public final NativeHolder A00;

    public C21040y2(byte[] bArr, byte[] bArr2) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2);
            return;
        }
        throw null;
    }
}
