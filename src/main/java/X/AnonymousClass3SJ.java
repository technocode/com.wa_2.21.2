package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.3SJ  reason: invalid class name */
public class AnonymousClass3SJ implements AnonymousClass0J2 {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    public AnonymousClass3SJ(File file, File file2, File file3) {
        this.A02 = file;
        this.A01 = file2;
        this.A00 = file3;
    }

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        this.A02.delete();
        this.A01.delete();
        this.A00.delete();
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("MemoryExceptionsUploadHelper/Error: ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        AnonymousClass008.A16("MemoryExceptionsUploadHelper/Response: ", str);
    }
}
