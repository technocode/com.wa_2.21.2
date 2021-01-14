package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.1b0  reason: invalid class name and case insensitive filesystem */
public class ServiceC30241b0 extends Service implements AbstractC005102k {
    public final C15620oO A00 = new C15620oO(this);

    @Override // X.AbstractC005102k
    public AbstractC013907w A75() {
        return this.A00.A02;
    }

    public IBinder onBind(Intent intent) {
        this.A00.A00(AnonymousClass082.ON_START);
        return null;
    }

    public void onCreate() {
        this.A00.A00(AnonymousClass082.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C15620oO r1 = this.A00;
        r1.A00(AnonymousClass082.ON_STOP);
        r1.A00(AnonymousClass082.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.A00.A00(AnonymousClass082.ON_START);
        super.onStart(intent, i);
    }
}
