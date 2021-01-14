package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1Tn  reason: invalid class name and case insensitive filesystem */
public class C28261Tn extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass01A A00;

    public C28261Tn(AnonymousClass01A r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        Locale locale;
        Log.d("vname: purging cached contacts not matching current locale");
        AnonymousClass01A r1 = this.A00;
        Locale A0I = r1.A0A.A0I();
        Map map = r1.A02.A01;
        synchronized (map) {
            HashSet<AnonymousClass02N> hashSet = null;
            for (Map.Entry entry : map.entrySet()) {
                AnonymousClass02N r12 = (AnonymousClass02N) entry.getKey();
                C007003k r0 = (C007003k) entry.getValue();
                if (!(r12 == null || r0 == null || (locale = r0.A0P) == null || A0I.equals(locale))) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r12);
                }
            }
            if (hashSet != null) {
                for (AnonymousClass02N r02 : hashSet) {
                    map.remove(r02);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("vname: purged ");
                sb.append(hashSet.size());
                sb.append(" contact cache entries");
                Log.d(sb.toString());
            }
        }
    }
}
