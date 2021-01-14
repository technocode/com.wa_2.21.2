package X;

import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0EO  reason: invalid class name */
public class AnonymousClass0EO {
    public static Handler A0n;
    public static volatile AnonymousClass0EO A0o;
    public long A00 = 0;
    public Integer A01;
    public Integer A02;
    public AtomicBoolean A03 = new AtomicBoolean();
    public final AnonymousClass009 A04;
    public final AnonymousClass02M A05;
    public final AnonymousClass01I A06;
    public final AnonymousClass0ES A07;
    public final AnonymousClass0EY A08;
    public final C000300f A09;
    public final AnonymousClass01A A0A;
    public final AnonymousClass08B A0B;
    public final C014308b A0C;
    public final AnonymousClass08C A0D;
    public final AnonymousClass0EQ A0E;
    public final AnonymousClass04j A0F;
    public final AnonymousClass00S A0G;
    public final AnonymousClass00D A0H;
    public final C001000o A0I;
    public final C001400w A0J;
    public final AnonymousClass09A A0K;
    public final C006903j A0L;
    public final AnonymousClass0A8 A0M;
    public final AnonymousClass01Q A0N;
    public final AnonymousClass01K A0O;
    public final AnonymousClass0EP A0P;
    public final C02930Ea A0Q;
    public final AnonymousClass091 A0R;
    public final C016608y A0S;
    public final AnonymousClass01T A0T;
    public final AnonymousClass0AN A0U;
    public final AnonymousClass0AP A0V;
    public final AnonymousClass01L A0W;
    public final C002701k A0X;
    public final C02940Eb A0Y;
    public final AnonymousClass0EZ A0Z;
    public final AnonymousClass01S A0a;
    public final AnonymousClass09H A0b;
    public final C015808q A0c;
    public final AnonymousClass0AR A0d;
    public final C02040Ak A0e;
    public final AnonymousClass01R A0f;
    public final AnonymousClass0AT A0g;
    public final AnonymousClass00T A0h;
    public final AnonymousClass0C4 A0i;
    public final Map A0j = new ConcurrentHashMap();
    public final Set A0k = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile boolean A0l;
    public volatile boolean A0m;

    public AnonymousClass0EO(AnonymousClass00S r10, C002701k r11, AnonymousClass02M r12, AnonymousClass009 r13, AnonymousClass01I r14, AnonymousClass00T r15, C006903j r16, AnonymousClass0C4 r17, AnonymousClass0AR r18, C000300f r19, AnonymousClass0AN r20, AnonymousClass09H r21, AnonymousClass01A r22, AnonymousClass0EP r23, C001400w r24, C014308b r25, AnonymousClass01X r26, AnonymousClass08B r27, AnonymousClass01K r28, AnonymousClass0AT r29, AnonymousClass0AP r30, AnonymousClass0EQ r31, C015808q r32, C001000o r33, AnonymousClass01L r34, AnonymousClass09A r35, AnonymousClass08C r36, AnonymousClass04j r37, AnonymousClass0ES r38, AnonymousClass0EY r39, AnonymousClass00D r40, AnonymousClass01Q r41, AnonymousClass01R r42, AnonymousClass0A8 r43, C016608y r44, C02040Ak r45, AnonymousClass01S r46, AnonymousClass01T r47, AnonymousClass0EZ r48, C02930Ea r49, AnonymousClass091 r50) {
        C02940Eb r8 = new C02940Eb();
        this.A0Y = r8;
        this.A0G = r10;
        this.A0X = r11;
        this.A05 = r12;
        this.A04 = r13;
        this.A06 = r14;
        this.A0h = r15;
        this.A0L = r16;
        this.A0i = r17;
        this.A0d = r18;
        this.A09 = r19;
        this.A0U = r20;
        this.A0b = r21;
        this.A0A = r22;
        this.A0P = r23;
        this.A0C = r25;
        this.A0V = r30;
        this.A0B = r27;
        this.A0O = r28;
        this.A0g = r29;
        this.A0E = r31;
        this.A0c = r32;
        this.A0I = r33;
        this.A0W = r34;
        this.A0K = r35;
        this.A0D = r36;
        this.A0F = r37;
        this.A07 = r38;
        this.A08 = r39;
        this.A0H = r40;
        this.A0N = r41;
        this.A0f = r42;
        this.A0M = r43;
        this.A0S = r44;
        this.A0e = r45;
        this.A0a = r46;
        this.A0Z = r48;
        this.A0T = r47;
        this.A0Q = r49;
        this.A0R = r50;
        this.A0J = r24;
        A0n = new AnonymousClass0Ec(r12, r19, r22, r25, r26, r28, r48, r8);
    }

