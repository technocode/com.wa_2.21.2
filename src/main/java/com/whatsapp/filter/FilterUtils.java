package com.whatsapp.filter;

import X.C59502nm;
import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

public class FilterUtils {
    public static final List A00 = Arrays.asList(Integer.valueOf((int) R.string.filter_name_none), Integer.valueOf((int) R.string.filter_name_pop), Integer.valueOf((int) R.string.filter_name_bw), Integer.valueOf((int) R.string.filter_name_cool), Integer.valueOf((int) R.string.filter_name_chrome), Integer.valueOf((int) R.string.filter_name_film));

    public static native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native boolean blurNative(Bitmap bitmap, int i, int i2);

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(int r6, X.C59502nm r7) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A00(int, X.2nm):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(android.graphics.Bitmap r4, int r5, boolean r6, X.C59502nm r7) {
        /*
            r3 = 0
            if (r4 != 0) goto L_0x0009
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
            com.whatsapp.util.Log.e(r0)
            return r3
        L_0x0009:
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r1) goto L_0x0017
            java.lang.String r0 = "Invalid bitmap config."
            com.whatsapp.util.Log.e(r0)
            return r3
        L_0x0017:
            if (r5 < 0) goto L_0x0051
            java.util.List r0 = com.whatsapp.filter.FilterUtils.A00
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0051
            android.graphics.Bitmap r2 = A00(r5, r7)     // Catch:{ OutOfMemoryError -> 0x002f }
            if (r6 == 0) goto L_0x0037
            r0 = 1
            android.graphics.Bitmap r4 = r4.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x002d }
            goto L_0x0037
        L_0x002d:
            r1 = move-exception
            goto L_0x0031
        L_0x002f:
            r1 = move-exception
            r2 = r3
        L_0x0031:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r4 = r3
        L_0x0037:
            if (r4 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            boolean r0 = applyFilter(r2, r4)
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.recycle()
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            return r4
        L_0x0047:
            r0 = 0
            goto L_0x003f
        L_0x0049:
            if (r6 == 0) goto L_0x0050
            if (r4 == 0) goto L_0x0050
            r4.recycle()
        L_0x0050:
            return r3
        L_0x0051:
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            com.whatsapp.util.Log.e(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A01(android.graphics.Bitmap, int, boolean, X.2nm):android.graphics.Bitmap");
    }

    public static boolean A02(Bitmap bitmap, Bitmap bitmap2, int i, C59502nm r6) {
        if (bitmap == null) {
            Log.e("FilterUtils/applyFilterIntoBuffer/sourceImage is null");
            return false;
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Log.e("Invalid sourceImage config.");
            return false;
        } else if (bitmap2 == null) {
            Log.e("FilterUtils/applyFilterIntoBuffer/destinationBuffer is null");
            return false;
        } else if (i < 0 || i >= A00.size()) {
            Log.e("FilterUtils/applyFilterIntoBuffer/filterId is invalid");
            return false;
        } else {
            Log.a(bitmap2.isMutable());
            try {
                Bitmap A002 = A00(i, r6);
                if (A002 != null) {
                    boolean applyFilterIntoBuffer = applyFilterIntoBuffer(A002, bitmap, bitmap2);
                    A002.recycle();
                    return applyFilterIntoBuffer;
                }
            } catch (OutOfMemoryError e) {
                Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e);
            }
            return false;
        }
    }
}
