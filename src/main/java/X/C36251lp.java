package X;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.1lp  reason: invalid class name and case insensitive filesystem */
public final class C36251lp extends AbstractC24661Bw {
    public boolean A00 = true;
    public final C36281ls A01;
    public final AnonymousClass1C6 A02 = new AnonymousClass1C6();
    public final Object A03 = new Object();

    public final void finalize() {
        try {
            synchronized (this.A03) {
                if (this.A00) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    A00();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public C36251lp(C36281ls r2) {
        this.A01 = r2;
    }

    @Override // X.AbstractC24661Bw
    public final void A00() {
        super.A00();
        synchronized (this.A03) {
            if (this.A00) {
                C36281ls r1 = this.A01;
                synchronized (r1.A03) {
                    if (((AbstractC24381Ai) r1).A00 != null) {
                        try {
                            ((AnonymousClass1C3) r1.A00()).ASN();
                        } catch (RemoteException e) {
                            Log.e(r1.A04, "Could not finalize native handle", e);
                        }
                    }
                }
                this.A00 = false;
            }
        }
    }
}
