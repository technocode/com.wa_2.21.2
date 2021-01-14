package X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.0Ig  reason: invalid class name and case insensitive filesystem */
public class C03910Ig implements AbstractC03920Ih {
    public static volatile C03910Ig A05;
    public boolean A00;
    public final C03930Ii A01;
    public final C04000Ip A02;
    public final C04010Iq A03;
    public final C03950Ik A04;

    public C03910Ig(AnonymousClass00G r3, C03930Ii r4, AnonymousClass04q r5, C03950Ik r6, C04000Ip r7) {
        this.A01 = r4;
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = new C04010Iq(r3.A00, r5);
    }

    public static C03910Ig A00() {
        if (A05 == null) {
            synchronized (C03910Ig.class) {
                if (A05 == null) {
                    A05 = new C03910Ig(AnonymousClass00G.A01, C03930Ii.A00(), AnonymousClass04q.A00(), C03950Ik.A00(), new C04000Ip(EnumC03970Im.values()));
                }
            }
        }
        return A05;
    }

    public static final LinkedHashSet A01(List list, HashSet hashSet) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!hashSet.isEmpty()) {
            for (Object obj : list) {
                if (hashSet.contains(obj)) {
                    linkedHashSet.add(obj);
                    hashSet.remove(obj);
                }
            }
        }
        return linkedHashSet;
    }

    public static final void A02(AnonymousClass0BK r4) {
        AnonymousClass008.A0t("emojidictionarystore/clearall/count=", r4.A01("emoji_search_tag", "type=?", new String[]{String.valueOf(1)}, "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG"));
    }

    public List A03(String str, int i, List list, List list2, boolean z) {
        String trim = str.trim();
        String A042 = C003701u.A04(trim);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            linkedHashSet.addAll(A04(i, A042, list, list2, true));
        } else if (TextUtils.isEmpty(trim)) {
            linkedHashSet.addAll(list);
            linkedHashSet.addAll(list2);
        } else {
            linkedHashSet.addAll(A04(i - linkedHashSet.size(), A042, list, list2, true));
            if (linkedHashSet.size() < i) {
                linkedHashSet.addAll(A04(i - linkedHashSet.size(), A042, list, list2, false));
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C03960Il r5 = (C03960Il) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            int[] iArr = r5.A00;
            if (iArr.length == 1) {
                C03960Il r2 = new C03960Il(new int[]{iArr[0], 65039});
                if (EmojiDescriptor.A00(new AnonymousClass2d1(r2.A00), true) != -1) {
                    arrayList.add(r2);
                }
            }
            if (EmojiDescriptor.A00(new AnonymousClass2d1(iArr), false) != -1) {
                arrayList.add(r5);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r1 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A04(int r10, java.lang.String r11, java.util.List r12, java.util.List r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03910Ig.A04(int, java.lang.String, java.util.List, java.util.List, boolean):java.util.Set");
    }

    @Override // X.AbstractC03920Ih
    public void A2f() {
        AnonymousClass0BK A012 = this.A03.A01();
        SQLiteDatabase sQLiteDatabase = A012.A00;
        sQLiteDatabase.beginTransaction();
        try {
            A02(A012);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // X.AbstractC03920Ih
    public Collection A4D(String str, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : this.A01.A02()) {
            arrayList.add(new C03960Il(iArr));
        }
        C03950Ik r3 = this.A04;
        List list = r3.A00;
        List list2 = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            String string = r3.A01.A00.getString("top_emojis", null);
            if (string != null) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList2.add(C002001d.A0w(jSONArray.getString(i2)));
                    }
                    r3.A00 = arrayList2;
                    list2 = arrayList2;
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder("topemojisstore/get-top-emojis/failed ");
                    sb.append(e);
                    Log.e(sb.toString());
                    list2 = C03950Ik.A02;
                }
            } else {
                list2 = C03950Ik.A02;
            }
        }
        return A03(str, i, arrayList, list2, z2);
    }

    @Override // X.AbstractC03920Ih
    public void AOP(boolean z) {
        this.A00 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r0;
     */
    @Override // X.AbstractC03920Ih
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r5 = this;
            X.0Iq r0 = r5.A03
            X.0BK r4 = r0.A00()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = 0
            r3[r2] = r0
            java.lang.String r1 = "SELECT count(*) FROM emoji_search_tag WHERE type=?"
            java.lang.String r0 = "GET_COUNT_EMOJI_SEARCH_TAG"
            android.database.Cursor r1 = r4.A07(r1, r3, r0)
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0022
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x0026 }
        L_0x0022:
            r1.close()
            return r2
        L_0x0026:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03910Ig.getCount():int");
    }
}
