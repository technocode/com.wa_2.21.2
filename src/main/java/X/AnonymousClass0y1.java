package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0y1  reason: invalid class name */
public class AnonymousClass0y1 {
    public final NativeHolder A00;

    public AnonymousClass0y1(byte[] bArr, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIO(10, j, bArr);
            return;
        }
        throw null;
    }
}
