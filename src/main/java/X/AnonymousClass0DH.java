package X;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0DH  reason: invalid class name */
public class AnonymousClass0DH extends AnonymousClass019 implements AnonymousClass0By, AnonymousClass0DI, AnonymousClass0XS, AnonymousClass0DJ {
    public static volatile AnonymousClass0DH A0Q;
    public AnonymousClass2FT A00 = null;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass01I A04;
    public final C000300f A05;
    public final AnonymousClass0FD A06;
    public final AnonymousClass0FC A07;
    public final C02420Bx A08;
    public final AnonymousClass0F5 A09;
    public final C02750Dh A0A;
    public final AnonymousClass0DX A0B;
    public final C02410Bw A0C;
    public final AnonymousClass0DL A0D;
    public final AnonymousClass0DT A0E;
    public final AnonymousClass01A A0F;
    public final AnonymousClass00G A0G;
    public final AnonymousClass01Q A0H;
    public final C02430Bz A0I;
    public final AnonymousClass0DK A0J;
    public final AnonymousClass0DU A0K;
    public final AnonymousClass0AR A0L;
    public final AnonymousClass0C5 A0M;
    public final AnonymousClass00T A0N;
    public final C73193Vv A0O;
    public final AnonymousClass08H A0P;

    @Override // X.AnonymousClass0By
    public void AF0(C05350Oe r1, int i) {
    }

