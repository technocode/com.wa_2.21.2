package X;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1xh  reason: invalid class name and case insensitive filesystem */
public class C43041xh extends AbstractC25311Gi {
    public static final C43041xh A01 = new C43041xh();
    public final C28011Sm A00 = C28011Sm.A00();

    public void A01(View view, AnonymousClass05q r30, AnonymousClass2Aw r31) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.A0i = true;
        try {
            recyclerView.setAdapter(new C43161xt(new C42981xb(r30), LayoutInflater.from(((AnonymousClass05r) r30).A00), this.A00.A01(), new JSONArray(r31.A05), r31.A00, r31.A06, r31.A07, r31.A04, r31.A08, r31.A01, r31.A02, r31.A03, r31.A0A, r31.A09));
        } catch (JSONException unused) {
            AnonymousClass008.A1S(AnonymousClass008.A0S("WaListViewBinder/bindView data source is not a valid JSON: "), r31.A05);
        }
    }
}
