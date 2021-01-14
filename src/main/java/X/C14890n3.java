package X;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;

/* renamed from: X.0n3  reason: invalid class name and case insensitive filesystem */
public final class C14890n3 {
    public final AbstractC14870n1 A00;

    public C14890n3(Context context, GestureDetector.OnGestureListener onGestureListener) {
        if (Build.VERSION.SDK_INT > 17) {
            this.A00 = new C30121al(context, onGestureListener);
        } else {
            this.A00 = new C30111ak(context, onGestureListener);
        }
    }
}
