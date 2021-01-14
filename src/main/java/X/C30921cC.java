package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
public class C30921cC implements AbstractC17380rR {
    public final WindowId A00;

    public C30921cC(View view) {
        this.A00 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C30921cC) && ((C30921cC) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
