package X;

import android.graphics.Bitmap;
import android.os.Handler;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.0DD  reason: invalid class name */
public class AnonymousClass0DD {
    public final AnonymousClass08V A00;

    public AnonymousClass0DD(int i) {
        this.A00 = new AnonymousClass08X(this, i);
    }

    public int A00(Object obj, Object obj2) {
        if (this instanceof AnonymousClass0DC) {
            return ((Bitmap) obj2).getByteCount() >> 10;
        }
        if (this instanceof C12280hq) {
            return ((Bitmap) obj2).getByteCount() >> 10;
        }
        if (this instanceof C43391yI) {
            return ((Bitmap) obj2).getByteCount() >> 10;
        }
        throw null;
    }

    public long A01(int i) {
        long currentTimeMillis = System.currentTimeMillis() - ((long) i);
        AnonymousClass08V r4 = this.A00;
        long j = 0;
        for (Map.Entry entry : ((AbstractMap) r4.A05()).entrySet()) {
            synchronized (r4) {
                if (((C12430i5) entry.getValue()).A00 >= currentTimeMillis) {
                    return j;
                }
                A04(entry.getKey());
                j += (long) A00(entry.getKey(), ((C12430i5) entry.getValue()).A01);
            }
        }
        return j;
    }

    public Object A02(Object obj) {
        C12430i5 r2 = (C12430i5) this.A00.A03(obj);
        if (r2 == null) {
            return null;
        }
        A03();
        r2.A00 = System.currentTimeMillis();
        return r2.A01;
    }

    public void A03() {
        if (this instanceof AnonymousClass0DC) {
            Handler A01 = ((AnonymousClass0DC) this).A00.A01();
            if (!A01.hasMessages(0)) {
                A01.sendEmptyMessageDelayed(0, 60000);
            }
        } else if (this instanceof C12280hq) {
            Handler A012 = ((C12280hq) this).A00.A01();
            if (!A012.hasMessages(0)) {
                A012.sendEmptyMessageDelayed(0, 60000);
            }
        } else if (!(this instanceof C43391yI)) {
            throw null;
        } else {
            Handler A013 = ((C43391yI) this).A00.A01();
            if (!A013.hasMessages(0)) {
                A013.sendEmptyMessageDelayed(0, 60000);
            }
        }
    }

    public void A04(Object obj) {
        if (this.A00.A04(obj) == null) {
        }
    }

    public void A05(Object obj, Object obj2) {
        this.A00.A07(obj, new C12430i5(obj2, System.currentTimeMillis()));
        A03();
    }
}
