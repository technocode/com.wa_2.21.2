package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0le  reason: invalid class name and case insensitive filesystem */
public class C14170le {
    public static SparseIntArray A10;
    public float A00 = 0.0f;
    public float A01 = -1.0f;
    public float A02 = 1.0f;
    public float A03 = 0.5f;
    public float A04 = -1.0f;
    public float A05 = 0.5f;
    public float A06 = -1.0f;
    public float A07 = 1.0f;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = 0;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = 0;
    public int A0S = -1;
    public int A0T = -1;
    public int A0U = 0;
    public int A0V = -1;
    public int A0W = -1;
    public int A0X = -1;
    public int A0Y = -1;
    public int A0Z = 0;
    public int A0a;
    public int A0b = -1;
    public int A0c;
    public int A0d = -1;
    public int A0e = -1;
    public int A0f = -1;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = 0;
    public int A0o = 0;
    public int A0p = -1;
    public int A0q = -1;
    public String A0r = null;
    public String A0s;
    public String A0t;
    public boolean A0u = false;
    public boolean A0v = false;
    public boolean A0w = false;
    public boolean A0x = true;
    public boolean A0y = false;
    public int[] A0z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A10 = sparseIntArray;
        sparseIntArray.append(38, 24);
        A10.append(39, 25);
        A10.append(41, 28);
        A10.append(42, 29);
        A10.append(47, 35);
        A10.append(46, 34);
        A10.append(20, 4);
        A10.append(19, 3);
        A10.append(17, 1);
        A10.append(55, 6);
        A10.append(56, 7);
        A10.append(27, 17);
        A10.append(28, 18);
        A10.append(29, 19);
        A10.append(0, 26);
        A10.append(43, 31);
        A10.append(44, 32);
        A10.append(26, 10);
        A10.append(25, 9);
        A10.append(59, 13);
        A10.append(62, 16);
        A10.append(60, 14);
        A10.append(57, 11);
        A10.append(61, 15);
        A10.append(58, 12);
        A10.append(50, 38);
        A10.append(36, 37);
        A10.append(35, 39);
        A10.append(49, 40);
        A10.append(34, 20);
        A10.append(48, 36);
        A10.append(24, 5);
        A10.append(37, 76);
        A10.append(45, 76);
        A10.append(40, 76);
        A10.append(18, 76);
        A10.append(16, 76);
        A10.append(3, 23);
        A10.append(5, 27);
        A10.append(7, 30);
        A10.append(8, 8);
        A10.append(4, 33);
        A10.append(6, 2);
        A10.append(1, 22);
        A10.append(2, 21);
        A10.append(21, 61);
        A10.append(23, 62);
        A10.append(22, 63);
        A10.append(54, 69);
        A10.append(33, 70);
        A10.append(12, 71);
        A10.append(10, 72);
        A10.append(11, 73);
        A10.append(13, 74);
        A10.append(9, 75);
    }

    public void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14240ll.A0X);
        this.A0w = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = A10.get(index);
            if (i2 == 80) {
                this.A0v = obtainStyledAttributes.getBoolean(index, this.A0v);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.A08 = C14210li.A00(obtainStyledAttributes, index, this.A08);
                        continue;
                    case 2:
                        this.A09 = obtainStyledAttributes.getDimensionPixelSize(index, this.A09);
                        continue;
                    case 3:
                        this.A0A = C14210li.A00(obtainStyledAttributes, index, this.A0A);
                        continue;
                    case 4:
                        this.A0B = C14210li.A00(obtainStyledAttributes, index, this.A0B);
                        continue;
                    case 5:
                        this.A0r = obtainStyledAttributes.getString(index);
                        continue;
                    case 6:
                        this.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0E);
                        continue;
                    case 7:
                        this.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0F);
                        continue;
                    case 8:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.A0G = obtainStyledAttributes.getDimensionPixelSize(index, this.A0G);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        this.A0H = C14210li.A00(obtainStyledAttributes, index, this.A0H);
                        continue;
                    case 10:
                        this.A0I = C14210li.A00(obtainStyledAttributes, index, this.A0I);
                        continue;
                    case 11:
                        this.A0J = obtainStyledAttributes.getDimensionPixelSize(index, this.A0J);
                        continue;
                    case 12:
                        this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                        continue;
                    case 13:
                        this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                        continue;
                    case 14:
                        this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                        continue;
                    case 15:
                        this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                        continue;
                    case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                        continue;
                    case 17:
                        this.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0P);
                        continue;
                    case 18:
                        this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                        continue;
                    case 19:
                        this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                        continue;
                    case AnonymousClass0PW.A01:
                        this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                        continue;
                    case 21:
                        this.A0a = obtainStyledAttributes.getLayoutDimension(index, this.A0a);
                        continue;
                    case 22:
                        this.A0c = obtainStyledAttributes.getLayoutDimension(index, this.A0c);
                        continue;
                    case 23:
                        this.A0V = obtainStyledAttributes.getDimensionPixelSize(index, this.A0V);
                        continue;
                    case 24:
                        this.A0W = C14210li.A00(obtainStyledAttributes, index, this.A0W);
                        continue;
                    case 25:
                        this.A0X = C14210li.A00(obtainStyledAttributes, index, this.A0X);
                        continue;
                    case 26:
                        this.A0d = obtainStyledAttributes.getInt(index, this.A0d);
                        continue;
                    case 27:
                        this.A0e = obtainStyledAttributes.getDimensionPixelSize(index, this.A0e);
                        continue;
                    case 28:
                        this.A0f = C14210li.A00(obtainStyledAttributes, index, this.A0f);
                        continue;
                    case 29:
                        this.A0g = C14210li.A00(obtainStyledAttributes, index, this.A0g);
                        continue;
                    case 30:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.A0h = obtainStyledAttributes.getDimensionPixelSize(index, this.A0h);
                            break;
                        } else {
                            continue;
                        }
                    case 31:
                        this.A0i = C14210li.A00(obtainStyledAttributes, index, this.A0i);
                        continue;
                    case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                        this.A0j = C14210li.A00(obtainStyledAttributes, index, this.A0j);
                        continue;
                    case 33:
                        this.A0k = obtainStyledAttributes.getDimensionPixelSize(index, this.A0k);
                        continue;
                    case 34:
                        this.A0l = C14210li.A00(obtainStyledAttributes, index, this.A0l);
                        continue;
                    case 35:
                        this.A0m = C14210li.A00(obtainStyledAttributes, index, this.A0m);
                        continue;
                    case 36:
                        this.A05 = obtainStyledAttributes.getFloat(index, this.A05);
                        continue;
                    case 37:
                        this.A04 = obtainStyledAttributes.getFloat(index, this.A04);
                        continue;
                    case 38:
                        this.A06 = obtainStyledAttributes.getFloat(index, this.A06);
                        continue;
                    case 39:
                        this.A0U = obtainStyledAttributes.getInt(index, this.A0U);
                        continue;
                    case 40:
                        this.A0n = obtainStyledAttributes.getInt(index, this.A0n);
                        continue;
                    default:
                        switch (i2) {
                            case 54:
                                this.A0o = obtainStyledAttributes.getInt(index, this.A0o);
                                continue;
                            case 55:
                                this.A0R = obtainStyledAttributes.getInt(index, this.A0R);
                                continue;
                            case 56:
                                this.A0p = obtainStyledAttributes.getDimensionPixelSize(index, this.A0p);
                                continue;
                            case 57:
                                this.A0S = obtainStyledAttributes.getDimensionPixelSize(index, this.A0S);
                                continue;
                            case 58:
                                this.A0q = obtainStyledAttributes.getDimensionPixelSize(index, this.A0q);
                                continue;
                            case 59:
                                this.A0T = obtainStyledAttributes.getDimensionPixelSize(index, this.A0T);
                                continue;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.A0C = C14210li.A00(obtainStyledAttributes, index, this.A0C);
                                        continue;
                                    case 62:
                                        this.A0D = obtainStyledAttributes.getDimensionPixelSize(index, this.A0D);
                                        continue;
                                    case 63:
                                        this.A00 = obtainStyledAttributes.getFloat(index, this.A00);
                                        continue;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case AnonymousClass0PW.A02:
                                                this.A0Y = obtainStyledAttributes.getInt(index, this.A0Y);
                                                continue;
                                            case 73:
                                                this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                                                continue;
                                            case 74:
                                                this.A0t = obtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.A0x = obtainStyledAttributes.getBoolean(index, this.A0x);
                                                continue;
                                            case 76:
                                                StringBuilder A0S2 = AnonymousClass008.A0S("unused attribute 0x");
                                                A0S2.append(Integer.toHexString(index));
                                                A0S2.append("   ");
                                                A0S2.append(A10.get(index));
                                                Log.w("ConstraintSet", A0S2.toString());
                                                continue;
                                            case 77:
                                                this.A0s = obtainStyledAttributes.getString(index);
                                                continue;
                                            default:
                                                StringBuilder A0S3 = AnonymousClass008.A0S("Unknown attribute 0x");
                                                A0S3.append(Integer.toHexString(index));
                                                A0S3.append("   ");
                                                A0S3.append(A10.get(index));
                                                Log.w("ConstraintSet", A0S3.toString());
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                }
            } else {
                this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
