package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.27y  reason: invalid class name */
public class AnonymousClass27y extends AbstractC43741ys {
    public static final C52842bq A06 = new C52842bq(null);
    public static final String A07;
    public static final String A08;
    public C52842bq A00 = A06;
    public final AnonymousClass01I A01;
    public final AnonymousClass09V A02;
    public final C014508d A03;
    public final AnonymousClass095 A04;
    public final C06240Si A05;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("SELECT ");
        String str = AbstractC05370Og.A11;
        AnonymousClass008.A1Y(A0S, str, " FROM ", "message_view_old_schema", " WHERE ");
        A07 = AnonymousClass008.A0Q(A0S, "_id > ?", " ORDER BY ", "_id", " LIMIT ?");
        StringBuilder A0S2 = AnonymousClass008.A0S("SELECT ");
        AnonymousClass008.A1Y(A0S2, str, " FROM ", "message_view_old_schema", " WHERE ");
        A08 = AnonymousClass008.A0O(A0S2, "_id", " = ?");
    }

    public AnonymousClass27y(AnonymousClass01I r3, AnonymousClass095 r4, AnonymousClass09V r5, C014508d r6, C06240Si r7, AnonymousClass0PQ r8) {
        super(r8);
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r7;
        RunnableEBaseShape9S0100000_I1_4 runnableEBaseShape9S0100000_I1_4 = new RunnableEBaseShape9S0100000_I1_4(this, 28);
        List list = ((AnonymousClass0PN) this).A00;
        if (list == null) {
            list = new ArrayList();
            ((AnonymousClass0PN) this).A00 = list;
        }
        list.add(runnableEBaseShape9S0100000_I1_4);
    }

    @Override // X.AnonymousClass0PN, X.AbstractC43741ys
    public Pair A07(Cursor cursor) {
        Pair A072 = super.A07(cursor);
        if (this.A00 != null) {
            return A072;
        }
        throw null;
    }

    @Override // X.AnonymousClass0PN, X.AbstractC43741ys
    public void A0C() {
        super.A0C();
        this.A06.A03("message_main_verification_done", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    @Override // X.AnonymousClass0PN, X.AbstractC43741ys
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r4 = this;
            super.A0D()
            X.08d r0 = r4.A03
            X.0OQ r3 = r0.A04()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "DROP VIEW IF EXISTS message_view_old_schema"
            java.lang.String r0 = "DROP_MESSAGE_VIEW_OLD_SCHEMA_FROM_V1"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x001d }
            X.08m r1 = r4.A06     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "message_main_verification_done"
            r1.A02(r0)     // Catch:{ all -> 0x001d }
            r3.close()
            return
        L_0x001d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27y.A0D():void");
    }

    public final void A0T(AbstractC007503q r7, AbstractC007503q r8) {
        AbstractC007503q A09;
        String str;
        C02850Ds r3;
        C02900Dx r5;
        if (r7.A01() != r8.A01()) {
            r7.A01 = r8.A01;
        }
        if (r8.A01() == 0) {
            if (r8.A0D() == null) {
                r7.A0d(null);
            }
        } else if (r8.A0t() == null) {
            r7.A0o(null);
        }
        if (r7 instanceof C05490Ot) {
            C05490Ot r2 = (C05490Ot) r7;
            if (TextUtils.isEmpty(r2.A02)) {
                r2.A02 = null;
            }
            C05490Ot r1 = (C05490Ot) r8;
            if (TextUtils.isEmpty(r1.A02)) {
                r1.A02 = null;
            }
            if (TextUtils.isEmpty(r2.A04)) {
                r2.A04 = null;
            }
            if (TextUtils.isEmpty(r1.A04)) {
                r1.A04 = null;
            }
            if (TextUtils.isEmpty(r2.A05)) {
                r2.A05 = null;
            }
            if (TextUtils.isEmpty(r1.A05)) {
                r1.A05 = null;
            }
        }
        if (r7 instanceof AnonymousClass0M1) {
            AnonymousClass0M1 r0 = (AnonymousClass0M1) r7;
            r0.A0u();
            r7.A0o(null);
            r8.A0o(null);
            List A0u = r0.A0u();
            List A0u2 = ((AnonymousClass0M1) r8).A0u();
            if (!A0u.equals(A0u2) && !A0u.isEmpty() && A0u.size() == A0u2.size()) {
                Collections.sort(A0u);
                Collections.sort(A0u2);
            }
        }
        if (r7 instanceof AnonymousClass0ZJ) {
            r7.A00 = 7;
        }
        if ((r7 instanceof C02850Ds) && r7.A0n.A02 && (r5 = (r3 = (C02850Ds) r7).A02) != null) {
            UserJid userJid = r5.A06;
            AnonymousClass01I r02 = this.A01;
            r02.A04();
            UserJid userJid2 = r02.A03;
            if (userJid2 != null && !userJid.equals(userJid2)) {
                C02900Dx r22 = new C02900Dx(userJid2);
                r22.A00 = r5.A00;
                r22.A01 = r5.A01;
                r22.A03 = r5.A03;
                r22.A02 = r5.A02;
                r22.A04 = r5.A04;
                r22.A05 = r5.A05;
                r3.A02 = r22;
            }
        }
        r7.A0C = r8.A0C;
        List list = r7.A0c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(new HashSet(list));
            Collections.sort(arrayList);
            r7.A0n(arrayList);
        }
        List list2 = r8.A0c;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(new HashSet(list2));
            Collections.sort(arrayList2);
            r8.A0n(arrayList2);
        }
        r7.A0B = r8.A0B;
        if ((r7 instanceof C12120ha) && (r8 instanceof C12120ha) && ((C12120ha) r7).A00 == null) {
            C12120ha r12 = (C12120ha) r8;
            if (r12.A00 != null) {
                r12.A00 = null;
            }
        }
        if ((r7 instanceof AnonymousClass0M2) && (r8 instanceof AnonymousClass0M2)) {
            AnonymousClass0M3 r13 = (AnonymousClass0M3) r7;
            r13.A08 = r13.A0w();
            AnonymousClass0M3 r14 = (AnonymousClass0M3) r8;
            r14.A08 = r14.A0w();
        }
        AbstractC007503q A092 = r7.A09();
        if (A092 != null && (A09 = r8.A09()) != null) {
            A092.A0p = A09.A0p;
            r7.A09().A0q = r8.A09().A0q;
            r7.A09().A0N();
            r8.A09().A0N();
            AbstractC007503q A093 = r7.A09();
            AbstractC007503q A094 = r8.A09();
            A093.A0a = A094.A0a;
            A093.A0C = A094.A0C;
            A093.A06 = A094.A06;
            A093.A0S(A094.A03());
            if (!(A094 instanceof AnonymousClass0M3)) {
                str = null;
            } else {
                str = ((AnonymousClass0M3) A094).A0A;
            }
            A093.A0e(str);
            AbstractC007503q A095 = r7.A09();
            A095.A0P(A095.A04());
            AbstractC007503q A096 = r7.A09();
            A096.A0f = false;
            A096.A0Y(r8.A09().A07());
            AbstractC007503q A097 = r7.A09();
            if (A097 instanceof C05490Ot) {
                C05490Ot r32 = (C05490Ot) A097;
                C05490Ot r15 = (C05490Ot) r8.A09();
                r32.A02 = r15.A02;
                r32.A04 = r15.A04;
                r32.A05 = r15.A05;
                r32.A0x(r15.A0y());
                byte[] A0y = r32.A0y();
                r32.A0v(null);
                r32.A0x(A0y);
            }
            if (A097 instanceof AnonymousClass0M3) {
                AnonymousClass0M4 r33 = ((AnonymousClass0M3) A097).A02;
                AnonymousClass0M4 r4 = ((AnonymousClass0M3) r8.A09()).A02;
                if (!(r33 == null || r4 == null)) {
                    r33.A0Q = r4.A0Q;
                    r33.A0S = r4.A0S;
                    r33.A0T = r4.A0T;
                    r33.A00 = r4.A00;
                    r33.A0C = r4.A0C;
                    r33.A0L = r4.A0L;
                    r33.A09 = r4.A09;
                    r33.A0V = r4.A0V;
                    r33.A0O = r4.A0O;
                    r33.A0M = r4.A0M;
                    r33.A05 = r4.A05;
                    r33.A02 = r4.A02;
                    r33.A03 = r4.A03;
                    r33.A0D = r4.A0D;
                    r33.A0E = r4.A0E;
                }
            }
            if (A097 instanceof AbstractC02860Dt) {
                ((AbstractC02860Dt) A097).A02 = ((AbstractC02860Dt) r8.A09()).A02;
            }
            if (A097 instanceof C02850Ds) {
                C02850Ds r42 = (C02850Ds) A097;
                C02850Ds r34 = (C02850Ds) r8.A09();
                if (r34 != null) {
                    r42.A01 = r34.A01;
                    r42.A00 = r34.A00;
                    r42.A02 = r34.A02;
                }
            }
            if (A097 instanceof AnonymousClass0ZJ) {
                ((AnonymousClass0ZJ) A097).A00 = ((AnonymousClass0ZJ) r8.A09()).A00;
            }
            if (A097 instanceof AnonymousClass0ZI) {
                ((AnonymousClass0ZI) A097).A00 = ((AnonymousClass0ZI) r8.A09()).A00;
            }
            A0T(A097, r8.A09());
        }
    }
}
