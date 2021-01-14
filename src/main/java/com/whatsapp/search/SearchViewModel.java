package com.whatsapp.search;

import X.AbstractC02280Bj;
import X.AbstractC07440Xr;
import X.AbstractC08640bT;
import X.AbstractC10770fA;
import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01Q;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass082;
import X.AnonymousClass0AC;
import X.AnonymousClass0AM;
import X.AnonymousClass0AN;
import X.AnonymousClass0AQ;
import X.AnonymousClass0B7;
import X.AnonymousClass0ET;
import X.AnonymousClass0M3;
import X.AnonymousClass0SD;
import X.AnonymousClass0SL;
import X.AnonymousClass0XL;
import X.AnonymousClass0YX;
import X.AnonymousClass0Yi;
import X.AnonymousClass0Yj;
import X.AnonymousClass2UI;
import X.AnonymousClass31y;
import X.AnonymousClass3NM;
import X.AnonymousClass3NO;
import X.AnonymousClass3NQ;
import X.AnonymousClass3NR;
import X.AnonymousClass3NU;
import X.AnonymousClass3NW;
import X.AnonymousClass3NX;
import X.AnonymousClass3NY;
import X.AnonymousClass3NZ;
import X.AnonymousClass3ZP;
import X.C006803i;
import X.C014308b;
import X.C02270Bi;
import X.C07580Yh;
import X.C08580bN;
import X.C08590bO;
import X.C08600bP;
import X.C08610bQ;
import X.C08620bR;
import X.C08670bW;
import X.C08720bb;
import X.C08740bd;
import X.C08790bi;
import X.C08800bj;
import X.C15610oN;
import X.C655530i;
import X.C71113Nq;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class SearchViewModel extends AnonymousClass0SD implements AbstractC07440Xr, AnonymousClass0SL {
    public long A00 = 0;
    public Handler A01 = new Handler(Looper.getMainLooper(), new C655530i(this));
    public SparseIntArray A02 = new SparseIntArray();
    public AbstractC02280Bj A03;
    public AbstractC02280Bj A04;
    public AbstractC02280Bj A05;
    public AbstractC02280Bj A06;
    public AnonymousClass0Yj A07 = new AnonymousClass0Yj();
    public AnonymousClass0Yj A08 = new AnonymousClass0Yj();
    public AnonymousClass0Yj A09 = new AnonymousClass0Yj();
    public AnonymousClass0Yj A0A = new AnonymousClass0Yj();
    public AnonymousClass0Yj A0B = new AnonymousClass0Yj();
    public AnonymousClass0Yj A0C = new AnonymousClass0Yj();
    public AnonymousClass0Yj A0D = new AnonymousClass0Yj();
    public C02270Bi A0E = new C02270Bi();
    public C02270Bi A0F = new C02270Bi();
    public C02270Bi A0G = new C02270Bi();
    public AnonymousClass019 A0H = new C08600bP(this);
    public UserJid A0I;
    public C08590bO A0J = C08590bO.A00();
    public C08610bQ A0K = new C08610bQ(this);
    public C07580Yh A0L = new C07580Yh();
    public C08580bN A0M = new C08580bN();
    public C08580bN A0N = new C08580bN();
    public C08580bN A0O = new C08580bN();
    public C08580bN A0P = new C08580bN();
    public C08580bN A0Q = new C08580bN();
    public C08580bN A0R = new C08580bN();
    public C08580bN A0S = new C08580bN();
    public C08580bN A0T = new C08580bN();
    public Integer A0U;
    public Runnable A0V;
    public Runnable A0W;
    public String A0X;
    public List A0Y = new ArrayList();
    public List A0Z = new ArrayList();
    public List A0a = new ArrayList();
    public AtomicBoolean A0b = new AtomicBoolean();
    public boolean A0c = true;
    public final C15610oN A0d;
    public final AnonymousClass02M A0e;
    public final AnonymousClass0YX A0f;
    public final AnonymousClass0AN A0g;
    public final AnonymousClass0B7 A0h;
    public final AnonymousClass0AC A0i;
    public final AnonymousClass0ET A0j;
    public final C08670bW A0k;
    public final C08720bb A0l;
    public final C08740bd A0m;
    public final AnonymousClass31y A0n;
    public final AnonymousClass00T A0o;
    public final AtomicBoolean A0p = new AtomicBoolean();

    public SearchViewModel(AnonymousClass02M r17, AnonymousClass00T r18, AnonymousClass0AN r19, AnonymousClass01A r20, AnonymousClass0XL r21, C014308b r22, AnonymousClass0AM r23, AnonymousClass0AC r24, C15610oN r25, AnonymousClass31y r26, AnonymousClass0ET r27, AnonymousClass0B7 r28, AnonymousClass0YX r29, AnonymousClass01Q r30, AnonymousClass0AQ r31) {
        this.A0e = r17;
        this.A0o = r18;
        this.A0g = r19;
        this.A0i = r24;
        this.A0d = r25;
        this.A0n = r26;
        this.A0j = r27;
        this.A0h = r28;
        this.A0f = r29;
        this.A03 = r25.A01("current_screen", false, null);
        this.A0C.A09(r25.A01("query_text", false, null), new AnonymousClass3NY(this));
        this.A05 = r25.A01("search_type", false, null);
        this.A04 = r25.A01("search_jid", false, null);
        this.A06 = r25.A01("user_grid_view_choice", false, null);
        this.A0k = new C08670bW(r21, r22, r30, r31, this.A0C, this.A05, this.A04);
        this.A0l = new C08720bb(r21, r22, r30, r31, this.A0C, this.A05, this.A04);
        C08740bd r8 = new C08740bd(r21, r20, r22, r23, this.A0C, this.A05, this.A04);
        this.A0m = r8;
        this.A0i.A01(r8.A00);
        this.A0i.A01(this.A0H);
        this.A0D.A09(this.A0k.A01, new AnonymousClass3NX(this));
        this.A0D.A09(this.A0l.A01, new AnonymousClass3NR(this));
        this.A0D.A09(this.A0m.A05, new C08790bi(this));
        this.A0D.A09(this.A0m.A02, new AnonymousClass3NM(this));
        this.A0D.A09(this.A0m.A03, new AnonymousClass3NW(this));
        this.A0D.A09(this.A06, new AnonymousClass3NQ(this));
        this.A0B.A09(this.A0m.A08, new C08800bj(this));
        this.A0B.A09(this.A0m.A0A, new C08800bj(this));
        this.A0B.A09(this.A0m.A0B, new C08800bj(this));
        this.A0B.A09(this.A0k.A03, new C08800bj(this));
        this.A0B.A09(this.A0l.A03, new C08800bj(this));
        this.A0B.A09(this.A0F, new AnonymousClass3NU(this));
        this.A0B.A09(this.A0D, new AnonymousClass3NZ(this));
        this.A0C.A09(this.A0m.A0C, new AnonymousClass3NO(this, r25));
        this.A0D.A07(A07());
    }

    public int A02() {
        Number number = (Number) this.A0d.A02.get("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A03() {
        Number number = (Number) this.A0d.A01("search_type", true, 0).A01();
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public int A04(AnonymousClass02N r6) {
        C08620bR A082 = A08();
        int i = -2;
        for (int i2 = 0; i2 < A082.size(); i2++) {
            if ((((AbstractC08640bT) A082.get(i2)).A00 == 3 || ((AbstractC08640bT) A082.get(i2)).A00 == 2) && C006803i.A0q(((AbstractC10770fA) A082.get(i2)).A6w(), r6)) {
                i = i2;
            }
        }
        return i;
    }

    public int A05(AnonymousClass0M3 r6) {
        int i = -2;
        if (!this.A0J.A00.contains(r6)) {
            return -2;
        }
        C08620bR A082 = A08();
        for (int i2 = 0; i2 < A082.size(); i2++) {
            int A002 = A082.A00(i2);
            if ((AnonymousClass3ZP.A00(A002) || A002 == 17 || A002 == 18 || A002 == 16 || A002 == 14) && C006803i.A0q(((AbstractC08640bT) A082.get(i2)).A01, r6)) {
                i = i2;
            }
        }
        return i;
    }

    public UserJid A06() {
        return (UserJid) this.A0d.A01("search_jid", true, null).A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0167, code lost:
        if (A0M() == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01aa, code lost:
        if (r9.A02.size() <= 0) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c4, code lost:
        if (A0P() != false) goto L_0x01c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C08620bR A07() {
        /*
        // Method dump skipped, instructions count: 596
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A07():X.0bR");
    }

    public final C08620bR A08() {
        if (this.A0D.A01() == null) {
            return A07();
        }
        return (C08620bR) this.A0D.A01();
    }

    public String A09() {
        String str = (String) this.A0d.A01("query_text", true, "").A01();
        if (str != null) {
            return str;
        }
        return "";
    }

    public void A0A() {
        A0H(0);
        A0I(null);
        A0L(false);
        A0J("");
        this.A0d.A02("user_grid_view_choice", null);
        this.A0P.A07(null);
        this.A0m.A00(true);
        this.A0l.A01.A07(new ArrayList());
        this.A0k.A01.A07(new ArrayList());
        this.A0a = new ArrayList();
        this.A0Y = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0J = C08590bO.A00();
        Runnable runnable = this.A0W;
        if (runnable != null) {
            runnable.run();
        }
        this.A0L = new C07580Yh();
        A0C();
    }

    public final void A0B() {
        this.A0b.set(true);
        if (TextUtils.isEmpty(A09()) && A03() == 0 && A06() == null) {
            this.A0p.set(true);
            this.A0c = true;
        } else if (this.A0c) {
            this.A00 = SystemClock.uptimeMillis();
            this.A0c = false;
        }
    }

    public final void A0C() {
        AnonymousClass00T r2 = this.A0o;
        RunnableEBaseShape4S0100000_I0_4 runnableEBaseShape4S0100000_I0_4 = new RunnableEBaseShape4S0100000_I0_4(this, 14);
        this.A0V = runnableEBaseShape4S0100000_I0_4;
        r2.ANF(runnableEBaseShape4S0100000_I0_4);
    }

    public final void A0D() {
        int intValue;
        int size = A08().size();
        if (this.A0F.A01() == null) {
            intValue = 0;
        } else {
            intValue = ((Number) this.A0F.A01()).intValue();
        }
        if (size - intValue < 300) {
            C08740bd r1 = this.A0m;
            if (!r1.A01.get()) {
                AnonymousClass0Yj r3 = r1.A06;
                if (r3.A01() != null) {
                    Object obj = ((Pair) r3.A01()).first;
                    Number number = (Number) ((Pair) r3.A01()).second;
                    if (number != null) {
                        C02270Bi r2 = r1.A09;
                        if (r2.A01() != null && ((Number) r2.A01()).intValue() != -1) {
                            r3.A07(new Pair(obj, Integer.valueOf(number.intValue() + 1)));
                        } else if (Boolean.TRUE.equals(obj)) {
                            r3.A07(new Pair(Boolean.FALSE, 0));
                        }
                    }
                }
            }
        }
    }

    public final void A0E() {
        int size;
        int intValue;
        AbstractCollection abstractCollection = (AbstractCollection) this.A0D.A01();
        boolean z = false;
        if (abstractCollection == null) {
            size = 0;
        } else {
            size = abstractCollection.size();
        }
        if (this.A0F.A01() == null) {
            intValue = 0;
        } else {
            intValue = ((Number) this.A0F.A01()).intValue();
        }
        if (A0O() && intValue > size - 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!C006803i.A0q(valueOf, this.A0B.A01())) {
            this.A0B.A07(valueOf);
        }
    }

    public void A0F(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C15610oN r2 = this.A0d;
        r2.A02("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A02("last_nav_type", Integer.valueOf(i));
    }

    public void A0G(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!C006803i.A0q(valueOf, this.A03.A01())) {
            this.A0d.A02("current_screen", valueOf);
        }
    }

    public void A0H(int i) {
        if (i != A03()) {
            C07580Yh r5 = this.A0L;
            Integer valueOf = Integer.valueOf(i);
            r5.A00(new AnonymousClass0Yi(2, valueOf, A06(), A09()));
            this.A0d.A02("search_type", valueOf);
        }
    }

    public void A0I(UserJid userJid) {
        if (!C006803i.A0q(userJid, A06())) {
            this.A0L.A00(new AnonymousClass0Yi(3, Integer.valueOf(A03()), userJid, A09()));
            this.A0d.A02("search_jid", userJid);
        }
    }

    public void A0J(String str) {
        if (!C006803i.A0q(str, A09())) {
            this.A0L.A00(new AnonymousClass0Yi(1, Integer.valueOf(A03()), A06(), str));
            this.A0d.A02("query_text", str);
        }
    }

    public void A0K(boolean z) {
        A0A();
        A0G(1);
        A0F(4);
        this.A0P.A08(Boolean.valueOf(z));
    }

    public void A0L(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.equals(this.A0G.A01())) {
            this.A0G.A07(valueOf);
        }
    }

    public boolean A0M() {
        return A03() == 103 || A03() == 105 || A03() == 118;
    }

    public final boolean A0N() {
        if (this.A0J.A01.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) this.A0d.A02.get("user_grid_view_choice");
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!A0M() || !A09().isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0O() {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.A0k.A03.A01()) && !bool.equals(this.A0l.A03.A01())) {
            C08740bd r2 = this.A0m;
            return bool.equals(r2.A08.A01()) || bool.equals(r2.A0B.A01()) || bool.equals(r2.A0A.A01());
        }
    }

    public final boolean A0P() {
        return (!Boolean.TRUE.equals(this.A0m.A0B.A01()) || this.A0J.A01.size() > 0) && this.A02.size() > 0;
    }

    public final boolean A0Q(long j) {
        long longValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0d.A02.get("last_nav_time");
        if (number == null) {
            longValue = 0;
        } else {
            longValue = number.longValue();
        }
        return elapsedRealtime - longValue > j;
    }

    @Override // X.AbstractC07440Xr
    public AnonymousClass2UI A3P(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r3) {
        return new C71113Nq(this);
    }

    @OnLifecycleEvent(AnonymousClass082.ON_PAUSE)
    public void onPause() {
        A02();
        if (A02() != 2 && A02() != 1 && A02() != 4) {
            if (A02() != 0 || A0Q(500)) {
                A0F(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.AnonymousClass082.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            r5.A02()
            int r1 = r5.A02()
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 == r0) goto L_0x001c
            r0 = 2
            r2 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L_0x0023
            r0 = 3
            if (r1 != r0) goto L_0x0031
            boolean r0 = r5.A0Q(r2)
        L_0x001a:
            if (r0 == 0) goto L_0x0031
        L_0x001c:
            r5.A02()
            r5.A0K(r4)
            return
        L_0x0023:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r5.A0Q(r0)
            if (r0 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r0 = r5.A0Q(r2)
            goto L_0x001a
        L_0x0031:
            r5.A0F(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.onResume():void");
    }
}
