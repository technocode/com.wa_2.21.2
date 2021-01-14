package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0oQ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC15640oQ {
    public static AbstractC15640oQ A00(AbstractC005102k r2) {
        return new C30311b7(r2, ((AbstractC005302m) r2).A9n());
    }

    public C15650oR A01(int i, Bundle bundle, AbstractC15630oP r8) {
        C30311b7 r3 = (C30311b7) this;
        C30301b6 r2 = r3.A01;
        if (r2.A01) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C08890bv r4 = (C08890bv) r2.A00.A02(i, null);
            if (r4 == null) {
                return r3.A04(i, null, r8, null);
            }
            AbstractC005102k r32 = r3.A00;
            C15650oR r22 = r4.A05;
            C30281b4 r1 = new C30281b4(r22, r8);
            r4.A03(r32, r1);
            C30281b4 r0 = r4.A01;
            if (r0 != null) {
                r4.A06(r0);
            }
            r4.A00 = r32;
            r4.A01 = r1;
            return r22;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public C15650oR A02(int i, Bundle bundle, AbstractC15630oP r7) {
        C30311b7 r3 = (C30311b7) this;
        C30301b6 r2 = r3.A01;
        if (r2.A01) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C15650oR r0 = null;
            C08890bv r1 = (C08890bv) r2.A00.A02(i, null);
            if (r1 != null) {
                r0 = r1.A09(false);
            }
            return r3.A04(i, bundle, r7, r0);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public void A03(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C30301b6 r5 = ((C30311b7) this).A01;
        if (r5.A00.A00() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            int i = 0;
            while (true) {
                C06540Tt r1 = r5.A00;
                if (i < r1.A00()) {
                    if (r1.A01) {
                        r1.A03();
                    }
                    C08890bv r6 = (C08890bv) r1.A03[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    C06540Tt r12 = r5.A00;
                    if (r12.A01) {
                        r12.A03();
                    }
                    printWriter.print(r12.A02[i]);
                    printWriter.print(": ");
                    printWriter.println(r6.toString());
                    printWriter.print(obj);
                    printWriter.print("mId=");
                    printWriter.print(r6.A03);
                    printWriter.print(" mArgs=");
                    printWriter.println(r6.A04);
                    printWriter.print(obj);
                    printWriter.print("mLoader=");
                    C15650oR r13 = r6.A05;
                    printWriter.println(r13);
                    r13.A04(AnonymousClass008.A0K(obj, "  "), fileDescriptor, printWriter, strArr);
                    if (r6.A01 != null) {
                        printWriter.print(obj);
                        printWriter.print("mCallbacks=");
                        printWriter.println(r6.A01);
                        C30281b4 r14 = r6.A01;
                        String A0K = AnonymousClass008.A0K(obj, "  ");
                        if (r14 != null) {
                            printWriter.print(A0K);
                            printWriter.print("mDeliveredData=");
                            printWriter.println(r14.A00);
                        } else {
                            throw null;
                        }
                    }
                    printWriter.print(obj);
                    printWriter.print("mData=");
                    Object A01 = r6.A01();
                    StringBuilder sb2 = new StringBuilder(64);
                    AnonymousClass0N2.A1S(A01, sb2);
                    sb2.append("}");
                    printWriter.println(sb2.toString());
                    printWriter.print(obj);
                    printWriter.print("mStarted=");
                    boolean z = false;
                    if (((AbstractC02280Bj) r6).A00 > 0) {
                        z = true;
                    }
                    printWriter.println(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
