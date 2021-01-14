package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.1QA  reason: invalid class name */
public abstract class AnonymousClass1QA {
    public final AnonymousClass0GV A00;
    public final File A01;

    public AnonymousClass1QA(AnonymousClass0GV r1, File file) {
        this.A01 = file;
        this.A00 = r1;
    }

    public static AnonymousClass1QA A00(AnonymousClass1Y3 r2, AnonymousClass01I r3, AnonymousClass0GV r4, File file) {
        int i = r2.version;
        if (i == AnonymousClass1Y3.CRYPT12.version) {
            return new C41281um(r3, r4, file);
        }
        if (i == AnonymousClass1Y3.CRYPT14.version) {
            return new C41291un(r4, file);
        }
        StringBuilder sb = new StringBuilder("BackupFile/verify-integrity/unknown-version: ");
        sb.append(r2);
        sb.append(" ");
        sb.append(file);
        r4.A01(sb.toString(), 4);
        throw new IOException("BackupFile/verify-integrity/unknown-version");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1QD A01() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QA.A01():X.1QD");
    }
}
