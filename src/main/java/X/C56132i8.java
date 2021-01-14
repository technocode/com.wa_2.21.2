package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.2i8  reason: invalid class name and case insensitive filesystem */
public class C56132i8 implements AbstractC19080uO {
    public final View A00;

    @Override // X.AbstractC19080uO
    public View A6n(C32311eg r2) {
        return null;
    }

    public C56132i8(LocationPicker locationPicker) {
        this.A00 = locationPicker.getLayoutInflater().inflate(R.layout.place_map_info_window, (ViewGroup) null, false);
    }

    @Override // X.AbstractC19080uO
    public View A6p(C32311eg r6) {
        View view = this.A00;
        TextView textView = (TextView) view.findViewById(R.id.place_name);
        TextView textView2 = (TextView) view.findViewById(R.id.place_address);
        Object obj = r6.A0L;
        if (obj instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) obj;
            textView.setText(placeInfo.name);
            textView2.setText(placeInfo.vicinity);
        }
        return view;
    }
}
