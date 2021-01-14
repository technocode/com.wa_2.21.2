package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import java.util.WeakHashMap;

/* renamed from: X.11K  reason: invalid class name */
public class AnonymousClass11K {
    public static final AnonymousClass075 A00 = AnonymousClass075.TEXT_START;
    public static final WeakHashMap A01 = new WeakHashMap();
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();

    public static AnonymousClass075 A00(int i, int i2) {
        AnonymousClass075 r4 = AnonymousClass075.LAYOUT_END;
        AnonymousClass075 r3 = AnonymousClass075.LAYOUT_START;
        AnonymousClass075 r2 = AnonymousClass075.CENTER;
        switch (i) {
            case 0:
            case 1:
                int i3 = 8388615 & i2;
                if (i3 != 1) {
                    if (i3 == 3) {
                        return AnonymousClass075.LEFT;
                    }
                    if (i3 == 5) {
                        return AnonymousClass075.RIGHT;
                    }
                    if (i3 != 8388611) {
                        if (i3 != 8388613) {
                            return A00;
                        }
                        return r4;
                    }
                    return r3;
                }
                return r2;
            case 2:
                return AnonymousClass075.TEXT_START;
            case 3:
                return AnonymousClass075.TEXT_END;
            case 4:
                return r2;
            case 5:
                return r3;
            case 6:
                return r4;
            default:
                return A00;
        }
    }

    public static AnonymousClass074 A01(Context context) {
        AnonymousClass074 r4;
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        TypedArray typedArray4;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            r4 = (AnonymousClass074) weakHashMap.get(theme);
        }
        if (r4 == null) {
            r4 = new AnonymousClass074();
            C33471gp.A00("LoadTextStyle", null);
            Resources.Theme theme2 = context.getTheme();
            if (Build.VERSION.SDK_INT <= 22) {
                synchronized (theme2) {
                    typedArray = context.obtainStyledAttributes(null, AnonymousClass11I.A01, 0, 0);
                }
            } else {
                typedArray = context.obtainStyledAttributes(null, AnonymousClass11I.A01, 0, 0);
            }
            int resourceId = typedArray.getResourceId(0, -1);
            typedArray.recycle();
            if (resourceId != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        typedArray4 = theme2.obtainStyledAttributes(resourceId, AnonymousClass11I.A00);
                    }
                } else {
                    typedArray4 = theme2.obtainStyledAttributes(resourceId, AnonymousClass11I.A00);
                }
                A02(typedArray4, r4);
                typedArray4.recycle();
            }
            if (Build.VERSION.SDK_INT <= 22) {
                synchronized (theme2) {
                    typedArray2 = context.obtainStyledAttributes(null, AnonymousClass11I.A02, 0, 0);
                }
            } else {
                typedArray2 = context.obtainStyledAttributes(null, AnonymousClass11I.A02, 0, 0);
            }
            int resourceId2 = typedArray2.getResourceId(0, -1);
            typedArray2.recycle();
            if (resourceId2 != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        typedArray3 = theme2.obtainStyledAttributes(resourceId2, AnonymousClass11I.A00);
                    }
                } else {
                    typedArray3 = theme2.obtainStyledAttributes(resourceId2, AnonymousClass11I.A00);
                }
                A02(typedArray3, r4);
                typedArray3.recycle();
            }
            AnonymousClass112.A00();
            synchronized (weakHashMap) {
                weakHashMap.put(theme, r4);
            }
        }
        return r4.A00();
    }

    public static void A02(TypedArray typedArray, AnonymousClass074 r10) {
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                r10.A0N = typedArray.getColorStateList(index);
                r10.A0K = 0;
            } else if (index == 0) {
                r10.A0L = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    r10.A0P = A02[integer - 1];
                }
            } else if (index == 25) {
                if (Build.VERSION.SDK_INT >= 17) {
                    i = typedArray.getInt(index, -1);
                    r10.A0R = A00(i, i2);
                }
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                r10.A0R = A00(i, i2);
                AnonymousClass0W1 r7 = AnonymousClass0W1.TOP;
                int i4 = i2 & 112;
                if (i4 == 16) {
                    r7 = AnonymousClass0W1.CENTER;
                } else if (i4 != 48 && i4 == 80) {
                    r7 = AnonymousClass0W1.BOTTOM;
                }
                r10.A0S = r7;
            } else if (index == 15) {
                r10.A0V = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                r10.A0H = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                r10.A0E = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                r10.A0W = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                r10.A0C = typedArray.getColor(index, 0);
            } else if (index == 3) {
                r10.A07 = typedArray.getColor(index, 0);
            } else if (index == 1) {
                r10.A0M = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                r10.A00 = (float) typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                r10.A05 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                r10.A02 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                r10.A03 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                r10.A04 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                r10.A0J = typedArray.getColor(index, 0);
            } else if (index == 13) {
                r10.A0G = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                r10.A0D = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                r10.A0I = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                r10.A0F = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    r10.A0O = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A06 = typedArray.getInt(index, 0);
                }
            } else if (index == 27) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A0A = typedArray.getInt(index, 0);
                }
            } else if (index == 28 && Build.VERSION.SDK_INT >= 26) {
                r10.A0B = typedArray.getInt(index, 0);
            }
        }
    }
}
