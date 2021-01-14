package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0SX  reason: invalid class name */
public class AnonymousClass0SX {
    public final AnonymousClass0LW A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public AnonymousClass0SX(AnonymousClass0LW r2) {
        this.A00 = r2;
    }

    public void A00(AnonymousClass037 r4, Context context, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A00(r4, context, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A01(AnonymousClass037 r4, Context context, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A01(r4, context, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A02(AnonymousClass037 r4, Bundle bundle, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A02(r4, bundle, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A03(AnonymousClass037 r4, Bundle bundle, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A03(r4, bundle, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A04(AnonymousClass037 r4, Bundle bundle, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A04(r4, bundle, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A05(AnonymousClass037 r4, Bundle bundle, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A05(r4, bundle, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A06(AnonymousClass037 r4, View view, Bundle bundle, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A06(r4, view, bundle, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A07(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A07(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A08(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A08(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A09(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A09(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if (!z || r1.A01) {
                ((AnonymousClass0L9) r1.A00).A00.A03(r4, "paused");
            }
        }
    }

    public void A0A(AnonymousClass037 r5, boolean z) {
        String str;
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A0A(r5, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if (!z || r1.A01) {
                AnonymousClass0L9 r2 = (AnonymousClass0L9) r1.A00;
                StringBuilder A0S = AnonymousClass008.A0S("resumed ");
                if (r5.A0k) {
                    str = "visible";
                } else {
                    str = "invisible";
                }
                A0S.append(str);
                r2.A00.A03(r5, A0S.toString());
            }
        }
    }

    public void A0B(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A0B(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A0C(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A0C(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }

    public void A0D(AnonymousClass037 r4, boolean z) {
        AnonymousClass037 r0 = this.A00.A02;
        if (r0 != null) {
            r0.A0D().A0P.A0D(r4, true);
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0WW r1 = (AnonymousClass0WW) it.next();
            if ((!z || r1.A01) && r1.A00 == null) {
                throw null;
            }
        }
    }
}
