package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Vv  reason: invalid class name and case insensitive filesystem */
public class C73193Vv extends AnonymousClass01C {
    public static volatile C73193Vv A00;

    public C73193Vv(AnonymousClass08H r1) {
        super(r1);
    }

    public static C73193Vv A00() {
        if (A00 == null) {
            synchronized (C73193Vv.class) {
                if (A00 == null) {
                    A00 = new C73193Vv(AnonymousClass08H.A00());
                }
            }
        }
        return A00;
    }

    public Integer A09(String str) {
        String A0B = A0B(str);
        if (A0B == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A0B));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("key-value-store/getIntProp/Invalid int value: ");
            sb.append(A0B);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public Long A0A(String str) {
        String A0B = A0B(str);
        if (A0B == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A0B));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("key-value-store/getLongProp/Invalid long value: ");
            sb.append(A0B);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B(java.lang.String r11) {
        /*
            r10 = this;
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "prop_value"
            r2 = 0
            r5[r2] = r0
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r2] = r11
            java.lang.String r4 = "wa_props"
            java.lang.String r6 = "prop_name=?"
            r8 = 0
            java.lang.String r9 = "CONTACT_PROPS"
            r3 = r10
            android.database.Cursor r1 = r3.A07(r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0029 }
            r1.close()
            return r0
        L_0x0029:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()
        L_0x0035:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73193Vv.A0B(java.lang.String):java.lang.String");
    }

    public List A0C(String str) {
        String A0B = A0B(str);
        if (A0B == null) {
            return null;
        }
        String[] split = A0B.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("key-value-store/getLongListProp/Invalid long value: ");
                sb.append(str2);
                Log.e(sb.toString(), e);
                return null;
            }
        }
        return arrayList;
    }

    public synchronized Set A0D(String str) {
        String A0B = A0B(str);
        HashSet hashSet = new HashSet();
        if (A0B == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = new JSONArray(A0B);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            return hashSet;
        } catch (JSONException e) {
            throw new IllegalStateException("key-value-store/getStringSetProp:", e);
        }
    }

    public final void A0E(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                A06("wa_props", "prop_name=?", new String[]{str});
                return;
            }
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("prop_name", str);
            contentValues.put("prop_value", str2);
            A08("wa_props", contentValues);
        } catch (IllegalArgumentException e) {
            String A0K = AnonymousClass008.A0K("key-value-store/unable to set prop:", str);
            if (A0K != null) {
                Log.e(A0K, e);
                return;
            }
            throw null;
        }
    }

    public synchronized void A0F(String str, Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        A0E(str, jSONArray.toString());
    }
}
