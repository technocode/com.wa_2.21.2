package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.3Oc  reason: invalid class name and case insensitive filesystem */
public class C71233Oc implements AnonymousClass2PK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass2PJ A01;
    public final /* synthetic */ C74003Zv A02;
    public final /* synthetic */ String A03;

    @Override // X.AnonymousClass2PK
    public void A2A() {
    }

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C71233Oc(C74003Zv r1, AnonymousClass2PJ r2, Context context, String str) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        C74003Zv r2 = this.A02;
        AnonymousClass31W r3 = r2.A09;
        if (r3.getTag() == this.A01 && bitmap != MediaGalleryFragmentBase.A0O) {
            r2.A01 = true;
            r3.A00(this.A03, new BitmapDrawable(this.A00.getResources(), bitmap), null);
        }
    }
}
