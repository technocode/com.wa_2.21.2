package X;

import android.os.Looper;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Bj  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC02280Bj {
    public static final Object A09 = new Object();
    public int A00;
    public int A01;
    public C014107y A02;
    public boolean A03;
    public boolean A04;
    public final Object A05;
    public final Runnable A06;
    public volatile Object A07;
    public volatile Object A08;

    public AbstractC02280Bj() {
        this.A05 = new Object();
        this.A02 = new C014107y();
        this.A00 = 0;
        Object obj = A09;
        this.A08 = obj;
        this.A06 = new RunnableEBaseShape0S0100000_I0_0(this, 18);
        this.A07 = obj;
        this.A01 = -1;
    }

    public AbstractC02280Bj(Object obj) {
        this.A05 = new Object();
        this.A02 = new C014107y();
        this.A00 = 0;
        this.A08 = A09;
        this.A06 = new RunnableEBaseShape0S0100000_I0_0(this, 18);
        this.A07 = obj;
        this.A01 = 0;
    }

    public static void A00(String str) {
        boolean z;
        AbstractC06850Uy r1 = C06840Ux.A00().A01;
        if (!(r1 instanceof AnonymousClass0V0)) {
            z = ((C06840Ux) r1).A01.A02();
        } else {
            z = false;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
        }
        if (!z) {
            throw new IllegalStateException(AnonymousClass008.A0L("Cannot invoke ", str, " on a background thread"));
        }
    }

    public Object A01() {
        Object obj = this.A07;
        if (obj != A09) {
            return obj;
        }
        return null;
    }

    public void A02(AbstractC005102k r5) {
        boolean z;
        A00("removeObservers");
        Iterator it = this.A02.iterator();
        while (true) {
            AbstractC11200fs r1 = (AbstractC11200fs) it;
            if (r1.hasNext()) {
                Map.Entry entry = (Map.Entry) r1.next();
                AnonymousClass0V3 r12 = (AnonymousClass0V3) entry.getValue();
                if (!(r12 instanceof LiveData$LifecycleBoundObserver)) {
                    z = false;
                } else {
                    AbstractC005102k r0 = ((LiveData$LifecycleBoundObserver) r12).A00;
                    z = false;
                    if (r0 == r5) {
                        z = true;
                    }
                }
                if (z) {
                    A06((AnonymousClass0SG) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void A03(AbstractC005102k r4, AnonymousClass0SG r5) {
        boolean z;
        A00("observe");
        if (((C013807v) r4.A75()).A02 != EnumC014207z.DESTROYED) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, r4, r5);
            AnonymousClass0V3 r1 = (AnonymousClass0V3) this.A02.A02(r5, liveData$LifecycleBoundObserver);
            if (r1 != null) {
                if (!(r1 instanceof LiveData$LifecycleBoundObserver)) {
                    z = false;
                } else {
                    AbstractC005102k r0 = ((LiveData$LifecycleBoundObserver) r1).A00;
                    z = false;
                    if (r0 == r4) {
                        z = true;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
                return;
            }
            r4.A75().A00(liveData$LifecycleBoundObserver);
        }
    }

    public void A04(AnonymousClass0V3 r5) {
        if (this.A04) {
            this.A03 = true;
            return;
        }
        this.A04 = true;
        do {
            this.A03 = false;
            if (r5 == null) {
                C014107y r0 = this.A02;
                C07130Wa r2 = new C07130Wa(r0);
                r0.A03.put(r2, Boolean.FALSE);
                while (r2.hasNext()) {
                    A05((AnonymousClass0V3) ((Map.Entry) r2.next()).getValue());
                    if (this.A03) {
                        break;
                    }
                }
            } else {
                A05(r5);
                r5 = null;
            }
        } while (this.A03);
        this.A04 = false;
    }

    public final void A05(AnonymousClass0V3 r3) {
        boolean z;
        if (r3.A01) {
            if (!(r3 instanceof LiveData$LifecycleBoundObserver)) {
                z = true;
            } else {
                z = false;
                if (((C013807v) ((LiveData$LifecycleBoundObserver) r3).A00.A75()).A02.compareTo((Enum) EnumC014207z.STARTED) >= 0) {
                    z = true;
                }
            }
            if (!z) {
                r3.A00(false);
                return;
            }
            int i = r3.A00;
            int i2 = this.A01;
            if (i < i2) {
                r3.A00 = i2;
                r3.A02.ADy(this.A07);
            }
        }
    }

    public void A06(AnonymousClass0SG r4) {
        A00("removeObserver");
        AnonymousClass0V3 r2 = (AnonymousClass0V3) this.A02.A01(r4);
        if (r2 != null) {
            if (r2 instanceof LiveData$LifecycleBoundObserver) {
                LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = (LiveData$LifecycleBoundObserver) r2;
                ((C013807v) liveData$LifecycleBoundObserver.A00.A75()).A01.A01(liveData$LifecycleBoundObserver);
            }
            r2.A00(false);
        }
    }

    public void A07(Object obj) {
        A00("setValue");
        this.A01++;
        this.A07 = obj;
        A04(null);
    }
}
