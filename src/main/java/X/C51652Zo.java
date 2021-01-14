package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Zo  reason: invalid class name and case insensitive filesystem */
public class C51652Zo implements AnonymousClass0D9 {
    public final /* synthetic */ C59122n6 A00;

    @Override // X.AnonymousClass0D9
    public int A96() {
        return 96;
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C51652Zo(C59122n6 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        ImageView imageView = this.A00.A05;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.avatar_group);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.A05.setImageResource(R.drawable.avatar_group);
    }
}
