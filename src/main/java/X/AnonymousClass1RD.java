package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.FileEntity;

/* renamed from: X.1RD  reason: invalid class name */
public class AnonymousClass1RD extends FileEntity {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass1RE A02;
    public final /* synthetic */ FileInputStream A03;
    public final /* synthetic */ AtomicLong A04;
    public final /* synthetic */ HttpPut A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RD(AnonymousClass1RE r2, File file, long j, long j2, FileInputStream fileInputStream, HttpPut httpPut, AtomicLong atomicLong) {
        super(file, "application/binary");
        this.A02 = r2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = fileInputStream;
        this.A05 = httpPut;
        this.A04 = atomicLong;
    }

    public InputStream getContent() {
        return this.A03;
    }

    public long getContentLength() {
        return (this.A00 - this.A01) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r7 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r10) {
        /*
            r9 = this;
            java.io.FileInputStream r7 = r9.A03
            r8 = 16384(0x4000, float:2.2959E-41)
            byte[] r6 = new byte[r8]     // Catch:{ all -> 0x0039 }
        L_0x0006:
            X.1RE r5 = r9.A02     // Catch:{ all -> 0x0039 }
            X.0Ib r0 = r5.A03     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0016
            org.apache.http.client.methods.HttpPut r0 = r9.A05     // Catch:{ all -> 0x0039 }
            r0.abort()     // Catch:{ all -> 0x0039 }
            goto L_0x002c
        L_0x0016:
            r4 = 0
            int r3 = r7.read(r6, r4, r8)     // Catch:{ all -> 0x0039 }
            if (r3 <= 0) goto L_0x0032
            java.util.concurrent.atomic.AtomicLong r0 = r9.A04     // Catch:{ all -> 0x0039 }
            long r1 = (long) r3     // Catch:{ all -> 0x0039 }
            r0.addAndGet(r1)     // Catch:{ all -> 0x0039 }
            X.1vJ r0 = r5.A04     // Catch:{ all -> 0x0039 }
            r0.A00(r1)     // Catch:{ all -> 0x0039 }
            r10.write(r6, r4, r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0006
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            r7.close()
        L_0x0031:
            return
        L_0x0032:
            r10.flush()
            r7.close()
            return
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            if (r7 == 0) goto L_0x0041
            r7.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RD.writeTo(java.io.OutputStream):void");
    }
}
