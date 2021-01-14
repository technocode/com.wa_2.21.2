package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0oR  reason: invalid class name and case insensitive filesystem */
public class C15650oR {
    public int A00;
    public AbstractC08900bw A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06 = false;

    public C15650oR(Context context) {
        context.getApplicationContext();
    }

    public void A00() {
        if (!(this instanceof AbstractC30331b9)) {
            throw null;
        }
        AbstractC30331b9 r1 = (AbstractC30331b9) this;
        r1.A05();
        r1.A03 = new RunnableC30321b8(r1);
        r1.A06();
    }

    public void A01() {
        if (this instanceof C59322nS) {
            C59322nS r1 = (C59322nS) this;
            r1.A05();
            Cursor cursor = r1.A00;
            if (cursor != null && !cursor.isClosed()) {
                r1.A00.close();
            }
            r1.A00 = null;
        } else if (this instanceof C59292nP) {
            A05();
        } else if (this instanceof AnonymousClass27K) {
            AnonymousClass27K r12 = (AnonymousClass27K) this;
            r12.A05();
            r12.A00 = null;
        } else if (this instanceof AnonymousClass27H) {
            AnonymousClass27H r13 = (AnonymousClass27H) this;
            r13.A05();
            Cursor cursor2 = r13.A00;
            if (cursor2 != null && !cursor2.isClosed()) {
                r13.A00.close();
            }
            r13.A00 = null;
        }
    }

    public void A02() {
        if (this instanceof C59322nS) {
            C59322nS r2 = (C59322nS) this;
            Cursor cursor = r2.A00;
            if (cursor != null) {
                r2.A03(cursor);
            }
            boolean z = ((C15650oR) r2).A03;
            ((C15650oR) r2).A03 = false;
            ((C15650oR) r2).A04 |= z;
            if (z || r2.A00 == null) {
                r2.A00();
            }
        } else if (this instanceof C59292nP) {
            boolean z2 = this.A03;
            this.A03 = false;
            this.A04 |= z2;
            A00();
        } else if (this instanceof AnonymousClass27H) {
            AnonymousClass27H r22 = (AnonymousClass27H) this;
            Cursor cursor2 = r22.A00;
            if (cursor2 != null) {
                r22.A03(cursor2);
            }
            boolean z3 = ((C15650oR) r22).A03;
            ((C15650oR) r22).A03 = false;
            r22.A04 |= z3;
            if (z3 || r22.A00 == null) {
                r22.A00();
            }
        } else if (!(this instanceof C456525s)) {
            throw null;
        } else {
            C456525s r1 = (C456525s) this;
            r1.A01.drainPermits();
            r1.A00();
        }
    }

    public void A03(Object obj) {
        AbstractC08900bw r2 = this.A01;
        if (r2 != null) {
            C02270Bi r22 = (C02270Bi) r2;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r22.A07(obj);
            } else {
                r22.A08(obj);
            }
        }
    }

    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A00);
        printWriter.print(" mListener=");
        printWriter.println(this.A01);
        if (this.A06 || this.A03 || this.A04) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A06);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A03);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A04);
        }
        if (this.A02 || this.A05) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A02);
            printWriter.print(" mReset=");
            printWriter.println(this.A05);
        }
    }

    public boolean A05() {
        if (!(this instanceof AbstractC30331b9)) {
            throw null;
        }
        AbstractC30331b9 r4 = (AbstractC30331b9) this;
        if (r4.A03 != null) {
            if (!r4.A06) {
                ((C15650oR) r4).A03 = true;
            }
            if (r4.A02 != null) {
                r4.A03 = null;
            } else {
                RunnableC30321b8 r1 = r4.A03;
                r1.A02.set(true);
                boolean cancel = ((AbstractC15710oX) r1).A01.cancel(false);
                if (cancel) {
                    r4.A02 = r4.A03;
                    if (r4 instanceof C59322nS) {
                        C59322nS r0 = (C59322nS) r4;
                        synchronized (r4) {
                            C04080Iy r02 = r0.A01;
                            if (r02 != null) {
                                r02.A01();
                            }
                        }
                    } else if (r4 instanceof AnonymousClass27H) {
                        AnonymousClass27H r03 = (AnonymousClass27H) r4;
                        synchronized (r4) {
                            CancellationSignal cancellationSignal = r03.A01;
                            if (cancellationSignal != null) {
                                cancellationSignal.cancel();
                            }
                        }
                    }
                }
                r4.A03 = null;
                return cancel;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AnonymousClass0N2.A1S(this, sb);
        sb.append(" id=");
        return AnonymousClass008.A0N(sb, this.A00, "}");
    }
}
