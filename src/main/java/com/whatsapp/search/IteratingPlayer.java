package com.whatsapp.search;

import X.AbstractC11900hC;
import X.AbstractC16420pm;
import X.AbstractC16450pp;
import X.AbstractC59872oQ;
import X.AnonymousClass02M;
import X.AnonymousClass082;
import X.AnonymousClass0SL;
import X.C71043Nj;
import X.C73943Zl;
import X.C74913bm;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class IteratingPlayer implements AbstractC16420pm, AnonymousClass0SL {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03;
    public final AbstractC16450pp A04 = new C71043Nj(this);
    public final RecyclerView A05;
    public final AnonymousClass02M A06;
    public final Runnable A07 = new RunnableEBaseShape12S0100000_I1_7(this, 31);

    public IteratingPlayer(AnonymousClass02M r3, RecyclerView recyclerView) {
        this.A06 = r3;
        this.A05 = recyclerView;
    }

    public final void A00() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass02M r0 = this.A06;
            r0.A02.postDelayed(this.A07, 2000);
        }
    }

    public final void A01() {
        this.A03 = false;
        AbstractC11900hC r0 = (AbstractC11900hC) this.A05.A0D(this.A00, false);
        if (r0 != null) {
            r0.A0E(false);
        }
        AnonymousClass02M r02 = this.A06;
        r02.A02.removeCallbacks(this.A07);
    }

    public final void A02() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A05.A0S;
        if (linearLayoutManager == null) {
            A00();
            return;
        }
        this.A01 = linearLayoutManager.A0r();
        this.A02 = linearLayoutManager.A0t();
    }

    public final void A03(int i) {
        boolean z;
        if (this.A01 > 0 || this.A02 > 0) {
            int i2 = this.A00;
            RecyclerView recyclerView = this.A05;
            AbstractC11900hC r0 = (AbstractC11900hC) recyclerView.A0D(i2, false);
            if (r0 != null) {
                r0.A0E(false);
            }
            int min = Math.min(Math.max(i, this.A01), this.A02);
            int i3 = min;
            do {
                AbstractC11900hC r1 = (AbstractC11900hC) recyclerView.A0D(i3, false);
                if (r1 != null) {
                    if (!(r1 instanceof C73943Zl)) {
                        z = r1 instanceof AbstractC59872oQ;
                    } else {
                        z = ((C73943Zl) r1).A01 instanceof C74913bm;
                    }
                    if (z) {
                        AbstractC11900hC r02 = (AbstractC11900hC) recyclerView.A0D(i3, false);
                        if (r02 != null) {
                            r02.A0E(true);
                        }
                        this.A00 = i3;
                        return;
                    }
                }
                i3++;
                int i4 = this.A02;
                if (i3 > i4) {
                    i3 = this.A01;
                }
                if (min == i3 || i3 > i4) {
                    A01();
                }
            } while (i3 >= this.A01);
            A01();
            return;
        }
        A01();
    }

    @Override // X.AbstractC16420pm
    public void AE4(View view) {
        A02();
        A00();
    }

    @Override // X.AbstractC16420pm
    public void AE5(View view) {
        A02();
    }

    @OnLifecycleEvent(AnonymousClass082.ON_START)
    public void onStart() {
        A00();
    }

    @OnLifecycleEvent(AnonymousClass082.ON_STOP)
    public void onStop() {
        A01();
    }
}
