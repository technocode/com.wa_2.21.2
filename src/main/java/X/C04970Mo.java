package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0Mo  reason: invalid class name and case insensitive filesystem */
public final class C04970Mo extends AbstractC04160Jh implements AnonymousClass077 {
    public C04970Mo() {
        super(C02840Dr.A0b);
    }

    public AnonymousClass0OG A04() {
        AnonymousClass0OG r0 = ((C02840Dr) this.A00).A0X;
        if (r0 == null) {
            return AnonymousClass0OG.A05;
        }
        return r0;
    }

    public void A05(C75653dH r3) {
        A02();
        C02840Dr r1 = (C02840Dr) this.A00;
        if (r1 != null) {
            r1.A02 = (C75663dI) r3.A01();
            r1.A00 |= 128;
            return;
        }
        throw null;
    }

    public void A06(C75933dj r3) {
        A02();
        C02840Dr r1 = (C02840Dr) this.A00;
        if (r1 != null) {
            r1.A0D = (C75943dk) r3.A01();
            r1.A00 |= 32;
            return;
        }
        throw null;
    }

    public void A07(C76293eJ r4) {
        A02();
        C02840Dr r2 = (C02840Dr) this.A00;
        if (r2 != null) {
            r2.A0M = (C02890Dw) r4.A01();
            r2.A00 |= 65536;
            return;
        }
        throw null;
    }

    public void A08(C76343eO r4) {
        A02();
        C02840Dr r2 = (C02840Dr) this.A00;
        if (r2 != null) {
            r2.A0P = (C76393eT) r4.A01();
            r2.A00 |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            return;
        }
        throw null;
    }

    public void A09(C76403eU r3) {
        A02();
        C02840Dr r1 = (C02840Dr) this.A00;
        if (r1 != null) {
            r1.A0Q = (C76413eV) r3.A01();
            r1.A00 |= 2048;
            return;
        }
        throw null;
    }

    public void A0A(C76523eg r4) {
        A02();
        C02840Dr r2 = (C02840Dr) this.A00;
        if (r2 != null) {
            r2.A0X = (AnonymousClass0OG) r4.A01();
            r2.A00 |= 1048576;
            return;
        }
        throw null;
    }

    public void A0B(C76553ej r3) {
        A02();
        C02840Dr r1 = (C02840Dr) this.A00;
        if (r1 != null) {
            r1.A0Y = (C76563ek) r3.A01();
            r1.A00 |= 256;
            return;
        }
        throw null;
    }
}
