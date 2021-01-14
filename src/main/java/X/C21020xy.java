package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xy  reason: invalid class name and case insensitive filesystem */
public class C21020xy {
    public final NativeHolder A00;

    public C21020xy(int i, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOII((long) i, j);
            return;
        }
        throw null;
    }

    public C21020xy(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
