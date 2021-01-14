package X;

import com.google.android.search.verification.client.R;
import java.util.HashMap;

/* renamed from: X.1Vn  reason: invalid class name and case insensitive filesystem */
public class C28731Vn {
    public static final C28731Vn A01 = new C28731Vn();
    public final AnonymousClass0PU A00;

    public C28731Vn() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.whatsapp.intrumentation.sample", Integer.valueOf((int) R.string.instrumentation_sample_device_name));
        hashMap.put("com.facebook.assistantplayground", Integer.valueOf((int) R.string.assistant_playground_device_name));
        Integer valueOf = Integer.valueOf((int) R.string.stella_device_name);
        hashMap.put("com.facebook.stella_debug", valueOf);
        hashMap.put("com.facebook.stella", valueOf);
        this.A00 = new AnonymousClass0PU(hashMap, null);
    }
}
