package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.0IU  reason: invalid class name */
public class AnonymousClass0IU {
    public AnonymousClass0I0 A00 = null;
    public Map A01;
    public Set A02;
    public final AnonymousClass0IB A03;

    public AnonymousClass0IU(AnonymousClass0IB r2) {
        this.A03 = r2;
        A01();
    }

    public final void A00() {
        SharedPreferences sharedPreferences;
        Set<AnonymousClass0I0> set;
        try {
            AnonymousClass0I0 r0 = this.A00;
            if (r0 == null || !r0.A02()) {
                sharedPreferences = this.A03.A00;
                sharedPreferences.edit().remove("current_running_sync").apply();
            } else {
                AnonymousClass0IB r2 = this.A03;
                String A012 = this.A00.A01();
                sharedPreferences = r2.A00;
                sharedPreferences.edit().putString("current_running_sync", A012).apply();
            }
        } catch (JSONException unused) {
            sharedPreferences = this.A03.A00;
            sharedPreferences.edit().remove("current_running_sync").apply();
        }
        if (this.A02.isEmpty()) {
            sharedPreferences.edit().remove("queued_running_sync_set").apply();
            return;
        }
        HashSet hashSet = new HashSet();
        synchronized (this) {
            set = this.A02;
        }
        for (AnonymousClass0I0 r1 : set) {
            try {
                if (r1.A02()) {
                    hashSet.add(r1.A01());
                }
            } catch (JSONException unused2) {
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (isEmpty) {
            edit.remove("queued_running_sync_set").apply();
        } else {
            edit.putStringSet("queued_running_sync_set", hashSet).apply();
        }
    }

    public synchronized void A01() {
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    public synchronized void A02(AnonymousClass0I0 r3, Runnable runnable, long j) {
        this.A02.add(r3);
        this.A01.put(r3, new C06080Rq(runnable, j));
        A00();
    }
}
