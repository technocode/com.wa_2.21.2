package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.11p  reason: invalid class name and case insensitive filesystem */
public class C224511p extends ViewGroup {
    public final AbstractC224011k A00;
    public final Map A01 = new HashMap();

    public C224511p(Context context) {
        super(context, null, 0);
        AnonymousClass25K r1 = new AnonymousClass25K();
        this.A00 = r1;
        r1.mData = this;
        r1.setMeasureFunction(new C33771hM());
        A00((C224411o) generateDefaultLayoutParams(), this.A00, this);
    }

    public static void A00(C224411o r15, AbstractC224011k r16, View view) {
        AnonymousClass064 r2;
        EnumC224211m r22;
        EnumC224111l r23;
        AnonymousClass063 r24;
        AnonymousClass062 r25;
        EnumC223511c r26;
        EnumC223711e r13 = EnumC223711e.ALL;
        EnumC223711e r12 = EnumC223711e.VERTICAL;
        EnumC223711e r11 = EnumC223711e.HORIZONTAL;
        EnumC223711e r10 = EnumC223711e.END;
        EnumC223711e r9 = EnumC223711e.START;
        EnumC223711e r8 = EnumC223711e.BOTTOM;
        EnumC223711e r7 = EnumC223711e.RIGHT;
        EnumC223711e r6 = EnumC223711e.TOP;
        EnumC223711e r4 = EnumC223711e.LEFT;
        if (Build.VERSION.SDK_INT >= 17 && view.getResources().getConfiguration().getLayoutDirection() == 1) {
            YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) r16).mNativePointer, EnumC223511c.RTL.mIntValue);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r16;
                YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, r4.mIntValue, (float) rect.left);
                YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, r6.mIntValue, (float) rect.top);
                YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, r7.mIntValue, (float) rect.right);
                YogaNative.jni_YGNodeStyleSetPaddingJNI(yogaNodeJNIBase.mNativePointer, r8.mIntValue, (float) rect.bottom);
            }
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = r15.A00;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                float floatValue = ((Number) r15.A00.valueAt(i)).floatValue();
                if (keyAt == 0) {
                    YogaNative.jni_YGNodeStyleSetAlignContentJNI(((YogaNodeJNIBase) r16).mNativePointer, AnonymousClass061.A00(Math.round(floatValue)).mIntValue);
                } else if (keyAt == 1) {
                    YogaNative.jni_YGNodeStyleSetAlignItemsJNI(((YogaNodeJNIBase) r16).mNativePointer, AnonymousClass061.A00(Math.round(floatValue)).mIntValue);
                } else if (keyAt == 2) {
                    YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) r16).mNativePointer, AnonymousClass061.A00(Math.round(floatValue)).mIntValue);
                } else if (keyAt == 3) {
                    YogaNative.jni_YGNodeStyleSetAspectRatioJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 8) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, floatValue);
                } else if (keyAt == 11) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, floatValue);
                } else if (keyAt == 9) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, floatValue);
                } else if (keyAt == 5) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, floatValue);
                } else if (keyAt == 10) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, floatValue);
                } else if (keyAt == 6) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, floatValue);
                } else if (keyAt == 7) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, floatValue);
                } else if (keyAt == 12) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, floatValue);
                } else if (keyAt == 4) {
                    YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, floatValue);
                } else if (keyAt == 13) {
                    int round = Math.round(floatValue);
                    if (round == 0) {
                        r26 = EnumC223511c.INHERIT;
                    } else if (round == 1) {
                        r26 = EnumC223511c.LTR;
                    } else if (round == 2) {
                        r26 = EnumC223511c.RTL;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round));
                    }
                    YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) r16).mNativePointer, r26.mIntValue);
                } else if (keyAt == 14) {
                    YogaNative.jni_YGNodeStyleSetDisplayJNI(((YogaNodeJNIBase) r16).mNativePointer, EnumC223611d.A00(Math.round(floatValue)).mIntValue);
                } else if (keyAt == 15) {
                    YogaNative.jni_YGNodeStyleSetFlexJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 16) {
                    YogaNative.jni_YGNodeStyleSetFlexBasisJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 17) {
                    int round2 = Math.round(floatValue);
                    if (round2 == 0) {
                        r25 = AnonymousClass062.COLUMN;
                    } else if (round2 == 1) {
                        r25 = AnonymousClass062.COLUMN_REVERSE;
                    } else if (round2 == 2) {
                        r25 = AnonymousClass062.ROW;
                    } else if (round2 == 3) {
                        r25 = AnonymousClass062.ROW_REVERSE;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round2));
                    }
                    YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(((YogaNodeJNIBase) r16).mNativePointer, r25.mIntValue);
                } else if (keyAt == 18) {
                    YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 19) {
                    YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 20) {
                    YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 26) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, floatValue);
                } else if (keyAt == 21) {
                    int round3 = Math.round(floatValue);
                    if (round3 == 0) {
                        r24 = AnonymousClass063.FLEX_START;
                    } else if (round3 == 1) {
                        r24 = AnonymousClass063.CENTER;
                    } else if (round3 == 2) {
                        r24 = AnonymousClass063.FLEX_END;
                    } else if (round3 == 3) {
                        r24 = AnonymousClass063.SPACE_BETWEEN;
                    } else if (round3 == 4) {
                        r24 = AnonymousClass063.SPACE_AROUND;
                    } else if (round3 == 5) {
                        r24 = AnonymousClass063.SPACE_EVENLY;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round3));
                    }
                    YogaNative.jni_YGNodeStyleSetJustifyContentJNI(((YogaNodeJNIBase) r16).mNativePointer, r24.mIntValue);
                } else if (keyAt == 29) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, floatValue);
                } else if (keyAt == 27) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, floatValue);
                } else if (keyAt == 23) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, floatValue);
                } else if (keyAt == 28) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, floatValue);
                } else if (keyAt == 24) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, floatValue);
                } else if (keyAt == 25) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, floatValue);
                } else if (keyAt == 30) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, floatValue);
                } else if (keyAt == 22) {
                    YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, floatValue);
                } else if (keyAt == 31) {
                    YogaNative.jni_YGNodeStyleSetMaxHeightJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 32) {
                    YogaNative.jni_YGNodeStyleSetMaxWidthJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 33) {
                    YogaNative.jni_YGNodeStyleSetMinHeightJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 34) {
                    YogaNative.jni_YGNodeStyleSetMinWidthJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt == 35) {
                    int round4 = Math.round(floatValue);
                    if (round4 == 0) {
                        r23 = EnumC224111l.VISIBLE;
                    } else if (round4 == 1) {
                        r23 = EnumC224111l.HIDDEN;
                    } else if (round4 == 2) {
                        r23 = EnumC224111l.SCROLL;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round4));
                    }
                    YogaNative.jni_YGNodeStyleSetOverflowJNI(((YogaNodeJNIBase) r16).mNativePointer, r23.mIntValue);
                } else if (keyAt == 40) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, floatValue);
                } else if (keyAt == 43) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, floatValue);
                } else if (keyAt == 41) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, floatValue);
                } else if (keyAt == 37) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, floatValue);
                } else if (keyAt == 42) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, floatValue);
                } else if (keyAt == 38) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, floatValue);
                } else if (keyAt == 39) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, floatValue);
                } else if (keyAt == 44) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, floatValue);
                } else if (keyAt == 36) {
                    YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, floatValue);
                } else if (keyAt == 49) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, floatValue);
                } else if (keyAt == 52) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, floatValue);
                } else if (keyAt == 50) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, floatValue);
                } else if (keyAt == 46) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, floatValue);
                } else if (keyAt == 51) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, floatValue);
                } else if (keyAt == 47) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, floatValue);
                } else if (keyAt == 48) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, floatValue);
                } else if (keyAt == 54) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, floatValue);
                } else if (keyAt == 45) {
                    YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, floatValue);
                } else if (keyAt == 53) {
                    int round5 = Math.round(floatValue);
                    if (round5 == 0) {
                        r22 = EnumC224211m.RELATIVE;
                    } else if (round5 == 1) {
                        r22 = EnumC224211m.ABSOLUTE;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round5));
                    }
                    YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) r16).mNativePointer, r22.mIntValue);
                } else if (keyAt == 55) {
                    YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) r16).mNativePointer, floatValue);
                } else if (keyAt != 56) {
                    continue;
                } else {
                    int round6 = Math.round(floatValue);
                    if (round6 == 0) {
                        r2 = AnonymousClass064.NO_WRAP;
                    } else if (round6 == 1) {
                        r2 = AnonymousClass064.WRAP;
                    } else if (round6 == 2) {
                        r2 = AnonymousClass064.WRAP_REVERSE;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", round6));
                    }
                    YogaNative.jni_YGNodeStyleSetFlexWrapJNI(((YogaNodeJNIBase) r16).mNativePointer, r2.mIntValue);
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = r15.A01;
                    if (i2 < sparseArray2.size()) {
                        int keyAt2 = sparseArray2.keyAt(i2);
                        String str = (String) r15.A01.valueAt(i2);
                        if (str.equals("auto")) {
                            if (keyAt2 == 26) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue);
                            } else if (keyAt2 == 29) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue);
                            } else if (keyAt2 == 27) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue);
                            } else if (keyAt2 == 23) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue);
                            } else if (keyAt2 == 28) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue);
                            } else if (keyAt2 == 24) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue);
                            } else if (keyAt2 == 25) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue);
                            } else if (keyAt2 == 30) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue);
                            } else if (keyAt2 == 22) {
                                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue);
                            }
                        }
                        if (str.endsWith("%")) {
                            float parseFloat = Float.parseFloat(str.substring(0, str.length() - 1));
                            if (keyAt2 == 16) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 20) {
                                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 26) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, parseFloat);
                            } else if (keyAt2 == 29) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, parseFloat);
                            } else if (keyAt2 == 27) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, parseFloat);
                            } else if (keyAt2 == 23) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, parseFloat);
                            } else if (keyAt2 == 28) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, parseFloat);
                            } else if (keyAt2 == 24) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, parseFloat);
                            } else if (keyAt2 == 25) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, parseFloat);
                            } else if (keyAt2 == 30) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, parseFloat);
                            } else if (keyAt2 == 22) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, parseFloat);
                            } else if (keyAt2 == 31) {
                                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 32) {
                                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 33) {
                                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 34) {
                                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            } else if (keyAt2 == 40) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, parseFloat);
                            } else if (keyAt2 == 43) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, parseFloat);
                            } else if (keyAt2 == 41) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, parseFloat);
                            } else if (keyAt2 == 37) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, parseFloat);
                            } else if (keyAt2 == 42) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, parseFloat);
                            } else if (keyAt2 == 38) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, parseFloat);
                            } else if (keyAt2 == 39) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, parseFloat);
                            } else if (keyAt2 == 44) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, parseFloat);
                            } else if (keyAt2 == 36) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, parseFloat);
                            } else if (keyAt2 == 49) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r4.mIntValue, parseFloat);
                            } else if (keyAt2 == 52) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r6.mIntValue, parseFloat);
                            } else if (keyAt2 == 50) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r7.mIntValue, parseFloat);
                            } else if (keyAt2 == 46) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r8.mIntValue, parseFloat);
                            } else if (keyAt2 == 51) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r9.mIntValue, parseFloat);
                            } else if (keyAt2 == 47) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r10.mIntValue, parseFloat);
                            } else if (keyAt2 == 48) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r11.mIntValue, parseFloat);
                            } else if (keyAt2 == 54) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r12.mIntValue, parseFloat);
                            } else if (keyAt2 == 45) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, r13.mIntValue, parseFloat);
                            } else if (keyAt2 == 55) {
                                YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) r16).mNativePointer, parseFloat);
                            }
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A01(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.A00).mNativePointer, (float) size2);
        }
        if (mode == 1073741824) {
            YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.A00).mNativePointer, (float) size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(((YogaNodeJNIBase) this.A00).mNativePointer, (float) size2);
        }
        if (mode == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(((YogaNodeJNIBase) this.A00).mNativePointer, (float) size);
        }
        this.A00.calculateLayout(Float.NaN, Float.NaN);
    }

    public final void A02(View view, boolean z) {
        Map map = this.A01;
        AbstractC224011k r3 = (AbstractC224011k) map.get(view);
        if (r3 != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r3;
            YogaNodeJNIBase yogaNodeJNIBase2 = yogaNodeJNIBase.mOwner;
            int i = 0;
            while (true) {
                if (i >= yogaNodeJNIBase2.getChildCount()) {
                    break;
                } else if (yogaNodeJNIBase2.getChildAt(i).equals(r3)) {
                    List list = yogaNodeJNIBase2.mChildren;
                    if (list != null) {
                        YogaNodeJNIBase yogaNodeJNIBase3 = (YogaNodeJNIBase) list.remove(i);
                        yogaNodeJNIBase3.mOwner = null;
                        YogaNative.jni_YGNodeRemoveChildJNI(yogaNodeJNIBase2.mNativePointer, yogaNodeJNIBase3.mNativePointer);
                    } else {
                        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
                    }
                } else {
                    i++;
                }
            }
            yogaNodeJNIBase.mData = null;
            map.remove(view);
            if (z) {
                this.A00.calculateLayout(Float.NaN, Float.NaN);
            }
        }
    }

    public final void A03(AbstractC224011k r7, float f, float f2) {
        View view = (View) ((YogaNodeJNIBase) r7).mData;
        if (!(view == null || view == this)) {
            if (view.getVisibility() != 8) {
                int round = Math.round(r7.getLayoutX() + f);
                int round2 = Math.round(r7.getLayoutY() + f2);
                view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(r7.getLayoutWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(r7.getLayoutHeight()), 1073741824));
                view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
            } else {
                return;
            }
        }
        int childCount = r7.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (equals(view)) {
                A03(r7.getChildAt(i), f, f2);
            } else if (!(view instanceof C224511p)) {
                A03(r7.getChildAt(i), r7.getLayoutX() + f, r7.getLayoutY() + f2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC224011k r1;
        AbstractC224011k r3 = this.A00;
        r3.setMeasureFunction(null);
        super.addView(view, i, layoutParams);
        Map map = this.A01;
        if (!map.containsKey(view)) {
            if (view instanceof C224511p) {
                r1 = ((C224511p) view).A00;
            } else {
                if (map.containsKey(view)) {
                    r1 = (AbstractC224011k) map.get(view);
                } else {
                    r1 = new AnonymousClass25K();
                }
                ((YogaNodeJNIBase) r1).mData = view;
                r1.setMeasureFunction(new C33771hM());
            }
            A00((C224411o) view.getLayoutParams(), r1, view);
            map.put(view, r1);
            r3.addChildAt(r1, r3.getChildCount());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C224411o;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C224411o(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C224411o(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C224411o(layoutParams);
    }

    public AbstractC224011k getYogaNode() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!(getParent() instanceof C224511p)) {
            A01(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        A03(this.A00, 0.0f, 0.0f);
    }

    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof C224511p)) {
            A01(i, i2);
        }
        AbstractC224011k r2 = this.A00;
        setMeasuredDimension(Math.round(r2.getLayoutWidth()), Math.round(r2.getLayoutHeight()));
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            A02(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            A02(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        A02(view, false);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        A02(getChildAt(i), false);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        A02(view, true);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A02(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A02(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }
}
