package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3RG  reason: invalid class name */
public class AnonymousClass3RG implements AnonymousClass33Y {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3RG(String str, ImageView imageView) {
        this.A01 = str;
        this.A00 = imageView;
    }

    @Override // X.AnonymousClass33Y
    public void AH1(Bitmap bitmap) {
        String str = this.A01;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AnonymousClass33Y
    public void AH8() {
        String str = this.A01;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    @Override // X.AnonymousClass33Y
    public void AHD(Bitmap bitmap) {
        String str = this.A01;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
