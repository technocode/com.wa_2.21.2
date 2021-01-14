package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xz  reason: invalid class name and case insensitive filesystem */
public class C21030xz {
    public final NativeHolder A00;

    public C21030xz(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public byte[] A00() {
        JniBridge.getInstance();
        return (byte[]) JniBridge.jvidispatchOIO(0, (long) 37, this.A00);
    }
}
