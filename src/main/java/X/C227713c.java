package X;

import java.util.Comparator;

/* renamed from: X.13c  reason: invalid class name and case insensitive filesystem */
public final class C227713c implements Comparator {
    public static int A00(AnonymousClass13V r2) {
        String str = r2.A02;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return -1;
        }
        return (AnonymousClass0W2.A00 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return A00((AnonymousClass13V) obj) - A00((AnonymousClass13V) obj2);
    }
}
