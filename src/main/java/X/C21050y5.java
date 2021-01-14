package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0y5  reason: invalid class name and case insensitive filesystem */
public class C21050y5 {
    public final NativeHolder A00;

    public C21050y5(byte[] bArr, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIO(9, j, bArr);
            return;
        }
        throw null;
    }
}