    @Override // X.AnonymousClass0By
    public void AF1(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF3(AnonymousClass1VI r1) {
    }

    @Override // X.AnonymousClass0DI
    public void AKs() {
    }

    public AnonymousClass0DH(AnonymousClass00G r24, AnonymousClass00S r25, AnonymousClass009 r26, AnonymousClass01I r27, AnonymousClass00T r28, AnonymousClass0AR r29, C000300f r30, AnonymousClass0DK r31, C73193Vv r32, AnonymousClass09H r33, AnonymousClass01A r34, AnonymousClass0DL r35, AnonymousClass0DT r36, AnonymousClass0C5 r37, AnonymousClass0DX r38, AnonymousClass08H r39, C02750Dh r40, AnonymousClass0DU r41, AnonymousClass0F0 r42, AnonymousClass01Q r43, AnonymousClass0F1 r44, AnonymousClass0F2 r45, AnonymousClass0F5 r46, C02430Bz r47, AnonymousClass0F3 r48, C02410Bw r49, C02420Bx r50, AnonymousClass0F6 r51, AnonymousClass0F7 r52, AnonymousClass0C3 r53, AnonymousClass0EU r54, AnonymousClass0F9 r55) {
        this.A0G = r24;
        this.A04 = r27;
        this.A0N = r28;
        this.A0L = r29;
        this.A05 = r30;
        this.A0J = r31;
        this.A0O = r32;
        this.A0F = r34;
        this.A0D = r35;
        this.A0E = r36;
        this.A0M = r37;
        this.A0B = r38;
        this.A0P = r39;
        this.A0A = r40;
        this.A0K = r41;
        this.A0H = r43;
        this.A09 = r46;
        this.A0I = r47;
        this.A0C = r49;
        this.A08 = r50;
        r54.A00(this);
        r55.A00(this);
        AnonymousClass0FC r8 = new AnonymousClass0FC(r25, r26, r35, r36, r38, r41, r44, r45, r46, r48, r49, r51, new AnonymousClass0FA(new Random()), new AnonymousClass0FB(this, r30, r49, r42));
        this.A07 = r8;
        this.A06 = new AnonymousClass0FD(r28, r33, r45, r46, r52, r8);
        r53.A00(this);
    }

    public static AnonymousClass0DH A00() {
        if (A0Q == null) {
            synchronized (AnonymousClass0DH.class) {
                if (A0Q == null) {
                    AnonymousClass00G r9 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass009 A003 = AnonymousClass009.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    AnonymousClass00T A005 = C002101e.A00();
                    AnonymousClass0AR A006 = AnonymousClass0AR.A00();
                    C000300f A007 = C000300f.A00();
                    AnonymousClass0DK A008 = AnonymousClass0DK.A00();
                    C73193Vv A009 = C73193Vv.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    AnonymousClass01A A0010 = AnonymousClass01A.A00();
                    AnonymousClass0DL A0011 = AnonymousClass0DL.A00();
                    AnonymousClass0DT A0012 = AnonymousClass0DT.A00();
                    AnonymousClass0C5 A0013 = AnonymousClass0C5.A00();
                    AnonymousClass0DX A0014 = AnonymousClass0DX.A00();
                    AnonymousClass08H A0015 = AnonymousClass08H.A00();
                    C02750Dh A0016 = C02750Dh.A00();
                    AnonymousClass0DU A0017 = AnonymousClass0DU.A00();
                    AnonymousClass0F0 A0018 = AnonymousClass0F0.A00();
                    AnonymousClass01Q A0019 = AnonymousClass01Q.A00();
                    AnonymousClass0F1 A0020 = AnonymousClass0F1.A00();
                    AnonymousClass0F2 A0021 = AnonymousClass0F2.A00();
                    if (AnonymousClass0F5.A01 == null) {
                        synchronized (AnonymousClass0F5.class) {
                            if (AnonymousClass0F5.A01 == null) {
                                AnonymousClass0F5.A01 = new AnonymousClass0F5(C02410Bw.A00());
                            }
                        }
                    }
                    AnonymousClass0F5 r31 = AnonymousClass0F5.A01;
                    C02430Bz A0022 = C02430Bz.A00();
                    AnonymousClass0F3 A0023 = AnonymousClass0F3.A00();
                    C02410Bw A0024 = C02410Bw.A00();
                    C02420Bx A0025 = C02420Bx.A00();
                    if (AnonymousClass0F6.A05 == null) {
                        synchronized (AnonymousClass0F6.class) {
                            if (AnonymousClass0F6.A05 == null) {
                                AnonymousClass0F6.A05 = new AnonymousClass0F6(AnonymousClass0CL.A00(), C000300f.A00(), AnonymousClass0CT.A00(), AnonymousClass00C.A00(), AnonymousClass0CW.A00());
                            }
                        }
                    }
                    AnonymousClass0F6 r36 = AnonymousClass0F6.A05;
                    if (AnonymousClass0F7.A03 == null) {
                        synchronized (AnonymousClass0F7.class) {
                            if (AnonymousClass0F7.A03 == null) {
                                C000300f A0026 = C000300f.A00();
                                AnonymousClass0F1 A0027 = AnonymousClass0F1.A00();
                                if (AnonymousClass0F8.A02 == null) {
                                    synchronized (AnonymousClass0F8.class) {
                                        if (AnonymousClass0F8.A02 == null) {
                                            AnonymousClass0F8.A02 = new AnonymousClass0F8(AnonymousClass0EJ.A01(), AnonymousClass00C.A00());
                                        }
                                    }
                                }
                                AnonymousClass0F7.A03 = new AnonymousClass0F7(A0026, A0027, AnonymousClass0F8.A02);
                            }
                        }
                    }
                    A0Q = new AnonymousClass0DH(r9, A002, A003, A004, A005, A006, A007, A008, A009, A012, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, r31, A0022, A0023, A0024, A0025, r36, AnonymousClass0F7.A03, AnonymousClass0C3.A00(), AnonymousClass0EU.A03, AnonymousClass0F9.A00);
                }
            }
        }
        return A0Q;
    }

    public static void A01(AnonymousClass0DH r1, boolean z) {
        synchronized (r1) {
            if (r1.A03 && z) {
                if (r1.A0I != null) {
                    Log.i("companion-device-manager/onCriticalAppStateDataSynced");
                } else {
                    throw null;
                }
            }
            r1.A02 = false;
            r1.A03 = false;
            if (z) {
                r1.A0B();
            }
        }
    }

    public final Pair A04(Collection collection, Collection collection2) {
        C73193Vv r2 = this.A0O;
        List A0G2 = AnonymousClass1VY.A0G(UserJid.class, r2.A0D("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        List A0G3 = AnonymousClass1VY.A0G(UserJid.class, r2.A0D("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A0G2);
        collection2.addAll(A0G3);
        HashSet hashSet = new HashSet();
        AnonymousClass1VY.A0P(collection, hashSet);
        HashSet hashSet2 = new HashSet();
        AnonymousClass1VY.A0P(collection2, hashSet2);
        return new Pair(hashSet, hashSet2);
    }

    public Set A05(AnonymousClass02N r13, boolean z) {
        AnonymousClass0DT r2 = this.A0E;
        C02690Db r1 = (C02690Db) r2.A02("archive");
        if (A0O(r1)) {
            AnonymousClass01I r0 = this.A04;
            r0.A04();
            if (r0.A03 != null && A0K()) {
                return r2.A03(Collections.singletonList(new AnonymousClass2bZ(null, r13, z, r1.A01.A05(), null, false, C28191Tg.A02(r1.A05, r13, false))));
            }
        }
        return Collections.emptySet();
    }

    public Set A06(AnonymousClass02N r12, boolean z) {
        AnonymousClass0DT r2 = this.A0E;
        C02680Da r1 = (C02680Da) r2.A02("pin");
        if (!A0O(r1)) {
            return Collections.emptySet();
        }
        AnonymousClass01I r0 = this.A04;
        r0.A04();
        if (r0.A03 == null) {
            return Collections.emptySet();
        }
        if (!A0K()) {
            return Collections.emptySet();
        }
        return r2.A03(Collections.singletonList(new C52752bh(null, r12, z, r1.A01.A05(), null, false)));
    }

    public Set A07(AnonymousClass02N r13, boolean z) {
        AnonymousClass0DT r2 = this.A0E;
        C51222Xv r1 = (C51222Xv) r2.A02("markChatAsRead");
        if (!A0O(r1)) {
            return Collections.emptySet();
        }
        if (!A0K()) {
            return Collections.emptySet();
        }
        return r2.A03(Collections.singletonList(new C52732bf(null, r13, z, r1.A01.A05(), null, false, C28191Tg.A02(r1.A04, r13, false))));
    }

    public Set A08(AnonymousClass02N r14, boolean z, long j) {
        AnonymousClass0DT r2 = this.A0E;
        AnonymousClass0DY r1 = (AnonymousClass0DY) r2.A02("mute");
        if (!A0O(r1)) {
            return Collections.emptySet();
        }
        if (!A0K()) {
            return Collections.emptySet();
        }
        return r2.A03(Collections.singletonList(new C52742bg(null, r14, z, null, false, j, r1.A00.A05())));
    }

    public Set A09(AnonymousClass02N r25, boolean z, boolean z2) {
        AnonymousClass0DT r6 = this.A0E;
        C51192Xs r2 = (C51192Xs) r6.A02("clearChat");
        if (A0O(r2)) {
            AnonymousClass01I r0 = this.A04;
            r0.A04();
            if (r0.A03 != null && A0K()) {
                C52682ba r8 = new C52682ba(null, r25, z, z2, r2.A01.A05(), null, false, C28191Tg.A02(r2.A03, r25, true));
                AnonymousClass0DU r1 = ((AnonymousClass0DZ) r2).A00;
                C52682ba r22 = (C52682ba) r1.A07(AbstractC48162Ld.A00(r8.A03()));
                if (!(r22 == null && (r22 = (C52682ba) r1.A08(AbstractC48162Ld.A00(r8.A03()))) == null)) {
                    r8 = r14;
                    C52682ba r14 = new C52682ba(null, r22.A00, r22.A03, r22.A02, r8.A04, null, false, C28191Tg.A03(r8.A01, r22.A01));
                }
                return r6.A03(Collections.singletonList(r8));
            }
        }
        return Collections.emptySet();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x005c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0DH] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0DT] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0A(java.util.Collection r7, boolean r8) {
        /*
            r6 = this;
            X.0DT r5 = r6.A0E
            java.lang.String r0 = "star"
            java.lang.Object r1 = r5.A02(r0)
            X.0Dc r1 = (X.C02700Dc) r1
            boolean r0 = r6.A0O(r1)
            if (r0 != 0) goto L_0x0016
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L_0x0016:
            X.01I r0 = r6.A04
            r0.A04()
            com.whatsapp.jid.UserJid r0 = r0.A03
            if (r0 != 0) goto L_0x0024
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L_0x0024:
            boolean r0 = r6.A0K()
            if (r0 != 0) goto L_0x002f
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L_0x002f:
            if (r7 == 0) goto L_0x0058
            X.00S r0 = r1.A00
            long r1 = r0.A05()
            int r0 = r7.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r7.iterator()
        L_0x0044:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r3.next()
            X.03q r0 = (X.AbstractC007503q) r0
            X.2bl r0 = X.C02700Dc.A00(r0, r8, r1)
            r4.add(r0)
            goto L_0x0044
        L_0x0058:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x005c:
            java.util.Set r0 = r5.A03(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0A(java.util.Collection, boolean):java.util.Set");
    }

    public void A0B() {
        Set<String> stringSet;
        List<AbstractC48162Ld> list;
        boolean z;
        AnonymousClass01I r0 = this.A04;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null && !this.A08.A04()) {
            synchronized (this) {
                if (!this.A02) {
                    AnonymousClass0DU r3 = this.A0K;
                    boolean z2 = true;
                    boolean z3 = false;
                    if (!r3.A0H()) {
                        z3 = true;
                    }
                    AnonymousClass0F5 r6 = this.A09;
                    synchronized (r6) {
                        stringSet = r6.A00.A00.getStringSet("syncd_out_of_date_collections", null);
                        if (stringSet == null) {
                            stringSet = new HashSet<>();
                        }
                    }
                    if (!z3) {
                        list = r3.A09();
                    } else {
                        HashSet hashSet = new HashSet(AbstractC48162Ld.A09);
                        hashSet.remove("critical_unblock_low");
                        list = r3.A0A(hashSet, Integer.MAX_VALUE);
                        ArrayList arrayList = (ArrayList) list;
                        arrayList.addAll(r3.A0A(Collections.singleton("critical_unblock_low"), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                        if (arrayList.isEmpty()) {
                            list = r3.A09();
                        }
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("sync-manager/prepareAndSendRequest loaded ");
                    A0S.append(list.size());
                    A0S.append(" pending mutation(s)");
                    Log.i(A0S.toString());
                    if (!stringSet.isEmpty() || !list.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        for (AbstractC48162Ld r2 : list) {
                            String str = r2.A06;
                            List list2 = (List) hashMap.get(str);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap.put(str, list2);
                            }
                            list2.add(r2);
                        }
                        for (String str2 : stringSet) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, Collections.emptyList());
                            }
                        }
                        Iterator it = ((HashSet) this.A0D.A04()).iterator();
                        while (it.hasNext()) {
                            hashMap.remove(it.next());
                        }
                        if (hashMap.isEmpty()) {
                            z = false;
                        } else {
                            this.A0N.ANF(new RunnableEBaseShape0S0300000_I0_0(this, userJid, hashMap, 18));
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    this.A02 = z;
                    if (!z || !z3) {
                        z2 = false;
                    }
                    this.A03 = z2;
                }
            }
        }
    }

    public synchronized void A0C() {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/deleteAllSyncdData: isSyncing = ");
        sb.append(this.A02);
        Log.i(sb.toString());
        this.A00 = new C51172Xq(this);
        if (!this.A02) {
            A0N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        if (r1 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0D() {
        /*
        // Method dump skipped, instructions count: 694
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0D():void");
    }

    public final synchronized void A0E() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A0N.AMj(runnable);
            this.A01 = null;
            Log.i("sync-manager/forceSync removed scheduled sync");
        }
        A0B();
    }

    public synchronized void A0F(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/handleFatalFailure: errorCode = ");
        sb.append(i);
        sb.append("; isSyncing = ");
        sb.append(this.A02);
        Log.i(sb.toString());
        this.A00 = new C51182Xr(this, i);
        if (!this.A02) {
            A0N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (A0K() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0G(java.util.Collection r8) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0G(java.util.Collection):void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x030d */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0321, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0325, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0329, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        ((android.database.CursorWrapper) r9).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032f, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0H(java.util.List r23) {
        /*
        // Method dump skipped, instructions count: 867
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0H(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(java.util.Set r6) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            X.0DT r4 = r5.A0E
            monitor-enter(r4)
            X.0DU r0 = r4.A00     // Catch:{ all -> 0x003c }
            X.0DK r0 = r0.A01     // Catch:{ all -> 0x003c }
            X.0OQ r3 = r0.A01()     // Catch:{ all -> 0x003c }
            X.0Rk r2 = r3.A00()     // Catch:{ all -> 0x0035 }
            X.0BK r1 = r3.A04     // Catch:{ all -> 0x002e }
            java.lang.String[] r0 = X.AnonymousClass0DU.A02     // Catch:{ all -> 0x002e }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x002e }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x002e }
            X.AnonymousClass0DU.A03(r1, r0)     // Catch:{ all -> 0x002e }
            r2.A00()     // Catch:{ all -> 0x002e }
            r2.close()
            r3.close()
            monitor-exit(r4)
            return
        L_0x002e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0I(java.util.Set):void");
    }

    public void A0J(Set set) {
        if (!set.isEmpty()) {
            AnonymousClass0DT r1 = this.A0E;
            synchronized (r1) {
                r1.A00.A0G(set);
            }
            A0E();
        }
    }

    public boolean A0K() {
        return A0L() && A0M();
    }

    public boolean A0L() {
        int A062 = this.A05.A06(AbstractC000400g.A41);
        if (A062 < 2 || A062 <= this.A0C.A00.getInt("disabled_version", 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0M() {
        /*
            r6 = this;
            X.0DU r1 = r6.A0K
            boolean r0 = r1.A0H()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x003d
            r3 = 0
            if (r1 == 0) goto L_0x003a
            X.0DK r0 = r1.A01     // Catch:{ Exception -> 0x003e }
            X.0BK r2 = r0.A8g()     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1"
            java.lang.String r0 = "PendingMutationsTable.SELECT_ANY_MUTATION"
            android.database.Cursor r2 = r2.A07(r1, r3, r0)     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0044
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0027
            r2.close()
            goto L_0x0044
        L_0x0027:
            java.lang.String r1 = r2.getString(r4)
            r0 = 0
            if (r1 == 0) goto L_0x002f
            r0 = 1
        L_0x002f:
            r2.close()
            goto L_0x003b
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0
        L_0x003a:
            throw r3
        L_0x003b:
            if (r0 == 0) goto L_0x0044
        L_0x003d:
            return r5
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "SyncdMutationsStore/hasPendingMutations exception on DB query"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0044:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A0M():boolean");
    }

    public synchronized boolean A0N() {
        AnonymousClass2FT r2 = this.A00;
        if (r2 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/handleSyncdStateIfRequired: syncdState = ");
        sb.append(r2);
        Log.i(sb.toString());
        AnonymousClass2FT r22 = this.A00;
        if (!(r22 instanceof C51182Xr)) {
            ((C51172Xq) r22).A00.A08.A01();
        } else {
            C51182Xr r23 = (C51182Xr) r22;
            r23.A01.A07.A00(r23.A00);
        }
        this.A00 = null;
        return true;
    }

    public boolean A0O(AnonymousClass0DZ r4) {
        boolean z;
        if (r4 != null) {
            int A062 = this.A05.A06(AbstractC000400g.A41);
            if (r4 instanceof C02700Dc) {
                z = false;
                if (A062 >= 2) {
                    z = true;
                }
            } else if (r4 instanceof C02740Dg) {
                z = false;
                if (A062 == 2) {
                    z = true;
                }
            } else if (r4 instanceof C02720De) {
                z = true;
                if (A062 < 1) {
                    z = false;
                }
            } else if (r4 instanceof C02680Da) {
                z = false;
                if (A062 >= 2) {
                    z = true;
                }
            } else if (r4 instanceof AnonymousClass0DY) {
                z = false;
                if (A062 >= 2) {
                    z = true;
                }
            } else if (!(r4 instanceof C02710Dd)) {
                z = false;
                if (A062 >= 3) {
                    z = true;
                }
            } else {
                z = false;
                if (A062 >= 2) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // X.AnonymousClass0DJ
    public void ADz(boolean z) {
        if (z) {
            this.A0N.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 18));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0136 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0DH] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c7, code lost:
        if (r2 != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass0By
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AEz(X.AnonymousClass2F8 r22) {
        /*
        // Method dump skipped, instructions count: 463
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.AEz(X.2F8):void");
    }

    @Override // X.AnonymousClass0By
    public void AF2(C05350Oe r4) {
        this.A0N.ANF(new RunnableEBaseShape1S0200000_I0_0(this, r4, 49));
    }

    @Override // X.AnonymousClass0XS
    public void AHK() {
        AnonymousClass0DZ r3 = (AnonymousClass0DZ) this.A0E.A02("setting_locale");
        if (A0O(r3)) {
            this.A0N.ANF(new RunnableEBaseShape2S0200000_I0_1(this, r3, 0));
        }
    }

    @Override // X.AnonymousClass0DI
    public void AKr() {
        AnonymousClass0DK r1 = this.A0J;
        r1.A02(r1.A9x().A00);
        SharedPreferences.Editor edit = this.A0C.A00.edit();
        for (String str : C02410Bw.A01) {
            edit.remove(str);
        }
        edit.apply();
        C73193Vv r2 = this.A0O;
        r2.A0E("SYNC_MANAGER_CONTACTS_JID_ADDED", null);
        r2.A0E("SYNC_MANAGER_CONTACTS_JID_REMOVED", null);
    }
}
