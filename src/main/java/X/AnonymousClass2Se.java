package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import java.util.List;

/* renamed from: X.2Se  reason: invalid class name */
public class AnonymousClass2Se extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final C664334g A03;
    public final boolean A04 = true;

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2Se(Context context, C664334g r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public int getCount() {
        List list = this.A01;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        List list = this.A01;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.A01.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(R.layout.location_picker_row, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.location_name);
        TextView textView2 = (TextView) view.findViewById(R.id.location_description);
        ImageView imageView = (ImageView) view.findViewById(R.id.location_icon);
        if (this.A04) {
            AnonymousClass0N2.A1E(imageView, C004302a.A02(this.A02, R.color.primary_surface));
        }
        List list = this.A01;
        if (list != null && i < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i);
            textView.setText(placeInfo.name);
            int i2 = 0;
            if (!TextUtils.isEmpty(placeInfo.vicinity)) {
                textView2.setVisibility(0);
                textView2.setText(placeInfo.vicinity);
                textView2.setSingleLine(true);
            } else {
                textView2.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pin_location_red, 0);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            int i3 = placeInfo.source;
            if (i3 == 1) {
                i2 = this.A02.getResources().getDimensionPixelSize(R.dimen.place_icon_padding_facebook);
            } else if (i3 == 3) {
                i2 = this.A02.getResources().getDimensionPixelSize(R.dimen.place_icon_padding_fousquare);
            }
            imageView.setPadding(i2, i2, i2, i2);
            String str = placeInfo.icon;
            if (str != null) {
                this.A03.A00(str, imageView);
            } else {
                imageView.setImageDrawable(null);
                return view;
            }
        }
        return view;
    }
}
