package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;

/* renamed from: X.1a6  reason: invalid class name and case insensitive filesystem */
public class C29731a6 implements AbstractC13780l0 {
    public final RectF A00 = new RectF();

    @Override // X.AbstractC13780l0
    public void AEN(AbstractC13770kz r1) {
    }

    public void A00(AbstractC13770kz r7) {
        Rect rect = new Rect();
        AnonymousClass1a2 r4 = (AnonymousClass1a2) r7;
        ((C13810l3) r4.A00).getPadding(rect);
        int ceil = (int) Math.ceil((double) A7Y(r7));
        int ceil2 = (int) Math.ceil((double) A7W(r7));
        CardView cardView = r4.A01;
        if (ceil > cardView.A01) {
            C29731a6.super.setMinimumWidth(ceil);
        }
        if (ceil2 > cardView.A00) {
            C29731a6.super.setMinimumHeight(ceil2);
        }
        r4.A00(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // X.AbstractC13780l0
    public ColorStateList A4s(AbstractC13770kz r2) {
        return ((C13810l3) ((AnonymousClass1a2) r2).A00).A04;
    }

    @Override // X.AbstractC13780l0
    public float A6A(AbstractC13770kz r2) {
        return ((C13810l3) ((AnonymousClass1a2) r2).A00).A02;
    }

    @Override // X.AbstractC13780l0
    public float A7E(AbstractC13770kz r2) {
        return ((C13810l3) ((AnonymousClass1a2) r2).A00).A01;
    }

    @Override // X.AbstractC13780l0
    public float A7W(AbstractC13770kz r7) {
        C13810l3 r0 = (C13810l3) ((AnonymousClass1a2) r7).A00;
        float f = r0.A01;
        float f2 = r0.A00;
        float f3 = (float) r0.A0C;
        float f4 = f * 1.5f;
        float f5 = f4 / 2.0f;
        return ((f4 + f3) * 2.0f) + (Math.max(f, f5 + f2 + f3) * 2.0f);
    }

    @Override // X.AbstractC13780l0
    public float A7Y(AbstractC13770kz r6) {
        C13810l3 r0 = (C13810l3) ((AnonymousClass1a2) r6).A00;
        float f = r0.A01;
        float f2 = r0.A00;
        float f3 = (float) r0.A0C;
        float f4 = f / 2.0f;
        return ((f + f3) * 2.0f) + (Math.max(f, f4 + f2 + f3) * 2.0f);
    }

    @Override // X.AbstractC13780l0
    public float A8e(AbstractC13770kz r2) {
        return ((C13810l3) ((AnonymousClass1a2) r2).A00).A00;
    }

    @Override // X.AbstractC13780l0
    public void AAk() {
        C13810l3.A0G = new C29721a5(this);
    }

    @Override // X.AbstractC13780l0
    public void AAo(AbstractC13770kz r9, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C13810l3 r2 = new C13810l3(context.getResources(), colorStateList, f, f2, f3);
        AnonymousClass1a2 r92 = (AnonymousClass1a2) r9;
        CardView cardView = r92.A01;
        r2.A09 = cardView.A03;
        r2.invalidateSelf();
        r92.A00 = r2;
        cardView.setBackgroundDrawable(r2);
        A00(r92);
    }

    @Override // X.AbstractC13780l0
    public void AIl(AbstractC13770kz r3) {
        AnonymousClass1a2 r32 = (AnonymousClass1a2) r3;
        C13810l3 r1 = (C13810l3) r32.A00;
        r1.A09 = r32.A01.A03;
        r1.invalidateSelf();
        A00(r32);
    }

    @Override // X.AbstractC13780l0
    public void ANw(AbstractC13770kz r2, ColorStateList colorStateList) {
        C13810l3 r0 = (C13810l3) ((AnonymousClass1a2) r2).A00;
        r0.A02(colorStateList);
        r0.invalidateSelf();
    }

    @Override // X.AbstractC13780l0
    public void AOD(AbstractC13770kz r3, float f) {
        C13810l3 r1 = (C13810l3) ((AnonymousClass1a2) r3).A00;
        r1.A01(f, r1.A01);
    }

    @Override // X.AbstractC13780l0
    public void AOV(AbstractC13770kz r3, float f) {
        C13810l3 r1 = (C13810l3) ((AnonymousClass1a2) r3).A00;
        r1.A01(r1.A02, f);
        A00(r3);
    }

    @Override // X.AbstractC13780l0
    public void AOw(AbstractC13770kz r4, float f) {
        C13810l3 r2 = (C13810l3) ((AnonymousClass1a2) r4).A00;
        if (r2 == null) {
            throw null;
        } else if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (r2.A00 != f2) {
                r2.A00 = f2;
                r2.A0A = true;
                r2.invalidateSelf();
            }
            A00(r4);
        } else {
            StringBuilder sb = new StringBuilder("Invalid radius ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
