package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: X.28l  reason: invalid class name and case insensitive filesystem */
public final class C461828l extends AnonymousClass25L implements Handler.Callback {
    public int A00;
    public int A01;
    public AnonymousClass126 A02;
    public AbstractC34251i9 A03;
    public C454925a A04;
    public AbstractC455025b A05;
    public AbstractC455025b A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AnonymousClass127 A0A;
    public final AnonymousClass14H A0B;
    public final AnonymousClass14I A0C;

    @Override // X.AbstractC33821hR
    public boolean ABS() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C461828l(AnonymousClass14I r3, Looper looper) {
        super(3);
        AnonymousClass14H r1 = AnonymousClass14H.A00;
        Handler handler = null;
        if (r3 != null) {
            this.A0C = r3;
            this.A09 = looper != null ? new Handler(looper, this) : handler;
            this.A0B = r1;
            this.A0A = new AnonymousClass127();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass25L
    public void A04() {
        this.A02 = null;
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0C.AEn(emptyList);
        }
        A07();
        this.A03.release();
        this.A03 = null;
        this.A00 = 0;
    }

    @Override // X.AnonymousClass25L
    public void A05(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0C.AEn(emptyList);
        }
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A07();
            this.A03.release();
            this.A03 = null;
            this.A00 = 0;
            this.A03 = C34261iA.A00(this.A02);
            return;
        }
        A07();
        this.A03.flush();
    }

    public final long A06() {
        int i = this.A01;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC455025b r4 = this.A06;
        AnonymousClass14F r1 = r4.A01;
        if (i < r1.A6I()) {
            return r1.A6H(i) + r4.A00;
        }
        return Long.MAX_VALUE;
    }

    public final void A07() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC455025b r0 = this.A06;
        if (r0 != null) {
            r0.A02();
            this.A06 = null;
        }
        AbstractC455025b r02 = this.A05;
        if (r02 != null) {
            r02.A02();
            this.A05 = null;
        }
    }

    @Override // X.AbstractC33821hR
    public boolean AB1() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        if (r3 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be A[LOOP:1: B:46:0x00be->B:71:0x00be, LOOP_START, SYNTHETIC, Splitter:B:46:0x00be] */
    @Override // X.AbstractC33821hR
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AMl(long r11, long r13) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461828l.AMl(long, long):void");
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A0C.AEn((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
