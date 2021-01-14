package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2P1  reason: invalid class name */
public class AnonymousClass2P1 extends ContentObserver {
    public final /* synthetic */ GalleryPickerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2P1(GalleryPickerFragment galleryPickerFragment, Handler handler) {
        super(handler);
        this.A00 = galleryPickerFragment;
    }

    public void onChange(boolean z) {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        GalleryPickerFragment galleryPickerFragment = this.A00;
        ActivityC004902h A0A = galleryPickerFragment.A0A();
        if (A0A == null) {
            contentResolver = null;
        } else {
            contentResolver = A0A.getContentResolver();
        }
        if (contentResolver != null) {
            ActivityC004902h A0A2 = galleryPickerFragment.A0A();
            if (A0A2 == null) {
                contentResolver2 = null;
            } else {
                contentResolver2 = A0A2.getContentResolver();
            }
            galleryPickerFragment.A0p(false, AnonymousClass2PB.A01(contentResolver2));
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("gallerypicker/");
        A0S.append(galleryPickerFragment.A00);
        A0S.append(" no content resolver");
        Log.i(A0S.toString());
    }
}
