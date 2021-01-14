package X;

import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Oo  reason: invalid class name */
public abstract class AnonymousClass0Oo extends AbstractC007503q {
    public boolean A00 = false;
    public boolean A01;
    public final List A02 = new ArrayList();

    public AnonymousClass0Oo(C007303n r2, long j, byte b) {
        super(r2, j, b);
        super.A0T(6);
    }

    @Override // X.AbstractC007503q
    public void A0T(int i) {
        super.A0T(6);
    }

    public AnonymousClass0QM A0u() {
        AnonymousClass0QM r0;
        AnonymousClass0QM r02;
        if (!(this instanceof AnonymousClass0ZH)) {
            C12220hk r3 = (C12220hk) this;
            synchronized (r3.A0o) {
                r02 = r3.A03;
                if (r02 == null) {
                    boolean z = ((AnonymousClass0Oo) r3).A01;
                    int i = r3.A00;
                    int i2 = 5;
                    int i3 = 2;
                    if (i > 0) {
                        i3 = 5;
                    } else if (r3.A0n.A02) {
                        switch (r3.A01) {
                            case 1:
                            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                                break;
                            case 2:
                            case 22:
                                i2 = 4;
                                break;
                            case 3:
                            case 6:
                            case 7:
                            case 8:
                            case 10:
                            case 15:
                            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            case 17:
                            case 19:
                                i2 = 3;
                                break;
                            case 4:
                            case 5:
                            case 9:
                                i2 = 2;
                                break;
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 18:
                                i2 = 1;
                                break;
                            case 21:
                                i2 = 6;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        i3 = i2;
                    }
                    r02 = AnonymousClass0QM.A01(r3, z, i, i3, r3.A02, false);
                    r3.A03 = r02;
                }
            }
            return r02;
        }
        AnonymousClass0ZH r2 = (AnonymousClass0ZH) this;
        synchronized (r2.A0o) {
            r0 = r2.A00;
            if (r0 == null) {
                r0 = AnonymousClass0QM.A01(r2, ((AnonymousClass0Oo) r2).A01, 0, 2, 0, true);
                r2.A00 = r0;
            }
        }
        return r0;
    }

    public List A0v() {
        AnonymousClass0QM A0u;
        List list = this.A02;
        if (list.isEmpty() && this.A00 && (A0u = A0u()) != null) {
            list.add(A0u);
        }
        return new ArrayList(list);
    }

    public void A0w(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, C64532yL.A00);
    }
}
