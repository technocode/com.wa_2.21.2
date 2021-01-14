package X;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2HL  reason: invalid class name */
public class AnonymousClass2HL extends CursorAdapter {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = 1;
    public ActivityC004802g A06;
    public AbstractC06110Rt A07;
    public AnonymousClass2IG A08;
    public AnonymousClass2NP A09;
    public AnonymousClass02N A0A;
    public C007303n A0B;
    public AbstractC007503q A0C;
    public List A0D = new ArrayList();
    public List A0E = new ArrayList();
    public boolean A0F;
    public boolean A0G;
    public final SparseArray A0H = new SparseArray();
    public final AnonymousClass00S A0I;
    public final AnonymousClass01X A0J;
    public final AnonymousClass01K A0K;
    public final AnonymousClass09J A0L;
    public final AnonymousClass0AL A0M;
    public final ArrayList A0N = new ArrayList();
    public final HashSet A0O = new HashSet();
    public final HashSet A0P = new HashSet();
    public final Set A0Q = new HashSet();

    public boolean hasStableIds() {
        return true;
    }

    public void onContentChanged() {
    }

    public AnonymousClass2HL(ActivityC004802g r3, AnonymousClass2IG r4, AnonymousClass00S r5, AnonymousClass01X r6, AnonymousClass0AL r7, AnonymousClass01K r8, AnonymousClass09J r9) {
        super((Context) r3, (Cursor) null, false);
        this.A0I = r5;
        this.A0J = r6;
        this.A0M = r7;
        this.A0K = r8;
        this.A0L = r9;
        this.A06 = r3;
        this.A08 = r4;
    }

    public int A00() {
        return (this.A0N.size() + getCursor().getCount()) - this.A04;
    }

    public int A01(int i, int i2) {
        if (i2 == -1 || i2 == 1) {
            return i;
        }
        AbstractC007503q A042 = getItem(i);
        if (A042 != null) {
            int A043 = AbstractC59032mw.A04(A042);
            if (A043 == 1) {
                int i3 = i - 1;
                while (i3 >= 0) {
                    AbstractC007503q A044 = getItem(i3);
                    if (A044 == null || !A07(A044, i3, A042, i3 + 1) || !A06(A044)) {
                        return i3 + 1;
                    }
                    i3--;
                    A042 = A044;
                }
            } else if (A043 != 2) {
                return i;
            }
            return !this.A0F ? i : i - 1;
        }
        throw null;
    }

    public int A02(AbstractC007503q r4) {
        SparseArray sparseArray = this.A0H;
        int indexOfValue = sparseArray.indexOfValue(r4);
        if (indexOfValue >= 0) {
            int keyAt = sparseArray.keyAt(indexOfValue);
            return keyAt >= A00() ? keyAt + 1 : keyAt;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0N;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (r4.equals(arrayList.get(i))) {
                int count = getCursor().getCount() + i;
                return count >= A00() ? count + 1 : count;
            }
            i++;
        }
    }

