package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
public class C56162iB implements AbstractC24481Az {
    public final View A00;

    @Override // X.AbstractC24481Az
    public View A6o(AnonymousClass1BR r2) {
        return null;
    }

    public C56162iB(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2.getLayoutInflater().inflate(R.layout.place_map_info_window, (ViewGroup) null, false);
    }

    @Override // X.AbstractC24481Az
    public View A6q(AnonymousClass1BR r6) {
        View view = this.A00;
        TextView textView = (TextView) view.findViewById(R.id.place_name);
        TextView textView2 = (TextView) view.findViewById(R.id.place_address);
        if (r6.A01() instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) r6.A01();
            textView.setText(placeInfo.name);
            textView2.setText(placeInfo.vicinity);
        }
        return view;
    }
}
