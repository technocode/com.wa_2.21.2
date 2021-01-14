package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3Rd  reason: invalid class name and case insensitive filesystem */
public class C72003Rd implements AnonymousClass2PJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC53892e0 A01;
    public final /* synthetic */ String A02;

    public C72003Rd(AbstractC53892e0 r1, int i, String str) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.A03);
        sb.append(this.A02);
        return sb.toString();
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        Bitmap AQZ = this.A01.AQZ(this.A00);
        return AQZ == null ? StorageUsageMediaPreviewView.A09 : AQZ;
    }
}
