package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.0qb  reason: invalid class name and case insensitive filesystem */
public class C16880qb {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public C16880qb(String str, Map map, Set set, Set set2) {
        Set unmodifiableSet;
        this.A00 = str;
        this.A01 = Collections.unmodifiableMap(map);
        this.A02 = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.A03 = unmodifiableSet;
    }

    /* JADX INFO: finally extract failed */
    public static C16880qb A00(AbstractC16990qn r22, String str) {
        C30761bu r2 = (C30761bu) r22;
        Cursor A002 = r2.A00(new C30741bs(AnonymousClass008.A0L("PRAGMA table_info(`", str, "`)")));
        HashMap hashMap = new HashMap();
        try {
            if (A002.getColumnCount() > 0) {
                int columnIndex = A002.getColumnIndex("name");
                int columnIndex2 = A002.getColumnIndex("type");
                int columnIndex3 = A002.getColumnIndex("notnull");
                int columnIndex4 = A002.getColumnIndex("pk");
                int columnIndex5 = A002.getColumnIndex("dflt_value");
                while (A002.moveToNext()) {
                    String string = A002.getString(columnIndex);
                    String string2 = A002.getString(columnIndex2);
                    boolean z = false;
                    if (A002.getInt(columnIndex3) != 0) {
                        z = true;
                    }
                    hashMap.put(string, new C16840qX(string, string2, z, A002.getInt(columnIndex4), A002.getString(columnIndex5), 2));
                }
            }
            A002.close();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
            sb.append(str);
            sb.append("`)");
            Cursor A003 = r2.A00(new C30741bs(sb.toString()));
            try {
                int columnIndex6 = A003.getColumnIndex("id");
                int columnIndex7 = A003.getColumnIndex("seq");
                int columnIndex8 = A003.getColumnIndex("table");
                int columnIndex9 = A003.getColumnIndex("on_delete");
                int columnIndex10 = A003.getColumnIndex("on_update");
                int columnIndex11 = A003.getColumnIndex("id");
                int columnIndex12 = A003.getColumnIndex("seq");
                int columnIndex13 = A003.getColumnIndex("from");
                int columnIndex14 = A003.getColumnIndex("to");
                int count = A003.getCount();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < count; i++) {
                    A003.moveToPosition(i);
                    arrayList.add(new C16860qZ(A003.getInt(columnIndex11), A003.getInt(columnIndex12), A003.getString(columnIndex13), A003.getString(columnIndex14)));
                }
                Collections.sort(arrayList);
                int count2 = A003.getCount();
                for (int i2 = 0; i2 < count2; i2++) {
                    A003.moveToPosition(i2);
                    if (A003.getInt(columnIndex7) == 0) {
                        int i3 = A003.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C16860qZ r8 = (C16860qZ) it.next();
                            if (r8.A00 == i3) {
                                arrayList2.add(r8.A02);
                                arrayList3.add(r8.A03);
                            }
                        }
                        hashSet.add(new C16850qY(A003.getString(columnIndex8), A003.getString(columnIndex9), A003.getString(columnIndex10), arrayList2, arrayList3));
                    }
                }
                A003.close();
                StringBuilder sb2 = new StringBuilder("PRAGMA index_list(`");
                sb2.append(str);
                sb2.append("`)");
                Cursor A004 = r2.A00(new C30741bs(sb2.toString()));
                try {
                    int columnIndex15 = A004.getColumnIndex("name");
                    int columnIndex16 = A004.getColumnIndex("origin");
                    int columnIndex17 = A004.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (!(columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1)) {
                        HashSet hashSet3 = new HashSet();
                        while (A004.moveToNext()) {
                            if ("c".equals(A004.getString(columnIndex16))) {
                                String string3 = A004.getString(columnIndex15);
                                boolean z2 = false;
                                if (A004.getInt(columnIndex17) == 1) {
                                    z2 = true;
                                }
                                Cursor A005 = r2.A00(new C30741bs(AnonymousClass008.A0L("PRAGMA index_xinfo(`", string3, "`)")));
                                try {
                                    int columnIndex18 = A005.getColumnIndex("seqno");
                                    int columnIndex19 = A005.getColumnIndex("cid");
                                    int columnIndex20 = A005.getColumnIndex("name");
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1) {
                                        A005.close();
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        while (A005.moveToNext()) {
                                            if (A005.getInt(columnIndex19) >= 0) {
                                                int i4 = A005.getInt(columnIndex18);
                                                treeMap.put(Integer.valueOf(i4), A005.getString(columnIndex20));
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(treeMap.size());
                                        arrayList4.addAll(treeMap.values());
                                        C16870qa r0 = new C16870qa(string3, z2, arrayList4);
                                        A005.close();
                                        hashSet3.add(r0);
                                    }
                                } catch (Throwable th) {
                                    A005.close();
                                    throw th;
                                }
                            }
                        }
                        A004.close();
                        hashSet2 = hashSet3;
                        return new C16880qb(str, hashMap, hashSet, hashSet2);
                    }
                    A004.close();
                    return new C16880qb(str, hashMap, hashSet, hashSet2);
                } catch (Throwable th2) {
                    A004.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                A003.close();
                throw th3;
            }
        } catch (Throwable th4) {
            A002.close();
            throw th4;
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C16880qb.class != obj.getClass()) {
            return false;
        }
        C16880qb r5 = (C16880qb) obj;
        String str = this.A00;
        if (str != null) {
            if (!str.equals(r5.A00)) {
                return false;
            }
        } else if (r5.A00 != null) {
            return false;
        }
        Map map = this.A01;
        if (map != null) {
            if (!map.equals(r5.A01)) {
                return false;
            }
        } else if (r5.A01 != null) {
            return false;
        }
        Set set2 = this.A02;
        if (set2 != null) {
            if (!set2.equals(r5.A02)) {
                return false;
            }
        } else if (r5.A02 != null) {
            return false;
        }
        Set set3 = this.A03;
        if (set3 == null || (set = r5.A03) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.A00;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.A01;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set set = this.A02;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("TableInfo{name='");
        AnonymousClass008.A1W(A0S, this.A00, '\'', ", columns=");
        A0S.append(this.A01);
        A0S.append(", foreignKeys=");
        A0S.append(this.A02);
        A0S.append(", indices=");
        A0S.append(this.A03);
        A0S.append('}');
        return A0S.toString();
    }
}
