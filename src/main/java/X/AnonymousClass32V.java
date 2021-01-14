package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.32V  reason: invalid class name */
public abstract class AnonymousClass32V {
    public final AbstractC02790Dl A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass01X A03;
    public final C02560Co A04;
    public final AbstractC71653Pu A05;

    public abstract long A00();

    public abstract void A04();

    public abstract void A05();

    public AnonymousClass32V(AnonymousClass02M r1, AnonymousClass03P r2, AnonymousClass01X r3, C02560Co r4, AbstractC02790Dl r5, AbstractC71653Pu r6) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = r5;
        this.A05 = r6;
    }

    public Context A01() {
        return this.A05.A00.A0A();
    }

    public View A02() {
        if (this instanceof C71493Pe) {
            return ((C71493Pe) this).A09;
        }
        if (this instanceof C71463Pb) {
            return ((C71463Pb) this).A00;
        }
        if (!(this instanceof C71453Pa)) {
            return ((AnonymousClass3PY) this).A06;
        }
        return ((C71453Pa) this).A01;
    }

    public void A03() {
        if (this instanceof C71493Pe) {
            C71493Pe r2 = (C71493Pe) this;
            r2.A0H("resumePlayback");
            if (!r2.A04) {
                r2.A0D();
                if (r2.A02 != null) {
                    r2.A0H("resumePlayback/player not null");
                    r2.A02.A07();
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("statusplaybackvideo/no player for ");
                    A0S.append(r2.A0H.A0n);
                    Log.w(A0S.toString());
                }
                DoodleView doodleView = r2.A0D;
                if (doodleView != null) {
                    doodleView.A07();
                }
                r2.A0F();
            }
        } else if (this instanceof C71463Pb) {
            ((C71463Pb) this).A05.A01();
        } else if (!(this instanceof C71453Pa)) {
            ((AnonymousClass3PY) this).A08.A01();
        } else {
            ((C71453Pa) this).A06.A01();
        }
    }

    public void A06(boolean z) {
        if (this instanceof C71493Pe) {
            C71493Pe r2 = (C71493Pe) this;
            r2.A04 = z;
            AbstractC71663Pv r1 = ((AnonymousClass32V) r2).A05.A00;
            if (r1.A05) {
                AnonymousClass37M r0 = r2.A02;
                if (z) {
                    if (r0 != null) {
                        r0.A05();
                        Bitmap A032 = r2.A02.A03();
                        if (A032 != null) {
                            r2.A0G.A06(A032);
                            r2.A06 = true;
                        }
                    }
                    r2.A08.setVisibility(0);
                    r2.A0G();
                } else if (r0 == null) {
                    r2.A0H("onDragEnd/startPlayback");
                    r2.A04();
                } else {
                    r2.A0H("onDragEnd/resumePlayback");
                    r1.A0G();
                }
            }
        }
    }

    public boolean A07() {
        if (this instanceof C71493Pe) {
            C71493Pe r0 = (C71493Pe) this;
            return C28051Sr.A1t(((AnonymousClass32V) r0).A04, r0.A0H);
        } else if (this instanceof C71463Pb) {
            C71463Pb r02 = (C71463Pb) this;
            return C28051Sr.A1t(((AnonymousClass32V) r02).A04, r02.A04);
        } else if (!(this instanceof C71453Pa)) {
            AnonymousClass3PY r03 = (AnonymousClass3PY) this;
            return C28051Sr.A1t(((AnonymousClass32V) r03).A04, r03.A07);
        } else {
            C71453Pa r04 = (C71453Pa) this;
            return C28051Sr.A1t(((AnonymousClass32V) r04).A04, r04.A05);
        }
    }

    public boolean A08() {
        View view;
        return (this instanceof C71453Pa) && (view = ((C71453Pa) this).A00) != null && view.getVisibility() == 0;
    }
}
