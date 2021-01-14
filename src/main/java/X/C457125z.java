package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.25z  reason: invalid class name and case insensitive filesystem */
public final class C457125z implements AnonymousClass176, AnonymousClass177, AbstractC35041jd {
    public C34661ix A00 = null;
    public boolean A01;
    public final int A02;
    public final AbstractC236216v A03;
    public final AbstractC34701j2 A04;
    public final AnonymousClass17S A05;
    public final AnonymousClass297 A06;
    public final C237017e A07;
    public final List A08 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Queue A0A = new LinkedList();
    public final Set A0B = new HashSet();
    public final /* synthetic */ AnonymousClass17J A0C;

    public C457125z(AnonymousClass17J r20, AnonymousClass173 r21) {
        this.A0C = r20;
        Handler handler = r20.A05;
        Looper looper = handler.getLooper();
        C238317t A002 = r21.A00();
        C238417u r10 = new C238417u(A002.A00, null, A002.A02, A002.A03, A002.A01);
        AbstractC34691j1 r7 = r21.A03.A00;
        C001801b.A1b(r7 != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        AbstractC34701j2 A003 = r7.A00(r21.A01, looper, r10, null, this, this);
        this.A04 = A003;
        this.A03 = A003;
        this.A07 = r21.A07;
        this.A05 = new AnonymousClass17S();
        this.A02 = r21.A00;
        if (this.A04.AMw()) {
            Context context = r20.A04;
            C238317t A004 = r21.A00();
            this.A06 = new AnonymousClass297(context, handler, new C238417u(A004.A00, null, A004.A02, A004.A03, A004.A01), AnonymousClass297.A07);
            return;
        }
        this.A06 = null;
    }

    public final void A00() {
        AnonymousClass17J r5 = this.A0C;
        C001801b.A1L(r5.A05);
        AbstractC34701j2 r4 = this.A04;
        if (!r4.isConnected() && !r4.AAw()) {
            int A002 = r5.A07.A00(r5.A04, r4);
            if (A002 != 0) {
                AEY(new C34661ix(A002, null));
                return;
            }
            C34741j9 r3 = new C34741j9(r5, r4, this.A07);
            if (r4.AMw()) {
                AnonymousClass297 r10 = this.A06;
                AbstractC458426o r0 = r10.A02;
                if (r0 != null) {
                    r0.A3k();
                }
                r10.A01.A00 = Integer.valueOf(System.identityHashCode(r10));
                AbstractC34691j1 r52 = r10.A06;
                Context context = r10.A04;
                Handler handler = r10.A05;
                Looper looper = handler.getLooper();
                C238417u r8 = r10.A01;
                r10.A02 = (AbstractC458426o) r52.A00(context, looper, r8, r8.A01, r10, r10);
                r10.A00 = r3;
                Set set = r10.A03;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableEBaseShape5S0100000_I1_0(r10, 45));
                } else {
                    r10.A02.connect();
                }
            }
            r4.A2x(r3);
        }
    }

    public final void A01() {
        Handler handler = this.A0C.A05;
        C001801b.A1L(handler);
        this.A00 = null;
        A06(C34661ix.A04);
        if (this.A01) {
            C237017e r1 = this.A07;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            this.A01 = false;
        }
        Iterator it = this.A09.values().iterator();
        if (!it.hasNext()) {
            A03();
            A05();
            return;
        }
        it.next();
        throw null;
    }

    public final void A02() {
        AnonymousClass17J r5 = this.A0C;
        Handler handler = r5.A05;
        C001801b.A1L(handler);
        this.A00 = null;
        this.A01 = true;
        this.A05.A00(true, C236817c.A03);
        C237017e r3 = this.A07;
        handler.sendMessageDelayed(Message.obtain(handler, 9, r3), 5000);
        handler.sendMessageDelayed(Message.obtain(handler, 11, r3), 120000);
        r5.A07.A01.clear();
    }

    public final void A03() {
        Queue queue = this.A0A;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AnonymousClass17U r1 = (AnonymousClass17U) obj;
            if (!this.A04.isConnected()) {
                return;
            }
            if (A0A(r1)) {
                queue.remove(r1);
            }
        }
    }

    public final void A04() {
        C001801b.A1L(this.A0C.A05);
        Status status = AnonymousClass17J.A0E;
        A07(status);
        AnonymousClass17S r0 = this.A05;
        if (r0 != null) {
            r0.A00(false, status);
            Map map = this.A09;
            for (AnonymousClass17M r2 : (AnonymousClass17M[]) map.keySet().toArray(new AnonymousClass17M[map.size()])) {
                A08(new AnonymousClass298(r2, new C24611Bq()));
            }
            A06(new C34661ix(4));
            AbstractC34701j2 r1 = this.A04;
            if (r1.isConnected()) {
                r1.ALc(new C34971jW(this));
                return;
            }
            return;
        }
        throw null;
    }

    public final void A05() {
        AnonymousClass17J r4 = this.A0C;
        Handler handler = r4.A05;
        C237017e r1 = this.A07;
        handler.removeMessages(12, r1);
        handler.sendMessageDelayed(handler.obtainMessage(12, r1), r4.A02);
    }

    public final void A06(C34661ix r6) {
        Set<C237117f> set = this.A0B;
        for (C237117f r2 : set) {
            String str = null;
            if (AnonymousClass05S.A0H(r6, C34661ix.A04)) {
                str = this.A04.A6D();
            }
            r2.A00(this.A07, r6, str);
        }
        set.clear();
    }

    public final void A07(Status status) {
        C001801b.A1L(this.A0C.A05);
        Queue<AnonymousClass17U> queue = this.A0A;
        for (AnonymousClass17U r0 : queue) {
            r0.A01(status);
        }
        queue.clear();
    }

    public final void A08(AnonymousClass17U r3) {
        C001801b.A1L(this.A0C.A05);
        if (!this.A04.isConnected()) {
            this.A0A.add(r3);
            C34661ix r1 = this.A00;
            if (r1 == null || !r1.A01()) {
                A00();
            } else {
                AEY(r1);
            }
        } else if (A0A(r3)) {
            A05();
        } else {
            this.A0A.add(r3);
        }
    }

    public final boolean A09(C34661ix r7) {
        synchronized (AnonymousClass17J.A0G) {
            AnonymousClass17J r2 = this.A0C;
            if (r2.A03 == null || !r2.A09.contains(this.A07)) {
                return false;
            }
            AnonymousClass261 r4 = r2.A03;
            C237217g r3 = new C237217g(r7, this.A02);
            if (r4.A02.compareAndSet(null, r3)) {
                ((AbstractDialogInterface$OnCancelListenerC35011ja) r4).A00.post(new RunnableEBaseShape5S0200000_I1_0(r3, r4, 38));
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: X.1iy */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.app.PendingIntent] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(X.AnonymousClass17U r14) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C457125z.A0A(X.17U):boolean");
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            handler.post(new RunnableEBaseShape5S0100000_I1_0(this, 42));
        }
    }

    @Override // X.AnonymousClass177
    public final void AEY(C34661ix r5) {
        AbstractC458426o r0;
        AnonymousClass17J r2 = this.A0C;
        Handler handler = r2.A05;
        C001801b.A1L(handler);
        AnonymousClass297 r02 = this.A06;
        if (!(r02 == null || (r0 = r02.A02) == null)) {
            r0.A3k();
        }
        C001801b.A1L(handler);
        this.A00 = null;
        r2.A07.A01.clear();
        A06(r5);
        int i = r5.A01;
        if (i == 4) {
            A07(AnonymousClass17J.A0F);
        } else if (this.A0A.isEmpty()) {
            this.A00 = r5;
        } else if (!A09(r5) && !r2.A03(r5, this.A02)) {
            if (i == 18) {
                this.A01 = true;
            }
            if (this.A01) {
                handler.sendMessageDelayed(Message.obtain(handler, 9, this.A07), 5000);
                return;
            }
            String str = this.A07.A01.A02;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("API: ");
            sb.append(str);
            sb.append(" is not available on this device.");
            A07(new Status(17, sb.toString()));
        }
    }

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            A02();
        } else {
            handler.post(new RunnableEBaseShape5S0100000_I1_0(this, 43));
        }
    }

    @Override // X.AbstractC35041jd
    public final void ARQ(C34661ix r4, AnonymousClass16z r5, boolean z) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            AEY(r4);
        } else {
            handler.post(new RunnableEBaseShape5S0200000_I1_0(this, r4, 35));
        }
    }
}
