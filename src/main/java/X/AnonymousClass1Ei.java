package X;

import android.os.Bundle;
import android.util.Log;

/* renamed from: X.1Ei  reason: invalid class name */
public abstract class AnonymousClass1Ei {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C24611Bq A03 = new C24611Bq();

    public AnonymousClass1Ei(int i, int i2, Bundle bundle) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }

    public final void A00(C25061Eh r7) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(r7);
            Log.d("MessengerIpcClient", AnonymousClass008.A09(valueOf2.length() + valueOf.length() + 14, "Failing ", valueOf, " with ", valueOf2));
        }
        this.A03.A00.A07(r7);
    }

    public final void A01(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            Log.d("MessengerIpcClient", AnonymousClass008.A09(valueOf2.length() + valueOf.length() + 16, "Finishing ", valueOf, " with ", valueOf2));
        }
        this.A03.A00.A08(obj);
    }

    public String toString() {
        boolean z;
        int i = this.A00;
        int i2 = this.A01;
        if (!(this instanceof C37011nO)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
