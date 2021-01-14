package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.1hM  reason: invalid class name and case insensitive filesystem */
public class C33771hM implements AbstractC223811h {
    @Override // X.AbstractC223811h
    public long AC8(AbstractC224011k r7, float f, EnumC223911i r9, float f2, EnumC223911i r11) {
        int i;
        EnumC223911i r5 = EnumC223911i.EXACTLY;
        EnumC223911i r4 = EnumC223911i.AT_MOST;
        View view = (View) ((YogaNodeJNIBase) r7).mData;
        int i2 = 0;
        if (view == null || (view instanceof C224511p)) {
            return AnonymousClass0N2.A0N(0, 0);
        }
        int i3 = (int) f;
        if (r9 == r4) {
            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else {
            i = 0;
            if (r9 == r5) {
                i = 1073741824;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i);
        int i4 = (int) f2;
        if (r11 == r4) {
            i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else if (r11 == r5) {
            i2 = 1073741824;
        }
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, i2));
        return AnonymousClass0N2.A0N(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
