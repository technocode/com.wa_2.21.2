package X;

import android.content.Context;
import android.graphics.Typeface;
import com.whatsapp.emoji.EmojiDescriptor;
import java.util.Random;

/* renamed from: X.32m  reason: invalid class name and case insensitive filesystem */
public class C660232m {
    public static final Random A00 = new Random();
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 3, 5};

    public static int A00(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static Typeface A01(Context context, int i) {
        if (i == 1) {
            return Typeface.SERIF;
        }
        if (i == 2) {
            return C53232ck.A01(context);
        }
        if (i == 3) {
            Typeface typeface = C53232ck.A0C;
            if (typeface != null) {
                return typeface;
            }
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Bryndan-Write.ttf");
            C53232ck.A0C = createFromAsset;
            return createFromAsset;
        } else if (i != 5) {
            return Typeface.SANS_SERIF;
        } else {
            return C53232ck.A00(context);
        }
    }

    public static String A02(String str) {
        AnonymousClass0M6 r5 = new AnonymousClass0M6(str);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '\n') {
                i2 += 50;
            } else {
                i2++;
            }
            if (i2 > 700) {
                break;
            }
            r5.A00 = i;
            i += r5.A01(i, EmojiDescriptor.A00(r5, false));
        }
        return str.substring(0, i);
    }
}
