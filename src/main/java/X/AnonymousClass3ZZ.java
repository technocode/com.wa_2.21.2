package X;

import android.content.Context;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.3ZZ  reason: invalid class name */
public class AnonymousClass3ZZ extends AnonymousClass3OO {
    public AnonymousClass3ZZ(Context context) {
        super(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.search_token_list_vertical_margin) - A04()) - (A04() >> 1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.search_item_horizontal_margin) - A04();
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setLayoutParams(marginLayoutParams);
    }

    public void A05(SparseIntArray sparseIntArray, SearchViewModel searchViewModel) {
        removeAllViews();
        int A04 = A04();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < sparseIntArray.size(); i++) {
            if (sparseIntArray.keyAt(i) != 0) {
                arrayList.add(new Pair(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i))));
            }
        }
        Collections.sort(arrayList, C656630v.A00);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) ((Pair) it.next()).first).intValue();
            C655630j r4 = (C655630j) C28051Sr.A0T().get(intValue);
            if (r4 != null) {
                Chip chip = new Chip(getContext(), null);
                chip.setText(((AnonymousClass3OO) this).A00.A06(r4.A05));
                chip.setClickable(true);
                chip.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(searchViewModel, intValue, 7));
                C28051Sr.A1K(getContext(), chip, intValue, R.color.search_token_text);
                chip.setChipIconTintResource(R.color.search_token_text);
                chip.setTextColor(C004302a.A00(getContext(), R.color.search_token_text));
                chip.setChipBackgroundColorResource(R.color.searchChipBackground);
                chip.setId(r4.A04);
                addView(chip);
                EnumC223711e r2 = EnumC223711e.LEFT;
                float f = (float) A04;
                YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((AbstractC224011k) this.A01.get(chip));
                YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, r2.mIntValue, f);
                YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.RIGHT.mIntValue, f);
                YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.BOTTOM.mIntValue, f);
                YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, EnumC223711e.TOP.mIntValue, f);
            }
        }
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(((YogaNodeJNIBase) ((C224511p) this).A00).mNativePointer);
        if (sparseIntArray.get(0) == 1) {
            z = true;
        }
        setBackground(z);
    }

    private void setBackground(boolean z) {
        Context context = getContext();
        int i = R.color.primary_surface;
        if (z) {
            i = R.color.neutral_primary;
        }
        setBackgroundColor(C004302a.A00(context, i));
    }
}
