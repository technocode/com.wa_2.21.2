package X;

import android.os.IBinder;

/* renamed from: X.1cB  reason: invalid class name */
public class AnonymousClass1cB implements AbstractC17380rR {
    public final IBinder A00;

    public AnonymousClass1cB(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass1cB) && ((AnonymousClass1cB) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
