package X;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1rN  reason: invalid class name and case insensitive filesystem */
public class C39361rN implements AnonymousClass2PK {
    public final /* synthetic */ AnonymousClass1KT A00;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C39361rN(AnonymousClass1KT r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        AnonymousClass1KT r0 = this.A00;
        ImageView imageView = r0.A07;
        imageView.setImageBitmap(null);
        r0.A05.setBackgroundDrawable(null);
        imageView.setBackgroundResource(0);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        AnonymousClass1KT r2 = this.A00;
        ImageView imageView = r2.A07;
        imageView.setImageBitmap(bitmap);
        if (bitmap == AnonymousClass1RK.A05) {
            r2.A05.setBackgroundDrawable(null);
            imageView.setBackgroundDrawable(r2.A0E.getResources().getDrawable(R.drawable.audio_picker_empty_thumb_background));
            return;
        }
        FrameLayout frameLayout = r2.A05;
        AudioPickerActivity audioPickerActivity = r2.A0E;
        frameLayout.setBackgroundDrawable(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_thumb_frame_background));
        imageView.setBackgroundDrawable(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_filled_thumb_background));
    }
}
