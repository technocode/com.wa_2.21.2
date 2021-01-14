package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.3Id  reason: invalid class name and case insensitive filesystem */
public class C69723Id implements AnonymousClass0J2 {
    public final /* synthetic */ File A00;

    public C69723Id(File file) {
        this.A00 = file;
    }

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        this.A00.delete();
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("ProfiloUpload/Error: ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        AnonymousClass008.A16("ProfiloUpload/Response: ", str);
    }
}
