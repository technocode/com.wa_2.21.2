package X;

import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.1b9  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC30331b9 extends C15650oR {
    public long A00 = -10000;
    public final Executor A01;
    public volatile RunnableC30321b8 A02;
    public volatile RunnableC30321b8 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC30331b9(Context context) {
        super(context);
        Executor executor = AbstractC15710oX.A07;
        this.A01 = executor;
    }

    @Override // X.C15650oR
    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A04(str, fileDescriptor, printWriter, strArr);
        if (this.A03 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A03);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public void A06() {
        if (this.A02 == null && this.A03 != null) {
            RunnableC30321b8 r3 = this.A03;
            Executor executor = this.A01;
            if (r3.A04 != EnumC15700oW.PENDING) {
                int ordinal = r3.A04.ordinal();
                if (ordinal == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (ordinal != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                r3.A04 = EnumC15700oW.RUNNING;
                executor.execute(((AbstractC15710oX) r3).A01);
            }
        }
    }

    public void A07(RunnableC30321b8 r3, Object obj) {
        A08(obj);
        if (this.A02 == r3) {
            if (this.A04) {
                if (this.A06) {
                    A00();
                } else {
                    super.A03 = true;
                }
            }
            this.A00 = SystemClock.uptimeMillis();
            this.A02 = null;
            A06();
        }
    }

    public void A08(Object obj) {
        Cursor cursor;
        if (this instanceof C59322nS) {
            Cursor cursor2 = (Cursor) obj;
            if (cursor2 != null && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if ((this instanceof AnonymousClass27H) && (cursor = (Cursor) obj) != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
