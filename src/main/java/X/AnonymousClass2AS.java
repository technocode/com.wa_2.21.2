package X;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2AS  reason: invalid class name */
public final class AnonymousClass2AS extends AnonymousClass29F {
    public final AnonymousClass1AQ A00;

    public AnonymousClass2AS(Context context, Looper looper, AnonymousClass176 r5, AnonymousClass177 r6, C238417u r7) {
        super(context, looper, r5, r6, r7);
        this.A00 = new AnonymousClass1AQ(context, ((AnonymousClass29F) this).A00);
    }

    @Override // X.AbstractC238217s, X.AbstractC34701j2
    public final void A3k() {
        AnonymousClass1AQ r3 = this.A00;
        synchronized (r3) {
            if (isConnected()) {
                try {
                    Map map = r3.A02;
                    synchronized (map) {
                        for (AnonymousClass26Z r1 : map.values()) {
                            if (r1 != null) {
                                ((AnonymousClass1AP) r3.A01.A00.A01()).ARy(new C35821kz(2, null, r1.asBinder(), null, null, null));
                            }
                        }
                        map.clear();
                    }
                    Map map2 = r3.A04;
                    synchronized (map2) {
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        map2.clear();
                    }
                    Map map3 = r3.A03;
                    synchronized (map3) {
                        Iterator it2 = map3.values().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        map3.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.A3k();
        }
    }
}
