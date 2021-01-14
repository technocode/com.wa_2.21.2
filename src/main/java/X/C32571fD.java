package X;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: X.1fD  reason: invalid class name and case insensitive filesystem */
public class C32571fD implements AbstractC20220wL {
    public AbstractC20030w0 A00;
    public final SparseArray A01 = new SparseArray();
    public final C20360wa A02;
    public final boolean A03;

    public C32571fD(C20360wa r2, boolean z) {
        this.A02 = r2;
        this.A03 = z;
    }

    public static AbstractC20030w0 A00(AbstractC20030w0 r2) {
        C32841fh r1;
        AbstractC20030w0 A002;
        try {
            if (!AbstractC20030w0.A02(r2) || !(r2.A04() instanceof C32841fh) || (r1 = (C32841fh) r2.A04()) == null) {
                return null;
            }
            synchronized (r1) {
                A002 = AbstractC20030w0.A00(r1.A00);
            }
            r2.close();
            return A002;
        } finally {
            if (r2 != null) {
                r2.close();
            }
        }
    }

    @Override // X.AbstractC20220wL
    public synchronized boolean A30(int i) {
        boolean containsKey;
        C20360wa r0 = this.A02;
        C32791fb r3 = r0.A02;
        C32711fS r2 = new C32711fS(r0.A00, i);
        synchronized (r3) {
            C20430wh r1 = r3.A03;
            synchronized (r1) {
                containsKey = r1.A02.containsKey(r2);
            }
        }
        return containsKey;
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A4w(int i, int i2, int i3) {
        AbstractC20030w0 r5;
        AbstractC19710vU r1;
        C20440wi r3;
        boolean z;
        if (!this.A03) {
            return null;
        }
        C20360wa r6 = this.A02;
        do {
            synchronized (r6) {
                Iterator it = r6.A03.iterator();
                r5 = null;
                if (it.hasNext()) {
                    r1 = (AbstractC19710vU) it.next();
                    it.remove();
                } else {
                    r1 = null;
                }
            }
            if (r1 == null) {
                break;
            }
            C32791fb r4 = r6.A02;
            synchronized (r4) {
                r3 = (C20440wi) r4.A04.A02(r1);
                z = false;
                if (r3 != null) {
                    C20440wi r12 = (C20440wi) r4.A03.A02(r1);
                    if (r12 != null) {
                        if (r12.A00 == 0) {
                            z = true;
                        }
                        AnonymousClass0N2.A1Z(z);
                        r5 = r12.A02;
                        z = true;
                    } else {
                        throw null;
                    }
                }
            }
            if (z) {
                C32791fb.A00(r3);
                continue;
            }
        } while (r5 == null);
        return A00(r5);
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A55(int i) {
        AbstractC20030w0 r3;
        C20440wi r2;
        Object obj;
        C20360wa r0 = this.A02;
        C32791fb r5 = r0.A02;
        C32711fS r4 = new C32711fS(r0.A00, i);
        r3 = null;
        synchronized (r5) {
            r2 = (C20440wi) r5.A04.A02(r4);
            C20430wh r1 = r5.A03;
            synchronized (r1) {
                obj = r1.A02.get(r4);
            }
            C20440wi r02 = (C20440wi) obj;
            if (r02 != null) {
                r3 = r5.A01(r02);
            }
        }
        C32791fb.A00(r2);
        r5.A04();
        r5.A03();
        return A00(r3);
    }

    @Override // X.AbstractC20220wL
    public synchronized AbstractC20030w0 A6L(int i) {
        return A00(AbstractC20030w0.A00(this.A00));
    }

    @Override // X.AbstractC20220wL
    public synchronized void AGN(int i, AbstractC20030w0 r6, int i2) {
        AbstractC20030w0 r3 = null;
        try {
            AbstractC20030w0 A012 = AbstractC20030w0.A01(new C32841fh(r6), AbstractC20030w0.A05, AbstractC20030w0.A04);
            if (A012 != null) {
                AbstractC20030w0 A002 = this.A02.A00(i, A012);
                if (AbstractC20030w0.A02(A002)) {
                    SparseArray sparseArray = this.A01;
                    r3 = (AbstractC20030w0) sparseArray.get(i);
                    sparseArray.put(i, A002);
                }
                A012.close();
            }
        } finally {
            if (r3 != null) {
                r3.close();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, X.0w0] */
    @Override // X.AbstractC20220wL
    public synchronized void AGO(int i, AbstractC20030w0 r6, int i2) {
        AbstractC20030w0 r1 = 0;
        if (r6 != null) {
            SparseArray sparseArray = this.A01;
            AbstractC20030w0 r0 = (AbstractC20030w0) sparseArray.get(i);
            if (r0 != null) {
                sparseArray.delete(i);
                if (r0 != null) {
                    r0.close();
                }
            }
            try {
                AbstractC20030w0 A012 = AbstractC20030w0.A01(new C32841fh(r6), AbstractC20030w0.A05, AbstractC20030w0.A04);
                if (A012 != null) {
                    r1 = this.A00;
                    this.A00 = this.A02.A00(i, A012);
                    A012.close();
                }
            } finally {
                if (r1 != 0) {
                    r1.close();
                }
            }
        } else {
            throw r1;
        }
    }

    @Override // X.AbstractC20220wL
    public synchronized void clear() {
        AbstractC20030w0 r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                AbstractC20030w0 r02 = (AbstractC20030w0) sparseArray.valueAt(i);
                if (r02 != null) {
                    r02.close();
                }
                i++;
            } else {
                sparseArray.clear();
            }
        }
    }
}
