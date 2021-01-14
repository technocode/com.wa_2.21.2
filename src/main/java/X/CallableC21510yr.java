package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yr  reason: invalid class name and case insensitive filesystem */
public class CallableC21510yr implements Callable {
    public final /* synthetic */ C33171gJ A00;

    public CallableC21510yr(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33171gJ r5 = this.A00;
        C22100zr.A00();
        if (r5.A0f != null) {
            try {
                AnonymousClass0VV r0 = r5.A0E;
                AnonymousClass0VV r3 = AnonymousClass0VV.BACK;
                if (r0.equals(r3)) {
                    r3 = AnonymousClass0VV.FRONT;
                }
                AnonymousClass0z3 r2 = r5.A0T;
                int i = 1;
                if (r3 == AnonymousClass0VV.FRONT) {
                    i = 0;
                }
                if (r2.A02(Integer.valueOf(i))) {
                    r5.A0m = true;
                    String A01 = r2.A01(r3);
                    C33171gJ.A01(r5, A01);
                    C33171gJ.A02(r5, A01);
                    C21960zc r02 = new C21960zc(r5.A0E, r5.A5B(), r5.A04());
                    C22100zr.A00();
                    return r02;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot switch to ");
                sb.append(r3.name());
                sb.append(", camera is not present");
                throw new AnonymousClass0y7(sb.toString());
            } finally {
                r5.A0m = false;
            }
        } else {
            throw new C21620z2("Cannot switch camera, no cameras open.");
        }
    }
}
