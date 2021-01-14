package com.whatsapp.emoji;

import X.AnonymousClass0M7;
import X.C12320hu;
import X.C12330hv;
import X.C12340hw;
import X.C12350hx;
import X.C12360hy;
import java.util.Arrays;

public class EmojiDescriptor {
    public static int A00(AnonymousClass0M7 r5, boolean z) {
        short s = 0;
        do {
            int A00 = r5.A00();
            if (A00 == 0) {
                return C12350hx.A00[s];
            }
            int binarySearch = Arrays.binarySearch(C12320hu.A00, (int) C12330hv.A00[s], (int) C12340hw.A00[s], A00);
            if (binarySearch >= 0) {
                s = C12360hy.A00[binarySearch];
            } else if (!z) {
                return C12350hx.A00[s];
            } else {
                return -1;
            }
        } while (s >= 0);
        if (z) {
            if (r5.A00() != 0 || s == -1) {
                return -1;
            }
            return -s;
        } else if (s != -1) {
            return -s;
        } else {
            return -1;
        }
    }

    public static int getDescriptor(AnonymousClass0M7 r1) {
        return A00(r1, false);
    }
}
