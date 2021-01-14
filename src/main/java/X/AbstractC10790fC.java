package X;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.SetStatus;
import com.whatsapp.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.0fC  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC10790fC implements AdapterView.OnItemClickListener {
    public long A00;

    public void A00(AdapterView adapterView, View view, int i, long j) {
        if (this instanceof C11140fm) {
            C11140fm r0 = (C11140fm) this;
            AnonymousClass390 r2 = (AnonymousClass390) view.getTag();
            if (r2 == null) {
                Log.e("voip/CallsFragment/onItemClick/empty");
            } else {
                r0.A00.A0w(r2.A00, r2);
            }
        } else if (this instanceof AnonymousClass3PN) {
            MyStatusesActivity myStatusesActivity = ((AnonymousClass3PN) this).A00;
            if (myStatusesActivity.A0s.isEmpty()) {
                AbstractC007503q r3 = (AbstractC007503q) myStatusesActivity.A06.A00.get(i);
                AbstractC06110Rt r02 = myStatusesActivity.A01;
                if (r02 != null) {
                    r02.A00();
                }
                Intent intent = new Intent(myStatusesActivity, StatusPlaybackActivity.class);
                intent.putExtra("jid", AnonymousClass1VY.A0D(r3.A07()));
                C006803i.A05(intent, r3.A0n);
                myStatusesActivity.startActivity(intent);
                AnonymousClass09E r03 = myStatusesActivity.A0Y;
                r03.A0C();
                if (r03.A05.get(AnonymousClass02Z.A00) != null) {
                    myStatusesActivity.A0H.A05(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
                }
            }
        } else if (!(this instanceof C10780fB)) {
            ((C40601tX) this).A00.A0V((String) SetStatus.A0A.get(i));
        } else {
            C10780fB r1 = (C10780fB) this;
            C27071Nv r32 = (C27071Nv) view.getTag();
            if (r32 == null) {
                return;
            }
            if (!AnonymousClass02Z.A02(r32.A01) || r32.A00 != 0) {
                StatusesFragment statusesFragment = r1.A00;
                Intent intent2 = new Intent(statusesFragment.A00(), StatusPlaybackActivity.class);
                intent2.putExtra("jid", r32.A01.getRawString());
                statusesFragment.A0h(intent2);
                C04380Kd r33 = statusesFragment.A0P;
                C09150cN r04 = statusesFragment.A05;
                r33.A05(r04.A02, r04.A03, r04.A01);
                return;
            }
            r1.A00.A0u();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(adapterView, view, i, j);
        }
    }
}
