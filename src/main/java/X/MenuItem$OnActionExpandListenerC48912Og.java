package X;

import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2Og  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnActionExpandListenerC48912Og implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ MediaGalleryActivity A00;

    public MenuItem$OnActionExpandListenerC48912Og(MediaGalleryActivity mediaGalleryActivity) {
        this.A00 = mediaGalleryActivity;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        MediaGalleryActivity mediaGalleryActivity = this.A00;
        mediaGalleryActivity.A0C = null;
        ((AnonymousClass1D7) mediaGalleryActivity.findViewById(R.id.toolbar).getLayoutParams()).A00 = 21;
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        ((AnonymousClass1D7) this.A00.findViewById(R.id.toolbar).getLayoutParams()).A00 = 0;
        return true;
    }
}
