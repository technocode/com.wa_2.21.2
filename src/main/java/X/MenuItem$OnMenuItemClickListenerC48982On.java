package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import com.whatsapp.gallerypicker.GalleryPicker;

/* renamed from: X.2On  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class MenuItem$OnMenuItemClickListenerC48982On implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ ResolveInfo A01;
    public final /* synthetic */ GalleryPicker A02;

    public /* synthetic */ MenuItem$OnMenuItemClickListenerC48982On(GalleryPicker galleryPicker, Intent intent, ResolveInfo resolveInfo) {
        this.A02 = galleryPicker;
        this.A00 = intent;
        this.A01 = resolveInfo;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        GalleryPicker galleryPicker = this.A02;
        Intent intent = this.A00;
        ActivityInfo activityInfo = this.A01.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        galleryPicker.startActivityForResult(intent, 1);
        return false;
    }
}
