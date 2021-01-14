package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public class C20950xr {
    public static volatile C20950xr A01;
    public final JniBridge A00;

    public C20950xr(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static C20950xr A00() {
        if (A01 == null) {
            synchronized (C20950xr.class) {
                if (A01 == null) {
                    A01 = new C20950xr(JniBridge.getInstance());
                }
            }
        }
        return A01;
    }
}
