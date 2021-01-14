package X;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.1Es  reason: invalid class name */
public final class AnonymousClass1Es extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!FirebaseInstanceId.A03()) {
            return AnonymousClass1Et.class;
        }
        Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
        return AnonymousClass1Et.class;
    }
}