    public static AnonymousClass0EO A00() {
        if (A0o == null) {
            synchronized (AnonymousClass0EO.class) {
                if (A0o == null) {
                    A0o = new AnonymousClass0EO(AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), C006903j.A00(), AnonymousClass0C4.A00(), AnonymousClass0AR.A00(), C000300f.A00(), AnonymousClass0AN.A00(), AnonymousClass09H.A01(), AnonymousClass01A.A00(), AnonymousClass0EP.A00(), C001400w.A02, C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass08B.A00, AnonymousClass01K.A00(), AnonymousClass0AT.A03, AnonymousClass0AP.A00(), AnonymousClass0EQ.A00(), C015808q.A00(), C001000o.A00(), AnonymousClass01L.A00(), AnonymousClass09A.A02, AnonymousClass08C.A00(), AnonymousClass04j.A00(), AnonymousClass0ES.A00(), AnonymousClass0EY.A00(), AnonymousClass00D.A00(), AnonymousClass01Q.A00(), AnonymousClass01R.A01(), AnonymousClass0A8.A00, C016608y.A01, C02040Ak.A00(), AnonymousClass01S.A00(), AnonymousClass01T.A00(), AnonymousClass0EZ.A01, C02930Ea.A00(), AnonymousClass091.A00());
                }
            }
        }
        return A0o;
    }

    public static UserJid A01(AbstractC007503q r3) {
        C007303n r2 = r3.A0n;
        AnonymousClass02N r1 = r2.A00;
        if (!AnonymousClass1VY.A0Y(r1)) {
            return UserJid.of(r1);
        }
        if (!r2.A02 || !(r3 instanceof C05390Oi)) {
            return UserJid.of(r3.A07());
        }
        C05390Oi r22 = (C05390Oi) r3;
        int i = r22.A00;
        if (i == 10) {
            return ((C12130hb) r22).A00;
        }
        if (i == 20 || i == 52) {
            return (UserJid) ((C05400Oj) r22).A01.get(0);
        }
        return UserJid.of(r3.A07());
    }

    public static void A02(int i, Object obj) {
        A0n.obtainMessage(i, obj).sendToTarget();
    }

    public static final boolean A03(C007003k r2, String str, long j, C11220fu r6, boolean z, boolean z2, boolean z3, boolean z4, UserJid userJid) {
        if (TextUtils.equals(r2.A0F, str) && TextUtils.equals(r2.A0J, Long.toString(j)) && TextUtils.equals(r2.A0B.A02, r6.A02) && r2.A0S == z && r2.A0Z == z2 && r2.A0Q == z3 && r2.A0Y == z4 && C006803i.A0q(r2.A0A, userJid)) {
            return false;
        }
        r2.A0F = str;
        r2.A0J = Long.toString(j);
        if (r6.A02 != null) {
            r2.A0B = r6;
        }
        r2.A0S = z;
        r2.A0Z = z2;
        r2.A0Q = z3;
        r2.A0Y = z4;
        r2.A0A = userJid;
        return true;
    }

    public static boolean A04(AbstractC007503q r5) {
        try {
            if (!(r5 instanceof C05400Oj)) {
                return false;
            }
            C05400Oj r3 = (C05400Oj) r5;
            int i = ((C05390Oi) r3).A00;
            if ((i == 4 && r3.A00 == 1) || (i == 12 && r3.A00 == 1)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            StringBuilder A0S2 = AnonymousClass008.A0S("groupmgr/importantmsg/null ");
            A0S2.append(AnonymousClass0FI.A0B(r5));
            Log.e(A0S2.toString(), e);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x031f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0324, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0328, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x032b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x032f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0333, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0337, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x033a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0314, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0318, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(X.C05340Od r35, java.util.Map r36, boolean r37, boolean r38, long r39) {
        /*
        // Method dump skipped, instructions count: 831
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EO.A05(X.0Od, java.util.Map, boolean, boolean, long):int");
    }

    public int A06(AnonymousClass02U r3) {
        if (this.A0A.A08(r3) == null) {
            return 0;
        }
        return this.A09.A06(AbstractC000400g.A3i) - 1;
    }

    public C05390Oi A07(AnonymousClass0OP r8, List list) {
        A0C(r8, list, false);
        AnonymousClass01R r3 = this.A0f;
        long A052 = this.A0G.A05();
        AnonymousClass01I r0 = this.A06;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            AnonymousClass0A6 r02 = r3.A04;
            C05390Oi A002 = AnonymousClass01R.A00(AnonymousClass0FI.A07(r02.A01, r02.A00, r8, true), A052, 9);
            A002.A0d(null);
            A002.A0m(list);
            A002.A0Y(userJid);
            return A002;
        }
        throw null;
    }

    public final synchronized void A08() {
        Integer num = this.A02;
        if (num != null) {
            if (num.intValue() == 3) {
                this.A00 = this.A0G.A05();
            }
            int intValue = this.A02.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("groupmgr/sendGetGroups/ ");
            sb.append(intValue);
            Log.i(sb.toString());
            this.A01 = Integer.valueOf(intValue);
            this.A0m = true;
            AnonymousClass3LB r9 = new AnonymousClass3LB(this.A04, this.A0b, this, this.A0E, this.A0c, intValue);
            Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
            AnonymousClass09H r13 = r9.A04;
            String A022 = r13.A02();
            ArrayList arrayList = new ArrayList();
            int i = r9.A00;
            if ((i & 1) != 0) {
                arrayList.add(new AnonymousClass0M5("participants", null, null, null));
            }
            if ((i & 2) != 0) {
                arrayList.add(new AnonymousClass0M5("description", null, null, null));
            }
            AnonymousClass0M5 r6 = new AnonymousClass0M5("participating", null, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
            r13.A07(19, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:g2", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", C448021n.A00)}, new AnonymousClass0M5[]{r6}, null), r9, 0);
            this.A02 = null;
        } else {
            throw null;
        }
    }

    public synchronized void A09(int i) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        this.A0l = false;
        this.A0m = false;
        A0A(i);
    }

    public final synchronized void A0A(int i) {
        Integer valueOf;
        int intValue;
        Integer num = this.A02;
        if (num != null) {
            valueOf = Integer.valueOf(i | num.intValue());
            this.A02 = valueOf;
        } else {
            valueOf = Integer.valueOf(i);
            this.A02 = valueOf;
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            intValue = num2.intValue() | valueOf.intValue();
        } else {
            intValue = valueOf.intValue();
        }
        this.A0H.A0P(intValue);
    }

    public final void A0B(AnonymousClass02N r4, List list) {
        if (this.A0e.A02() && AnonymousClass1VY.A0Y(r4)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A0O.A0D(r4, (UserJid) it.next());
            }
        }
    }

    public final void A0C(AnonymousClass02X r13, Iterable iterable, boolean z) {
        C05340Od A012 = this.A0T.A01(r13);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            arrayList.add(new AnonymousClass1M5(userJid, C05340Od.A01(this.A0W.A06(userJid)), 0, z));
        }
        A012.A08(arrayList);
        if (AnonymousClass1VY.A0U(r13)) {
            AnonymousClass01I r0 = this.A06;
            r0.A04();
            UserJid userJid2 = r0.A03;
            if (userJid2 != null) {
                A012.A02(userJid2, this.A0W.A06(userJid2), 2, z, true);
                return;
            }
            throw null;
        }
    }

    public final void A0D(AnonymousClass02X r14, List list) {
        AnonymousClass00E.A05(list);
        C05340Od A012 = this.A0T.A01(r14);
        A012.A09(list);
        this.A0a.A0R(r14, list);
        if (AnonymousClass1VY.A0T(r14)) {
            C001400w r2 = this.A0J;
            r2.A00.submit(new RunnableEBaseShape0S0300000_I0_0(this, A012, r14, 39));
            this.A0C.A05.remove(r14);
        } else {
            A0B(r14, list);
        }
        if (list.size() == 1) {
            A02(2, this.A0f.A07(null, r14, this.A0G.A05(), 7, (UserJid) list.get(0)));
        } else {
            A02(2, this.A0f.A08(null, r14, this.A0G.A05(), 14, null, list, A012, 0));
        }
    }

    public final void A0E(AnonymousClass02X r9, List list, Long l) {
        this.A0K.A01(new RunnableEBaseShape0S0400000_I0(this, r9, list, l, 7), 46);
    }

    public final void A0F(AnonymousClass02U r13, UserJid userJid) {
        StringBuilder sb = new StringBuilder("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        sb.append(userJid);
        sb.append(" to group:");
        sb.append(r13);
        Log.i(sb.toString());
        this.A0T.A01(r13).A02(userJid, this.A0W.A06(userJid), 0, false, true);
        this.A0C.A05.remove(r13);
        C05400Oj A072 = this.A0f.A07(null, r13, this.A0G.A05(), 4, userJid);
        this.A0O.A0d(A072);
        A0n.post(new RunnableEBaseShape3S0200000_I0_2(this, A072, 8));
    }

    public void A0G(AnonymousClass02U r28, UserJid userJid, long j, String str, long j2, String str2, long j3, long j4, Map map, C11220fu r41, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5;
        int i2;
        int A052;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupInfoFromList/gjid:");
        sb.append(r28);
        sb.append("/creator:");
        sb.append(userJid);
        sb.append("/creation:");
        sb.append(j);
        sb.append("/subject:");
        sb.append(str);
        sb.append("/subject_time:");
        sb.append(j2);
        sb.append("/type:");
        sb.append(str2);
        sb.append("/vid:");
        sb.append(j3);
        sb.append("/inAppSupport:");
        sb.append(z);
        sb.append("/restrictMode:");
        sb.append(z2);
        sb.append("/announcementsOnly:");
        sb.append(z3);
        sb.append("/ephemeralDuration");
        sb.append(i);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("groupmgr/onGroupInfoFromList/");
        sb2.append(map);
        Log.i(sb2.toString());
        AnonymousClass01A r10 = this.A0A;
        C007003k A0A2 = r10.A0A(r28);
        boolean A032 = A03(A0A2, str, j, r41, z, z2, z3, z4, userJid);
        if (!this.A09.A0D(AbstractC000400g.A0t) || A0A2.A00 == i) {
            z5 = false;
        } else {
            A0A2.A00 = i;
            A032 = true;
            z5 = true;
        }
        boolean z6 = !this.A0L.A0C(r28);
        if (z6) {
            AnonymousClass01R r3 = this.A0f;
            C05400Oj A062 = r3.A06(null, r28, j2, 11, null);
            A062.A0d(str);
            A062.A0Y(userJid);
            A02(1, A062);
            AnonymousClass01I r12 = this.A06;
            if (!r12.A09(userJid)) {
                r12.A04();
                UserJid userJid2 = r12.A03;
                if (userJid2 != null) {
                    AnonymousClass0A6 r2 = r3.A04;
                    C05390Oi A002 = AnonymousClass01R.A00(AnonymousClass0FI.A07(r2.A01, r2.A00, r28, true), j2, 4);
                    A002.A0Y(userJid2);
                    A02(2, A002);
                } else {
                    throw null;
                }
            }
            i2 = 2;
        } else {
            i2 = 2;
            this.A0P.A03(r28, str, j);
        }
        if (map == null) {
            A052 = 0;
        } else {
            A052 = A05(this.A0T.A01(r28), map, !z6, true, j3);
            if ((A052 & 1) != 0) {
                this.A0C.A05.remove(r28);
            }
        }
        if (A032) {
            r10.A0K(A0A2);
        }
        if (!this.A0S.A00.containsKey(r28)) {
            this.A07.A03(r28, 0, i2, null);
        }
        if ((A052 & i2) != 0) {
            A02(5, r28);
        }
        if (z5) {
            A02(3017, this.A0f.A04(null, r28, null, A0A2.A00, this.A0G.A05()));
        }
        AnonymousClass091 r4 = this.A0R;
        if (r4.A01()) {
            r4.A01.A02(r28, j4);
        }
        long j5 = j2 / 1000;
        if (r4.A01()) {
            r4.A01.A04(r28, j5);
        }
    }

    public void A0H(AnonymousClass1XX r10, int i, UserJid userJid, long j) {
        int i2 = i;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupEphemeralChanged/");
        sb.append(r10);
        sb.append("/");
        sb.append(i);
        Log.i(sb.toString());
        if (i < 0) {
            i2 = 0;
        }
        AnonymousClass02U A022 = AnonymousClass02U.A02(AnonymousClass1VY.A09(r10.A01));
        if (A022 != null) {
            if (!this.A09.A0D(AbstractC000400g.A0t)) {
                Log.i("groupmgr/onGroupEphemeralChanged/skip");
            } else {
                AnonymousClass01A r2 = this.A0A;
                C007003k A082 = r2.A08(A022);
                if (A082 == null) {
                    Log.i("groupmgr/onGroupEphemeralChanged/new group");
                } else if (A082.A00 != i2) {
                    Log.i("groupmgr/onGroupEphemeralChanged/changed");
                    C007003k A0A2 = r2.A0A(A022);
                    if (A0A2.A00 != i2) {
                        A0A2.A00 = i2;
                        r2.A04.A0J(A0A2);
                        r2.A02.A00(A0A2);
                    }
                    A02(3017, this.A0f.A04(r10, A022, userJid, i2, j));
                    return;
                } else {
                    Log.i("groupmgr/onGroupEphemeralChanged/did not change");
                }
            }
            this.A0d.A0M(r10);
            return;
        }
        throw null;
    }

    public void A0I(AnonymousClass1XX r20, String str, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupNewSubject/");
        sb.append(r20);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(userJid);
        sb.append("/");
        sb.append(j);
        Log.i(sb.toString());
        AnonymousClass02U A022 = AnonymousClass02U.A02(AnonymousClass1VY.A09(r20.A01));
        if (A022 != null) {
            AnonymousClass01A r7 = this.A0A;
            C007003k A082 = r7.A08(A022);
            if (A082 != null) {
                String A083 = this.A0C.A08(A082, false);
                if (!A083.equals(str)) {
                    Log.i("groupmgr/onGroupNewSubject/changed");
                    C007003k A0A2 = r7.A0A(A022);
                    A0A2.A0F = str;
                    r7.A04.A0J(A0A2);
                    r7.A02.A00(A0A2);
                    C12100hY r0 = (C12100hY) this.A0f.A06(r20, A022, j, 1, null);
                    synchronized (r0.A0o) {
                        r0.A00 = str;
                    }
                    r0.A01 = A083;
                    r0.A0Y(userJid);
                    A02(4, r0);
                    return;
                }
                Log.i("groupmgr/onGroupNewSubject/did not change");
                this.A0d.A0M(r20);
                return;
            }
            Log.i("groupmgr/onGroupNewSubject/new group");
            C05340Od r1 = new C05340Od(A022);
            r7.A0B(A022, str, j, C11220fu.A04, false, false, false, false, 0, null);
            this.A0S.A00.put(A022, r1);
            C05400Oj A062 = this.A0f.A06(r20, A022, j, 11, null);
            A062.A0d(str);
            A062.A0Y(userJid);
            A02(1, A062);
            this.A0d.A0F(A022, null);
            return;
        }
        throw null;
    }

    public void A0J(AnonymousClass1XX r10, boolean z, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupNoFrequentlyForwardedToggled/");
        sb.append(r10);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass02U A022 = AnonymousClass02U.A02(AnonymousClass1VY.A09(r10.A01));
        if (A022 != null) {
            AnonymousClass01A r2 = this.A0A;
            C007003k A082 = r2.A08(A022);
            if (A082 == null) {
                Log.i("groupmgr/onGroupNoFrequentlyForwardedToggled/new group");
            } else if (A082.A0Y != z) {
                Log.i("groupmgr/onGroupAnnouncementsToggled/changed");
                C007003k A0A2 = r2.A0A(A022);
                if (A0A2.A0Y != z) {
                    A0A2.A0Y = z;
                    r2.A04.A0J(A0A2);
                    r2.A02.A00(A0A2);
                }
                AnonymousClass01R r22 = this.A0f;
                int i = 54;
                if (z) {
                    i = 53;
                }
                C05400Oj A062 = r22.A06(r10, A022, j, i, null);
                A062.A0Y(userJid);
                A02(3016, A062);
            } else {
                Log.i("groupmgr/onGroupNoFrequentlyForwardedToggled/did not change");
                this.A0d.A0M(r10);
            }
        } else {
            throw null;
        }
    }

    public void A0K(AnonymousClass1XX r10, boolean z, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupRestrictModeToggled/");
        sb.append(r10);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass02U A022 = AnonymousClass02U.A02(AnonymousClass1VY.A09(r10.A01));
        if (A022 != null) {
            AnonymousClass01A r2 = this.A0A;
            C007003k A082 = r2.A08(A022);
            if (A082 == null) {
                Log.i("groupmgr/onGroupRestrictModeToggled/new group");
            } else if (A082.A0Z != z) {
                Log.i("groupmgr/onGroupRestrictModeToggled/changed");
                C007003k A0A2 = r2.A0A(A022);
                if (A0A2.A0Z != z) {
                    A0A2.A0Z = z;
                    r2.A04.A0J(A0A2);
                    r2.A02.A00(A0A2);
                }
                AnonymousClass01R r22 = this.A0f;
                int i = 30;
                if (z) {
                    i = 29;
                }
                C05400Oj A062 = r22.A06(r10, A022, j, i, null);
                A062.A0Y(userJid);
                A02(3008, A062);
            } else {
                Log.i("groupmgr/onGroupRestrictModeToggled/did not change");
                this.A0d.A0M(r10);
            }
        } else {
            throw null;
        }
    }

    public void A0L(List list, boolean z) {
        StringBuilder A0S2 = AnonymousClass008.A0S("groupmgr/onLeaveGroup/");
        A0S2.append(Arrays.deepToString(list.toArray()));
        Log.i(A0S2.toString());
        AnonymousClass01I r1 = this.A06;
        r1.A04();
        UserJid userJid = r1.A03;
        if (userJid != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass02U r6 = (AnonymousClass02U) it.next();
                this.A0C.A05.remove(r6);
                C05340Od A012 = this.A0T.A01(r6);
                if (A012.A0A(r1)) {
                    if (A012.A01.remove(userJid) != null) {
                        A012.A06();
                    }
                    this.A0a.A0S(r6);
                    A0B(r6, Collections.singletonList(userJid));
                    if (!z || !this.A0L.A0C(r6)) {
                        A02(3, this.A0f.A07(null, r6, this.A0G.A05(), 5, userJid));
                    } else {
                        A02(2, this.A0f.A07(null, r6, this.A0G.A05(), 5, userJid));
                    }
                }
            }
            return;
        }
        throw null;
    }

    public synchronized void A0M(boolean z, boolean z2, int i) {
        if (z2) {
            if (this.A00 != 0 && this.A0G.A05() - this.A00 < 120000) {
                StringBuilder sb = new StringBuilder();
                sb.append("groupmgr/sendGetGroups/skip backoff param=");
                sb.append(i);
                Log.i(sb.toString());
                return;
            }
        }
        if (i == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            this.A0l = true;
        }
        Integer num = this.A01;
        if (num == null) {
            A0A(i);
            A08();
        } else if (!z || (num.intValue() & i) != i) {
            A0A(i);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/sendGetGroups/skip inFlight param=");
            sb2.append(i);
            Log.i(sb2.toString());
        }
    }

    public boolean A0N(AnonymousClass02U r4) {
        C007003k A092;
        Iterator it = this.A0T.A01(r4).A05().iterator();
        while (it.hasNext()) {
            AnonymousClass01I r0 = this.A06;
            UserJid userJid = ((AnonymousClass1M5) it.next()).A03;
            if (!r0.A09(userJid) && (A092 = this.A0A.A09(userJid)) != null && A092.A08 != null) {
                return true;
            }
        }
        return false;
    }
}
