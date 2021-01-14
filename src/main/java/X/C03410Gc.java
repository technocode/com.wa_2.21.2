package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Gc  reason: invalid class name and case insensitive filesystem */
public class C03410Gc {
    public int A00;
    public AbstractC03430Gf A01;
    public final Comparator A02 = AnonymousClass2QC.A00;
    public volatile List A03;

    public C03410Gc(AbstractC03430Gf r2, int i) {
        this.A01 = r2;
        this.A00 = i;
    }

    public int A00() {
        int min;
        A07();
        synchronized (this) {
            min = Math.min(this.A00, this.A03.size());
        }
        return min;
    }

    public Object A01(int i) {
        Object A6a;
        A07();
        synchronized (this) {
            A6a = ((AnonymousClass2QD) this.A03.get(i)).A6a();
        }
        return A6a;
    }

    public List A02() {
        List A06;
        A07();
        synchronized (this) {
            A06 = A06(this.A03.size());
        }
        return A06;
    }

    public Map A03() {
        HashMap hashMap;
        A07();
        synchronized (this) {
            hashMap = new HashMap();
            for (AnonymousClass2QD r0 : this.A03) {
                hashMap.put(r0.A6a(), Float.valueOf(r0.A9r()));
            }
        }
        return hashMap;
    }

    public final void A04() {
        if (this.A03 != null) {
            for (int size = this.A03.size() - 1; size >= this.A00; size--) {
                if (((AnonymousClass2QD) this.A03.get(size)).A9r() < 0.1f) {
                    A08(size);
                }
            }
            return;
        }
        throw null;
    }

    public void A05(Object obj) {
        A07();
        synchronized (this) {
            for (int size = this.A03.size() - 1; size >= 0; size--) {
                if (((AnonymousClass2QD) this.A03.get(size)).A2r(obj)) {
                    A08(size);
                }
            }
            this.A01.AM3(this.A03);
        }
    }

    public List A06(int i) {
        A07();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i2 = 0; i2 < Math.min(i, this.A03.size()); i2++) {
                arrayList.add(((AnonymousClass2QD) this.A03.get(i2)).A6a());
            }
        }
        return arrayList;
    }

    public void A07() {
        synchronized (this) {
            if (this.A03 == null) {
                this.A03 = Collections.synchronizedList(this.A01.AAW());
            }
        }
    }

    public void A08(int i) {
        A07();
        synchronized (this) {
            this.A03.remove(i);
        }
    }

    public void A09(AnonymousClass2QD r2) {
        A07();
        synchronized (this) {
            this.A03.add(r2);
        }
    }

    public boolean A0A(Object obj) {
        boolean z;
        A07();
        synchronized (this) {
            z = false;
            for (AnonymousClass2QD r2 : this.A03) {
                float A9r = r2.A9r();
                if (!r2.A2r(obj)) {
                    r2.APN(A9r * 0.9f);
                } else {
                    r2.APN(A9r + 1.0f);
                    z = true;
                }
            }
            if (!z) {
                A09(this.A01.A3H(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            A04();
            this.A01.AM3(this.A03);
        }
        return z;
    }
}
