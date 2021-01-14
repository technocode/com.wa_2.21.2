package X;

import android.content.Intent;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2e6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53952e6 implements AbstractC48492Mm {
    public final /* synthetic */ MediaPreviewFragment A00;

    public /* synthetic */ C53952e6(MediaPreviewFragment mediaPreviewFragment) {
        this.A00 = mediaPreviewFragment;
    }

    @Override // X.AbstractC48492Mm
    public final void AK6(AbstractC48582Mw r5) {
        Class cls;
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        if (mediaPreviewFragment.A0C.A09(mediaPreviewFragment.A00())) {
            cls = LocationPicker2.class;
        } else {
            cls = LocationPicker.class;
        }
        Intent intent = new Intent(mediaPreviewFragment.A00(), cls);
        intent.putExtra("sticker_mode", true);
        mediaPreviewFragment.startActivityForResult(intent, 2);
    }
}
