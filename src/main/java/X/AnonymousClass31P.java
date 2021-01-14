package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.31P  reason: invalid class name */
public class AnonymousClass31P extends BaseAdapter {
    public final Context A00;
    public final /* synthetic */ SolidColorWallpaper A01;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public AnonymousClass31P(SolidColorWallpaper solidColorWallpaper, Context context) {
        this.A01 = solidColorWallpaper;
        this.A00 = context;
    }

    public int getCount() {
        return this.A01.A00.length;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String string;
        if (view == null) {
            view = new C74043Zz(this.A00);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        }
        SolidColorWallpaper solidColorWallpaper = this.A01;
        view.setBackgroundColor(solidColorWallpaper.A00[i]);
        if (solidColorWallpaper != null) {
            if (SolidColorWallpaper.A03.A0D(AbstractC000400g.A2e)) {
                string = solidColorWallpaper.getString(SolidColorWallpaper.A05[i]);
            } else {
                string = solidColorWallpaper.getString(SolidColorWallpaper.A04[i]);
            }
            view.setContentDescription(string);
            view.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 8));
            return view;
        }
        throw null;
    }
}
