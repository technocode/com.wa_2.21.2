package X;

import android.text.SpannableStringBuilder;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iL  reason: invalid class name and case insensitive filesystem */
public final class C34371iL implements AnonymousClass14F {
    public final int A00;
    public final List A01;
    public final long[] A02;
    public final long[] A03;

    public C34371iL(List list) {
        this.A01 = list;
        int size = list.size();
        this.A00 = size;
        long[] jArr = new long[(size << 1)];
        this.A02 = jArr;
        for (int i = 0; i < this.A00; i++) {
            C34361iK r3 = (C34361iK) list.get(i);
            int i2 = i << 1;
            jArr = this.A02;
            jArr[i2] = r3.A01;
            jArr[i2 + 1] = r3.A00;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        this.A03 = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // X.AnonymousClass14F
    public List A5d(long j) {
        AnonymousClass14E r4 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                AnonymousClass14E r5 = (AnonymousClass14E) this.A01.get(i);
                if (r5.A01 != Float.MIN_VALUE || r5.A02 != Float.MIN_VALUE) {
                    arrayList.add(r5);
                } else if (r4 == null) {
                    r4 = r5;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(r4.A0C).append((CharSequence) "\n").append(r5.A0C);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append(r5.A0C);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C34361iK(0, 0, spannableStringBuilder, null, Float.MIN_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE));
        } else if (r4 != null) {
            arrayList.add(r4);
            return arrayList;
        } else if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    @Override // X.AnonymousClass14F
    public long A6H(int i) {
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        C002001d.A39(z2);
        long[] jArr = this.A03;
        if (i >= jArr.length) {
            z = false;
        }
        C002001d.A39(z);
        return jArr[i];
    }

    @Override // X.AnonymousClass14F
    public int A6I() {
        return this.A03.length;
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        long[] jArr = this.A03;
        int A032 = AnonymousClass0W2.A03(jArr, j, false, false);
        if (A032 >= jArr.length) {
            return -1;
        }
        return A032;
    }
}
