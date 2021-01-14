package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0Ey  reason: invalid class name and case insensitive filesystem */
public class C03140Ey implements AbstractC03150Ez {
    public Object A00;
    public final Object A01 = new Object();
    public final List A02 = new ArrayList();

    public Object A00() {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
        }
        return obj;
    }

    public void A01() {
        synchronized (this.A01) {
            this.A02.clear();
        }
    }

    public void A02(AbstractC03150Ez r4) {
        synchronized (this.A01) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                if (((AbstractC03150Ez) ((Pair) it.next()).first).equals(r4)) {
                    it.remove();
                }
            }
        }
    }

    public void A03(AbstractC03150Ez r5, Executor executor) {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
            this.A02.add(Pair.create(r5, executor));
        }
        if (obj == null) {
            return;
        }
        if (executor == null) {
            r5.A1e(obj);
        } else {
            executor.execute(new RunnableEBaseShape1S0200000_I0_0(r5, obj, 40));
        }
    }

    public void A04(Object obj) {
        ArrayList arrayList;
        synchronized (this.A01) {
            this.A00 = obj;
            arrayList = new ArrayList(this.A02);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC03150Ez r3 = (AbstractC03150Ez) pair.first;
            Executor executor = (Executor) pair.second;
            if (executor == null) {
                r3.A1e(obj);
            } else {
                executor.execute(new RunnableEBaseShape1S0200000_I0_0(r3, obj, 40));
            }
        }
    }

    @Override // X.AbstractC03150Ez
    public void A1e(Object obj) {
        A04(obj);
    }
}
