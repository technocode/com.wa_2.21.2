package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.HashSet;

/* renamed from: X.2OY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2OY implements View.OnLongClickListener {
    public final /* synthetic */ C53822dt A00;
    public final /* synthetic */ C59592ny A01;

    public /* synthetic */ AnonymousClass2OY(C53822dt r1, C59592ny r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        boolean z;
        C53822dt r0 = this.A00;
        C59592ny r4 = this.A01;
        AbstractC48882Od r1 = r4.A04;
        if (r1 != null) {
            MediaGalleryFragmentBase mediaGalleryFragmentBase = r0.A01;
            if (mediaGalleryFragmentBase instanceof StorageUsageMediaGalleryFragment) {
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase;
                AnonymousClass0M3 r12 = ((AbstractC53892e0) r1).A00;
                z = true;
                if (storageUsageMediaGalleryFragment.A0w()) {
                    r4.setChecked(storageUsageMediaGalleryFragment.A0y().AQh(r12));
                } else {
                    storageUsageMediaGalleryFragment.A0y().AQ6(r12);
                    r4.setChecked(true);
                }
            } else if (mediaGalleryFragmentBase instanceof MediaPickerFragment) {
                MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) mediaGalleryFragmentBase;
                z = true;
                if (mediaPickerFragment.A01 <= 1) {
                    z = false;
                } else if (mediaPickerFragment.A0w()) {
                    mediaPickerFragment.A0y(r1);
                } else {
                    HashSet hashSet = mediaPickerFragment.A0E;
                    Uri A4W = r1.A4W();
                    hashSet.add(A4W);
                    mediaPickerFragment.A0C.A03(new AnonymousClass2PG(A4W));
                    ActivityC004802g r13 = (ActivityC004802g) mediaPickerFragment.A0A();
                    if (r13 != null) {
                        mediaPickerFragment.A04 = r13.A0B(mediaPickerFragment.A03);
                        ((MediaGalleryFragmentBase) mediaPickerFragment).A06.A01.A00();
                        mediaPickerFragment.A0s(hashSet.size());
                    } else {
                        throw null;
                    }
                }
            } else if (!(mediaGalleryFragmentBase instanceof MediaGalleryFragment)) {
                CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) mediaGalleryFragmentBase;
                if (cameraMediaPickerFragment.A0w()) {
                    cameraMediaPickerFragment.A11(r1);
                } else {
                    HashSet hashSet2 = cameraMediaPickerFragment.A07;
                    Uri A4W2 = r1.A4W();
                    hashSet2.add(A4W2);
                    cameraMediaPickerFragment.A06.A03(new AnonymousClass2PG(A4W2));
                    cameraMediaPickerFragment.A0y();
                    ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A06.A01.A00();
                    cameraMediaPickerFragment.A0s(hashSet2.size());
                }
                z = true;
            } else {
                AnonymousClass0M3 r2 = ((AbstractC53892e0) r1).A00;
                boolean A0w = mediaGalleryFragmentBase.A0w();
                z = true;
                AbstractC43421yL r02 = (AbstractC43421yL) mediaGalleryFragmentBase.A0A();
                if (A0w) {
                    r4.setChecked(r02.AQh(r2));
                } else {
                    r02.AQ6(r2);
                    r4.setChecked(true);
                }
            }
            return z;
        }
    }
}
