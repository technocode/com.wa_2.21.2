package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3Re  reason: invalid class name and case insensitive filesystem */
public class C72013Re implements AnonymousClass2PK {
    public final /* synthetic */ C59592ny A00;
    public final /* synthetic */ AbstractC53892e0 A01;
    public final /* synthetic */ AnonymousClass2PJ A02;
    public final /* synthetic */ StorageUsageMediaPreviewView A03;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C72013Re(StorageUsageMediaPreviewView storageUsageMediaPreviewView, C59592ny r2, AnonymousClass2PJ r3, AbstractC53892e0 r4) {
        this.A03 = storageUsageMediaPreviewView;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        C59592ny r1 = this.A00;
        r1.setBackgroundColor(this.A03.A04);
        r1.setImageDrawable(null);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        Bitmap bitmap2 = bitmap;
        C59592ny r2 = this.A00;
        if (r2.getTag() == this.A02) {
            AbstractC53892e0 r3 = this.A01;
            if (bitmap == StorageUsageMediaPreviewView.A09) {
                bitmap2 = null;
            }
            StorageUsageMediaPreviewView storageUsageMediaPreviewView = this.A03;
            C28051Sr.A1c(r2, r3, bitmap2, storageUsageMediaPreviewView.A04, storageUsageMediaPreviewView.A06, !z);
        }
    }
}
