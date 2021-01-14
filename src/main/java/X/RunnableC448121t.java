package X;

import com.whatsapp.util.Log;

/* renamed from: X.21t  reason: invalid class name and case insensitive filesystem */
public class RunnableC448121t implements Runnable, AnonymousClass1XK {
    public final AnonymousClass02N A00;
    public final AnonymousClass1Xa A01;

    public RunnableC448121t(AnonymousClass02N r1, AnonymousClass1Xa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1XK
    public void AN9(int i) {
        AnonymousClass008.A0u("locationsunsubscriberesponsehandler/error ", i);
    }

    public void run() {
        Log.i("locationsunsubscriberesponsehandler/success");
    }
}
