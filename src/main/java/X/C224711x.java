package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Locale;

/* renamed from: X.11x  reason: invalid class name and case insensitive filesystem */
public final class C224711x {
    public static AnonymousClass15B A00;

    public static AnonymousClass25O A00(Context context, AnonymousClass12N r13, AbstractC232314x r14, AnonymousClass129 r15) {
        AnonymousClass15B r10;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        new AnonymousClass12S();
        synchronized (C224711x.class) {
            r10 = A00;
            if (r10 == null) {
                String country = Locale.getDefault().getCountry();
                if (country != null) {
                    country = country.toUpperCase(Locale.US);
                }
                int[] iArr = (int[]) C34421iS.A09.get(country);
                if (iArr == null) {
                    iArr = new int[]{2, 2, 2, 2};
                }
                SparseArray sparseArray = new SparseArray(6);
                sparseArray.append(0, Long.valueOf((long) SearchActionVerificationClientService.MS_TO_NS));
                Long valueOf = Long.valueOf(C34421iS.A0D[iArr[0]]);
                sparseArray.append(2, valueOf);
                sparseArray.append(3, Long.valueOf(C34421iS.A0A[iArr[1]]));
                sparseArray.append(4, Long.valueOf(C34421iS.A0B[iArr[2]]));
                sparseArray.append(5, Long.valueOf(C34421iS.A0C[iArr[3]]));
                sparseArray.append(7, valueOf);
                AnonymousClass15Y r2 = AnonymousClass15Y.A00;
                Long l = (Long) sparseArray.get(0);
                if (l == null) {
                    l = (Long) sparseArray.get(0);
                }
                r10 = new C34421iS(l.longValue(), r2);
                A00 = r10;
            }
        }
        return new AnonymousClass25O(context, r13, r14, r15, r10, myLooper);
    }
}
