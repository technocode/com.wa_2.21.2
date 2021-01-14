package X;

import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.1xp  reason: invalid class name and case insensitive filesystem */
public final class C43121xp implements AnonymousClass34f {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass05r A01;
    public final /* synthetic */ C009405x A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ WeakReference A06;

    public C43121xp(WeakReference weakReference, WeakReference weakReference2, C009405x r3, String str, AnonymousClass05r r5, ImageView imageView, String str2) {
        this.A06 = weakReference;
        this.A05 = weakReference2;
        this.A02 = r3;
        this.A04 = str;
        this.A01 = r5;
        this.A00 = imageView;
        this.A03 = str2;
    }

    @Override // X.AnonymousClass34f
    public void AH4() {
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            C28051Sr.A1W(this.A01, this.A00, str, this.A03, this.A02);
        }
    }

    @Override // X.AnonymousClass34f
    public void AKx() {
        C009405x r0;
        ImageView imageView = (ImageView) this.A06.get();
        AnonymousClass05r r1 = (AnonymousClass05r) this.A05.get();
        if (imageView != null && r1 != null && (r0 = this.A02) != null) {
            imageView.setColorFilter(r0.A00(r1).intValue());
        }
    }
}
