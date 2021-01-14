package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xv  reason: invalid class name and case insensitive filesystem */
public class C20990xv {
    public final NativeHolder A00;

    public C20990xv(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C20990xv(String str, String str2, int i) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIOO(1, (long) i, str, str2);
            return;
        }
        throw null;
    }
}
