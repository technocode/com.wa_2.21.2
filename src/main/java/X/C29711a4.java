package X;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* renamed from: X.1a4  reason: invalid class name and case insensitive filesystem */
public class C29711a4 implements AbstractC13780l0 {
    @Override // X.AbstractC13780l0
    public void AAk() {
    }

    @Override // X.AbstractC13780l0
    public ColorStateList A4s(AbstractC13770kz r2) {
        return ((C13790l1) ((AnonymousClass1a2) r2).A00).A02;
    }

    @Override // X.AbstractC13780l0
    public float A6A(AbstractC13770kz r2) {
        return ((AnonymousClass1a2) r2).A01.getElevation();
    }

    @Override // X.AbstractC13780l0
    public float A7E(AbstractC13770kz r2) {
        return ((C13790l1) ((AnonymousClass1a2) r2).A00).A00;
    }

    @Override // X.AbstractC13780l0
    public float A7W(AbstractC13770kz r3) {
        return ((C13790l1) ((AnonymousClass1a2) r3).A00).A01 * 2.0f;
    }

    @Override // X.AbstractC13780l0
    public float A7Y(AbstractC13770kz r3) {
        return ((C13790l1) ((AnonymousClass1a2) r3).A00).A01 * 2.0f;
    }

    @Override // X.AbstractC13780l0
    public float A8e(AbstractC13770kz r2) {
        return ((C13790l1) ((AnonymousClass1a2) r2).A00).A01;
    }

    @Override // X.AbstractC13780l0
    public void AAo(AbstractC13770kz r4, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C13790l1 r2 = new C13790l1(colorStateList, f);
        AnonymousClass1a2 r0 = (AnonymousClass1a2) r4;
        r0.A00 = r2;
        CardView cardView = r0.A01;
        cardView.setBackgroundDrawable(r2);
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        AOV(r4, f3);
    }

    @Override // X.AbstractC13780l0
    public void AEN(AbstractC13770kz r2) {
        AOV(r2, ((C13790l1) ((AnonymousClass1a2) r2).A00).A00);
    }

    @Override // X.AbstractC13780l0
    public void AIl(AbstractC13770kz r2) {
        AOV(r2, ((C13790l1) ((AnonymousClass1a2) r2).A00).A00);
    }

    @Override // X.AbstractC13780l0
    public void ANw(AbstractC13770kz r2, ColorStateList colorStateList) {
        C13790l1 r0 = (C13790l1) ((AnonymousClass1a2) r2).A00;
        r0.A01(colorStateList);
        r0.invalidateSelf();
    }

    @Override // X.AbstractC13780l0
    public void AOD(AbstractC13770kz r2, float f) {
        ((AnonymousClass1a2) r2).A01.setElevation(f);
    }

    @Override // X.AbstractC13780l0
    public void AOV(AbstractC13770kz r10, float f) {
        AnonymousClass1a2 r102 = (AnonymousClass1a2) r10;
        C13790l1 r4 = (C13790l1) r102.A00;
        CardView cardView = r102.A01;
        boolean z = cardView.A02;
        boolean z2 = cardView.A03;
        if (!(f == r4.A00 && r4.A06 == z && r4.A07 == z2)) {
            r4.A00 = f;
            r4.A06 = z;
            r4.A07 = z2;
            r4.A02(null);
            r4.invalidateSelf();
        }
        if (!cardView.A02) {
            r102.A00(0, 0, 0, 0);
            return;
        }
        C13790l1 r0 = (C13790l1) r102.A00;
        float f2 = r0.A00;
        float f3 = r0.A01;
        boolean z3 = cardView.A03;
        float f4 = f2;
        if (z3) {
            f4 = (float) (((1.0d - C13810l3.A0H) * ((double) f3)) + ((double) f2));
        }
        int ceil = (int) Math.ceil((double) f4);
        int ceil2 = (int) Math.ceil((double) C13810l3.A00(f2, f3, z3));
        r102.A00(ceil, ceil2, ceil, ceil2);
    }

    @Override // X.AbstractC13780l0
    public void AOw(AbstractC13770kz r3, float f) {
        C13790l1 r1 = (C13790l1) ((AnonymousClass1a2) r3).A00;
        if (f != r1.A01) {
            r1.A01 = f;
            r1.A02(null);
            r1.invalidateSelf();
        }
    }
}
