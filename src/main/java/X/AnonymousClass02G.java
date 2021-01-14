package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: X.02G  reason: invalid class name */
public class AnonymousClass02G implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public Map A04 = new HashMap();
    public boolean A05;
    public final int A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final AnonymousClass02F A08;
    public final AnonymousClass02E A09;
    public final Object A0A = new Object();
    public final Object A0B = new Object();
    public final String A0C = UUID.randomUUID().toString();
    public final Map A0D = new HashMap();
    public final boolean A0E;

    public AnonymousClass02G(AnonymousClass02F r6, boolean z, AnonymousClass02E r8, int i) {
        this.A08 = r6;
        this.A0E = z;
        this.A09 = r8;
        this.A06 = i;
        synchronized (this.A0A) {
            this.A05 = false;
        }
        this.A09.A00(this.A06, new RunnableEBaseShape3S0100000_I0_3(this, 41), false);
    }

    public final void A00() {
        while (!this.A05) {
            try {
                this.A0A.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    public final void A01(AnonymousClass0Qs r6, boolean z) {
        boolean z2;
        RunnableEBaseShape0S0210000_I0 runnableEBaseShape0S0210000_I0 = new RunnableEBaseShape0S0210000_I0(this, r6, z, 10);
        if (z) {
            synchronized (this.A0A) {
                z2 = false;
                if (this.A00 == 1) {
                    z2 = true;
                }
            }
            if (z2) {
                runnableEBaseShape0S0210000_I0.run();
                return;
            }
        }
        this.A09.A00(this.A06, runnableEBaseShape0S0210000_I0, true ^ z);
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A0A) {
            A00();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A0A) {
            A00();
        }
        return new AnonymousClass0Qq(this);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A0A) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        synchronized (this.A0A) {
            A00();
            Boolean bool = (Boolean) this.A04.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public float getFloat(String str, float f) {
        synchronized (this.A0A) {
            A00();
            Float f2 = (Float) this.A04.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public int getInt(String str, int i) {
        synchronized (this.A0A) {
            A00();
            Integer num = (Integer) this.A04.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public long getLong(String str, long j) {
        synchronized (this.A0A) {
            A00();
            Long l = (Long) this.A04.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public String getString(String str, String str2) {
        synchronized (this.A0A) {
            A00();
            String str3 = (String) this.A04.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        synchronized (this.A0A) {
            A00();
            Set set2 = (Set) this.A04.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        Handler handler = this.A07;
        synchronized (this.A0A) {
            Map map = this.A0D;
            if (str != null) {
                WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    map.put(str, weakHashMap);
                }
                if (onSharedPreferenceChangeListener == null) {
                    throw null;
                } else if (handler != null) {
                    weakHashMap.put(onSharedPreferenceChangeListener, handler);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        synchronized (this.A0A) {
            Map map = this.A0D;
            if (str != null) {
                Map map2 = (Map) map.get(str);
                if (map2 != null) {
                    if (onSharedPreferenceChangeListener != null) {
                        map2.remove(onSharedPreferenceChangeListener);
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
