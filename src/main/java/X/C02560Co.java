package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.0Co  reason: invalid class name and case insensitive filesystem */
public class C02560Co {
    public static final C02560Co A01 = new C02560Co();
    public final HashMap A00 = new HashMap();

    public C60602pn A00(AnonymousClass0M4 r3) {
        C60602pn r0;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            r0 = (C60602pn) hashMap.get(r3);
        }
        return r0;
    }

    public void A01(AnonymousClass0M4 r4, String str) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (hashMap.remove(r4) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaDataHelper/removeDownloader/successfully remove downloader for mediaDataV2 = ");
                sb.append(r4);
                sb.append("mediaHash=");
                sb.append(str);
                Log.d(sb.toString());
            }
        }
    }
}
