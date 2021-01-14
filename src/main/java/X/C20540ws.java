package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.Executors;

/* renamed from: X.0ws  reason: invalid class name and case insensitive filesystem */
public class C20540ws {
    public final int A00;
    public final C19750vY A01;
    public final AbstractC19950vs A02;
    public final AbstractC19980vv A03;
    public final C32761fY A04;
    public final AbstractC20520wq A05;
    public final C20560wu A06 = new C20560wu();
    public final C20600wy A07;
    public final C20780xH A08;

    /* JADX INFO: finally extract failed */
    public C20540ws(C20530wr r4) {
        C32501f3 r0;
        C20810xN.A00();
        Context context = r4.A05;
        this.A02 = new C32801fc((ActivityManager) context.getSystemService("activity"));
        this.A04 = new C32761fY();
        synchronized (C20450wj.class) {
            if (C20450wj.A00 == null) {
                C20450wj.A00 = new C20450wj();
            }
        }
        if (context != null) {
            synchronized (C20470wl.class) {
                if (C20470wl.A00 == null) {
                    C20470wl.A00 = new C20470wl();
                }
            }
            try {
                C20810xN.A00();
                C19750vY r02 = new C19750vY(new C19740vX(context));
                C20810xN.A00();
                this.A01 = r02;
                synchronized (C32501f3.class) {
                    r0 = C32501f3.A00;
                    if (r0 == null) {
                        r0 = new C32501f3();
                        C32501f3.A00 = r0;
                    }
                }
                this.A03 = r0;
                this.A00 = 30000;
                C20810xN.A00();
                Executors.newFixedThreadPool(3);
                C20810xN.A00();
                new C20760xF();
                C20780xH r03 = new C20780xH(new C20770xG());
                this.A08 = r03;
                this.A05 = new C32821ff(r03.A08.A03.A00);
                this.A07 = r4.A01;
                C20810xN.A00();
            } catch (Throwable th) {
                C20810xN.A00();
                throw th;
            }
        } else {
            throw null;
        }
    }
}
