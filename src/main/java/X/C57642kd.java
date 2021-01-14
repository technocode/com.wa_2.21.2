package X;

import android.os.Bundle;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kd  reason: invalid class name and case insensitive filesystem */
public class C57642kd extends AbstractC14640md {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C57652ke A01;

    public C57642kd(C57652ke r1, Bundle bundle) {
        this.A01 = r1;
        this.A00 = bundle;
    }

    @Override // X.AbstractC14640md
    public void A00(List list, Map map) {
        Bundle bundle;
        ArrayList<String> stringArrayList;
        PhotoView A0o;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01.A01;
        Object A0r = mediaViewBaseFragment.A0r(mediaViewBaseFragment.A09.getCurrentItem());
        if (A0r != null && (bundle = this.A00) != null && (stringArrayList = bundle.getStringArrayList("visible_shared_elements")) != null && stringArrayList.contains(AnonymousClass008.A0K("thumb-transition-", A0r.toString())) && (A0o = mediaViewBaseFragment.A0o(A0r)) != null) {
            Object A0q = mediaViewBaseFragment.A0q();
            if (A0q != null) {
                list.remove(AnonymousClass008.A0K("thumb-transition-", A0q.toString()));
                list.add(AnonymousClass008.A0K("thumb-transition-", A0r.toString()));
                map.put(AnonymousClass008.A0K("thumb-transition-", A0r.toString()), A0o);
                return;
            }
            throw null;
        }
    }
}
