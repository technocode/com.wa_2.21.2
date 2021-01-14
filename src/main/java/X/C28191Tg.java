package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Tg  reason: invalid class name and case insensitive filesystem */
public class C28191Tg {
    public static int A00(C04820Ly r9, C04820Ly r10) {
        long j = r9.A01;
        long j2 = r10.A01;
        if (j < j2) {
            if (!A05(r10, r9)) {
                return 3;
            }
            return 1;
        } else if (j <= j2) {
            boolean A05 = A05(r9, r10);
            boolean A052 = A05(r10, r9);
            if (!A05) {
                return A052 ? 1 : 3;
            }
            if (A052) {
                return 2;
            }
            return 0;
        } else if (A05(r9, r10)) {
            return 0;
        } else {
            return 3;
        }
    }

    public static C04820Ly A01(long j, long j2, List list) {
        AnonymousClass0OR r4 = (AnonymousClass0OR) C04820Ly.A04.AQb();
        if (list.size() <= 1000) {
            if (j > 0) {
                r4.A02();
                C04820Ly r1 = (C04820Ly) r4.A00;
                r1.A00 |= 1;
                r1.A01 = j;
            }
            if (j < j2) {
                r4.A02();
                C04820Ly r12 = (C04820Ly) r4.A00;
                r12.A00 |= 2;
                r12.A02 = j2;
            }
            if (!list.isEmpty()) {
                r4.A04(list);
            }
        } else {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, AnonymousClass2FR.A00);
            List subList = arrayList.subList(0, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            long j3 = ((AnonymousClass0QX) subList.get(subList.size() - 1)).A01;
            r4.A02();
            C04820Ly r13 = (C04820Ly) r4.A00;
            r13.A00 |= 1;
            r13.A01 = j3;
            if (j3 < j2) {
                r4.A02();
                C04820Ly r14 = (C04820Ly) r4.A00;
                r14.A00 |= 2;
                r14.A02 = j2;
            }
            r4.A04(subList);
        }
        return (C04820Ly) r4.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        if (r13 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01db, code lost:
        if (r3 != null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ea A[Catch:{ all -> 0x01da }, LOOP:0: B:57:0x00ea->B:85:0x01a0, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04820Ly A02(X.AnonymousClass01K r17, X.AnonymousClass02N r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 495
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28191Tg.A02(X.01K, X.02N, boolean):X.0Ly");
    }

    public static C04820Ly A03(C04820Ly r8, C04820Ly r9) {
        long max;
        int i = r8.A00;
        boolean z = false;
        if ((i & 1) == 1) {
            z = true;
        }
        long j = 0;
        if (z || (r9.A00 & 1) == 1) {
            max = Math.max(r8.A01, r9.A01);
        } else {
            max = 0;
        }
        if ((i & 2) == 2 || (r9.A00 & 2) == 2) {
            j = Math.max(r8.A02, r9.A02);
        }
        AbstractC04120Jd r6 = r8.A03;
        AbstractC04120Jd r5 = r9.A03;
        HashMap hashMap = new HashMap();
        A04(r6, max, hashMap);
        A04(r5, max, hashMap);
        return A01(max, j, new ArrayList(hashMap.values()));
    }

    public static void A04(List list, long j, HashMap hashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0QX r7 = (AnonymousClass0QX) it.next();
            AnonymousClass0N3 r3 = r7.A02;
            if (r3 == null) {
                r3 = AnonymousClass0N3.A05;
            }
            if (r3.A04 || r7.A01 >= j) {
                AnonymousClass0QX r6 = (AnonymousClass0QX) hashMap.get(r3);
                AnonymousClass0N3 r5 = r7.A02;
                if (r5 == null) {
                    r5 = AnonymousClass0N3.A05;
                }
                if (r6 != null && r6.A01 >= r7.A01) {
                    r7 = r6;
                }
                hashMap.put(r5, r7);
            }
        }
    }

    public static boolean A05(C04820Ly r8, C04820Ly r9) {
        HashSet hashSet = new HashSet();
        for (AnonymousClass0QX r0 : r8.A03) {
            AnonymousClass0N3 r02 = r0.A02;
            if (r02 == null) {
                r02 = AnonymousClass0N3.A05;
            }
            hashSet.add(r02);
        }
        for (AnonymousClass0QX r2 : r9.A03) {
            AnonymousClass0N3 r03 = r2.A02;
            if (r03 == null) {
                r03 = AnonymousClass0N3.A05;
            }
            if (!hashSet.contains(r03) && ((r2.A00 & 2) != 2 || r8.A01 <= r2.A01)) {
                return false;
            }
        }
        return true;
    }
}
