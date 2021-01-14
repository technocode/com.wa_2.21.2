package X;

import android.util.SparseIntArray;
import com.whatsapp.search.SearchGridLayoutManager;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0pJ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16130pJ {
    public final SparseIntArray A00 = new SparseIntArray();

    public int A00(int i) {
        boolean z;
        if (this instanceof C71363Op) {
            int i2 = ((AbstractC658031p) ((C71363Op) this).A00.A00.A04.get(i)).A00;
            if (i2 == 0 || i2 == 1) {
                return 1;
            }
            if (i2 == 2 || i2 == 3) {
                return 3;
            }
            throw new UnsupportedOperationException(AnonymousClass008.A0F("Invalid viewType: ", i2));
        } else if (this instanceof C71243Od) {
            int A002 = ((C71243Od) this).A00.A00.A00(i);
            if (A002 == 0 || A002 == 1 || A002 == 2 || A002 == 3) {
                return 1;
            }
            if (A002 == 4 || A002 == 5) {
                return 2;
            }
            throw new UnsupportedOperationException(AnonymousClass008.A0F("Invalid viewType: ", A002));
        } else if (this instanceof C71103Np) {
            C71103Np r0 = (C71103Np) this;
            SearchGridLayoutManager searchGridLayoutManager = r0.A01;
            int i3 = r0.A00.getResources().getConfiguration().orientation;
            int A003 = searchGridLayoutManager.A00.A00(i);
            int i4 = 3;
            if (A003 == -1 || A003 == 99 || A003 == 1 || A003 == 2 || A003 == 3 || A003 == 4) {
                return 6;
            }
            switch (A003) {
                case 6:
                case 7:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                case 17:
                case 18:
                case 19:
                case AnonymousClass0PW.A01:
                case 21:
                    return 6;
                case 8:
                    if (i3 == 1) {
                        return i4;
                    }
                    return 2;
                case 9:
                case 10:
                    i4 = 1;
                    if (i3 == 1) {
                        return 2;
                    }
                    break;
                default:
                    throw new UnsupportedOperationException(AnonymousClass008.A0F("Invalid viewType: ", A003));
            }
            return i4;
        } else if (this instanceof C69833Is) {
            C69833Is r1 = (C69833Is) this;
            if (r1.A01.A05.A0A(i)) {
                return r1.A00.A00;
            }
            return 1;
        } else if (this instanceof C69793Im) {
            C69793Im r3 = (C69793Im) this;
            AbstractC69803In r2 = r3.A01;
            if (r2.A06 == null) {
                return 1;
            }
            if (!(r2 instanceof AnonymousClass3Z4)) {
                z = !(r2 instanceof AnonymousClass3Z3) ? false : ((C54492f0) r2.A00()).A0A(i);
            } else {
                z = false;
            }
            if (z) {
                return r3.A00.A00;
            }
            return 1;
        } else if (this instanceof C54502f1) {
            C54502f1 r12 = (C54502f1) this;
            if (r12.A01.A0B.A0A(i)) {
                return r12.A00.A00;
            }
            return 1;
        } else if (this instanceof C54372eo) {
            C54372eo r13 = (C54372eo) this;
            if (r13.A01.A0I.A0A(i)) {
                return r13.A00.A00;
            }
            return 1;
        } else if (this instanceof AnonymousClass2cV) {
            AnonymousClass2cV r22 = (AnonymousClass2cV) this;
            int i5 = r22.A03.A08(i).A00;
            if (i5 == 0) {
                return r22.A00;
            }
            if (i5 == 1) {
                return r22.A01;
            }
            if (i5 == 2) {
                return r22.A02.A00;
            }
            throw new IllegalStateException("shapepickerrecyclerview/invalid grid size");
        } else if (!(this instanceof C40871ty)) {
            return 1;
        } else {
            C40871ty r6 = (C40871ty) this;
            if ((((C40891u0) r6.A01.A0N).A08(i) & 4294967295L) == 4294967295L) {
                return r6.A00.A00;
            }
            return 1;
        }
    }

    public int A01(int i, int i2) {
        if (this instanceof C30461bO) {
            return i % i2;
        }
        int A002 = A00(i);
        if (A002 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int A003 = A00(i4);
            i3 += A003;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = A003;
            }
        }
        if (A002 + i3 <= i2) {
            return i3;
        }
        return 0;
    }
}
