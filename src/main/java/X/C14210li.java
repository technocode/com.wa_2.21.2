package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0li  reason: invalid class name and case insensitive filesystem */
public class C14210li {
    public static SparseIntArray A03;
    public static final int[] A04 = {0, 4, 8};
    public HashMap A00 = new HashMap();
    public HashMap A01 = new HashMap();
    public boolean A02 = true;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A03 = sparseIntArray;
        sparseIntArray.append(76, 25);
        A03.append(77, 26);
        A03.append(79, 29);
        A03.append(80, 30);
        A03.append(86, 36);
        A03.append(85, 35);
        A03.append(58, 4);
        A03.append(57, 3);
        A03.append(55, 1);
        A03.append(94, 6);
        A03.append(95, 7);
        A03.append(65, 17);
        A03.append(66, 18);
        A03.append(67, 19);
        A03.append(0, 27);
        A03.append(81, 32);
        A03.append(82, 33);
        A03.append(64, 10);
        A03.append(63, 9);
        A03.append(98, 13);
        A03.append(101, 16);
        A03.append(99, 14);
        A03.append(96, 11);
        A03.append(100, 15);
        A03.append(97, 12);
        A03.append(89, 40);
        A03.append(74, 39);
        A03.append(73, 41);
        A03.append(88, 42);
        A03.append(72, 20);
        A03.append(87, 37);
        A03.append(62, 5);
        A03.append(75, 82);
        A03.append(84, 82);
        A03.append(78, 82);
        A03.append(56, 82);
        A03.append(54, 82);
        A03.append(5, 24);
        A03.append(7, 28);
        A03.append(23, 31);
        A03.append(24, 8);
        A03.append(6, 34);
        A03.append(8, 2);
        A03.append(3, 23);
        A03.append(4, 21);
        A03.append(2, 22);
        A03.append(13, 43);
        A03.append(26, 44);
        A03.append(21, 45);
        A03.append(22, 46);
        A03.append(20, 60);
        A03.append(18, 47);
        A03.append(19, 48);
        A03.append(14, 49);
        A03.append(15, 50);
        A03.append(16, 51);
        A03.append(17, 52);
        A03.append(25, 53);
        A03.append(90, 54);
        A03.append(68, 55);
        A03.append(91, 56);
        A03.append(69, 57);
        A03.append(92, 58);
        A03.append(70, 59);
        A03.append(59, 61);
        A03.append(61, 62);
        A03.append(60, 63);
        A03.append(27, 64);
        A03.append(106, 65);
        A03.append(33, 66);
        A03.append(107, 67);
        A03.append(103, 79);
        A03.append(1, 38);
        A03.append(102, 68);
        A03.append(93, 69);
        A03.append(71, 70);
        A03.append(31, 71);
        A03.append(29, 72);
        A03.append(30, 73);
        A03.append(32, 74);
        A03.append(28, 75);
        A03.append(104, 76);
        A03.append(83, 77);
        A03.append(AnonymousClass0PW.A03, 78);
        A03.append(53, 80);
        A03.append(52, 81);
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static final C14160ld A01(Context context, AttributeSet attributeSet) {
        C14160ld r4 = new C14160ld();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14240ll.A0H);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                r4.A03.A06 = true;
                r4.A02.A0w = true;
                r4.A04.A04 = true;
                r4.A05.A0C = true;
            }
            switch (A03.get(index)) {
                case 1:
                    C14170le r1 = r4.A02;
                    int resourceId = obtainStyledAttributes.getResourceId(index, r1.A08);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    r1.A08 = resourceId;
                    break;
                case 2:
                    C14170le r12 = r4.A02;
                    r12.A09 = obtainStyledAttributes.getDimensionPixelSize(index, r12.A09);
                    break;
                case 3:
                    C14170le r13 = r4.A02;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, r13.A0A);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r13.A0A = resourceId2;
                    break;
                case 4:
                    C14170le r14 = r4.A02;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, r14.A0B);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r14.A0B = resourceId3;
                    break;
                case 5:
                    r4.A02.A0r = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    C14170le r15 = r4.A02;
                    r15.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, r15.A0E);
                    break;
                case 7:
                    C14170le r16 = r4.A02;
                    r16.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, r16.A0F);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C14170le r17 = r4.A02;
                        r17.A0G = obtainStyledAttributes.getDimensionPixelSize(index, r17.A0G);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C14170le r18 = r4.A02;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, r18.A0H);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r18.A0H = resourceId4;
                    break;
                case 10:
                    C14170le r19 = r4.A02;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, r19.A0I);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r19.A0I = resourceId5;
                    break;
                case 11:
                    C14170le r110 = r4.A02;
                    r110.A0J = obtainStyledAttributes.getDimensionPixelSize(index, r110.A0J);
                    break;
                case 12:
                    C14170le r111 = r4.A02;
                    r111.A0K = obtainStyledAttributes.getDimensionPixelSize(index, r111.A0K);
                    break;
                case 13:
                    C14170le r112 = r4.A02;
                    r112.A0L = obtainStyledAttributes.getDimensionPixelSize(index, r112.A0L);
                    break;
                case 14:
                    C14170le r113 = r4.A02;
                    r113.A0M = obtainStyledAttributes.getDimensionPixelSize(index, r113.A0M);
                    break;
                case 15:
                    C14170le r114 = r4.A02;
                    r114.A0N = obtainStyledAttributes.getDimensionPixelSize(index, r114.A0N);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    C14170le r115 = r4.A02;
                    r115.A0O = obtainStyledAttributes.getDimensionPixelSize(index, r115.A0O);
                    break;
                case 17:
                    C14170le r116 = r4.A02;
                    r116.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, r116.A0P);
                    break;
                case 18:
                    C14170le r117 = r4.A02;
                    r117.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, r117.A0Q);
                    break;
                case 19:
                    C14170le r118 = r4.A02;
                    r118.A01 = obtainStyledAttributes.getFloat(index, r118.A01);
                    break;
                case AnonymousClass0PW.A01:
                    C14170le r119 = r4.A02;
                    r119.A03 = obtainStyledAttributes.getFloat(index, r119.A03);
                    break;
                case 21:
                    C14170le r120 = r4.A02;
                    r120.A0a = obtainStyledAttributes.getLayoutDimension(index, r120.A0a);
                    break;
                case 22:
                    C14190lg r8 = r4.A04;
                    int i2 = obtainStyledAttributes.getInt(index, r8.A03);
                    r8.A03 = i2;
                    r8.A03 = A04[i2];
                    break;
                case 23:
                    C14170le r121 = r4.A02;
                    r121.A0c = obtainStyledAttributes.getLayoutDimension(index, r121.A0c);
                    break;
                case 24:
                    C14170le r122 = r4.A02;
                    r122.A0V = obtainStyledAttributes.getDimensionPixelSize(index, r122.A0V);
                    break;
                case 25:
                    C14170le r123 = r4.A02;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, r123.A0W);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r123.A0W = resourceId6;
                    break;
                case 26:
                    C14170le r124 = r4.A02;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, r124.A0X);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r124.A0X = resourceId7;
                    break;
                case 27:
                    C14170le r125 = r4.A02;
                    r125.A0d = obtainStyledAttributes.getInt(index, r125.A0d);
                    break;
                case 28:
                    C14170le r126 = r4.A02;
                    r126.A0e = obtainStyledAttributes.getDimensionPixelSize(index, r126.A0e);
                    break;
                case 29:
                    C14170le r127 = r4.A02;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, r127.A0f);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r127.A0f = resourceId8;
                    break;
                case 30:
                    C14170le r128 = r4.A02;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, r128.A0g);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r128.A0g = resourceId9;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C14170le r129 = r4.A02;
                        r129.A0h = obtainStyledAttributes.getDimensionPixelSize(index, r129.A0h);
                        break;
                    } else {
                        break;
                    }
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                    C14170le r130 = r4.A02;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, r130.A0i);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r130.A0i = resourceId10;
                    break;
                case 33:
                    C14170le r131 = r4.A02;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, r131.A0j);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r131.A0j = resourceId11;
                    break;
                case 34:
                    C14170le r132 = r4.A02;
                    r132.A0k = obtainStyledAttributes.getDimensionPixelSize(index, r132.A0k);
                    break;
                case 35:
                    C14170le r133 = r4.A02;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, r133.A0l);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r133.A0l = resourceId12;
                    break;
                case 36:
                    C14170le r134 = r4.A02;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, r134.A0m);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r134.A0m = resourceId13;
                    break;
                case 37:
                    C14170le r135 = r4.A02;
                    r135.A05 = obtainStyledAttributes.getFloat(index, r135.A05);
                    break;
                case 38:
                    r4.A00 = obtainStyledAttributes.getResourceId(index, r4.A00);
                    break;
                case 39:
                    C14170le r136 = r4.A02;
                    r136.A04 = obtainStyledAttributes.getFloat(index, r136.A04);
                    break;
                case 40:
                    C14170le r137 = r4.A02;
                    r137.A06 = obtainStyledAttributes.getFloat(index, r137.A06);
                    break;
                case 41:
                    C14170le r138 = r4.A02;
                    r138.A0U = obtainStyledAttributes.getInt(index, r138.A0U);
                    break;
                case 42:
                    C14170le r139 = r4.A02;
                    r139.A0n = obtainStyledAttributes.getInt(index, r139.A0n);
                    break;
                case 43:
                    C14190lg r140 = r4.A04;
                    r140.A00 = obtainStyledAttributes.getFloat(index, r140.A00);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C14200lh r141 = r4.A05;
                        r141.A0B = true;
                        r141.A00 = obtainStyledAttributes.getDimension(index, r141.A00);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C14200lh r142 = r4.A05;
                    r142.A02 = obtainStyledAttributes.getFloat(index, r142.A02);
                    break;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                    C14200lh r143 = r4.A05;
                    r143.A03 = obtainStyledAttributes.getFloat(index, r143.A03);
                    break;
                case 47:
                    C14200lh r144 = r4.A05;
                    r144.A04 = obtainStyledAttributes.getFloat(index, r144.A04);
                    break;
                case 48:
                    C14200lh r145 = r4.A05;
                    r145.A05 = obtainStyledAttributes.getFloat(index, r145.A05);
                    break;
                case 49:
                    C14200lh r146 = r4.A05;
                    r146.A06 = obtainStyledAttributes.getDimension(index, r146.A06);
                    break;
                case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                    C14200lh r147 = r4.A05;
                    r147.A07 = obtainStyledAttributes.getDimension(index, r147.A07);
                    break;
                case 51:
                    C14200lh r148 = r4.A05;
                    r148.A08 = obtainStyledAttributes.getDimension(index, r148.A08);
                    break;
                case 52:
                    C14200lh r149 = r4.A05;
                    r149.A09 = obtainStyledAttributes.getDimension(index, r149.A09);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C14200lh r150 = r4.A05;
                        r150.A0A = obtainStyledAttributes.getDimension(index, r150.A0A);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C14170le r151 = r4.A02;
                    r151.A0o = obtainStyledAttributes.getInt(index, r151.A0o);
                    break;
                case 55:
                    C14170le r152 = r4.A02;
                    r152.A0R = obtainStyledAttributes.getInt(index, r152.A0R);
                    break;
                case 56:
                    C14170le r153 = r4.A02;
                    r153.A0p = obtainStyledAttributes.getDimensionPixelSize(index, r153.A0p);
                    break;
                case 57:
                    C14170le r154 = r4.A02;
                    r154.A0S = obtainStyledAttributes.getDimensionPixelSize(index, r154.A0S);
                    break;
                case 58:
                    C14170le r155 = r4.A02;
                    r155.A0q = obtainStyledAttributes.getDimensionPixelSize(index, r155.A0q);
                    break;
                case 59:
                    C14170le r156 = r4.A02;
                    r156.A0T = obtainStyledAttributes.getDimensionPixelSize(index, r156.A0T);
                    break;
                case 60:
                    C14200lh r157 = r4.A05;
                    r157.A01 = obtainStyledAttributes.getFloat(index, r157.A01);
                    break;
                case 61:
                    C14170le r158 = r4.A02;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, r158.A0C);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r158.A0C = resourceId14;
                    break;
                case 62:
                    C14170le r159 = r4.A02;
                    r159.A0D = obtainStyledAttributes.getDimensionPixelSize(index, r159.A0D);
                    break;
                case 63:
                    C14170le r160 = r4.A02;
                    r160.A00 = obtainStyledAttributes.getFloat(index, r160.A00);
                    break;
                case 64:
                    C14180lf r161 = r4.A03;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, r161.A02);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    r161.A02 = resourceId15;
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        r4.A03.A05 = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        r4.A03.A05 = C13930lF.A00[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    r4.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    C14180lf r162 = r4.A03;
                    r162.A01 = obtainStyledAttributes.getFloat(index, r162.A01);
                    break;
                case 68:
                    C14190lg r163 = r4.A04;
                    r163.A01 = obtainStyledAttributes.getFloat(index, r163.A01);
                    break;
                case 69:
                    r4.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    r4.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case AnonymousClass0PW.A02:
                    C14170le r164 = r4.A02;
                    r164.A0Y = obtainStyledAttributes.getInt(index, r164.A0Y);
                    break;
                case 73:
                    C14170le r165 = r4.A02;
                    r165.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, r165.A0Z);
                    break;
                case 74:
                    r4.A02.A0t = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    C14170le r166 = r4.A02;
                    r166.A0x = obtainStyledAttributes.getBoolean(index, r166.A0x);
                    break;
                case 76:
                    C14180lf r167 = r4.A03;
                    r167.A04 = obtainStyledAttributes.getInt(index, r167.A04);
                    break;
                case 77:
                    r4.A02.A0s = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    C14190lg r168 = r4.A04;
                    r168.A02 = obtainStyledAttributes.getInt(index, r168.A02);
                    break;
                case 79:
                    C14180lf r169 = r4.A03;
                    r169.A00 = obtainStyledAttributes.getFloat(index, r169.A00);
                    break;
                case 80:
                    C14170le r170 = r4.A02;
                    r170.A0v = obtainStyledAttributes.getBoolean(index, r170.A0v);
                    break;
                case 81:
                    C14170le r171 = r4.A02;
                    r171.A0u = obtainStyledAttributes.getBoolean(index, r171.A0u);
                    break;
                case 82:
                    StringBuilder A0S = AnonymousClass008.A0S("unused attribute 0x");
                    A0S.append(Integer.toHexString(index));
                    A0S.append("   ");
                    A0S.append(A03.get(index));
                    Log.w("ConstraintSet", A0S.toString());
                    break;
                default:
                    StringBuilder A0S2 = AnonymousClass008.A0S("Unknown attribute 0x");
                    A0S2.append(Integer.toHexString(index));
                    A0S2.append("   ");
                    A0S2.append(A03.get(index));
                    Log.w("ConstraintSet", A0S2.toString());
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return r4;
    }

    public static final int[] A02(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = C14230lk.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim == null || (hashMap = constraintLayout.A0F) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.A0F.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Number) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public void A03(Context context, int i) {
        NoSuchMethodException e;
        IllegalAccessException e2;
        InvocationTargetException e3;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = viewGroup.getChildCount();
        this.A00.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C06490Tl r12 = (C06490Tl) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.A00.containsKey(Integer.valueOf(id))) {
                    this.A00.put(Integer.valueOf(id), new C14160ld());
                }
                C14160ld r7 = (C14160ld) this.A00.get(Integer.valueOf(id));
                HashMap hashMap = this.A01;
                HashMap hashMap2 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    C14110lX r13 = (C14110lX) hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2.put(str, new C14110lX(r13, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("getMap");
                            sb.append(str);
                            try {
                                hashMap2.put(str, new C14110lX(r13, cls.getMethod(sb.toString(), new Class[0]).invoke(childAt, new Object[0])));
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                            } catch (IllegalAccessException e5) {
                                e2 = e5;
                                e2.printStackTrace();
                            } catch (InvocationTargetException e6) {
                                e3 = e6;
                                e3.printStackTrace();
                            }
                        }
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        e.printStackTrace();
                    } catch (IllegalAccessException e8) {
                        e2 = e8;
                        e2.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e3 = e9;
                        e3.printStackTrace();
                    }
                }
                r7.A01 = hashMap2;
                r7.A00(id, r12);
                C14190lg r8 = r7.A04;
                r8.A03 = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    r8.A00 = childAt.getAlpha();
                    C14200lh r82 = r7.A05;
                    r82.A01 = childAt.getRotation();
                    r82.A02 = childAt.getRotationX();
                    r82.A03 = childAt.getRotationY();
                    r82.A04 = childAt.getScaleX();
                    r82.A05 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        r82.A06 = pivotX;
                        r82.A07 = pivotY;
                    }
                    r82.A08 = childAt.getTranslationX();
                    r82.A09 = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        r82.A0A = childAt.getTranslationZ();
                        if (r82.A0B) {
                            r82.A00 = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    C14170le r1 = r7.A02;
                    r1.A0x = barrier.A02.A02;
                    r1.A0z = barrier.getReferencedIds();
                    r1.A0Y = barrier.A00;
                    r1.A0Z = barrier.A02.A01;
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
