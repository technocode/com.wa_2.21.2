package java.lang;

import X.C33081gA;
import X.C33171gJ;
import java.util.List;
import java.util.UUID;

public class RunnableEBaseShape0S1311000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public RunnableEBaseShape0S1311000_I1(Object obj, Object obj2, int i, String str, boolean z, Object obj3, int i2) {
        this.A06 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A04 = str;
        this.A05 = z;
        this.A03 = obj3;
    }

    public static void A00(RunnableEBaseShape0S1311000_I1 runnableEBaseShape0S1311000_I1) {
        List list = (List) runnableEBaseShape0S1311000_I1.A02;
        if (0 < list.size()) {
            list.get(0);
            throw null;
        } else if (runnableEBaseShape0S1311000_I1.A05) {
            C33171gJ r2 = (C33171gJ) runnableEBaseShape0S1311000_I1.A01;
            r2.A0a.A02((UUID) runnableEBaseShape0S1311000_I1.A03);
            r2.A3l(null);
        }
    }

    public void run() {
        switch (this.A06) {
            case 0:
                List list = (List) this.A02;
                if (0 < list.size()) {
                    list.get(0);
                    throw null;
                } else if (this.A05) {
                    C33081gA r2 = (C33081gA) this.A01;
                    r2.A0Q.A02((UUID) this.A03);
                    r2.A3l(null);
                    return;
                } else {
                    return;
                }
            case 1:
                A00(this);
                return;
            default:
                return;
        }
    }
}
