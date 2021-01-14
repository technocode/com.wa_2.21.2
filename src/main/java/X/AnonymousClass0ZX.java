package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: X.0ZX  reason: invalid class name */
public class AnonymousClass0ZX {
    public int A00 = -1;
    public int A01 = 0;
    public Typeface A02;
    public C07660Za A03;
    public C07660Za A04;
    public C07660Za A05;
    public C07660Za A06;
    public C07660Za A07;
    public C07660Za A08;
    public C07660Za A09;
    public boolean A0A;
    public final TextView A0B;
    public final AnonymousClass0ZZ A0C;

    public AnonymousClass0ZX(TextView textView) {
        this.A0B = textView;
        this.A0C = new AnonymousClass0ZZ(textView);
    }

    public static C07660Za A00(Context context, C06340Sv r1, int i) {
        ColorStateList A032 = r1.A03(context, i);
        if (A032 == null) {
            return null;
        }
        C07660Za r12 = new C07660Za();
        r12.A02 = true;
        r12.A00 = A032;
        return r12;
    }

    public void A01() {
        if (!(this.A05 == null && this.A09 == null && this.A06 == null && this.A03 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A06(compoundDrawables[0], this.A05);
            A06(compoundDrawables[1], this.A09);
            A06(compoundDrawables[2], this.A06);
            A06(compoundDrawables[3], this.A03);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.A07 != null || this.A04 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A06(compoundDrawablesRelative[0], this.A07);
            A06(compoundDrawablesRelative[2], this.A04);
        }
    }

    public void A02(int i) {
        AnonymousClass0ZZ r4 = this.A0C;
        if (!(!(r4.A09 instanceof C07670Zb))) {
            return;
        }
        if (i == 0) {
            r4.A03 = 0;
            r4.A01 = -1.0f;
            r4.A00 = -1.0f;
            r4.A02 = -1.0f;
            r4.A07 = new int[0];
            r4.A06 = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            r4.A04(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r4.A06()) {
                r4.A03();
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown auto-size text type: ", i));
        }
    }

    public void A03(int i, int i2, int i3, int i4) {
        AnonymousClass0ZZ r4 = this.A0C;
        if (!(r4.A09 instanceof C07670Zb)) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            r4.A04(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (r4.A06()) {
                r4.A03();
            }
        }
    }

    public void A04(Context context, int i) {
        String string;
        ColorStateList A012;
        AnonymousClass0TL r4 = new AnonymousClass0TL(context, context.obtainStyledAttributes(i, AnonymousClass0T3.A0b));
        TypedArray typedArray = r4.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (Build.VERSION.SDK_INT < 23 && typedArray.hasValue(3) && (A012 = r4.A01(3)) != null) {
            this.A0B.setTextColor(A012);
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A05(context, r4);
        if (Build.VERSION.SDK_INT >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A02;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A01);
        }
    }

    public final void A05(Context context, AnonymousClass0TL r15) {
        String string;
        Typeface A0a;
        int i = this.A01;
        TypedArray typedArray = r15.A02;
        this.A01 = typedArray.getInt(2, i);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = typedArray.getInt(11, -1);
            this.A00 = i2;
            if (i2 != -1) {
                this.A01 = (this.A01 & 2) | 0;
            }
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A02 = null;
            int i3 = 10;
            if (typedArray.hasValue(12)) {
                i3 = 12;
            }
            int i4 = this.A00;
            int i5 = this.A01;
            if (!context.isRestricted()) {
                C07680Zc r11 = new C07680Zc(this, i4, i5);
                try {
                    int i6 = this.A01;
                    int resourceId = typedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = r15.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            r15.A00 = typedValue;
                        }
                        Context context2 = r15.A01;
                        if (!context2.isRestricted() && (A0a = C002001d.A0a(context2, resourceId, typedValue, i6, r11, true)) != null) {
                            if (Build.VERSION.SDK_INT < 28 || this.A00 == -1) {
                                this.A02 = A0a;
                            } else {
                                Typeface create = Typeface.create(A0a, 0);
                                int i7 = this.A00;
                                boolean z2 = false;
                                if ((this.A01 & 2) != 0) {
                                    z2 = true;
                                }
                                this.A02 = Typeface.create(create, i7, z2);
                            }
                        }
                    }
                    boolean z3 = false;
                    if (this.A02 == null) {
                        z3 = true;
                    }
                    this.A0A = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 == null && (string = typedArray.getString(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.A00 == -1) {
                    this.A02 = Typeface.create(string, this.A01);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i8 = this.A00;
                if ((this.A01 & 2) != 0) {
                    z = true;
                }
                this.A02 = Typeface.create(create2, i8, z);
            }
        } else if (typedArray.hasValue(1)) {
            this.A0A = false;
            int i9 = typedArray.getInt(1, 1);
            if (i9 == 1) {
                this.A02 = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.A02 = Typeface.SERIF;
            } else if (i9 == 3) {
                this.A02 = Typeface.MONOSPACE;
            }
        }
    }

    public final void A06(Drawable drawable, C07660Za r3) {
        if (drawable != null && r3 != null) {
            AnonymousClass0TZ.A02(drawable, r3, this.A0B.getDrawableState());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.util.AttributeSet r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZX.A07(android.util.AttributeSet, int):void");
    }

    public void A08(int[] iArr, int i) {
        AnonymousClass0ZZ r4 = this.A0C;
        if (!(r4.A09 instanceof C07670Zb)) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                r4.A07 = AnonymousClass0ZZ.A02(iArr2);
                if (!r4.A07()) {
                    StringBuilder A0S = AnonymousClass008.A0S("None of the preset sizes is valid: ");
                    A0S.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(A0S.toString());
                }
            } else {
                r4.A05 = false;
            }
            if (r4.A06()) {
                r4.A03();
            }
        }
    }

    public boolean A09() {
        AnonymousClass0ZZ r1 = this.A0C;
        return ((r1.A09 instanceof C07670Zb) ^ true) && r1.A03 != 0;
    }
}
