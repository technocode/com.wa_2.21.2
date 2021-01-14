package X;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import java.util.HashSet;

/* renamed from: X.2eM  reason: invalid class name and case insensitive filesystem */
public class C54102eM implements AbstractC06100Rs {
    public MenuItem A00;
    public final /* synthetic */ MediaPickerFragment A01;

    public C54102eM(MediaPickerFragment mediaPickerFragment) {
        this.A01 = mediaPickerFragment;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r3, MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return false;
        }
        MediaPickerFragment mediaPickerFragment = this.A01;
        mediaPickerFragment.A0z(mediaPickerFragment.A0E);
        return false;
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r5, Menu menu) {
        MediaPickerFragment mediaPickerFragment = this.A01;
        MenuItem add = menu.add(0, 0, 0, mediaPickerFragment.A0B.A06(R.string.ok));
        this.A00 = add;
        add.setShowAsAction(2);
        if (Build.VERSION.SDK_INT < 21) {
            return true;
        }
        ActivityC004902h A0A = mediaPickerFragment.A0A();
        if (A0A != null) {
            A0A.getWindow().setStatusBarColor(C004302a.A00(mediaPickerFragment.A0A(), R.color.primary_dark));
            return true;
        }
        throw null;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r5) {
        MediaPickerFragment mediaPickerFragment = this.A01;
        if (mediaPickerFragment.A06) {
            mediaPickerFragment.A0B().finish();
        }
        mediaPickerFragment.A0E.clear();
        mediaPickerFragment.A04 = null;
        ((MediaGalleryFragmentBase) mediaPickerFragment).A06.A01.A00();
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityC004902h A0A = mediaPickerFragment.A0A();
            if (A0A != null) {
                A0A.getWindow().setStatusBarColor(C004302a.A00(mediaPickerFragment.A0A(), R.color.black));
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r10, Menu menu) {
        MediaPickerFragment mediaPickerFragment = this.A01;
        HashSet hashSet = mediaPickerFragment.A0E;
        if (hashSet.isEmpty()) {
            r10.A04(mediaPickerFragment.A0B.A06(R.string.select_multiple_title));
        } else {
            r10.A04(mediaPickerFragment.A0B.A0A(R.plurals.n_selected, (long) hashSet.size(), Integer.valueOf(hashSet.size())));
        }
        this.A00.setVisible(!hashSet.isEmpty());
        return true;
    }
}
