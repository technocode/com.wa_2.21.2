package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.google.android.search.verification.client.R;

/* renamed from: X.3OO  reason: invalid class name */
public abstract class AnonymousClass3OO extends C224511p {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    public AnonymousClass3OO(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AbstractC224011k r3 = super.A00;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.search_token_list_vertical_margin) - A04();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.search_item_horizontal_margin) - A04();
        float f = (float) dimensionPixelSize2;
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r3;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.LEFT.mIntValue, f);
        float f2 = (float) dimensionPixelSize;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.TOP.mIntValue, f2);
        YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.BOTTOM.mIntValue, f2);
        YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.RIGHT.mIntValue, f);
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass062.ROW.mIntValue);
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass061.FLEX_START.mIntValue);
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass064.WRAP.mIntValue);
    }

    public int A04() {
        return getResources().getDimensionPixelSize(R.dimen.search_token_list_yg_margin_all);
    }
}
