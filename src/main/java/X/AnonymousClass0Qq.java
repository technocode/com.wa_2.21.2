package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Qq  reason: invalid class name */
public final class AnonymousClass0Qq implements SharedPreferences.Editor {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final /* synthetic */ AnonymousClass02G A03;

    public AnonymousClass0Qq(AnonymousClass02G r2) {
        this.A03 = r2;
    }

    public final AnonymousClass0Qs A00() {
        Map map;
        ArrayList arrayList;
        long j;
        Object obj;
        boolean z;
        AnonymousClass02G r8 = this.A03;
        synchronized (r8.A0A) {
            if (r8.A00 > 0) {
                r8.A04 = new HashMap(r8.A04);
            }
            map = r8.A04;
            r8.A00++;
            boolean z2 = !r8.A0D.isEmpty();
            if (z2) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            synchronized (this.A01) {
                boolean z3 = false;
                if (this.A00) {
                    if (!map.isEmpty()) {
                        map.clear();
                        z = true;
                    } else {
                        z = false;
                    }
                    this.A00 = false;
                    z3 = z;
                }
                Map map2 = this.A02;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                    } else if (!map.containsKey(str) || (obj = map.get(str)) == null || !obj.equals(value)) {
                        map.put(str, value);
                    }
                    if (z2) {
                        arrayList.add(str);
                    }
                    z3 = true;
                }
                map2.clear();
                if (z3) {
                    r8.A01++;
                }
                j = r8.A01;
            }
        }
        return new AnonymousClass0Qs(j, arrayList, map);
    }

    public final void A01(AnonymousClass0Qs r8) {
        List list = r8.A01;
        if (list != null && list.size() != 0) {
            AnonymousClass02G r5 = this.A03;
            synchronized (r5.A0A) {
                Map map = r5.A0D;
                if (!map.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            String str = (String) list.get(size);
                            Map map2 = (Map) map.get(str);
                            if (map2 != null) {
                                A02(map2, str);
                            }
                            Map map3 = (Map) map.get(r5.A0C);
                            if (map3 != null) {
                                A02(map3, str);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void A02(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new RunnableEBaseShape0S1200000_I0(this, entry.getKey(), str, 16));
        }
    }

    public void apply() {
        AnonymousClass0Qs A002 = A00();
        this.A03.A01(A002, false);
        A01(A002);
    }

    public SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    public boolean commit() {
        AnonymousClass0Qs A002 = A00();
        this.A03.A01(A002, true);
        try {
            A002.A03.await();
            A01(A002);
            return A002.A04;
        } catch (InterruptedException e) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e);
            return false;
        }
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f));
        }
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.A01) {
            this.A02.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.A01) {
            this.A02.put(str, Long.valueOf(j));
        }
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.A01) {
            this.A02.put(str, set == null ? null : new HashSet(set));
        }
        return this;
    }

    public SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }
}
