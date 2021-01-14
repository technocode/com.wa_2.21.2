package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.io.IOException;
import java.util.List;

/* renamed from: X.11E  reason: invalid class name */
public class AnonymousClass11E {
    public static final C33761hK A00;

    static {
        C33761hK r0 = new C33761hK();
        A00 = r0;
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(r0.A00, true);
    }

    public static int A00(float f) {
        double d;
        if (f > 0.0f) {
            d = ((double) f) + 0.5d;
        } else {
            d = ((double) f) - 0.5d;
        }
        return (int) d;
    }

    public static int A01(float f, EnumC223911i r3) {
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (ordinal == 1) {
            return View.MeasureSpec.makeMeasureSpec(A00(f), 1073741824);
        }
        if (ordinal == 2) {
            return View.MeasureSpec.makeMeasureSpec(A00(f), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        StringBuilder sb = new StringBuilder("Unexpected YogaMeasureMode: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static C33511gt A02(C07080Vv r18, AbstractC008905s r19, List list, C33761hK r21, C37631oX r22) {
        AbstractC009105u r3;
        AbstractC07100Vx A01;
        EnumC223611d r13 = EnumC223611d.NONE;
        AnonymousClass0W0 r32 = (AnonymousClass0W0) r18.A00().A00.get(r19);
        if (r32 == null || !(r32 instanceof C33511gt)) {
            AnonymousClass25K r4 = new AnonymousClass25K(r21);
            boolean z = r19 instanceof AnonymousClass2AY;
            if (z) {
                AnonymousClass2AY r2 = (AnonymousClass2AY) r19;
                AnonymousClass062 r33 = r2.A03;
                if (r33 != null) {
                    YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(r4.mNativePointer, r33.mIntValue);
                }
                AnonymousClass063 r34 = r2.A04;
                if (r34 != null) {
                    YogaNative.jni_YGNodeStyleSetJustifyContentJNI(r4.mNativePointer, r34.mIntValue);
                }
                AnonymousClass061 r35 = r2.A02;
                if (r35 != null) {
                    YogaNative.jni_YGNodeStyleSetAlignItemsJNI(r4.mNativePointer, r35.mIntValue);
                }
                AnonymousClass061 r36 = r2.A01;
                if (r36 != null) {
                    YogaNative.jni_YGNodeStyleSetAlignContentJNI(r4.mNativePointer, r36.mIntValue);
                }
                AnonymousClass064 r37 = r2.A05;
                if (r37 != null) {
                    YogaNative.jni_YGNodeStyleSetFlexWrapJNI(r4.mNativePointer, r37.mIntValue);
                }
                int i = r2.A00;
                if (i == 0 || i == 4) {
                    YogaNative.jni_YGNodeStyleSetDisplayJNI(r4.mNativePointer, EnumC223611d.FLEX.mIntValue);
                } else if (i == 8) {
                    YogaNative.jni_YGNodeStyleSetDisplayJNI(r4.mNativePointer, r13.mIntValue);
                }
            }
            AnonymousClass05n r38 = r19.A01;
            if (r38 instanceof AbstractC009105u) {
                r3 = (AbstractC009105u) r38;
            } else {
                r3 = null;
            }
            if (r3 instanceof C37761ok) {
                C37761ok r39 = (C37761ok) r3;
                if (r39 != null) {
                    EnumC223711e r12 = EnumC223711e.END;
                    EnumC223711e r11 = EnumC223711e.START;
                    EnumC223711e r9 = EnumC223711e.RIGHT;
                    EnumC223711e r8 = EnumC223711e.LEFT;
                    EnumC223711e r7 = EnumC223711e.BOTTOM;
                    EnumC223711e r6 = EnumC223711e.TOP;
                    try {
                        String str = r39.A0S;
                        if (str != null) {
                            if (str.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetWidthPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str));
                            } else if (str.equals("auto")) {
                                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(r4.mNativePointer);
                            } else {
                                YogaNative.jni_YGNodeStyleSetWidthJNI(r4.mNativePointer, AnonymousClass05i.A01(str));
                            }
                        }
                        String str2 = r39.A06;
                        if (str2 != null) {
                            if (str2.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str2));
                            } else if (str2.equals("auto")) {
                                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(r4.mNativePointer);
                            } else {
                                YogaNative.jni_YGNodeStyleSetHeightJNI(r4.mNativePointer, AnonymousClass05i.A01(str2));
                            }
                        }
                        String str3 = r39.A0H;
                        if (str3 != null) {
                            if (str3.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str3));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMinWidthJNI(r4.mNativePointer, AnonymousClass05i.A01(str3));
                            }
                        }
                        String str4 = r39.A0G;
                        if (str4 != null) {
                            if (str4.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str4));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMinHeightJNI(r4.mNativePointer, AnonymousClass05i.A01(str4));
                            }
                        }
                        String str5 = r39.A0F;
                        if (str5 != null) {
                            if (str5.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str5));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(r4.mNativePointer, AnonymousClass05i.A01(str5));
                            }
                        }
                        String str6 = r39.A0E;
                        if (str6 != null) {
                            if (str6.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(r4.mNativePointer, AnonymousClass05i.A00(str6));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(r4.mNativePointer, AnonymousClass05i.A01(str6));
                            }
                        }
                        String str7 = r39.A0R;
                        if (str7 != null) {
                            if (str7.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A00(str7));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A01(str7));
                            }
                        }
                        String str8 = r39.A04;
                        if (str8 != null) {
                            if (str8.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A00(str8));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A01(str8));
                            }
                        }
                        String str9 = r39.A07;
                        if (str9 != null) {
                            if (str9.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A00(str9));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A01(str9));
                            }
                        }
                        String str10 = r39.A0P;
                        if (str10 != null) {
                            if (str10.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A00(str10));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A01(str10));
                            }
                        }
                        String str11 = r39.A0Q;
                        if (str11 != null) {
                            if (str11.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A00(str11));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A01(str11));
                            }
                        }
                        String str12 = r39.A05;
                        if (str12 != null) {
                            if (str12.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A00(str12));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPositionJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A01(str12));
                            }
                        }
                        String str13 = r39.A0D;
                        if (str13 != null) {
                            if (str13.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A00(str13));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A01(str13));
                            }
                        }
                        String str14 = r39.A08;
                        if (str14 != null) {
                            if (str14.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A00(str14));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A01(str14));
                            }
                        }
                        String str15 = r39.A0A;
                        if (str15 != null) {
                            if (str15.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A00(str15));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A01(str15));
                            }
                        }
                        String str16 = r39.A0B;
                        if (str16 != null) {
                            if (str16.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A00(str16));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A01(str16));
                            }
                        }
                        String str17 = r39.A0C;
                        if (str17 != null) {
                            if (str17.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A00(str17));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A01(str17));
                            }
                        }
                        String str18 = r39.A09;
                        if (str18 != null) {
                            if (str18.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A00(str18));
                            } else {
                                YogaNative.jni_YGNodeStyleSetMarginJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A01(str18));
                            }
                        }
                        String str19 = r39.A0N;
                        if (str19 != null) {
                            if (str19.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A00(str19));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r6.mIntValue, AnonymousClass05i.A01(str19));
                            }
                        }
                        String str20 = r39.A0I;
                        if (str20 != null) {
                            if (str20.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A00(str20));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r7.mIntValue, AnonymousClass05i.A01(str20));
                            }
                        }
                        String str21 = r39.A0K;
                        if (str21 != null) {
                            if (str21.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A00(str21));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r8.mIntValue, AnonymousClass05i.A01(str21));
                            }
                        }
                        String str22 = r39.A0L;
                        if (str22 != null) {
                            if (str22.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A00(str22));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r9.mIntValue, AnonymousClass05i.A01(str22));
                            }
                        }
                        String str23 = r39.A0M;
                        if (str23 != null) {
                            if (str23.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A00(str23));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r11.mIntValue, AnonymousClass05i.A01(str23));
                            }
                        }
                        String str24 = r39.A0J;
                        if (str24 != null) {
                            if (str24.endsWith("%")) {
                                YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A00(str24));
                            } else {
                                YogaNative.jni_YGNodeStyleSetPaddingJNI(r4.mNativePointer, r12.mIntValue, AnonymousClass05i.A01(str24));
                            }
                        }
                        String str25 = r39.A0O;
                        if (str25 != null) {
                            int hashCode = str25.hashCode();
                            if (hashCode != -554435892) {
                                if (hashCode == 1728122231 && str25.equals("absolute")) {
                                    YogaNative.jni_YGNodeStyleSetPositionTypeJNI(r4.mNativePointer, EnumC224211m.ABSOLUTE.mIntValue);
                                }
                            } else if (str25.equals("relative")) {
                                YogaNative.jni_YGNodeStyleSetPositionTypeJNI(r4.mNativePointer, EnumC224211m.RELATIVE.mIntValue);
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown position type ");
                            sb.append(str25);
                            throw new IOException(sb.toString());
                        }
                        Float f = r39.A00;
                        if (f != null) {
                            YogaNative.jni_YGNodeStyleSetAspectRatioJNI(r4.mNativePointer, f.floatValue());
                        }
                        Float f2 = r39.A01;
                        if (f2 != null) {
                            YogaNative.jni_YGNodeStyleSetFlexGrowJNI(r4.mNativePointer, f2.floatValue());
                        }
                        Float f3 = r39.A02;
                        if (f3 != null) {
                            YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(r4.mNativePointer, f3.floatValue());
                        }
                        String str26 = r39.A03;
                        if (str26 != null) {
                            YogaNative.jni_YGNodeStyleSetAlignSelfJNI(r4.mNativePointer, C008805h.A0E(str26).mIntValue);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    throw null;
                }
            }
            if (EnumC223611d.A00(YogaNative.jni_YGNodeStyleGetDisplayJNI(r4.mNativePointer)) == r13) {
                AnonymousClass25K r310 = new AnonymousClass25K(r21);
                YogaNative.jni_YGNodeStyleSetWidthJNI(r310.mNativePointer, 0.0f);
                YogaNative.jni_YGNodeStyleSetHeightJNI(r310.mNativePointer, 0.0f);
                return new C33511gt(r18, r19, r310, null, null);
            } else if (!z) {
                C33511gt r311 = new C33511gt(r18, r19, r4, new C33501gs(r19), null);
                list.add(r311);
                r4.setMeasureFunction(r311);
                return r311;
            } else {
                if (r19 == r22.A01) {
                    A01 = r22.A00;
                } else {
                    A01 = r19.A01(r18);
                }
                C33511gt r312 = new C33511gt(r18, r19, r4, null, A01);
                r18.A00().A01.put(r19, r312);
                List list2 = ((AnonymousClass07C) r19).A00;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    C33511gt A02 = A02(r18, (AbstractC008905s) list2.get(i2), list, r21, r22);
                    if (EnumC223611d.A00(YogaNative.jni_YGNodeStyleGetDisplayJNI(((YogaNodeJNIBase) A02.A08).mNativePointer)) != r13) {
                        r4.addChildAt(A02.A08, r312.A08.getChildCount());
                        r312.A0A.add(A02);
                    }
                }
                return r312;
            }
        } else {
            C33511gt r313 = (C33511gt) r32;
            C33471gp.A00("CloneYogaTree", null);
            YogaNodeJNIBase cloneWithChildren = ((YogaNodeJNIBase) r313.A08).cloneWithChildren();
            AnonymousClass112.A00();
            return A03(r313, cloneWithChildren, r18, list);
        }
    }

    public static C33511gt A03(C33511gt r9, AbstractC224011k r10, C07080Vv r11, List list) {
        AbstractC008905s r5 = r9.A09;
        C33501gs r7 = r9.A07;
        C33511gt r3 = new C33511gt(r11, r5, r10, r7, r9.A06);
        if (r7 == null) {
            r11.A00().A01.put(r5, r3);
            for (int i = 0; i < r9.A5I(); i++) {
                r3.A0A.add(A03((C33511gt) r9.A5E(i), r10.getChildAt(i), r11, list));
            }
        }
        if (r3.A07 != null) {
            list.add(r3);
            r10.setMeasureFunction(r3);
        }
        return r3;
    }
}
