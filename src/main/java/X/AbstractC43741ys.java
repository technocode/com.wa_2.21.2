package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1ys  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC43741ys extends AnonymousClass0PN {
    public Map A00;
    public Set A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass2LJ A03;
    public final Random A04 = new Random();

    public AbstractC43741ys(AnonymousClass0PQ r3) {
        super("message_main_verification", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r3);
        this.A02 = r3.A01;
        this.A03 = new AnonymousClass2LJ();
        this.A00 = new HashMap();
        RunnableEBaseShape9S0100000_I1_4 runnableEBaseShape9S0100000_I1_4 = new RunnableEBaseShape9S0100000_I1_4(this, 27);
        List list = super.A00;
        if (list == null) {
            list = new ArrayList();
            super.A00 = list;
        }
        list.add(runnableEBaseShape9S0100000_I1_4);
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int i;
        A0S();
        long j = -1;
        int i2 = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            i2++;
            String A0P = A0P(cursor);
            if (!TextUtils.isEmpty(A0P)) {
                Set set = this.A01;
                if (set == null) {
                    set = new HashSet();
                    this.A01 = set;
                }
                String valueOf = String.valueOf(j);
                set.add(valueOf);
                Set set2 = this.A01;
                if (set2 != null) {
                    i = set2.size();
                } else {
                    i = 0;
                }
                this.A00.put(valueOf, A0P);
                if (i >= 50) {
                    A0R();
                }
            }
        }
        Set set3 = this.A01;
        if (set3 != null && !set3.isEmpty()) {
            String join = TextUtils.join(",", this.A01);
            if (!TextUtils.isEmpty(join)) {
                this.A06.A05("message_main_verification_failed_message_ids", join);
            }
        }
        return new Pair(Long.valueOf(j), Integer.valueOf(i2));
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A06.A04("message_main_verification_start_index", ((AnonymousClass27y) this).A04.A04());
    }

    @Override // X.AnonymousClass0PN
    public void A0D() {
        super.A0D();
        A0Q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0285, code lost:
        if (r6 != null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x028a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x028d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0291, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r0 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        if (r5 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x022f A[SYNTHETIC, Splitter:B:132:0x022f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0P(android.database.Cursor r21) {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43741ys.A0P(android.database.Cursor):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q() {
        /*
            r3 = this;
            r0 = 0
            r3.A01 = r0
            java.util.Map r0 = r3.A00
            r0.clear()
            X.08d r0 = r3.A05
            X.0OQ r2 = r0.A04()
            X.08m r1 = r3.A06     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "message_main_verification_failed_message_ids"
            r1.A02(r0)
            r2.close()
            return
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43741ys.A0Q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r2 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43741ys.A0R():void");
    }

    public final void A0S() {
        String A012 = this.A06.A01("message_main_verification_failed_message_ids");
        if (A012 != null) {
            this.A01 = new HashSet(Arrays.asList(A012.split(",")));
        }
    }
}