    public int A03(AbstractC007503q r10, int i) {
        AbstractC007503q A042;
        if (!A06(r10)) {
            return -1;
        }
        int A043 = AbstractC59032mw.A04(r10);
        int i2 = 0;
        if (A043 == 1) {
            int i3 = i - 1;
            AbstractC007503q r2 = r10;
            int i4 = 0;
            while (i3 >= 0 && i4 < 3) {
                AbstractC007503q A044 = getItem(i3);
                if (A044 == null || !A07(A044, i3, r2, i3 + 1) || !A06(A044)) {
                    break;
                }
                i4++;
                i3--;
                r2 = A044;
            }
            int i5 = i + 1;
            while (i5 < getCount() && i2 < 102 && (A042 = getItem(i5)) != null && A07(A042, i5, r10, i5 - 1) && A06(A042)) {
                i2++;
                i5++;
                r10 = A042;
            }
            if (i4 + 1 + i2 < 4 || i2 >= 102) {
                return -1;
            }
            if (i2 == 101 || i4 == 0) {
                return 1;
            }
            if (i2 != 0) {
                return 2;
            }
            return 3;
        } else if (A043 != 2 || !this.A0F) {
            return -1;
        } else {
            int i6 = i - 1;
            AbstractC007503q r22 = r10;
            while (i6 >= 0) {
                AbstractC007503q A045 = getItem(i6);
                if (A045 == null || !A07(A045, i6, r22, i6 + 1) || !A06(A045)) {
                    break;
                }
                i2++;
                i6--;
                r22 = A045;
            }
            int i7 = i2 % 2;
            if (i7 != 0) {
                return i7 == 1 ? 3 : 2;
            }
            int i8 = i + 1;
            AbstractC007503q A046 = getItem(i8);
            if (A046 == null || !A07(A046, i8, r10, i) || !A06(A046)) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: A04 */
    public AbstractC007503q getItem(int i) {
        int i2;
        AbstractC007503q r2 = null;
        if (this.A04 <= 0 || i != A00()) {
            int i3 = i;
            if (i > A00()) {
                i3 = i - 1;
            }
            int count = getCursor().getCount();
            if (i3 < count) {
                SparseArray sparseArray = this.A0H;
                r2 = (AbstractC007503q) sparseArray.get(i3);
                if (r2 == null) {
                    int position = getCursor().getPosition();
                    getCursor().moveToPosition((count - 1) - i3);
                    int position2 = getCursor().getPosition();
                    try {
                        r2 = this.A0K.A0J.A03(getCursor(), this.A0A);
                        if (position2 < position && (position2 <= (i2 = this.A00) || position2 > i2 + 50)) {
                            this.A00 = Math.max(0, position2 - 50);
                            getCursor().moveToPosition(this.A00);
                        }
                        sparseArray.put(i3, r2);
                    } catch (CursorIndexOutOfBoundsException e) {
                        StringBuilder A0U = AnonymousClass008.A0U("conversation/cursor-out-of-bounds cursorCount:", count, " dataPosition:", i3, " viewPosition:");
                        A0U.append(i);
                        A0U.append(" appended:");
                        A0U.append(this.A0N.size());
                        A0U.append(" unseenRowCount:");
                        AnonymousClass008.A1O(A0U, this.A04, " old_pos:", position, " new_pos:");
                        A0U.append(position2);
                        A0U.append(" cursor-count:");
                        A0U.append(getCursor().getCount());
                        Log.e(A0U.toString());
                        throw e;
                    }
                }
            } else {
                int i4 = i3 - count;
                if (i4 >= 0) {
                    ArrayList arrayList = this.A0N;
                    if (i4 < arrayList.size()) {
                        r2 = (AbstractC007503q) arrayList.get(i4);
                    }
                }
            }
            for (AnonymousClass1LC r0 : this.A0D) {
                r0.AIe(r2);
            }
            return r2;
        }
        AbstractC007503q r1 = this.A0C;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0AL r6 = this.A0M;
        long A052 = this.A0I.A05();
        AnonymousClass0A6 r02 = r6.A07;
        AbstractC007503q A022 = r6.A02(AnonymousClass0FI.A07(r02.A01, r02.A00, null, true), A052, (byte) 0);
        A022.A0d("dummy msg!");
        this.A0C = A022;
        return A022;
    }

    public final boolean A05(AbstractC51572Zg r3, AbstractC007503q r4) {
        HashSet hashSet = this.A0P;
        C007303n r1 = r4.A0n;
        return hashSet.contains(r1) || this.A0O.contains(r1) || this.A07 != null || r3.A02 != this.A01 || (r4 instanceof C02850Ds);
    }

    public final boolean A06(AbstractC007503q r6) {
        byte b;
        if (r6.A0p <= 0 || r6.A0p > this.A05 || (((b = r6.A0m) == 20 && r6.A09() != null) || r6.A0H != null || ((b == 20 && AnonymousClass0FI.A0Q(this.A0I, this.A0L, r6)) || AbstractC59032mw.A04(r6) == -1))) {
            return false;
        }
        return true;
    }

    public final boolean A07(AbstractC007503q r13, int i, AbstractC007503q r15, int i2) {
        boolean z;
        boolean z2;
        AnonymousClass02N A072;
        long j = r13.A0E;
        long j2 = r15.A0E;
        boolean z3 = false;
        if (Math.abs(j - j2) <= 610000) {
            z3 = true;
        }
        boolean A062 = AnonymousClass0OY.A06(j, j2);
        boolean z4 = false;
        if (r13.A0s(1) == r15.A0s(1)) {
            z4 = true;
        }
        boolean z5 = r13.A0n.A02;
        if (z5 != r15.A0n.A02 || (!z5 && (A072 = r13.A07()) != null && !A072.equals(r15.A07()))) {
            z = false;
        } else {
            z = true;
        }
        boolean z6 = false;
        if (i < A00()) {
            z6 = true;
        }
        boolean z7 = false;
        if (i2 < A00()) {
            z7 = true;
        }
        boolean z8 = false;
        if (z6 == z7) {
            z8 = true;
        }
        boolean z9 = false;
        if (AbstractC59032mw.A04(r13) == AbstractC59032mw.A04(r15)) {
            z9 = true;
        }
        AbstractC007503q A092 = r13.A09();
        AbstractC007503q A093 = r15.A09();
        if (A092 == A093 || !(A092 == null || A093 == null || !A092.A0n.equals(A093.A0n))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3 || !A062 || !z || !z8 || !z4 || !z9 || !z2) {
            return false;
        }
        return true;
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    public void changeCursor(Cursor cursor) {
        this.A0G = true;
        super.changeCursor(cursor);
    }

    public int getCount() {
        int i = 0;
        if (!this.A0G || getCursor() == null) {
            Log.d("conversation/adapter/getcount/nocursor 0");
            return 0;
        }
        int size = this.A0N.size() + getCursor().getCount();
        if (this.A04 > 0) {
            i = 1;
        }
        return size + i;
    }

    public long getItemId(int i) {
        long j;
        AbstractC007503q A042 = getItem(i);
        if (A042 == null) {
            return 0;
        }
        if (A042.A0p == 0) {
            j = (long) A042.A0n.hashCode();
        } else {
            j = A042.A0p;
        }
        return (j & 4294967295L) | (((long) A042.A0m) << 32);
    }

    public int getItemViewType(int i) {
        if (!this.A0G) {
            return -1;
        }
        if (this.A04 > 0 && i == A00()) {
            return 18;
        }
        AbstractC007503q A042 = getItem(i);
        if (A042 == null) {
            return -1;
        }
        AnonymousClass2IG r0 = this.A08;
        int A032 = A03(A042, i);
        if (r0 == null) {
            throw null;
        } else if (A032 == -1) {
            return AnonymousClass2IG.A00(A042);
        } else {
            if (A032 == 1) {
                return AbstractC59032mw.A04(A042) != 2 ? A042.A0n.A02 ? 32 : 33 : A042.A0n.A02 ? 41 : 42;
            }
            return 34;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0270, code lost:
        if (X.AnonymousClass0OY.A06(r11.A0E, r6.A0E) != false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c9, code lost:
        if (r5.getFMessage().A0m == r6.A0m) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HL.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        int i = 0;
        if (this.A04 > 0) {
            i = 1;
        }
        return i + 79;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0G = false;
    }
}
