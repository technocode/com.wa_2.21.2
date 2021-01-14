package X;

import android.webkit.ValueCallback;
import com.whatsapp.util.Log;

/* renamed from: X.1KB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1KB implements ValueCallback {
    public static final /* synthetic */ AnonymousClass1KB A00 = new AnonymousClass1KB();

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Log.e("WaInappBrowsingActivity/onCreate: Safe browsing not allowed");
    }
}
