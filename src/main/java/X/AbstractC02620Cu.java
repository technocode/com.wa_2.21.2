package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Cu  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC02620Cu {
    public static final HashMap A0G = new C02630Cv();
    public long A00 = 0;
    public AnonymousClass2NI A01 = null;
    public final SparseArray A02 = new SparseArray();
    public final SparseArray A03 = new SparseArray();
    public final SparseIntArray A04 = new SparseIntArray();
    public final AnonymousClass009 A05;
    public final AnonymousClass0CL A06;
    public final AnonymousClass04j A07;
    public final AnonymousClass00S A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass00D A0A;
    public final C02640Cw A0B;
    public final C02660Cy A0C;
    public final AnonymousClass03U A0D;
    public final AnonymousClass00T A0E;
    public final List A0F = new ArrayList();

    public abstract boolean A0F(AbstractC28621Va v, String str, int i);

    public AbstractC02620Cu(AnonymousClass00G r3, AnonymousClass00S r4, AnonymousClass009 r5, AnonymousClass00T r6, AnonymousClass0CL r7, C02640Cw r8, AnonymousClass03U r9, AnonymousClass04j r10, C02660Cy r11, AnonymousClass00D r12) {
        this.A09 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A0E = r6;
        this.A06 = r7;
        this.A0B = r8;
        this.A0D = r9;
        this.A07 = r10;
        this.A0C = r11;
        this.A0A = r12;
    }

    public synchronized int A00(int i) {
        return this.A04.get(i, 0);
    }

    public synchronized AnonymousClass2NI A01() {
        AnonymousClass2NI r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        try {
            AnonymousClass00D r02 = this.A0A;
            String A032 = A03();
            SharedPreferences sharedPreferences = r02.A00;
            StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
            sb.append(A032);
            String string = sharedPreferences.getString(sb.toString(), null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            AnonymousClass2NI A002 = AnonymousClass2NI.A00(string);
            this.A01 = A002;
            return A002;
        } catch (JSONException e) {
            AnonymousClass009 r2 = this.A05;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
            sb2.append(A03());
            sb2.append(e.getMessage());
            C002001d.A2u(r2, sb2.toString());
            return null;
        }
    }

    public Object A02() {
        if (this instanceof C59502nm) {
            C59502nm r0 = (C59502nm) this;
            synchronized (this) {
                HashMap A0L = r0.A0L();
                if (A0L.isEmpty()) {
                    return null;
                }
                return A0L;
            }
        } else if (!(this instanceof C02600Cs)) {
            AnonymousClass0D0 r02 = (AnonymousClass0D0) this;
            synchronized (this) {
                SparseArray sparseArray = r02.A00;
                if (sparseArray == null || sparseArray.size() == 0) {
                    return null;
                }
                return sparseArray;
            }
        } else {
            throw new UnsupportedOperationException("EmojiManager/getContent/Not implemented");
        }
    }

    public String A03() {
        if (!(this instanceof C59502nm)) {
            return !(this instanceof C02600Cs) ? "doodle_emoji" : "emoji";
        }
        return "filter";
    }

    public Map A04(String str, int i, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        if (str2 != null) {
            hashMap.put("locale", str2);
        }
        if (str3 != null) {
            hashMap.put("existing_id", str3);
        }
        if (str4 != null) {
            hashMap.put("version", str4);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 == 3) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r8) {
        /*
            r7 = this;
            int r2 = r7.A00(r8)
            r6 = 0
            r0 = 1
            if (r2 == r0) goto L_0x000c
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            X.AnonymousClass00E.A07(r0)
            long r2 = r7.A00
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x001a
            r0 = 1
        L_0x001a:
            X.AnonymousClass00E.A07(r0)
            X.00S r0 = r7.A08
            long r2 = r0.A05()
            long r0 = r7.A00
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            r6 = 1
        L_0x002b:
            X.AnonymousClass00E.A07(r6)
            r7.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02620Cu.A05(int):void");
    }

    public final synchronized void A06(int i) {
        this.A02.put(i, Long.valueOf(this.A08.A05()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01df, code lost:
        if (r20 == 2) goto L_0x01e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02620Cu.A07(int, int):void");
    }

    public synchronized void A08(int i, int i2) {
        SparseIntArray sparseIntArray = this.A04;
        int i3 = sparseIntArray.get(i2, 0);
        if (!(i3 == 3 && i == 3)) {
            if (i3 == 1) {
                if (i != 1) {
                }
            } else if (i3 == 3 && i == 1) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CategoryManager/setState/State change from ");
            HashMap hashMap = A0G;
            sb.append((String) hashMap.get(Integer.valueOf(i3)));
            sb.append(" to ");
            sb.append((String) hashMap.get(Integer.valueOf(i)));
            Log.d(sb.toString());
            sparseIntArray.put(i2, i);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap2 = A0G;
        sb2.append((String) hashMap2.get(Integer.valueOf(i3)));
        sb2.append(" to ");
        sb2.append((String) hashMap2.get(Integer.valueOf(i)));
        sb2.append("!");
        Log.e(sb2.toString());
    }

    public synchronized void A09(AnonymousClass2NH r5, int i) {
        int A002 = A00(i);
        if (A002 == 3 || A002 == 1) {
            Log.d("CategoryManager/registerCallback/Registering user callback");
            this.A0F.add(r5);
        } else if (A002 == 4 || A002 == 2) {
            Log.d("CategoryManager/registerCallback/Servicing on error");
            r5.AFX();
        } else if (A002 != 5 || A02() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("CategoryManager/registerCallback/Unexpected state encountered - ");
            sb.append((String) A0G.get(Integer.valueOf(A002)));
            Log.e(sb.toString());
            r5.AFX();
        } else {
            Log.d("CategoryManager/registerCallback/Servicing on success");
            Object A022 = A02();
            if (A022 != null) {
                r5.AJ3(A022);
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass2NI r19, int r20, java.lang.String r21, long r22, X.AnonymousClass0CZ r24) {
        /*
        // Method dump skipped, instructions count: 571
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02620Cu.A0A(X.2NI, int, java.lang.String, long, X.0CZ):void");
    }

    public void A0B(String str) {
        if (this instanceof C59502nm) {
            C59502nm r1 = (C59502nm) this;
            synchronized (r1) {
                r1.A00.clear();
            }
        } else if (this instanceof C02600Cs) {
        }
    }

    public final synchronized void A0C(String str) {
        List<AnonymousClass2NH> list = this.A0F;
        if (!list.isEmpty()) {
            if (str == null || A02() == null) {
                Log.d("CategoryManager/serviceCallbacks/Servicing callbacks on error.");
                for (AnonymousClass2NH r0 : list) {
                    r0.AFX();
                }
            } else {
                Log.d("CategoryManager/serviceCallbacks/Servicing callbacks on success.");
                for (AnonymousClass2NH r1 : list) {
                    r1.AJ3(A02());
                }
            }
            list.clear();
        }
    }

    public synchronized void A0D(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            this.A0A.A0Y(A03(), null);
            this.A01 = null;
        } else {
            AnonymousClass2NI r0 = this.A01;
            if (r0 == null) {
                this.A01 = new AnonymousClass2NI(A03(), str, str2, null, null);
            } else {
                r0.A03.put(Integer.toString(i), str);
            }
            try {
                AnonymousClass00D r5 = this.A0A;
                String A032 = A03();
                AnonymousClass2NI r3 = this.A01;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", r3.A01);
                jSONObject.put("locale_lang", r3.A00);
                jSONObject.put("url", r3.A02);
                jSONObject.put("bundles", new JSONObject(r3.A03));
                r5.A0Y(A032, jSONObject.toString());
            } catch (JSONException e) {
                AnonymousClass009 r2 = this.A05;
                StringBuilder sb = new StringBuilder();
                sb.append("CategoryManager/setLocalIdHash/json exception while setting local category info for ");
                sb.append(A03());
                sb.append(e.getMessage());
                C002001d.A2u(r2, sb.toString());
            }
        }
    }

    public boolean A0E(int i) {
        if (!(this instanceof AbstractC02610Ct)) {
            if (((AnonymousClass0D0) this).A0G(i).get((i * 100) + 1) == null) {
                return false;
            }
            return true;
        }
        AbstractC02610Ct r1 = (AbstractC02610Ct) this;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        AnonymousClass00E.A06(z);
        return r1.A0I();
    }
}
