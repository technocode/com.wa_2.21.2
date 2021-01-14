package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0aw  reason: invalid class name and case insensitive filesystem */
public class C08340aw {
    public final Map A00 = new HashMap();

    public C08340aw() {
    }

    public C08340aw(AnonymousClass2PG r2) {
        A03(r2);
    }

    public AnonymousClass2PG A00(Uri uri) {
        Map map = this.A00;
        AnonymousClass2PG r0 = (AnonymousClass2PG) map.get(uri);
        if (r0 != null) {
            return r0;
        }
        Log.e("mediapreviewparams/get/item should be explicitly added");
        AnonymousClass2PG r02 = new AnonymousClass2PG(uri);
        map.put(uri, r02);
        return r02;
    }

    public void A01(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            map.clear();
            ArrayList<AnonymousClass2PI> parcelableArrayList = bundle2.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                for (AnonymousClass2PI r0 : parcelableArrayList) {
                    AnonymousClass2PG r1 = r0.A00;
                    map.put(r1.A0F, r1);
                }
            }
        }
    }

    public final void A02(Bundle bundle) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AnonymousClass2PG r1 : this.A00.values()) {
            arrayList.add(new AnonymousClass2PI(r1));
        }
        bundle.putParcelableArrayList("items", arrayList);
    }

    public void A03(AnonymousClass2PG r4) {
        Map map = this.A00;
        Uri uri = r4.A0F;
        if (map.containsKey(uri)) {
            Log.e("mediapreviewparams/add/item was already added");
        }
        map.put(uri, r4);
    }
}
