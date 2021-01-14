package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.UUID;

/* renamed from: X.09v  reason: invalid class name and case insensitive filesystem */
public class C018909v {
    public static volatile C018909v A03;
    public long A00;
    public String A01 = UUID.randomUUID().toString().substring(0, 8);
    public final AnonymousClass00S A02;

    public C018909v(AnonymousClass00S r4) {
        this.A02 = r4;
        this.A00 = r4.A01();
    }

    public static void A00(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            Log.e(th);
        } else if (th == null) {
            Log.e(str);
        } else {
            Log.e(str, th);
        }
    }

    public void A01() {
        AnonymousClass00S r5 = this.A02;
        if (Math.abs(r5.A01() - this.A00) > 300) {
            this.A01 = UUID.randomUUID().toString().substring(0, 8);
        }
        this.A00 = r5.A01();
    }
}
