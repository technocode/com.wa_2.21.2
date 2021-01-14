package X;

import android.hardware.Camera;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.2Qm  reason: invalid class name and case insensitive filesystem */
public class C49442Qm implements Camera.PreviewCallback {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C49442Qm(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.A00.A00.post(new RunnableEBaseShape8S0200000_I1_3(this, bArr, 15));
    }
}
