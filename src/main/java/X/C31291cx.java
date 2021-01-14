package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1cx  reason: invalid class name and case insensitive filesystem */
public class C31291cx implements AbstractC17830sL {
    public static final String A03 = AbstractC17610rq.A01("WorkConstraintsTracker");
    public final AbstractC17820sK A00;
    public final Object A01 = new Object();
    public final AbstractC31301cy[] A02;

    public C31291cx(Context context, AnonymousClass0t5 r6, AbstractC17820sK r7) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = r7;
        this.A02 = new AbstractC31301cy[]{new AnonymousClass24T(applicationContext, r6), new AnonymousClass24U(applicationContext, r6), new AnonymousClass24Z(applicationContext, r6), new AnonymousClass24V(applicationContext, r6), new AnonymousClass24Y(applicationContext, r6), new AnonymousClass24X(applicationContext, r6), new AnonymousClass24W(applicationContext, r6)};
    }

    public void A00() {
        synchronized (this.A01) {
            AbstractC31301cy[] r4 = this.A02;
            for (AbstractC31301cy r1 : r4) {
                if (!r1.A03.isEmpty()) {
                    r1.A03.clear();
                    r1.A01.A03(r1);
                }
            }
        }
    }

    public void A01(Iterable iterable) {
        boolean z;
        synchronized (this.A01) {
            AbstractC31301cy[] r7 = this.A02;
            for (AbstractC31301cy r2 : r7) {
                if (r2.A00 != null) {
                    r2.A00 = null;
                    r2.A00(null, r2.A02);
                }
            }
            for (AbstractC31301cy r9 : r7) {
                List list = r9.A03;
                list.clear();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C18030sf r3 = (C18030sf) it.next();
                    if (r9 instanceof AnonymousClass24Z) {
                        z = r3.A09.A07;
                    } else if (r9 instanceof AnonymousClass24Y) {
                        z = false;
                        if (r3.A09.A03 == EnumC07010Vo.UNMETERED) {
                            z = true;
                        }
                    } else if (r9 instanceof AnonymousClass24X) {
                        z = false;
                        if (r3.A09.A03 == EnumC07010Vo.NOT_ROAMING) {
                            z = true;
                        }
                    } else if (r9 instanceof AnonymousClass24W) {
                        z = false;
                        if (r3.A09.A03 == EnumC07010Vo.METERED) {
                            z = true;
                        }
                    } else if (!(r9 instanceof AnonymousClass24V)) {
                        z = !(r9 instanceof AnonymousClass24U) ? r3.A09.A05 : r3.A09.A04;
                    } else {
                        z = false;
                        if (r3.A09.A03 == EnumC07010Vo.CONNECTED) {
                            z = true;
                        }
                    }
                    if (z) {
                        list.add(r3.A0D);
                    }
                }
                if (list.isEmpty()) {
                    r9.A01.A03(r9);
                } else {
                    AbstractC17850sN r11 = r9.A01;
                    synchronized (r11.A03) {
                        Set set = r11.A04;
                        if (set.add(r9)) {
                            if (set.size() == 1) {
                                r11.A00 = r11.A00();
                                AbstractC17610rq.A00().A02(AbstractC17850sN.A05, String.format("%s: initial state = %s", r11.getClass().getSimpleName(), r11.A00), new Throwable[0]);
                                r11.A01();
                            }
                            r9.AEb(r11.A00);
                        }
                    }
                }
                r9.A00(r9.A00, r9.A02);
            }
            for (AbstractC31301cy r1 : r7) {
                if (r1.A00 != this) {
                    r1.A00 = this;
                    r1.A00(this, r1.A02);
                }
            }
        }
    }

    public boolean A02(String str) {
        synchronized (this.A01) {
            AbstractC31301cy[] r3 = this.A02;
            for (AbstractC31301cy r7 : r3) {
                Object obj = r7.A02;
                if (obj != null && r7.A01(obj) && r7.A03.contains(str)) {
                    AbstractC17610rq.A00().A02(A03, String.format("Work %s constrained by %s", str, r7.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
