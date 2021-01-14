package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1R6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1R6 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass1RB A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ CountDownLatch A04;
    public final /* synthetic */ AtomicReference A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass1R6(AnonymousClass1RB r1, File file, Map map, AtomicReference atomicReference, List list, boolean z, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = file;
        this.A03 = map;
        this.A05 = atomicReference;
        this.A02 = list;
        this.A06 = z;
        this.A04 = countDownLatch;
    }

    public final void run() {
        int i;
        String str;
        AnonymousClass1RB r6 = this.A00;
        File file = this.A01;
        Map map = this.A03;
        AtomicReference atomicReference = this.A05;
        List list = this.A02;
        boolean z = this.A06;
        CountDownLatch countDownLatch = this.A04;
        try {
            AnonymousClass03R r10 = r6.A0I;
            String A08 = AnonymousClass0JJ.A08(r10, r6.A0J.A00, file);
            if (A08 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ");
                sb.append(file);
                Log.e(sb.toString());
                return;
            }
            AnonymousClass1RH r2 = (AnonymousClass1RH) map.get(A08);
            AbstractC03860Ib r4 = r6.A0G;
            if (!r4.A00()) {
                countDownLatch.countDown();
                return;
            }
            try {
                i = C002001d.A0J(file.getAbsolutePath(), r2, r10, r6.A0K);
                if (i != 3) {
                    Object[] objArr = new Object[2];
                    objArr[0] = A08;
                    if (i == 1) {
                        str = "local-file-does-not-exist";
                    } else if (i == 2) {
                        str = "remote-file-does-not-exist";
                    } else if (i == 3) {
                        str = "remote-file-same-as-local";
                    } else if (i == 4) {
                        str = "remote-file-different-from-local";
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0F("unexpected file-status: ", i));
                    }
                    objArr[1] = str;
                    Log.i(String.format("gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", objArr));
                    list.add(file);
                }
            } catch (C41461v5 e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gdrive/backup/get-files-to-be-uploaded problem with a file ");
                sb2.append(file);
                Log.e(sb2.toString(), e);
                atomicReference.set(e);
                i = 0;
            }
            AtomicLong atomicLong = r6.A0W;
            atomicLong.addAndGet(file.length());
            if (!r4.A00()) {
                countDownLatch.countDown();
                return;
            }
            if (r6.A0B.A0Y.get() && z) {
                r6.A0C.A0A(atomicLong.get(), r6.A04);
            }
            countDownLatch.countDown();
        } finally {
            countDownLatch.countDown();
        }
    }
}
