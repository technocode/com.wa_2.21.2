package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0DU  reason: invalid class name */
public class AnonymousClass0DU {
    public static final String[] A02 = new String[0];
    public static volatile AnonymousClass0DU A03;
    public AnonymousClass0DV A00;
    public final AnonymousClass0DK A01;

    public AnonymousClass0DU(AnonymousClass0DK r1, AnonymousClass0DV r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static AnonymousClass0DU A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0DU.class) {
                if (A03 == null) {
                    AnonymousClass0DK A002 = AnonymousClass0DK.A00();
                    if (AnonymousClass0DV.A01 == null) {
                        synchronized (AnonymousClass0DV.class) {
                            if (AnonymousClass0DV.A01 == null) {
                                AnonymousClass0DV.A01 = new AnonymousClass0DV(C000300f.A00());
                            }
                        }
                    }
                    A03 = new AnonymousClass0DU(A002, AnonymousClass0DV.A01);
                }
            }
        }
        return A03;
    }

    public static final AnonymousClass0DM A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("device_id");
        int columnIndex2 = cursor.getColumnIndex("epoch");
        if (cursor.isNull(columnIndex) || cursor.isNull(columnIndex2)) {
            return null;
        }
        return new AnonymousClass0DM(cursor.getInt(columnIndex), cursor.getInt(columnIndex2));
    }

    public static final void A02(AnonymousClass0BK r3, String str, byte[] bArr, int i, String str2, boolean z, AnonymousClass0DM r9, byte[] bArr2) {
        long j;
        AnonymousClass1VB A0A = r3.A0A("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", "SyncdMutationsTable.INSERT_OR_REPLACE");
        A0A.A02();
        A0A.A07(1, str);
        if (bArr == null) {
            A0A.A04(2);
        } else {
            A0A.A08(2, bArr);
        }
        A0A.A06(3, (long) i);
        A0A.A07(4, str2);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        A0A.A06(5, j);
        A0A.A06(6, (long) r9.A01());
        A0A.A06(7, (long) r9.A02());
        if (bArr2 == null) {
            A0A.A04(8);
        } else {
            A0A.A08(8, bArr2);
        }
        if (A0A.A01() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public static final void A03(AnonymousClass0BK r5, String[] strArr) {
        AnonymousClass00E.A06(r5.A00.inTransaction());
        Iterator it = new AnonymousClass35P(strArr, 999).iterator();
        while (true) {
            AnonymousClass35O r1 = (AnonymousClass35O) it;
            if (r1.hasNext()) {
                String[] strArr2 = (String[]) r1.next();
                int length = strArr2.length;
                StringBuilder A0S = AnonymousClass008.A0S("DELETE FROM pending_mutations WHERE _id IN ( ");
                A0S.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                A0S.append(" )");
                r5.A0D(A0S.toString(), strArr2, "SyncdMutationsStore.deletePendingMutations");
            } else {
                return;
            }
        }
    }

    public static final void A04(AnonymousClass0BK r5, String[] strArr) {
        AnonymousClass00E.A06(r5.A00.inTransaction());
        Iterator it = new AnonymousClass35P(strArr, 999).iterator();
        while (true) {
            AnonymousClass35O r1 = (AnonymousClass35O) it;
            if (r1.hasNext()) {
                String[] strArr2 = (String[]) r1.next();
                int length = strArr2.length;
                StringBuilder A0S = AnonymousClass008.A0S("DELETE FROM syncd_mutations WHERE mutation_index IN ");
                A0S.append(AnonymousClass096.A01(length));
                r5.A0D(A0S.toString(), strArr2, "SyncdMutationsStore.deleteStoredMutations");
            } else {
                return;
            }
        }
    }

    public final AbstractC48162Ld A05(Cursor cursor) {
        AnonymousClass0DV r5 = this.A00;
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndex("are_dependencies_missing")) == 1) {
            z = true;
        }
        return r5.A00(z, cursor.getString(cursor.getColumnIndex("_id")), A01(cursor), cursor.getString(cursor.getColumnIndex("mutation_index")), cursor.getBlob(cursor.getColumnIndex("mutation_value")), cursor.getInt(cursor.getColumnIndex("mutation_version")), cursor.getBlob(cursor.getColumnIndex("operation")));
    }

    public final AbstractC48162Ld A06(Cursor cursor) {
        AnonymousClass0DV r5 = this.A00;
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndex("are_dependencies_missing")) == 1) {
            z = true;
        }
        AnonymousClass0DM A012 = A01(cursor);
        if (A012 != null) {
            return r5.A00(z, null, A012, cursor.getString(cursor.getColumnIndex("mutation_index")), cursor.getBlob(cursor.getColumnIndex("mutation_value")), cursor.getInt(cursor.getColumnIndex("mutation_version")), C48192Lg.A03.A01);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC48162Ld A07(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            X.0DK r0 = r5.A01     // Catch:{ Exception -> 0x0031 }
            X.0BK r3 = r0.A8g()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0031 }
            r0 = 0
            r1[r0] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "PendingMutationsTable.SELECT_BY_KEY"
            android.database.Cursor r1 = r3.A07(r2, r1, r0)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0021
            r1.close()
            return r4
        L_0x0021:
            X.2Ld r0 = r5.A05(r1)
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
            return r4
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "SyncdMutationsStore/findMutations exception on DB query "
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A07(java.lang.String):X.2Ld");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC48162Ld A08(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            X.0DK r0 = r5.A01     // Catch:{ Exception -> 0x0031 }
            X.0BK r3 = r0.A8g()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch FROM syncd_mutations WHERE mutation_index = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0031 }
            r0 = 0
            r1[r0] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "SyncdMutationsTable.SELECT_MUTATION_WITH_INDEX"
            android.database.Cursor r1 = r3.A07(r2, r1, r0)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0021
            r1.close()
            return r4
        L_0x0021:
            X.2Ld r0 = r5.A06(r1)
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
            return r4
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "SyncdMutationsStore/getStoredMutationWithIndex exception on DB query"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A08(java.lang.String):X.2Ld");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A09() {
        /*
            r7 = this;
            r6 = 2147483647(0x7fffffff, float:NaN)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0DK r0 = r7.A01     // Catch:{ Exception -> 0x003b }
            X.0BK r4 = r0.A8g()     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x003b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x003b }
            r2[r1] = r0     // Catch:{ Exception -> 0x003b }
            java.lang.String r0 = "PendingMutationsTable.SELECT_MUTATIONS"
            android.database.Cursor r1 = r4.A07(r3, r2, r0)     // Catch:{ Exception -> 0x003b }
        L_0x0020:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002e
            X.2Ld r0 = r7.A05(r1)     // Catch:{ all -> 0x0032 }
            r5.add(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0020
        L_0x002e:
            r1.close()
            return r5
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "SyncdMutationsStore/getPendingMutations(int) exception on DB query"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A09():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A(java.util.Set r8, int r9) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0A(java.util.Set, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0B(java.util.Collection r11) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0B(java.util.Collection):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(int r15, X.C48192Lg r16, java.lang.String r17, X.AnonymousClass0DM r18, java.lang.String r19, X.C77303fw r20) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0C(int, X.2Lg, java.lang.String, X.0DM, java.lang.String, X.3fw):void");
    }

    public final void A0D(AnonymousClass0BK r15, Collection collection) {
        byte[] A09;
        AnonymousClass00E.A06(r15.A00.inTransaction());
        ArrayList<AbstractC48162Ld> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC48162Ld r2 = (AbstractC48162Ld) it.next();
            C48192Lg r1 = r2.A05;
            if (r1 == C48192Lg.A03) {
                arrayList.add(r2);
            } else if (r1 == C48192Lg.A02) {
                arrayList2.add(r2);
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("Incorrect operation: ");
                A0S.append(r1);
                throw new IllegalStateException(A0S.toString());
            }
        }
        A04(r15, C48182Lf.A01(arrayList2));
        for (AbstractC48162Ld r12 : arrayList) {
            String A002 = AbstractC48162Ld.A00(r12.A03());
            C77303fw A012 = r12.A01();
            if (A012 == null) {
                A09 = null;
            } else {
                A09 = A012.A09();
            }
            int i = r12.A03;
            String str = r12.A06;
            boolean A022 = r12.A02();
            AnonymousClass0DM r122 = r12.A00;
            if (r122 != null) {
                A02(r15, A002, A09, i, str, A022, r122, r12.A02);
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AbstractC48162Ld r7) {
        /*
            r6 = this;
            X.0DK r0 = r6.A01
            X.0OQ r5 = r0.A01()
            X.0Rk r4 = r5.A00()     // Catch:{ all -> 0x0028 }
            X.0BK r3 = r5.A04     // Catch:{ all -> 0x0021 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0021 }
            r1 = 0
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x0021 }
            r2[r1] = r0     // Catch:{ all -> 0x0021 }
            A03(r3, r2)     // Catch:{ all -> 0x0021 }
            r4.A00()     // Catch:{ all -> 0x0021 }
            r4.close()
            r5.close()
            return
        L_0x0021:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0E(X.2Ld):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(java.util.Collection r4) {
        /*
            r3 = this;
            X.0DK r0 = r3.A01
            X.0OQ r2 = r0.A01()
            X.0Rk r1 = r2.A00()     // Catch:{ all -> 0x0020 }
            X.0BK r0 = r2.A04     // Catch:{ all -> 0x0019 }
            r3.A0D(r0, r4)     // Catch:{ all -> 0x0019 }
            r1.A00()     // Catch:{ all -> 0x0019 }
            r1.close()
            r2.close()
            return
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0F(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(java.util.Set r9) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0G(java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H() {
        /*
            r5 = this;
            r4 = 0
            X.0DK r0 = r5.A01     // Catch:{ Exception -> 0x0030 }
            X.0BK r3 = r0.A8g()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r2 = "SELECT _id FROM syncd_mutations LIMIT 1"
            r1 = 0
            java.lang.String r0 = "SyncdMutationsTable.SELECT_ANY_MUTATION"
            android.database.Cursor r2 = r3.A07(r2, r1, r0)     // Catch:{ Exception -> 0x0030 }
            if (r2 == 0) goto L_0x002f
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x001c
            r2.close()
            return r4
        L_0x001c:
            java.lang.String r1 = r2.getString(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0024
            r0 = 1
        L_0x0024:
            r2.close()
            return r0
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        L_0x002f:
            return r4
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "SyncdMutationsStore/hasStoredMutations exception on DB query"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DU.A0H():boolean");
    }
}
