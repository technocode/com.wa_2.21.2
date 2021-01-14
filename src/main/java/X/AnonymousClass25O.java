package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.25O  reason: invalid class name */
public class AnonymousClass25O extends AbstractC33781hN implements AbstractC33811hQ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public SurfaceHolder A05;
    public TextureView A06;
    public AnonymousClass126 A07;
    public AnonymousClass126 A08;
    public C227412z A09;
    public C227412z A0A;
    public AbstractC229313t A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final AnonymousClass25M A0G;
    public final SurfaceHolder$CallbackC33831hS A0H = new SurfaceHolder$CallbackC33831hS(this);
    public final C33851hU A0I;
    public final C225112b A0J;
    public final AnonymousClass15B A0K;
    public final CopyOnWriteArraySet A0L = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0M = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0N = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0O = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0P = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0Q = new CopyOnWriteArraySet();
    public final AbstractC33821hR[] A0R;

    public AnonymousClass25O(Context context, AnonymousClass12N r12, AbstractC232314x r13, AnonymousClass129 r14, AnonymousClass15B r15, Looper looper) {
        AnonymousClass15Y r8 = AnonymousClass15Y.A00;
        this.A0K = r15;
        Handler handler = new Handler(looper);
        this.A0F = handler;
        SurfaceHolder$CallbackC33831hS r2 = this.A0H;
        this.A0R = r12.A3R(handler, r2, r2, r2, r2, null);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A0C = Collections.emptyList();
        AnonymousClass25M r3 = new AnonymousClass25M(this.A0R, r13, r14, r15, r8, looper);
        this.A0G = r3;
        C33851hU r0 = new C33851hU(r3, r8);
        this.A0I = r0;
        A1n(r0);
        this.A0P.add(this.A0I);
        this.A0Q.add(this.A0I);
        this.A0L.add(this.A0I);
        this.A0M.add(this.A0I);
        this.A0N.add(this.A0I);
        r15.A1m(this.A0F, this.A0I);
        this.A0J = new C225112b(context, this.A0H);
    }

    public void A00() {
        A03();
        AnonymousClass25M r3 = this.A0G;
        AnonymousClass12E A002 = r3.A00(false, false, 1);
        r3.A02++;
        r3.A0C.A0Q.A00.obtainMessage(6, 0, 0).sendToTarget();
        r3.A01(A002, false, 4, 1, false, false);
        AbstractC229313t r1 = this.A0B;
        if (r1 != null) {
            C33851hU r0 = this.A0I;
            r1.AMc(r0);
            r0.A01();
        }
        C225112b r12 = this.A0J;
        if (r12.A02 != null) {
            r12.A00();
        }
        this.A0C = Collections.emptyList();
    }

    public final void A01() {
        TextureView textureView = this.A06;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0H) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.A06.setSurfaceTextureListener(null);
            }
            this.A06 = null;
        }
        SurfaceHolder surfaceHolder = this.A05;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0H);
            this.A05 = null;
        }
    }

    public final void A02() {
        float f = this.A00 * this.A0J.A00;
        AbstractC33821hR[] r4 = this.A0R;
        for (AbstractC33821hR r9 : r4) {
            if (r9.A9S() == 1) {
                AnonymousClass25M r1 = this.A0G;
                AnonymousClass12K r7 = new AnonymousClass12K(r1.A0C, r9, r1.A04.A03, r1.A5r(), r1.A0B);
                boolean z = !r7.A08;
                C002001d.A3A(z);
                r7.A00 = 2;
                Float valueOf = Float.valueOf(f);
                C002001d.A3A(z);
                r7.A04 = valueOf;
                r7.A00();
            }
        }
    }

    public final void A03() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() != this.A0G.A0A.getLooper()) {
            if (this.A0D) {
                illegalStateException = null;
            } else {
                illegalStateException = new IllegalStateException();
            }
            Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", illegalStateException);
            this.A0D = true;
        }
    }

    public void A04(float f) {
        A03();
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.A00 != max) {
            this.A00 = max;
            A02();
            Iterator it = this.A0M.iterator();
            while (it.hasNext()) {
                ((AbstractC225212c) it.next()).ALm(max);
            }
        }
    }

    public final void A05(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            Iterator it = this.A0Q.iterator();
            while (it.hasNext()) {
                ((AnonymousClass168) it.next()).AKo(i, i2);
            }
        }
    }

    public final void A06(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        AbstractC33821hR[] r5 = this.A0R;
        for (AbstractC33821hR r8 : r5) {
            if (r8.A9S() == 2) {
                AnonymousClass25M r6 = this.A0G;
                AnonymousClass12K r62 = new AnonymousClass12K(r6.A0C, r8, r6.A04.A03, r6.A5r(), r6.A0B);
                boolean z2 = !r62.A08;
                C002001d.A3A(z2);
                r62.A00 = 1;
                C002001d.A3A(z2);
                r62.A04 = surface;
                r62.A00();
                arrayList.add(r62);
            }
        }
        Surface surface2 = this.A04;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass12K r3 = (AnonymousClass12K) it.next();
                    synchronized (r3) {
                        C002001d.A3A(r3.A08);
                        boolean z3 = false;
                        if (r3.A03.getLooper().getThread() != Thread.currentThread()) {
                            z3 = true;
                        }
                        C002001d.A3A(z3);
                        while (!r3.A07) {
                            r3.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0E) {
                this.A04.release();
            }
        }
        this.A04 = surface;
        this.A0E = z;
    }

    public void A07(AbstractC229313t r9, boolean z, boolean z2) {
        int i;
        A03();
        AbstractC229313t r1 = this.A0B;
        if (r1 != null) {
            C33851hU r0 = this.A0I;
            r1.AMc(r0);
            r0.A01();
        }
        this.A0B = r9;
        r9.A1l(this.A0F, this.A0I);
        C225112b r2 = this.A0J;
        boolean A8P = A8P();
        if (r2.A02 != null) {
            if (!A8P) {
                i = -1;
                A08(A8P(), i);
                AnonymousClass25M r12 = this.A0G;
                AnonymousClass12E A002 = r12.A00(z, z2, 2);
                r12.A06 = true;
                r12.A02++;
                r12.A0C.A0Q.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, r9).sendToTarget();
                r12.A01(A002, false, 4, 1, false, false);
            } else if (r2.A01 != 0) {
                r2.A00();
            }
        }
        i = 1;
        A08(A8P(), i);
        AnonymousClass25M r122 = this.A0G;
        AnonymousClass12E A0022 = r122.A00(z, z2, 2);
        r122.A06 = true;
        r122.A02++;
        r122.A0C.A0Q.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, r9).sendToTarget();
        r122.A01(A0022, false, 4, 1, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r7 == -1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(boolean r6, int r7) {
        /*
            r5 = this;
            X.25M r4 = r5.A0G
            r3 = 0
            r2 = 1
            if (r6 == 0) goto L_0x000a
            r1 = -1
            r0 = 1
            if (r7 != r1) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r7 == r2) goto L_0x000e
            r3 = 1
        L_0x000e:
            r4.A02(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25O.A08(boolean, int):void");
    }

    @Override // X.AnonymousClass12H
    public void A1n(AnonymousClass12G r2) {
        A03();
        this.A0G.A0H.add(r2);
    }

    @Override // X.AnonymousClass12H
    public long A50() {
        A03();
        return this.A0G.A50();
    }

    @Override // X.AnonymousClass12H
    public long A5T() {
        A03();
        return this.A0G.A5T();
    }

    @Override // X.AnonymousClass12H
    public int A5j() {
        A03();
        AnonymousClass25M r1 = this.A0G;
        if (r1.A03()) {
            return r1.A04.A05.A00;
        }
        return -1;
    }

    @Override // X.AnonymousClass12H
    public int A5k() {
        A03();
        AnonymousClass25M r1 = this.A0G;
        if (r1.A03()) {
            return r1.A04.A05.A01;
        }
        return -1;
    }

    @Override // X.AnonymousClass12H
    public long A5n() {
        A03();
        return this.A0G.A5n();
    }

    @Override // X.AnonymousClass12H
    public AnonymousClass12R A5q() {
        A03();
        return this.A0G.A04.A03;
    }

    @Override // X.AnonymousClass12H
    public int A5r() {
        A03();
        return this.A0G.A5r();
    }

    @Override // X.AnonymousClass12H
    public long A67() {
        A03();
        return this.A0G.A67();
    }

    @Override // X.AnonymousClass12H
    public boolean A8P() {
        A03();
        return this.A0G.A09;
    }

    @Override // X.AnonymousClass12H
    public int A8R() {
        A03();
        return this.A0G.A04.A00;
    }

    @Override // X.AnonymousClass12H
    public long A9P() {
        A03();
        return Math.max(0L, AnonymousClass11u.A01(this.A0G.A04.A0C));
    }

    @Override // X.AnonymousClass12H
    public void AMe(AnonymousClass12G r2) {
        A03();
        this.A0G.A0H.remove(r2);
    }

    @Override // X.AnonymousClass12H
    public void ANV(int i, long j) {
        A03();
        C33851hU r2 = this.A0I;
        AnonymousClass12U r1 = r2.A02;
        if (!r1.A03) {
            r2.A00();
            r1.A03 = true;
            Iterator it = r2.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
        this.A0G.ANV(i, j);
    }

    @Override // X.AnonymousClass12H
    public void AOo(boolean z) {
        A03();
        C225112b r3 = this.A0J;
        int A8R = A8R();
        int i = 1;
        if (r3.A02 != null) {
            if (!z) {
                r3.A00();
                i = -1;
            } else if (!(A8R == 1 || r3.A01 == 0)) {
                r3.A00();
            }
        }
        A08(z, i);
    }
}
