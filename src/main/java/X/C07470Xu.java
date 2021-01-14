package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Xu  reason: invalid class name and case insensitive filesystem */
public class C07470Xu implements AnonymousClass0C0 {
    public static volatile C07470Xu A07;
    public final AnonymousClass009 A00;
    public final AnonymousClass0EQ A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass091 A03;
    public final AnonymousClass0EO A04;
    public final C015808q A05;
    public final AnonymousClass0AR A06;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{209};
    }

    public C07470Xu(AnonymousClass00S r1, AnonymousClass009 r2, AnonymousClass0AR r3, AnonymousClass0EO r4, AnonymousClass0EQ r5, C015808q r6, AnonymousClass091 r7) {
        this.A02 = r1;
        this.A00 = r2;
        this.A06 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A05 = r6;
        this.A03 = r7;
    }

    public final synchronized void A00(AnonymousClass1XX r16, boolean z, UserJid userJid, long j, AnonymousClass0M5 r21) {
        long j2;
        Jid jid = r16.A01;
        AnonymousClass02U A022 = AnonymousClass02U.A02(AnonymousClass1VY.A09(jid));
        if (A022 != null) {
            long A072 = r21.A07("v_id", 0);
            AnonymousClass091 r5 = this.A03;
            if (r5.A01()) {
                AnonymousClass092 r3 = r5.A01;
                Map map = r3.A03;
                synchronized (map) {
                    C28601Uy r2 = (C28601Uy) map.get(A022);
                    if (r2 == null) {
                        r2 = r3.A00(A022);
                    }
                    j2 = r2.A00;
                }
                if (j2 > A072) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GroupNotificationHandler/handleAnnouncement/old version, gjid=");
                    sb.append(A022);
                    sb.append("; version=");
                    sb.append(A072);
                    Log.w(sb.toString());
                }
            }
            AnonymousClass0EO r7 = this.A04;
            StringBuilder sb2 = new StringBuilder("groupmgr/onGroupAnnouncementsToggled/");
            sb2.append(r16);
            sb2.append("/");
            sb2.append(z);
            Log.i(sb2.toString());
            AnonymousClass02U A023 = AnonymousClass02U.A02(AnonymousClass1VY.A09(jid));
            if (A023 != null) {
                AnonymousClass01A r8 = r7.A0A;
                C007003k A08 = r8.A08(A023);
                if (A08 == null) {
                    Log.i("groupmgr/onGroupAnnouncementsToggled/new group");
                } else if (A08.A0Q != z) {
                    Log.i("groupmgr/onGroupAnnouncementsToggled/changed");
                    C007003k A0A = r8.A0A(A023);
                    if (A0A.A0Q != z) {
                        A0A.A0Q = z;
                        r8.A04.A0J(A0A);
                        r8.A02.A00(A0A);
                    }
                    AnonymousClass01R r82 = r7.A0f;
                    int i = 32;
                    if (z) {
                        i = 31;
                    }
                    C05400Oj A062 = r82.A06(r16, A023, j, i, null);
                    A062.A0Y(userJid);
                    AnonymousClass0EO.A02(3009, A062);
                } else {
                    Log.i("groupmgr/onGroupAnnouncementsToggled/did not change");
                    r7.A0d.A0M(r16);
                }
                if (r5.A01()) {
                    r5.A01.A02(A022, A072);
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public final void A01(Set set) {
        if (this.A05.A03() && !set.isEmpty()) {
            this.A01.A02((UserJid[]) set.toArray(new UserJid[0]), 2);
        }
    }

    public final boolean A02(AnonymousClass02U r9, AnonymousClass0M5 r10) {
        long j;
        long A072 = r10.A07("prev_v_id", 0);
        AnonymousClass091 r3 = this.A03;
        if (r3.A01()) {
            AnonymousClass092 r32 = r3.A01;
            Map map = r32.A03;
            synchronized (map) {
                C28601Uy r0 = (C28601Uy) map.get(r9);
                if (r0 == null) {
                    r0 = r32.A00(r9);
                }
                j = r0.A01;
            }
            return j == 0 || A072 == j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ce, code lost:
        if (r7.containsKey(r1.A03) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07cd, code lost:
        if (r8 == false) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07e0, code lost:
        if (r42.containsKey(r8) != false) goto L_0x07e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0912, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0916, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0a8e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0a92, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0a95, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r32.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a99, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a9c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:?, code lost:
        r33.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0aa0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0aa3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        r30.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0aa7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0aaa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0aae, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b56, code lost:
        if (r4 != false) goto L_0x0b5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ecc, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x0ece;
     */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0b37  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0b64  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0c2b  */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r59, android.os.Message r60) {
        /*
        // Method dump skipped, instructions count: 4236
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07470Xu.AAE(int, android.os.Message):boolean");
    }
}
