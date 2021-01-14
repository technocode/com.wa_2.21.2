package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.31Z  reason: invalid class name */
public class AnonymousClass31Z extends BaseAdapter {
    public final Context A00;
    public final /* synthetic */ WallpaperPicker A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass31Z(WallpaperPicker wallpaperPicker, Context context) {
        this.A01 = wallpaperPicker;
        this.A00 = context;
    }

    public int getCount() {
        return this.A01.A07.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        WallpaperPicker wallpaperPicker = this.A01;
        int intValue = ((Number) wallpaperPicker.A07.get(i)).intValue();
        if (view == null) {
            view = new C74043Zz(this.A00);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            view.setContentDescription(wallpaperPicker.A05.A06(R.string.wallpaper));
        }
        ImageView imageView = (ImageView) view;
        Resources resources = wallpaperPicker.A00;
        if (resources != null) {
            imageView.setImageDrawable(resources.getDrawable(intValue));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 9));
            return view;
        }
        throw null;
    }
}
