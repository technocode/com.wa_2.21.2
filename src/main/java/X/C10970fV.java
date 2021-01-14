package X;

import com.google.android.search.verification.client.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.0fV  reason: invalid class name and case insensitive filesystem */
public class C10970fV extends AnonymousClass0JW {
    public final int A00;
    public final File A01;
    public final WeakReference A02;
    public final boolean A03;
    public final byte[] A04;

    public C10970fV(AnonymousClass0YW r2, byte[] bArr, int i, boolean z, File file) {
        this.A02 = new WeakReference(r2);
        this.A04 = bArr;
        this.A00 = i;
        this.A03 = z;
        this.A01 = file;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass2EC r8 = (AnonymousClass2EC) obj;
        AnonymousClass0YW r6 = (AnonymousClass0YW) this.A02.get();
        if (r6 != null) {
            r6.A0L.findViewById(R.id.save_progress).setVisibility(8);
            if (r8 == null) {
                r6.A0s.A06(R.string.camera_failed, 1);
                r6.A01();
                return;
            }
            r6.A0G(new C59692o8(r6.A0L.getContentResolver(), r8.A01, r8.A02, r8.A00), null, true);
        }
    }
}
