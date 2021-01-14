package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0Tl  reason: invalid class name and case insensitive filesystem */
public class C06490Tl extends ViewGroup.MarginLayoutParams {
    public float A00 = 0.0f;
    public float A01 = -1.0f;
    public float A02 = 0.5f;
    public float A03 = -1.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06;
    public float A07 = 0.5f;
    public float A08 = 0.5f;
    public float A09 = -1.0f;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = 0;
    public int A0F = 1;
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
    public int A0R = -1;
    public int A0S = 0;
    public int A0T = -1;
    public int A0U = -1;
    public int A0V = 0;
    public int A0W = 0;
    public int A0X = 0;
    public int A0Y = 0;
    public int A0Z = 0;
    public int A0a = 0;
    public int A0b = -1;
    public int A0c = -1;
    public int A0d = -1;
    public int A0e;
    public int A0f;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = -1;
    public int A0o = -1;
    public int A0p = -1;
    public int A0q = 0;
    public AnonymousClass0WC A0r = new AnonymousClass0WC();
    public String A0s = null;
    public String A0t = null;
    public boolean A0u = false;
    public boolean A0v = false;
    public boolean A0w = true;
    public boolean A0x = false;
    public boolean A0y = false;
    public boolean A0z = false;
    public boolean A10 = true;

    public C06490Tl() {
        super(-2, -2);
    }

    public C06490Tl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14240ll.A0I);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = C14120lY.A00.get(index);
            switch (i3) {
                case 1:
                    this.A0b = obtainStyledAttributes.getInt(index, this.A0b);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.A0D);
                    this.A0D = resourceId;
                    if (resourceId == -1) {
                        this.A0D = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.A0E = obtainStyledAttributes.getDimensionPixelSize(index, this.A0E);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.A00) % 360.0f;
                    this.A00 = f;
                    if (f < 0.0f) {
                        this.A00 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                    break;
                case 6:
                    this.A0R = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0R);
                    break;
                case 7:
                    this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.A0T);
                    this.A0T = resourceId2;
                    if (resourceId2 == -1) {
                        this.A0T = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.A0U);
                    this.A0U = resourceId3;
                    if (resourceId3 == -1) {
                        this.A0U = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.A0k);
                    this.A0k = resourceId4;
                    if (resourceId4 == -1) {
                        this.A0k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.A0l);
                    this.A0l = resourceId5;
                    if (resourceId5 == -1) {
                        this.A0l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.A0p);
                    this.A0p = resourceId6;
                    if (resourceId6 == -1) {
                        this.A0p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.A0o);
                    this.A0o = resourceId7;
                    if (resourceId7 == -1) {
                        this.A0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.A0C);
                    this.A0C = resourceId8;
                    if (resourceId8 == -1) {
                        this.A0C = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.A0B);
                    this.A0B = resourceId9;
                    if (resourceId9 == -1) {
                        this.A0B = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.A0A);
                    this.A0A = resourceId10;
                    if (resourceId10 == -1) {
                        this.A0A = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.A0m);
                    this.A0m = resourceId11;
                    if (resourceId11 == -1) {
                        this.A0m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.A0n);
                    this.A0n = resourceId12;
                    if (resourceId12 == -1) {
                        this.A0n = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.A0J);
                    this.A0J = resourceId13;
                    if (resourceId13 == -1) {
                        this.A0J = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AnonymousClass0PW.A01:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.A0I);
                    this.A0I = resourceId14;
                    if (resourceId14 == -1) {
                        this.A0I = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                    break;
                case 22:
                    this.A0P = obtainStyledAttributes.getDimensionPixelSize(index, this.A0P);
                    break;
                case 23:
                    this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                    break;
                case 24:
                    this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                    break;
                case 25:
                    this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                    break;
                case 26:
                    this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                    break;
                case 27:
                    this.A0v = obtainStyledAttributes.getBoolean(index, this.A0v);
                    break;
                case 28:
                    this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
                    break;
                case 29:
                    this.A02 = obtainStyledAttributes.getFloat(index, this.A02);
                    break;
                case 30:
                    this.A08 = obtainStyledAttributes.getFloat(index, this.A08);
                    break;
                case 31:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.A0W = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    this.A0V = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.A0a = obtainStyledAttributes.getDimensionPixelSize(index, this.A0a);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.A0a) == -2) {
                            this.A0a = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.A0Y = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Y);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.A0Y) == -2) {
                            this.A0Y = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.A05 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.A05));
                    this.A0W = 2;
                    break;
                case 36:
                    try {
                        this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.A0Z) == -2) {
                            this.A0Z = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.A0X = obtainStyledAttributes.getDimensionPixelSize(index, this.A0X);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.A0X) == -2) {
                            this.A0X = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.A04 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.A04));
                    this.A0V = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            this.A0t = string;
                            this.A0F = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = string.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String substring = string.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.A0F = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.A0F = 1;
                                    }
                                    i = indexOf + 1;
                                }
                                String str = this.A0t;
                                int indexOf2 = str.indexOf(58);
                                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                    String substring2 = str.substring(i);
                                    if (substring2.length() > 0) {
                                        Float.parseFloat(substring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String substring3 = str.substring(i, indexOf2);
                                    String substring4 = this.A0t.substring(indexOf2 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            Float.parseFloat(substring3);
                                            Float.parseFloat(substring4);
                                            break;
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 45:
                            this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                            continue;
                        case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                            this.A09 = obtainStyledAttributes.getFloat(index, this.A09);
                            continue;
                        case 47:
                            this.A0S = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            this.A0q = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            this.A0G = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0G);
                            continue;
                        case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                            this.A0H = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0H);
                            continue;
                        case 51:
                            this.A0s = obtainStyledAttributes.getString(index);
                            continue;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        A00();
    }

    public C06490Tl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public void A00() {
        this.A0x = false;
        this.A0w = true;
        this.A10 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.A0v) {
            this.A0w = false;
            if (this.A0W == 0) {
                this.A0W = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.A0u) {
            this.A10 = false;
            if (this.A0V == 0) {
                this.A0V = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A0w = false;
            if (i == 0 && this.A0W == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.A0v = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A10 = false;
            if (i2 == 0 && this.A0V == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.A0u = true;
            }
        }
        if (this.A01 != -1.0f || this.A0Q != -1 || this.A0R != -1) {
            this.A0x = true;
            this.A0w = true;
            this.A10 = true;
            AnonymousClass0WC r1 = this.A0r;
            if (!(r1 instanceof C29811aE)) {
                r1 = new C29811aE();
                this.A0r = r1;
            }
            ((C29811aE) r1).A0I(this.A0b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (1 != getLayoutDirection()) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveLayoutDirection(int r15) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06490Tl.resolveLayoutDirection(int):void");
    }
}
