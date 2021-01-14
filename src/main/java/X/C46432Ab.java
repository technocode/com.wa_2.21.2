package X;

import android.util.TypedValue;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Ab  reason: invalid class name and case insensitive filesystem */
public final class C46432Ab extends AnonymousClass06d implements AnonymousClass05o {
    public float A00 = 1.0f;
    public float A01 = 0.0f;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public View A06;

    @Override // X.AbstractC009005t
    public AnonymousClass1Gq A8a() {
        return null;
    }

    @Override // X.AbstractC009906e
    public boolean ACG() {
        return true;
    }

    @Override // X.AbstractC009005t
    public List A4u() {
        return Collections.emptyList();
    }

    @Override // X.AbstractC009906e
    public AbstractC25331Gl A4v() {
        return C38011pA.A00;
    }

    @Override // X.AnonymousClass05o
    public boolean ANv(String str, AbstractC011306t r6) {
        switch (str.hashCode()) {
            case -1840651833:
                if (str.equals("translate_x")) {
                    this.A04 = ((Number) r6).floatValue();
                    View view = this.A06;
                    if (view != null) {
                        view.setTranslationX(TypedValue.applyDimension(1, this.A04, view.getContext().getResources().getDisplayMetrics()));
                    }
                    return true;
                }
                break;
            case -1840651832:
                if (str.equals("translate_y")) {
                    this.A05 = ((Number) r6).floatValue();
                    View view2 = this.A06;
                    if (view2 != null) {
                        view2.setTranslationY(TypedValue.applyDimension(1, this.A05, view2.getContext().getResources().getDisplayMetrics()));
                    }
                    return true;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    float floatValue = ((Number) r6).floatValue();
                    this.A01 = floatValue;
                    View view3 = this.A06;
                    if (view3 != null) {
                        view3.setRotation(floatValue);
                    }
                    return true;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    float floatValue2 = ((Number) r6).floatValue();
                    this.A00 = floatValue2;
                    View view4 = this.A06;
                    if (view4 != null) {
                        view4.setAlpha(floatValue2);
                    }
                    return true;
                }
                break;
            case 1910893251:
                if (str.equals("scale_x")) {
                    float floatValue3 = ((Number) r6).floatValue();
                    this.A02 = floatValue3;
                    View view5 = this.A06;
                    if (view5 != null) {
                        view5.setScaleX(floatValue3);
                    }
                    return true;
                }
                break;
            case 1910893252:
                if (str.equals("scale_y")) {
                    float floatValue4 = ((Number) r6).floatValue();
                    this.A03 = floatValue4;
                    View view6 = this.A06;
                    if (view6 != null) {
                        view6.setScaleY(floatValue4);
                    }
                    return true;
                }
                break;
        }
        return false;
    }
}
